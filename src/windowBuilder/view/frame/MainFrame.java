package windowBuilder.view.frame;

import javax.swing.JFrame;

import windowBuilder.view.panel.MainPanel;

public class MainFrame extends JFrame{
	

	private static final long serialVersionUID = 1L;

	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500); // (x축, y축, 높이, 너비) , 상속받았기 때문에 그냥 사용 가능!
		
		MainPanel mainPanel = MainPanel.getInstace();
		// 메인페널이 생성되고 나서 패널을 생성해줘야 함!
		mainPanel.init();
		setContentPane(mainPanel);
		
	}
}
