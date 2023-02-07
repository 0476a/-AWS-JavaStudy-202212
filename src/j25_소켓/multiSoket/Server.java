package j25_소켓.multiSoket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	private static final int PORT = 9090;
	
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(PORT);
			System.out.println("서버를 실행합니다.");
			
			// 클라이언트의 접속을 받는 무한 루프
			while(true) {
				// socket = 클라이언트
				Socket socket = serverSocket.accept();
				// SocketServer 쓰래드에 socket을 넣어줌!
				SocketServer socketServer = new SocketServer(socket);
				// 쓰래드를 실행 해줘야함!
				socketServer.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("서버를 종료합니다.");
		}
	}

}
