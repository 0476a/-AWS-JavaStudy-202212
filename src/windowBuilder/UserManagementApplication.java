package windowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import windowBuilder.view.frame.MainFrame;

import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;

// JFram 상속받음.
public class UserManagementApplication{

	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					// setVisible : 보여준다. 안보여준다.
					// true 여야 보임!
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
					
		EventQueue.invokeLater(runnable);
	
	}
	

}
