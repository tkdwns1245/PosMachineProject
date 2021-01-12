package kukirun.gui;

import java.awt.*;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class LoginFrame2 extends FrameTemplete2 implements ActionListener {

	// 클래스 생성자
	public LoginFrame2() {
	}





	// 종료버튼 구현(무명클래스)
	@Override
	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() == exitBtn)
//			System.exit(0);
		
		
	}

	public static void main(String[] args) {
		LoginFrame2 fr = new LoginFrame2();
		fr.showGui();
	

	}

	@Override
	public void CreateComponent() {
		// TODO Auto-generated method stub
		
	}
}
