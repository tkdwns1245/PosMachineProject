package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public abstract class FrameTemplete extends JFrame { 
	
	// Component 변수 선언 
	Color FadePoster = new Color(116, 185, 255);
	Font font1 = new Font("맑은 고딕",Font.BOLD, 20);
	Font font2 = new Font("맑은 고딕",Font.PLAIN,13);
	Font font3 = new Font("맑은 고딕",Font.BOLD, 12);
	
	static JPanel mainPanel = new JPanel();
	static JPanel northPanel = new JPanel();
	JPanel northTop = new JPanel();
	JPanel northCen = new JPanel();
	JPanel northBot = new JPanel();
	JPanel northLeft = new JPanel();
	JPanel northRight = new JPanel();
	
	static JPanel southPanel = new JPanel();
	static JPanel westPanel = new JPanel();
	static JPanel eastPanel = new JPanel();
	JPanel mTopPanel = new JPanel();
	JPanel mCenPanel = new JPanel();
	JPanel mBotPanel = new JPanel();
			
	JLabel title = new JLabel("POSMachine");
	JLabel id = new JLabel("아 이 디  : ");  
	JLabel password = new JLabel("패스워드 : ");
	JTextField idTF = new JTextField(10);
	JTextField passwordTF = new JTextField(10);

	static JButton loginBtn = new JButton("로그인");
	JButton regiBtn = new JButton("회원가입");	
	JButton exitBtn = new JButton("종료");	 
	
	
	public FrameTemplete() {
        setLocationRelativeTo(null);
        this.setTitle("SLR의 PosMachine");
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setSize(1000, 600);

	}  

	public abstract void CreateComponent();
}
