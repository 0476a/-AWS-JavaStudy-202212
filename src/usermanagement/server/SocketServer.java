package usermanagement.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import usermanagement.dto.RequestDto;
import usermanagement.dto.ResponseDto;
import usermanagement.entity.User;
import usermanagement.server.controller.AccoutnController;

public class SocketServer extends Thread {
	
	private static List<SocketServer> socketServerList = new ArrayList<>();
	
	private Socket socket;
	private InputStream inputStream;
	private OutputStream outputStream;
	private Gson gson;
	
	public SocketServer(Socket socket) {
		// 본인 멤버 변수에 받은 소켓을 넣어줌.
		// 클라이언트가 나올때 마다 Socket서버를 생성해준다.
		this.socket = socket;
		gson = new Gson();
		// 소켓서버들을 모아두는 리스트 생성
		socketServerList.add(this);
	}
	
	@Override
	public void run() {
		try {
			// 요청을 받는 녀석을 실행해준다.
			reciveRequest();
		} catch (IOException e) {
			// 클라이언트에서 먼저 종료를 했을 때.
			System.out.println(socket.getInetAddress() + ":" + socket.getPort() +  " 클라이언트의 접속이 끊어졌습니다.");
		}
	}
	
	private void reciveRequest() throws IOException {
		inputStream = socket.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		
		while(true) {
			// 클라이언트로 부터 값을 받는 녀석
			String request = reader.readLine();
			// 연결이 끊김!
			if (request == null) {
				// 강제로 예외발생
				throw new ConnectException();
			}
			RequestMapping(request);
		}
	}
	
	private void RequestMapping(String request) throws IOException {
		RequestDto<?> requestDto = gson.fromJson(request, RequestDto.class);
		String resource = requestDto.getResource();
		switch (resource) {
			// 값이 register인가를 알아봄.
			case "register":
				ResponseDto<?> responseDto =
					AccoutnController.getInstance().register((String) requestDto.getBody());
				sendResponse(responseDto);
				break;
			default:
				System.out.println("해당 요청은 처리할 수 없습니다.(404)");
				break;
		}
	}
	
	private void sendResponse(ResponseDto<?> responseDto) throws IOException {
		String response = gson.toJson(responseDto);
		outputStream = socket.getOutputStream();
		PrintWriter writer = new PrintWriter(outputStream, true);
		// 리스폰스 값을 던져줌!
		writer.println(response);
		// 버퍼를 비워줌!
		writer.flush();
	}
	
}
