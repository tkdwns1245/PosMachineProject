package kukirun.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.nio.file.AtomicMoveNotSupportedException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



import java.awt.*;


public class Mainpage extends CreateObject { 
	
	Container con;
	
	// Component ���� ����	

	JPanel loginPanel= setPanel(300,150,350,153,mainPanel);
	JPanel titlePanel= setPanel(400,50, 300,30,mainPanel);
	
	JLabel title=setLabel			(300, 100, 400, 50, "POSmachine",mainPanel,20);
	JLabel id=setLabel				(100, 20, 60, 30, "�� �� ��  : ",loginPanel,13);
	JLabel password=setLabel			(100, 20, 60, 70, "�н����� : ",loginPanel,13);
	JTextField idTF=setTextField		(100, 20, 150, 30, 10,loginPanel);
	JTextField passwordTF=setTextField(100, 20, 150, 70, 10,loginPanel);

	JButton loginBtn=setButton(90, 30, 40,110, "�α���",loginPanel,12);	
	JButton regiBtn=setButton(90, 30, 180, 110, "ȸ������",loginPanel,12); 
	JButton exitBtn=setButton(90, 30, 850, 500, "����",mainPanel,12);
	
	
	public Mainpage() {
		con=getContentPane();
		con.setLayout(new GridLayout(1,1));
		con.add(mainPanel);
		
		mainPanel.setLayout(null);
		mainPanel.setBackground(new Color(155,155,155));
		mainPanel.add(loginPanel);
		mainPanel.add(titlePanel);
		mainPanel.add(exitBtn);

		exitBtn.setFont(new Font("���� ���",Font.BOLD, 12));
				
		titlePanel.setLayout(new GridBagLayout());
		title.setForeground(Color.white);
		title.setFont(new Font("���� ���",Font.BOLD, 20));
		titlePanel.add(title);
		titlePanel.setBackground(new Color(100,100,100));
				
		loginPanel.setLayout(null);
		loginPanel.add(id);
		loginPanel.add(password);
		id.setFont(new Font("���� ���",Font.PLAIN,13));
		password.setFont(new Font("���� ���",Font.PLAIN,13));
		loginPanel.add(idTF);
		loginPanel.add(passwordTF);
		loginPanel.add(loginBtn);

		loginPanel.add(regiBtn);	
		
		con.setVisible(false);
		con.setSize((int)initX, (int)initY);
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(getMousePosition());
			}
		});
	
	

	
	if(CreateObject.guiHelpFunction!=1) //function
	{
	
		loginBtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String id = "1";
			String pass = "1";
			if (id.equals(idTF.getText()) && pass.equals(passwordTF.getText())) {

				JOptionPane.showMessageDialog(null, "�α��� ����");
			
			} else {

				JOptionPane.showMessageDialog(null, " �α��� ���� ");
			}
		}
	});
		
		exitBtn.addActionListener(new ActionListener() {			
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);

		}
	});
		
		regiBtn.addActionListener(new ActionListener() {			
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//mainPanel.setVisible(false);

		}
	});
		
	}
        //this.setTitle("����");
     // this.setResizable(true);
      //this.setVisible(true);
      //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      //this.setSize(1000, 600);
	
		
	}




}
