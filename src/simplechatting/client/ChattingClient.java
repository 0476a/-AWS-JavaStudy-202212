package simplechatting.client;

import java.awt.EventQueue;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class ChattingClient extends JFrame {

	private Socket socket;
	private String username;

	private JPanel contentPane;
	private JTextField ipInput;
	private JTextField portInput;
	private JTextArea contentView;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChattingClient frame = new ChattingClient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ChattingClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 834, 637);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ipInput = new JTextField();
		ipInput.setBounds(422, 10, 218, 34);
		contentPane.add(ipInput);
		ipInput.setColumns(10);
		
		JButton connectButton = new JButton("연결");
		connectButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String ip = null;
				int port = 0;
				
				ip = ipInput.getText();
				port = Integer.parseInt(portInput.getText());
				
				try {
					// 소켓 객체 생성 입력한 ip와 port에 들어갈 것이다. (서버에 accept를 실행시킴!)
					socket = new Socket(ip, port);
					
					JOptionPane.showMessageDialog(null, 
							socket.getInetAddress() + "서버 접속",
							"접속성공",
							JOptionPane.INFORMATION_MESSAGE);
					
					// 서버에서 받을 문을 열어준다.
					InputStream inputStream = socket.getInputStream();
					BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
					// join이라는 값을 받는다.
					if(in.readLine().equals("join")) {
						username = JOptionPane.showInputDialog(null, "사용자이름을 입력하세요.", JOptionPane.INFORMATION_MESSAGE);
						
						// 접속했다는 내용을 서버로 값을 준다.
						OutputStream outputStream = socket.getOutputStream();
						PrintWriter out = new PrintWriter(outputStream, true);
						
						// 접속했다는 내용
						out.println(username + "님이 접속하였습니다.");
						
						// 서버로 부터 값을 다시 받아서 contentView에 해당 받을 값을 넣어준다.
						String welcommessage = in.readLine();
						contentView.append(welcommessage);
					}
					
				} catch (ConnectException e1) {
					
					JOptionPane.showMessageDialog(null, 
							"서버 접속 실패",
							"접속실패",
							JOptionPane.ERROR_MESSAGE);
					
				}catch (UnknownHostException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		connectButton.setBounds(729, 9, 77, 34);
		contentPane.add(connectButton);
		
		portInput = new JTextField();
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
		
		JList userList = new JList();
		userListScroll.setViewportView(userList);
		
		JScrollPane messageScroll = new JScrollPane();
		messageScroll.setBounds(22, 531, 667, 57);
		contentPane.add(messageScroll);
		
		JTextArea messageInput = new JTextArea();
		messageScroll.setViewportView(messageInput);
		
		JButton sendButton = new JButton("전송");
		sendButton.setBounds(701, 531, 105, 57);
		contentPane.add(sendButton);
	}
}
