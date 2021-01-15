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


public class StartGui{

	// 클래스 생성자
	public StartGui() {
	}


	public static void main(String[] args) {
		//CreateObject.guiHelpFunction=1;
		Mainpage fr = new Mainpage();
		fr.addGui();
		if(CreateObject.guiHelpFunction!=1) fr.guiFunction();
	

	}

}
