package kukirun.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	

	
	MouseAdapter moveObject(JButton object) {
		MouseAdapter m2=new MouseAdapter() {
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
				object.move((int)getMousePosition().getX()-40,(int)getMousePosition().getY()-40);
				System.out.println(object.getX()+","+object.getY());
			}
			
		};
		return m2;
	};
	
	MouseAdapter moveObject(JLabel object) {
		MouseAdapter m2=new MouseAdapter() {
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
				object.move((int)getMousePosition().getX()-40,(int)getMousePosition().getY()-40);
				System.out.println(object.getX()+","+object.getY());
			}
			
		};
		return m2;
	};
	
	MouseAdapter moveObject(JPanel object) {
		MouseAdapter m2=new MouseAdapter() {
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
				object.move((int)getMousePosition().getX()-40,(int)getMousePosition().getY()-40);
				System.out.println(object.getX()+","+object.getY());
			}
			
		};
		return m2;
	};
	
	MouseAdapter moveObject(JTextField object) {
		MouseAdapter m2=new MouseAdapter() {
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
				object.move((int)getMousePosition().getX()-40,(int)getMousePosition().getY()-40);
				System.out.println(object.getX()+","+object.getY());
			}
			
		};
		return m2;
	};

	
	MouseListener selectObject(JButton object) {

		MouseListener m1=new MouseAdapter() {
			int func=-1;
			MouseAdapter m2=moveObject(object);
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
				if(func==-1) {
					mainPanel.addMouseMotionListener(m2); 
					System.out.println("리스너 등록");
				}
				else if(func==1) {
					mainPanel.removeMouseMotionListener(m2);
					System.out.println("리스너 삭제");
				}
				func*=-1;
			}
		};
		return m1;
	};
	
	MouseListener selectObject(JLabel object) {

		MouseListener m1=new MouseAdapter() {
			int func=-1;
			MouseAdapter m2=moveObject(object);
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
				if(func==-1) {
					mainPanel.addMouseMotionListener(m2); 
					System.out.println("리스너 등록");
				}
				else if(func==1) {
					mainPanel.removeMouseMotionListener(m2);
					System.out.println("리스너 삭제");
				}
				func*=-1;
			}
		};
		return m1;
	};
	
	MouseListener selectObject(JPanel object) {

		MouseListener m1=new MouseAdapter() {
			int func=-1;
			MouseAdapter m2=moveObject(object);
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
				if(func==-1) {
					mainPanel.addMouseMotionListener(m2); 
					System.out.println("리스너 등록");
				}
				else if(func==1) {
					mainPanel.removeMouseMotionListener(m2);
					System.out.println("리스너 삭제");
				}
				func*=-1;
			}
		};
		return m1;
	};
	
	MouseListener selectObject(JTextField object) {

		MouseListener m1=new MouseAdapter() {
			int func=-1;
			MouseAdapter m2=moveObject(object);
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
				if(func==-1) {
					mainPanel.addMouseMotionListener(m2); 
					System.out.println("리스너 등록");
				}
				else if(func==1) {
					mainPanel.removeMouseMotionListener(m2);
					System.out.println("리스너 삭제");
				}
				func*=-1;
			}
		};
		return m1;
	};

	
	public JPanel setPanel(int sizeX,int sizeY,int coordiX,int coordiY) {
		JPanel New=new JPanel();
		New.setSize(sizeX,sizeY);
		New.setLocation(coordiX,coordiY);
		New.addMouseListener(selectObject(New));
		return New;
	}
	
	public JLabel setLabel(int sizeX,int sizeY,int coordiX,int coordiY,String Text) {
		JLabel New=new JLabel(Text);
		New.setSize(sizeX,sizeY);
		New.setLocation(coordiX,coordiY);
		New.addMouseListener(selectObject(New));
		return New;
	}
	
	public JTextField setTextField(int sizeX,int sizeY,int coordiX,int coordiY,int length) {
		JTextField New=new JTextField(length);
		New.setSize(sizeX,sizeY);
		New.setLocation(coordiX,coordiY);
		New.addMouseListener(selectObject(New));
		return New;
	}
	
	public JButton setButton(int sizeX,int sizeY,int coordiX,int coordiY,String Text) {
		JButton New=new JButton(Text);
		New.setSize(sizeX,sizeY);
		New.setLocation(coordiX,coordiY);
		New.addMouseListener(selectObject(New));
		return New;
	}

	
	// Component 변수 선언

	
	JLabel title=setLabel			(width*3/10, height/6, width*4/10, height/60*5, "POSmachine");
	JLabel id=setLabel				(width/10, height/30, width*60/1000, height*30/600, "아 이 디  : ");
	JLabel password=setLabel		(width/10, height/30, width*60/1000, height*70/600, "패스워드 : ");
	JTextField idTF=setTextField	(width/1000*100, height/600*20, width/1000*150, height/600*30, 10);
	JTextField passwordTF=setTextField(width/1000*100, height/600*20, width/1000*150, height/600*70, 10);

	JButton loginBtn=setButton(width/1000*90, height/600*30, width/1000*40, height/600*110, "로그인");	
	JButton regiBtn=setButton(width/1000*90, height/600*30, width/1000*150, height/600*110, "회원가입"); 
	JButton exitBtn=setButton(width/1000*90, height/600*30, width/1000*850, height/600*500, "종료");
	
	
	
	JPanel mainPanel= new JPanel();
	JPanel loginPanel= setPanel(width*3/10,height/4, width*35/100,height*225/1000);
	JPanel titlePanel= setPanel(width*4/10,height*50/600, width*3/10,height/20);
	
	public void setGui()
	{
		resize(titlePanel,width*4/10,height*5/60, width*3/10,height/20);
		resize(loginPanel,width*3/10,height/4, width*7/20,height*9/40);
		
		
		resize(loginBtn,width/100*9, height/20, width/25, height/60*11);
		loginBtn.setFont(new Font("맑은 고딕",Font.BOLD, 12*width/1000));
		
		resize(regiBtn,width/100*9, height/20, width/5, height/60*11);
		regiBtn.setFont(new Font("맑은 고딕",Font.BOLD, 12*width/1000));
		
		resize(exitBtn,width/100*9, height/20, width/20*17, height/6*5);
		exitBtn.setFont(new Font("맑은 고딕",Font.BOLD, 12*width/1000));
		
		
		
		resize(title,width*3/10, height/6, width*4/10, height/12);
		title.setFont(new Font("맑은 고딕",Font.BOLD, 20*width/1000));
		
		resize(id,width/10, height/30, width*6/100, height*3/60);
		id.setFont(new Font("맑은 고딕",Font.PLAIN, 13*width/1000));
		
		resize(password,width/10, height/30, width*6/100, height*7/60);
		password.setFont(new Font("맑은 고딕",Font.PLAIN, 13*width/1000));
		
		resize(idTF,width/10, height/30, width/20*3, height/20);
		resize(passwordTF,width/10, height/30, width/20*3, height/60*7);

	}
	
	
	public void showGui()
	{
		con=getContentPane();
		con.setLayout(new GridLayout(1,1));
		con.add(mainPanel);
		
		mainPanel.setLayout(null);
		mainPanel.setBackground(new Color(155,155,155));
		mainPanel.add(loginPanel);
		mainPanel.add(titlePanel);
		mainPanel.add(exitBtn);
//		exitBtn.addActionListener(new ActionListener() {			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.exit(0);
//
//			}
//		});
		exitBtn.setFont(new Font("맑은 고딕",Font.BOLD, 12));
		
		
		
		titlePanel.setLayout(new GridBagLayout());
		title.setForeground(Color.white);
		title.setFont(new Font("맑은 고딕",Font.BOLD, 20));
		titlePanel.add(title);
		titlePanel.setBackground(new Color(100,100,100));
		
		
		
		loginPanel.setLayout(null);
		loginPanel.add(id);
		loginPanel.add(password);
		id.setFont(new Font("맑은 고딕",Font.PLAIN,13));
		password.setFont(new Font("맑은 고딕",Font.PLAIN,13));
		loginPanel.add(idTF);
		loginPanel.add(passwordTF);
		loginPanel.add(loginBtn);
//		loginBtn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String id = "1";
//				String pass = "1";
//				if (id.equals(idTF.getText()) && pass.equals(passwordTF.getText())) {
//
//					JOptionPane.showMessageDialog(null, "로그인 성공");
//				
//				} else {
//
//					JOptionPane.showMessageDialog(null, " 로그인 실패 ");
//				}
//			}
//		});
		loginPanel.add(regiBtn);
		
	}



	
	public FrameTemplete2() {
		
      
        this.setTitle("SLR의 PosMachine");
		this.setResizable(true);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setSize(width, height);
		
		this.addComponentListener(new ComponentListener() {
			
			@Override
			public void componentShown(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void componentResized(ComponentEvent e) {
				// TODO Auto-generated method stub
				
				height=getHeight();
				width=getWidth();
				
				setGui();
				//showGui();
			}
			
			@Override
			public void componentMoved(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void componentHidden(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		this.addMouseListener(new MouseAdapter() {
			

			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(getMousePosition());
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
