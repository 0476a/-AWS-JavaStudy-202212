package simplechatting2.client;

import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.google.gson.Gson;

import lombok.Getter;
import simplechatting2.dto.JoinReqDto;
import simplechatting2.dto.MessageReqDto;
import simplechatting2.dto.RequestDto;

@Getter
public class ChattingClient extends JFrame {
	private static ChattingClient instance;

	public static ChattingClient getInstace() {
		if (instance == null) {
			instance = new ChattingClient();
		}
		return instance;
	}

	private Socket socket;
	private Gson gson;
	private String username;

	private JPanel contentPane;
	private JTextField ipInput;
	private JTextField portInput;
	private JTextArea contentView;
	private JTextField messageInput;
	private JList<String> userList;
	private DefaultListModel<String> userListModel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChattingClient frame = ChattingClient.getInstace();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private ChattingClient() {
		gson = new Gson();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 834, 637);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		ipInput = new JTextField();
		ipInput.setText("127.0.0.1");
		ipInput.setBounds(422, 10, 218, 34);
		contentPane.add(ipInput);
		ipInput.setColumns(10);

		JButton connectButton = new JButton("연결");
		connectButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String ip = null;
				int port = 0;

				int flagNum = 1;

				ip = ipInput.getText();
				port = Integer.parseInt(portInput.getText());

				try {

					// 소켓 객체 생성 입력한 ip와 port에 들어갈 것이다. (서버에 accept를 실행시킴!)
					socket = new Socket(ip, port);

					JOptionPane.showMessageDialog(null, socket.getInetAddress() + "서버 접속", "접속성공",
							JOptionPane.INFORMATION_MESSAGE);
					ClientRecive clientRecive = new ClientRecive(socket);
					clientRecive.start();

					connectButton.setEnabled(false);
					connectButton.removeMouseListener(this);
					
					username = JOptionPane.showInputDialog(null, "사용자 이름을 입력해 주세요.", "이름입력",
							JOptionPane.INFORMATION_MESSAGE);
					JoinReqDto joinReqDto = new JoinReqDto(username);
					String joinReqDtoJson = gson.toJson(joinReqDto);
					RequestDto requestDto = new RequestDto("join", joinReqDtoJson);
					String requestDtoJson = gson.toJson(requestDto);

					OutputStream outputStream = socket.getOutputStream();
					PrintWriter out = new PrintWriter(outputStream, true);
					out.println(requestDtoJson);

				} catch (ConnectException e1) {

					JOptionPane.showMessageDialog(null, "서버 접속 실패", "접속실패", JOptionPane.ERROR_MESSAGE);

				} catch (UnknownHostException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		connectButton.setBounds(729, 9, 77, 34);
		contentPane.add(connectButton);

		portInput = new JTextField();
		portInput.setText("9090");
		portInput.setBounds(652, 10, 65, 34);
		contentPane.add(portInput);
		portInput.setColumns(10);

		JScrollPane contentScroll = new JScrollPane();
		contentScroll.setBounds(12, 10, 398, 511);
		contentPane.add(contentScroll);

		contentView = new JTextArea();
		contentScroll.setViewportView(contentView);

		JScrollPane userListScroll = new JScrollPane();
		userListScroll.setBounds(422, 54, 384, 467);
		contentPane.add(userListScroll);

		userListModel = new DefaultListModel<>();
		userList = new JList<String>(userListModel);
		userListScroll.setViewportView(userList);

		JScrollPane messageScroll = new JScrollPane();
		messageScroll.setBounds(22, 531, 667, 57);
		contentPane.add(messageScroll);

		messageInput = new JTextField();
		messageInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					sendMessage();
				}
			}
		});
		messageScroll.setViewportView(messageInput);

		JButton sendButton = new JButton("전송");
		sendButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sendMessage();
			}
		});
		sendButton.setBounds(701, 531, 105, 57);
		contentPane.add(sendButton);

	}

	private void sendRequest(String resourse, String body) {
		OutputStream outputStream;
		try {
			outputStream = socket.getOutputStream();
			PrintWriter out = new PrintWriter(outputStream, true);

			RequestDto requestDto = new RequestDto(resourse, body);

			out.println(gson.toJson(requestDto));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void sendMessage() {
		if (!messageInput.getText().isBlank()) {

			String toUser = userList.getSelectedIndex() == 0 ? "all" : userList.getSelectedValue();

			MessageReqDto messageReqDto = new MessageReqDto(toUser, username, messageInput.getText());

			sendRequest("sendMessage", gson.toJson(messageReqDto));
			messageInput.setText("");

		}
	}
}
