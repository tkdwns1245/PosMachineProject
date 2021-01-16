package LMH.gui;

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
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



import java.awt.*;


<<<<<<< HEAD:src/LMH/gui/FrameTemplete2.java
public abstract class FrameTemplete2 extends JFrame implements Runnable { 
	Container con;
=======
public abstract class FrameTemplete2 extends JFrame { 
	static Container con;
>>>>>>> a151eb9 (템플릿 객체에 있던 resize,resizegui,helpgui 를 CreateObject 객체에 병합. 새 템플릿에서 CreateObject를 활용 할 때 반복 작성을 줄여 편의성 증대.):src/kukirun/gui/FrameTemplete2.java
	static int width=1000;
	static int height=600;
	

	
	
	// Component ���� ����

	JPanel mainPanel= new JPanel();
<<<<<<< HEAD:src/LMH/gui/FrameTemplete2.java
	JPanel loginPanel= CO.setPanel(width*3/10,height/4, width*35/100,height*225/1000);
	JPanel titlePanel= CO.setPanel(width*4/10,height*50/600, width*3/10,height/20);
	// �ð��ǳ�
	JPanel timePanel = CO.setPanel(width*25/100,height*25/600, width*5/100,height*1/10);
	
	JLabel title=CO.setLabel(width*3/10, height/6, width*4/10, height/60*5, "POSmachine");
	JLabel id=CO.setLabel(width/10, height/30, width*60/1000, height*30/600, "�� �� ��  : ");
	JLabel password=CO.setLabel(width/10, height/30, width*60/1000, height*70/600, "�н����� : ");
	JLabel time=CO.setLabel(width/2, height/30, width*60/1000, height*70/600,"");
	
	JTextField idTF=CO.setTextField		(width/1000*100, height/600*20, width/1000*150, height/600*30, 10);
	JTextField passwordTF=CO.setTextField(width/1000*100, height/600*20, width/1000*150, height/600*70, 10);

	JButton loginBtn=CO.setButton(width/1000*90, height/600*30, width/1000*40, height/600*110, "�α���");	
	JButton regiBtn=CO.setButton(width/1000*90, height/600*30, width/1000*150, height/600*110, "ȸ������"); 
	JButton exitBtn=CO.setButton(width/1000*90, height/600*30, width/1000*850, height/600*500, "����");
=======
	JPanel initPanel= new JPanel();
	CreateObject CO=new CreateObject(mainPanel,width,height,initPanel);
>>>>>>> a151eb9 (템플릿 객체에 있던 resize,resizegui,helpgui 를 CreateObject 객체에 병합. 새 템플릿에서 CreateObject를 활용 할 때 반복 작성을 줄여 편의성 증대.):src/kukirun/gui/FrameTemplete2.java
	

	JPanel loginPanel= CO.setPanel(300,150,350,153,mainPanel);
	JPanel titlePanel= CO.setPanel(400,50, 300,30,mainPanel);
	
	JLabel title=CO.setLabel			(300, 100, 400, 50, "POSmachine",mainPanel,20);
	JLabel id=CO.setLabel				(100, 20, 60, 30, "�� �� ��  : ",loginPanel,13);
	JLabel password=CO.setLabel			(100, 20, 60, 70, "�н����� : ",loginPanel,13);
	JTextField idTF=CO.setTextField		(100, 20, 150, 30, 10,loginPanel);
	JTextField passwordTF=CO.setTextField(100, 20, 150, 70, 10,loginPanel);

	JButton loginBtn=CO.setButton(90, 30, 40,110, "�α���",loginPanel,12);	
	JButton regiBtn=CO.setButton(90, 30, 150, 110, "ȸ������",loginPanel,12); 
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

	public void timeGet()
	{
		
		con=getContentPane();
		con.add(mainPanel);
		
		mainPanel.setLayout(null);
		mainPanel.setBackground(new Color(155,155,155));
		mainPanel.add(timePanel);
		timePanel.add(time);
		time.setBackground(new Color(52, 152, 219));
	
		mainPanel.add(exitBtn);
		
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
			System.out.println(mainPanel.getComponent(3));

		}
	});
		
		
		
		
	}



	
	public FrameTemplete2() {
		
      
        this.setTitle("SLR�� PosMachine");
		this.setResizable(true);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setSize(width, height);
		initPanel.setSize(width, height);
		


//		this.addComponentListener(new ComponentAdapter() {
//
//			
//			@Override
//			public void componentResized(ComponentEvent e) {
//				// TODO Auto-generated method stub
//				
//				height=getHeight();
//				width=getWidth();
//				
//				resizeGui();
//				//showGui();
//			}
//			
//		});
		

		
	}  
	


	public abstract void CreateComponent();
}
