package windowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;


public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	// 코드의 시작점
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { // 실행하고자 하는 프로그램을 넣어줌
			                                    // new Runnable 익명클래스
			public void run() {
				try {
					Main frame = new Main(); // Main 자료형을 사용 (클래스는 자료형이 됨!) -> 참조자료형
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 904, 526); // (x좌표, y좌표, 넓이, 높이) (0,0) : 모니터 왼쪽 상단
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("집가기");
		button.setBounds(166, 124, 97, 23);
		contentPane.add(button);
		
		JButton button2 = new JButton("버튼2");
		button2.setBounds(300, 120, 97, 23);
		contentPane.add(button2);
		
		
	}
}
