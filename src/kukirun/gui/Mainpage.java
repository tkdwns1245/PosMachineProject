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


public class Mainpage extends JFrame { 
	static Container con;
	static int width=1000; //�ʼ� ���
	static int height=600; //�ʼ� ���
	

	// Component ���� ����

	JPanel mainPanel= new JPanel(); //�ʼ� ���
	CreateObject CO=new CreateObject(mainPanel,width,height); //�ʼ� ���
	

	JPanel loginPanel= CO.setPanel(300,150,350,153,mainPanel);
	JPanel titlePanel= CO.setPanel(400,50, 300,30,mainPanel);
	
	JLabel title=CO.setLabel			(300, 100, 400, 50, "POSmachine",mainPanel,20);
	JLabel id=CO.setLabel				(100, 20, 60, 30, "�� �� ��  : ",loginPanel,13);
	JLabel password=CO.setLabel			(100, 20, 60, 70, "�н����� : ",loginPanel,13);
	JTextField idTF=CO.setTextField		(100, 20, 150, 30, 10,loginPanel);
	JTextField passwordTF=CO.setTextField(100, 20, 150, 70, 10,loginPanel);

	JButton loginBtn=CO.setButton(90, 30, 40,110, "�α���",loginPanel,12);	
	JButton regiBtn=CO.setButton(90, 30, 180, 110, "ȸ������",loginPanel,12); 
	JButton exitBtn=CO.setButton(90, 30, 850, 500, "����",mainPanel,12);
	
	
	public void addGui()
	{
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
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(getMousePosition());
			}
		});
	}
	

	
	
	public void guiFunction()
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



	
	public Mainpage() {
		
      
        this.setTitle("SLR�� PosMachine");
		this.setResizable(true);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setSize(width, height);

		
	}  
	


}
