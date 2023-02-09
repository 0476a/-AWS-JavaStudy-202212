package usermanagement.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UserManagementServerApplication implements Runnable{
	
	private final static int PORT = 9090;
	private ServerSocket serverSocket;
	
	@Override
	public void run() {
		try {
			// 서버하나 여는 것
			serverSocket = new ServerSocket(PORT);
			System.out.println("====================<< 서버 실행 >>====================");
			
			socketConnection();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				// 서버가 열리지 않았다면
				if(serverSocket != null) {
					serverSocket.close();
				}
				
				System.out.println("====================<< 서버 종료 >>====================");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	private void socketConnection() throws IOException {
		while(true) {
			// 클라이언트의 연결을 기다림!
			Socket socket = serverSocket.accept();
			SocketServer socketServer = new SocketServer(socket);
			// start가 들어가면 실행됬다는 의미
			socketServer.start();
		}
	}
	
	public static void main(String[] args) {
		UserManagementServerApplication application = new UserManagementServerApplication();
		application.run();
	}

	
}
