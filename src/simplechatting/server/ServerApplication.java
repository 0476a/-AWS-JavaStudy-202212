package simplechatting.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApplication {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(9090);
			System.out.println("=====<<< 서버 실행 >>>=====");
			
			Socket socket = serverSocket.accept(); // 클라이언트의 접속을 기다리는 녀석(accept 소켓을 리턴해줌!)
			
			// join이라는 텍스트 값을 클라이언트에 보냄!
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter out = new PrintWriter(outputStream, true);
			out.println("join");
			
			// 클라이언트로부터 값을 받는다.
			InputStream inputStream = socket.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
			
			// 클라이언트로 부터 사용자가 접속했다는 내용을 받는다.
			String welcomMessage = in.readLine();
			System.out.println(welcomMessage);
			
			// 받은 내용을 클라이언트로 다시 보낸다.
			out.println(welcomMessage);
			
			// 서버 안꺼지게 만든 것
			while(true) {
				in.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			if(serverSocket != null) {
				try {
					serverSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("=====<<< 서버 종료 >>>=====");
		}
			
	}

}
