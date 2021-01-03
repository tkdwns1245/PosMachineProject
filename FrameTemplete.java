package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameTemplete extends JFrame { 
	public FrameTemplete() {
        setLocationRelativeTo(null);
        this.setTitle("SLRÀÇ PosMachine");
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setSize(1000, 600);

	}  
	
}
