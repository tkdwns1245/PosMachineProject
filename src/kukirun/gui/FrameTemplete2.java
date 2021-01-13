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


public abstract class FrameTemplete2 extends JFrame { 
	Container con;
	static int width=1000;
	static int height=600;
	
	CreateObject CO=new CreateObject();
	
	// Component º¯¼ö ¼±¾ð

	JPanel mainPanel= new JPanel();
	JPanel loginPanel= CO.setPanel(300,150,350,153);
	JPanel titlePanel= CO.setPanel(400,50, 300,30);
	
	JLabel title=CO.setLabel			(300, 100, 400, 50, "POSmachine");
	JLabel id=CO.setLabel				(100, 20, 60, 30, "¾Æ ÀÌ µð  : ");
	JLabel password=CO.setLabel			(100, 20, 60, 70, "ÆÐ½º¿öµå : ");
	JTextField idTF=CO.setTextField		(100, 20, 150, 30, 10);
	JTextField passwordTF=CO.setTextField(100, 20, 150, 70, 10);

	JButton loginBtn=CO.setButton(90, 30, 40,110, "·Î±×ÀÎ");	
	JButton regiBtn=CO.setButton(90, 30, 150, 110, "È¸¿ø°¡ÀÔ"); 
	JButton exitBtn=CO.setButton(90, 30, 850, 500, "Á¾·á");
	
	
	public void guiHelp()
	{
		loginPanel.addMouseListener(CO.selectObject(loginPanel,mainPanel));
		titlePanel.addMouseListener(CO.selectObject(titlePanel,mainPanel));
		
		title.addMouseListener(CO.selectObject(title,mainPanel));
		
		id.addMouseListener(CO.selectObject(id,loginPanel));
		password.addMouseListener(CO.selectObject(password,loginPanel));
		idTF.addMouseListener(CO.selectObject(idTF,loginPanel));
		passwordTF.addMouseListener(CO.selectObject(passwordTF,loginPanel));
		loginBtn.addMouseListener(CO.selectObject(loginBtn,loginPanel));
		regiBtn.addMouseListener(CO.selectObject(regiBtn,loginPanel));
		
		exitBtn.addMouseListener(CO.selectObject(exitBtn,mainPanel));
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(getMousePosition());
			}
		});
	}

	
	public void resizeGui()
	{
		resize(titlePanel,width*4/10,height*5/60, width*3/10,height/20);
		resize(loginPanel,width*3/10,height/4, width*7/20,height*9/40);
		
		
		resize(loginBtn,width/100*9, height/20, width/25, height/60*11);
		loginBtn.setFont(new Font("¸¼Àº °íµñ",Font.BOLD, 12*width/1000));
		
		resize(regiBtn,width/100*9, height/20, width/5, height/60*11);
		regiBtn.setFont(new Font("¸¼Àº °íµñ",Font.BOLD, 12*width/1000));
		
		resize(exitBtn,width/100*9, height/20, width/20*17, height/6*5);
		exitBtn.setFont(new Font("¸¼Àº °íµñ",Font.BOLD, 12*width/1000));
		
		
		
		resize(title,width*3/10, height/6, width*4/10, height/12);
		title.setFont(new Font("¸¼Àº °íµñ",Font.BOLD, 20*width/1000));
		
		resize(id,width/10, height/30, width*6/100, height*3/60);
		id.setFont(new Font("¸¼Àº °íµñ",Font.PLAIN, 13*width/1000));
		
		resize(password,width/10, height/30, width*6/100, height*7/60);
		password.setFont(new Font("¸¼Àº °íµñ",Font.PLAIN, 13*width/1000));
		
		resize(idTF,width/10, height/30, width/20*3, height/20);
		resize(passwordTF,width/10, height/30, width/20*3, height/60*7);

	}
	
	
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

		exitBtn.setFont(new Font("¸¼Àº °íµñ",Font.BOLD, 12));
				
		titlePanel.setLayout(new GridBagLayout());
		title.setForeground(Color.white);
		title.setFont(new Font("¸¼Àº °íµñ",Font.BOLD, 20));
		titlePanel.add(title);
		titlePanel.setBackground(new Color(100,100,100));
				
		loginPanel.setLayout(null);
		loginPanel.add(id);
		loginPanel.add(password);
		id.setFont(new Font("¸¼Àº °íµñ",Font.PLAIN,13));
		password.setFont(new Font("¸¼Àº °íµñ",Font.PLAIN,13));
		loginPanel.add(idTF);
		loginPanel.add(passwordTF);
		loginPanel.add(loginBtn);

		loginPanel.add(regiBtn);		
	}
	

	
	
	public void guiFunction()
	{
		loginBtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String id = "1";
			String pass = "1";
			if (id.equals(idTF.getText()) && pass.equals(passwordTF.getText())) {

				JOptionPane.showMessageDialog(null, "·Î±×ÀÎ ¼º°ø");
			
			} else {

				JOptionPane.showMessageDialog(null, " ·Î±×ÀÎ ½ÇÆÐ ");
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
	}



	
	public FrameTemplete2() {
		
      
        this.setTitle("SLRÀÇ PosMachine");
		this.setResizable(true);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setSize(width, height);
		
		this.addComponentListener(new ComponentAdapter() {

			
			@Override
			public void componentResized(ComponentEvent e) {
				// TODO Auto-generated method stub
				
				height=getHeight();
				width=getWidth();
				
				resizeGui();
				//showGui();
			}
			
		});
		

		
	}  
	
	public void resize(JPanel hey,int sizeX,int sizeY,int coordiX,int coordiY)
	{
		hey.resize(sizeX,sizeY);
		hey.move(coordiX,coordiY);
		
	}
	public void resize(JLabel hey,int sizeX,int sizeY,int coordiX,int coordiY)
	{
		hey.resize(sizeX,sizeY);
		hey.move(coordiX,coordiY);
	}
	public void resize(JButton hey,int sizeX,int sizeY,int coordiX,int coordiY)
	{
		hey.resize(sizeX,sizeY);
		hey.move(coordiX,coordiY);
	
	}
	public void resize(JTextField hey,int sizeX,int sizeY,int coordiX,int coordiY)
	{
		hey.resize(sizeX,sizeY);
		hey.move(coordiX,coordiY);
	}
	

	public abstract void CreateComponent();
}
