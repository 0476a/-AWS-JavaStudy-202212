package usermanagement.frame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.google.gson.JsonObject;

import usermanagement.service.UserService;

public class UserManagementFrame extends JFrame {

	private static final int JTextField = 0;
	private static final int List = 0;
	private List<JTextField> loginFields;
	private List<JTextField> registerFields;

	private CardLayout mainCard;
	private JPanel mainPanel;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JTextField registerUsernameField;
	private JPasswordField registerPasswordField;
	private JTextField registerNameField;
	private JTextField registerEmailField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserManagementFrame frame = new UserManagementFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserManagementFrame() {
		loginFields = new ArrayList<>();
		registerFields = new ArrayList<>();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBorder(null);

		setContentPane(mainPanel);

		mainCard = new CardLayout();
		mainPanel.setLayout(mainCard);

		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(new Color(255, 255, 255));

		mainPanel.add(loginPanel, "loginPanel");
		loginPanel.setLayout(null);

		JLabel logoText = new JLabel("UserManagement");
		logoText.setFont(new Font("Lucida Calligraphy", Font.BOLD, 20));
		logoText.setHorizontalAlignment(SwingConstants.CENTER);
		logoText.setBounds(60, 35, 260, 60);
		loginPanel.add(logoText);

		JLabel loginText = new JLabel("Login");
		loginText.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 30));
		loginText.setHorizontalAlignment(SwingConstants.CENTER);
		loginText.setBounds(85, 70, 200, 60);
		loginPanel.add(loginText);

		usernameField = new JTextField();
		usernameField.setBounds(60, 250, 260, 25);
		loginPanel.add(usernameField);
		usernameField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(60, 300, 260, 25);
		loginPanel.add(passwordField);

		JLabel usernameLabel = new JLabel("Username or email");
		usernameLabel.setFont(new Font("D2Coding", Font.PLAIN, 13));
		usernameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		usernameLabel.setBounds(60, 235, 120, 15);
		loginPanel.add(usernameLabel);

		JLabel passwordLabel = new JLabel("password");
		passwordLabel.setHorizontalAlignment(SwingConstants.LEFT);
		passwordLabel.setFont(new Font("D2Coding", Font.PLAIN, 13));
		passwordLabel.setBounds(60, 285, 57, 15);
		loginPanel.add(passwordLabel);

		JButton loginButton = new JButton("Login");
		
		// MouseAdapter 가 MouseListen에게 업케스팅 되고 있음!
		// 버튼은 버튼마다 기능이 달라서 익명클래스를 사용해서 각자 기능을 구현해줌.
//		MouseListener listener = new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				
//			}
//			
//		};
//		
//		loginButton.addMouseListener(listener);
		
		loginButton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		loginButton.setFont(new Font("Leelawadee", Font.BOLD, 16));
		loginButton.setBounds(60, 340, 260, 35);
		loginPanel.add(loginButton);

		JLabel signupDesc = new JLabel("Don't have an account?");
		signupDesc.setFont(new Font("D2Coding", Font.PLAIN, 13));
		signupDesc.setBounds(78, 405, 154, 15);
		loginPanel.add(signupDesc);

		JLabel signupLink = new JLabel("Sign up");
		signupLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "registerPanel");
				clearFields(loginFields);
			}
		});
		signupLink.setForeground(Color.BLUE);
		signupLink.setFont(new Font("D2Coding", Font.PLAIN, 13));
		signupLink.setBounds(244, 405, 57, 15);
		loginPanel.add(signupLink);

		JLabel forgotPasswordLink = new JLabel("Forgot your paswword?");
		forgotPasswordLink.setForeground(Color.BLUE);
		forgotPasswordLink.setFont(new Font("D2Coding", Font.PLAIN, 13));
		forgotPasswordLink.setBounds(120, 430, 160, 15);
		loginPanel.add(forgotPasswordLink);

		JPanel registerPanel = new JPanel();
		registerPanel.setBackground(new Color(255, 255, 255));
		mainPanel.add(registerPanel, "registerPanel");
		registerPanel.setLayout(null);

		JLabel signinLink = new JLabel("Sign in");
		signinLink.setFont(new Font("D2Coding", Font.PLAIN, 13));
		signinLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "loginPanel");
				clearFields(registerFields);
			}
		});
		signinLink.setForeground(Color.BLUE);
		signinLink.setHorizontalAlignment(SwingConstants.RIGHT);
		signinLink.setBounds(180, 420, 140, 30);
		registerPanel.add(signinLink);

		JLabel registerLogoText = new JLabel("UserManagement");
		registerLogoText.setHorizontalAlignment(SwingConstants.CENTER);
		registerLogoText.setFont(new Font("Lucida Calligraphy", Font.BOLD, 20));
		registerLogoText.setBounds(60, 35, 260, 60);
		registerPanel.add(registerLogoText);

		JLabel registerText = new JLabel("Register");
		registerText.setHorizontalAlignment(SwingConstants.CENTER);
		registerText.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 30));
		registerText.setBounds(85, 70, 200, 60);
		registerPanel.add(registerText);

		JLabel registerUsernameLabel = new JLabel("Username");
		registerUsernameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		registerUsernameLabel.setFont(new Font("D2Coding", Font.PLAIN, 13));
		registerUsernameLabel.setBounds(60, 170, 120, 15);
		registerPanel.add(registerUsernameLabel);

		registerUsernameField = new JTextField();
		registerUsernameField.setColumns(10);
		registerUsernameField.setBounds(60, 185, 260, 25);
		registerPanel.add(registerUsernameField);

		JLabel registerPasswordLabel = new JLabel("password");
		registerPasswordLabel.setHorizontalAlignment(SwingConstants.LEFT);
		registerPasswordLabel.setFont(new Font("D2Coding", Font.PLAIN, 13));
		registerPasswordLabel.setBounds(60, 220, 57, 15);
		registerPanel.add(registerPasswordLabel);

		registerPasswordField = new JPasswordField();
		registerPasswordField.setBounds(60, 235, 260, 25);
		registerPanel.add(registerPasswordField);

		JLabel registerNameLabel = new JLabel("name");
		registerNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		registerNameLabel.setFont(new Font("D2Coding", Font.PLAIN, 13));
		registerNameLabel.setBounds(60, 270, 120, 15);
		registerPanel.add(registerNameLabel);

		registerNameField = new JTextField();
		registerNameField.setColumns(10);
		registerNameField.setBounds(60, 285, 260, 25);
		registerPanel.add(registerNameField);

		JLabel registerEmailLabel = new JLabel("email");
		registerEmailLabel.setHorizontalAlignment(SwingConstants.LEFT);
		registerEmailLabel.setFont(new Font("D2Coding", Font.PLAIN, 13));
		registerEmailLabel.setBounds(60, 320, 120, 15);
		registerPanel.add(registerEmailLabel);

		registerEmailField = new JTextField();
		registerEmailField.setColumns(10);
		registerEmailField.setBounds(60, 335, 260, 25);
		registerPanel.add(registerEmailField);

		JButton registerButton = new JButton("Register");
		registerButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JsonObject userJson = new JsonObject();
				userJson.addProperty("username", registerUsernameField.getText());
				userJson.addProperty("password", registerPasswordField.getText());
				userJson.addProperty("name", registerNameField.getText());
				userJson.addProperty("email", registerEmailField.getText());

				UserService userService = UserService.getInstance();

				Map<String, String> response = userService.register(userJson.toString());

				if (response.containsKey("error")) {
					JOptionPane.showMessageDialog(null, response.get("error"), "error", JOptionPane.ERROR_MESSAGE);
					return; // 클릭 메소드를 빠져나감
				}

				JOptionPane.showMessageDialog(null, response.get("ok"), "ok", JOptionPane.INFORMATION_MESSAGE);
				mainCard.show(mainPanel, "loginPanel");
				clearFields(registerFields);
			}
		});
		registerButton.setFont(new Font("Leelawadee", Font.BOLD, 16));
		registerButton.setBounds(60, 380, 260, 35);
		registerPanel.add(registerButton);

		loginFields.add(usernameField);
		loginFields.add(passwordField);

		registerFields.add(registerUsernameField);
		registerFields.add(registerPasswordField);
		registerFields.add(registerNameField);
		registerFields.add(registerEmailField);
	}

	
	private void clearFields(List<JTextField> textFields) {
		for (JTextField field : textFields) {
			// 공백이라도 있으면 setText를 해라
			if(field.getText().isEmpty()) {
				continue;
			}
			field.setText("");
		}
	}

}
