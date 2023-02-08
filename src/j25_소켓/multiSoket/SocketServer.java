package j25_소켓.multiSoket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SocketServer extends Thread {

	// 소켓들을 모아 놓는 리스트
	private static List<SocketServer> clientList = new ArrayList<>();
	private Socket socket;
	private InputStream inputStream;
	private OutputStream outputStream;
	
	private static int autoIncrement = 1;
	private String name;

	public SocketServer(Socket socket) {
		// 매개변수로 받은 소켓값을 넣어줌.
		this.socket = socket;
		name = "user" + autoIncrement++;
		clientList.add(this);
	}

	@Override
	public void run() {
		System.out.println("[연결된 클라이언트 정보]");
		System.out.println("IP: " + socket.getInetAddress());

		try {
			inputStream = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

			// 브로드 케스팅 : 모든 클라이언트에 동시에 글을 출력해줄 때 사용
			sendToAll(name + "님이 접속하였습니다.");
			
			while(true) {
				// readLine을 통해 메시지가 들어올 때까지 기다림!
				String message = reader.readLine();
				// null이 들어올 수 없음! (통신이 끊겼다는 뜻임!)
				if(message == null) {
					break;
				}
				// 메시지를 받을 때까지 기다려서 받아줌.
				sendToAll(message);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 관을 끊어낸다.
				inputStream.close();
				outputStream.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	private void sendToAll(String message) throws IOException {
		for(SocketServer socketServer : clientList) {
			outputStream = socketServer.socket.getOutputStream();
			PrintWriter writer = new PrintWriter(outputStream, true);
			// name은 멤버변수의 name이다. (본인이 접속한 것을 알리기 위함!)
			writer.println(name + ": " + message);
		}
	}

}
