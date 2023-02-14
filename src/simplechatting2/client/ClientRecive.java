package simplechatting2.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import com.google.gson.Gson;

import lombok.RequiredArgsConstructor;
import simplechatting2.dto.JoinRespDto;
import simplechatting2.dto.MessageRespDto;
import simplechatting2.dto.ResponseDto;

@RequiredArgsConstructor
public class ClientRecive extends Thread{
	
	private final Socket socket;
	private InputStream inputStream;
	private Gson gson;
	
	@Override
	public void run() {
		try {
			inputStream = socket.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
			gson = new Gson();
			
			while(true) {
				String request = in.readLine();
				ResponseDto responseDto = gson.fromJson(request, ResponseDto.class);
				switch(responseDto.getResource()){
					case "join":
					// equlasIgnoreCase는 대소문자 구분 
						JoinRespDto joinRespDto = gson.fromJson(responseDto.getBody(), JoinRespDto.class);
						ChattingClient.getInstace().getContentView().append(joinRespDto.getWelcomeMessage() + "\n");
						ChattingClient.getInstace().getUserListModel().clear();
						ChattingClient.getInstace().getUserListModel().addElement("--- 전체 ---");
						ChattingClient.getInstace().getUserListModel().addAll(joinRespDto.getConnectedUsers());
						ChattingClient.getInstace().getUserList().setSelectedIndex(0);
						break;
					case "sendMessage":
						MessageRespDto messageRespDto = gson.fromJson(responseDto.getBody(), MessageRespDto.class);
						ChattingClient.getInstace().getContentView().append(messageRespDto.getMessageValue() + "\n");
						break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
