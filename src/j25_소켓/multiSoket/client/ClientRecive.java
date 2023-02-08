package j25_소켓.multiSoket.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClientRecive extends Thread{

	private final Socket socket;
	
	// 쓰레드는 무조건 run이 있어야해~
	@Override
	public void run() {
		try {
			InputStream inputStream = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			
			while(true) {
					System.out.println(reader.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
