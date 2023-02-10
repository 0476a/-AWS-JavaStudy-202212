package simplechatting.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketOption;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
class ConnectedSocket extends Thread {
	private static List<ConnectedSocket> socketList = new ArrayList<>();
	private Socket socket;
	private InputStream inputStream;
	private OutputStream outputStream;
	
	private String username;
	
	public ConnectedSocket(Socket socket) {
		this.socket = socket;
		socketList.add(this);
	}
	
	@Override
	public void run() {
		// join이라는 텍스트 값을 클라이언트에 보냄!
		try {
			outputStream = socket.getOutputStream();
			PrintWriter out = new PrintWriter(outputStream, true);
			out.println("join");

			// 클라이언트로부터 값을 받는다.
			inputStream = socket.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));

			// 클라이언트로 부터 사용자가 접속했다는 내용을 받는다.
			username = in.readLine();
			System.out.println(username + "님이 접속하였습니다.");
			
			String userListStr = "";
			
			for(int i = 0; i < socketList.size(); i++) {
				//                                username을 찾아줌.
				userListStr += socketList.get(i).getUsername();
				if(i < socketList.size() - 1) {
					userListStr += ",";
				}
			}

			// 모두에게 뿌려줌!
			for (ConnectedSocket connectedSocket : socketList) {
				// Socket 멤버변수를 들고와서 아웃풋 스트림을 걸어줘야함!
				outputStream = connectedSocket.getSocket().getOutputStream();
				out = new PrintWriter(outputStream, true);
				out.println("@welcome/" + username + "님이 접속하였습니다.");
				// 받은 내용을 클라이언트로 다시 보낸다.
				out.println("@userList/" + userListStr);
			}

			// 서버 안꺼지게 만든 것
			while (true) {
				String message = in.readLine();
				for (ConnectedSocket connectedSocket : socketList) {
					outputStream = connectedSocket.getSocket().getOutputStream();
					out = new PrintWriter(outputStream, true);
					out.println(message);
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
public class ServerApplication {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket(9090);
			System.out.println("=====<<< 서버 실행 >>>=====");
			
			
			while (true) {
				Socket socket = serverSocket.accept(); // 클라이언트의 접속을 기다리는 녀석(accept 소켓을 리턴해줌!)
				// 생성된 소켓을 리스트에 담아줌!
				ConnectedSocket connectedSocket = new ConnectedSocket(socket);
				connectedSocket.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			if (serverSocket != null) {
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
