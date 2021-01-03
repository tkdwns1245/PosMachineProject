package gui;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginFrame extends FrameTemplete {
	// Component ���� ����
		Color ElectronBlue = new Color(9, 132, 227);
		Color OrangeVille = new Color(225, 112, 85);
		Font font1 = new Font("���� ���",Font.BOLD, 40);
		Font font2 = new Font("���� ���",Font.PLAIN, 15);
		Font font3 = new Font("���� ���",Font.BOLD, 12);
		
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
				
		JLabel title = new JLabel("SRL�� POSMachine");
		JLabel id = new JLabel("�� �� ��  : ");  
		JLabel password = new JLabel("�н����� : ");
		JTextField idTF = new JTextField(10);
		JTextField passwordTF = new JTextField(10);

		JButton loginBtn = new JButton("�α���");
		JButton regiBtn = new JButton("ȸ������");	
		JButton exitBtn = new JButton("�� ��");	 

 	// �α��� ��� ����
	public LoginFrame() {
	
		loginBtn.addActionListener( new ActionListener() {
			 
	        public void actionPerformed(ActionEvent e) {
	                String id = "SLR";
	                String pass = "1234";
	                    if(id.equals(idTF.getText()) &&  pass.equals(passwordTF.getText())) {

	                            JOptionPane.showMessageDialog( null, "�α��� ����" );
	                    } else {

	                        JOptionPane.showMessageDialog( null , " �α��� ���� ");
	                    }
		
            }
    } );
		

	}
		//Component ����
	public void CreateComponent() {

		LoginFrame fr = new LoginFrame();
		Container cp = fr.getContentPane();
		
		cp.add(northPanel, BorderLayout.NORTH);
		cp.add(mainPanel, BorderLayout.CENTER);
		cp.add(eastPanel, BorderLayout.EAST);
		cp.add(westPanel, BorderLayout.WEST);
		cp.add(southPanel, BorderLayout.SOUTH);
		// ������ �����г� 
		northPanel.add(northTop, BorderLayout.NORTH);
		northTop.setPreferredSize(new Dimension(1000, 5));

		northPanel.add(northBot, BorderLayout.SOUTH);
		northBot.setPreferredSize(new Dimension(1000, 5));

		northPanel.add(northLeft, BorderLayout.EAST);
		northLeft.setPreferredSize(new Dimension(100, 60));
		
		
		northPanel.add(northCen, BorderLayout.CENTER);
		northCen.setBackground(OrangeVille);
		northCen.setPreferredSize(new Dimension(750, 60));
		northCen.add(title);
		northCen.setBackground(OrangeVille);
		title.setFont(font1);
		
		northPanel.add(northRight, BorderLayout.WEST);
		northRight.setPreferredSize(new Dimension(100, 60));
		northRight.add(exitBtn);
		exitBtn.setPreferredSize(new Dimension(70, 40));
		exitBtn.setFont(font3);


		northPanel.setPreferredSize(new Dimension(1000, 250));
		westPanel.setPreferredSize(new Dimension(300, 600));
		eastPanel.setPreferredSize(new Dimension(300, 600));
		southPanel.setPreferredSize(new Dimension(1000, 190));
		mainPanel.setBackground(ElectronBlue);

	// mainPanel ���� 
		mainPanel.add(mTopPanel);
		mTopPanel.add(id);
		mTopPanel.add(idTF);
		id.setFont(font2);
		mTopPanel.setPreferredSize(new Dimension(250, 30));
		mTopPanel.setBackground(ElectronBlue);

		mainPanel.add(mCenPanel);
		mCenPanel.add(password);
		password.setFont(font2);
		mCenPanel.add(passwordTF);
		mCenPanel.setPreferredSize(new Dimension(250, 30));
		mCenPanel.setBackground(ElectronBlue);

		
		mainPanel.add(mBotPanel);
		mBotPanel.add(loginBtn);
		mBotPanel.add(regiBtn);
		mBotPanel.setPreferredSize(new Dimension(250, 30));
		mBotPanel.setBackground(ElectronBlue);

	}
	
	
	public static void main(String[] args) {
		LoginFrame fr = new LoginFrame();
		fr.CreateComponent();
	
	
	}
}