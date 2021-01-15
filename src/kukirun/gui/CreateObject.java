package kukirun.gui;

import java.awt.*;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.Format;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CreateObject extends JFrame{

	static int guiHelpFunction=0;
	JPanel mainPanel;
	float initX,initY;
	
	
	public CreateObject(JPanel panel,int width,int height)
	{
		this.mainPanel=panel;
		this.initX=width;
		this.initY=height;
	}
	
	MouseAdapter moveObject(JButton object,JPanel mainPanel) {
		MouseAdapter m2=new MouseAdapter() {
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				object.move((int)mainPanel.getMousePosition().getX(),(int)mainPanel.getMousePosition().getY());
				System.out.println(object.getX()+","+object.getY());
			}
			
		};
		return m2;
	};
	
	MouseAdapter moveObject(JLabel object,JPanel mainPanel) {
		MouseAdapter m2=new MouseAdapter() {
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				object.move((int)mainPanel.getMousePosition().getX(),(int)mainPanel.getMousePosition().getY());
				System.out.println(object.getX()+","+object.getY());
			}
			
		};
		return m2;
	};
	
	MouseAdapter moveObject(JPanel object,JPanel mainPanel) {
		MouseAdapter m2=new MouseAdapter() {
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				object.move((int)mainPanel.getMousePosition().getX(),(int)mainPanel.getMousePosition().getY());
				System.out.println(object.getX()+","+object.getY());
			}
			
		};
		return m2;
	};
	
	MouseAdapter moveObject(JTextField object,JPanel mainPanel) {
		MouseAdapter m2=new MouseAdapter() {
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				object.move((int)mainPanel.getMousePosition().getX(),(int)mainPanel.getMousePosition().getY());
				System.out.println(object.getX()+","+object.getY());
			}
			
		};
		return m2;
	};

	
	MouseListener selectObject(JButton object,JPanel mainPanel) {
		
		MouseListener m1=new MouseAdapter() {
			int func=-1;
			MouseAdapter m2=moveObject(object,mainPanel);
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
	
	MouseListener selectObject(JLabel object,JPanel mainPanel) {

		MouseListener m1=new MouseAdapter() {
			int func=-1;
			MouseAdapter m2=moveObject(object,mainPanel);
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
	
	MouseListener selectObject(JPanel object,JPanel mainPanel) {

		MouseListener m1=new MouseAdapter() {
			int func=-1;
			MouseAdapter m2=moveObject(object,mainPanel);
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
	
	MouseListener selectObject(JTextField object,JPanel mainPanel) {

		MouseListener m1=new MouseAdapter() {
			int func=-1;
			MouseAdapter m2=moveObject(object,mainPanel);
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
	
	public void re_size(JPanel hey,int sizeX,int sizeY,int coordiX,int coordiY)
	{
		
		hey.resize(sizeX,sizeY);
		hey.move(coordiX,coordiY);
		
	}
	public void re_size(JLabel hey,int sizeX,int sizeY,int coordiX,int coordiY)
	{
		hey.resize(sizeX,sizeY);
		hey.move(coordiX,coordiY);
	}
	public void re_size(JButton hey,int sizeX,int sizeY,int coordiX,int coordiY)
	{
		hey.resize(sizeX,sizeY);
		hey.move(coordiX,coordiY);
	
	}
	public void re_size(JTextField hey,int sizeX,int sizeY,int coordiX,int coordiY)
	{
		hey.resize(sizeX,sizeY);
		hey.move(coordiX,coordiY);
	}

	
	public JPanel setPanel(int sizeX,int sizeY,int coordiX,int coordiY,JPanel panel) {
		JPanel New=new JPanel();
		New.setSize(sizeX,sizeY);
		New.setLocation(coordiX,coordiY);
		if(guiHelpFunction==1) New.addMouseListener(selectObject(New, panel));

		mainPanel.addComponentListener(new ComponentAdapter() {

			
			@Override
			public void componentResized(ComponentEvent e) {
				// TODO Auto-generated method stub
				float presentX=mainPanel.getWidth();
				float presentY=mainPanel.getHeight();
				
				float ratioX=presentX/initX; if(ratioX<1) ratioX=1;
				float ratioY=presentY/initY; if(ratioY<1) ratioY=1;

				re_size(New,(int) (sizeX*ratioX),(int) (sizeY*ratioY),(int) (coordiX*ratioX),(int) (coordiY*ratioY));
			}
		});
		
		return New;
	}
	
	
	public JLabel setLabel(int sizeX,int sizeY,int coordiX,int coordiY,String Text,JPanel panel,int fontsize) {
		JLabel New=new JLabel(Text);
		New.setSize(sizeX,sizeY);
		New.setLocation(coordiX,coordiY);
		if(guiHelpFunction==1) New.addMouseListener(selectObject(New, panel));
		
		mainPanel.addComponentListener(new ComponentAdapter() {

			
			@Override
			public void componentResized(ComponentEvent e) {
				// TODO Auto-generated method stub
				float presentX=mainPanel.getWidth();
				float presentY=mainPanel.getHeight();
				
				float ratioX=presentX/initX; if(ratioX<1) ratioX=1;
				float ratioY=presentY/initY; if(ratioY<1) ratioY=1;
				
			
				New.setFont(new Font(New.getFont().getName(), New.getFont().getStyle(),(int)(fontsize*ratioX)));
				re_size(New,(int) (sizeX*ratioX),(int) (sizeY*ratioY),(int) (coordiX*ratioX),(int) (coordiY*ratioY));

			}
		});
		return New;
	}
	
	public JTextField setTextField(int sizeX,int sizeY,int coordiX,int coordiY,int length,JPanel panel) {
		JTextField New=new JTextField(length);
		New.setSize(sizeX,sizeY);
		New.setLocation(coordiX,coordiY);
		if(guiHelpFunction==1) New.addMouseListener(selectObject(New, panel));
		
		mainPanel.addComponentListener(new ComponentAdapter() {

			
			@Override
			public void componentResized(ComponentEvent e) {
				// TODO Auto-generated method stub
				float presentX=mainPanel.getWidth();
				float presentY=mainPanel.getHeight();

				float ratioX=presentX/initX; if(ratioX<1) ratioX=1;
				float ratioY=presentY/initY; if(ratioY<1) ratioY=1;

				re_size(New,(int) (sizeX*ratioX),(int) (sizeY*ratioY),(int) (coordiX*ratioX),(int) (coordiY*ratioY));
			}
		});
		
		return New;
	}
	
	public JButton setButton(int sizeX,int sizeY,int coordiX,int coordiY,String Text,JPanel panel,int fontsize) {
		
		JButton New=new JButton(Text);
		
		New.setSize(sizeX,sizeY);
		New.setLocation(coordiX,coordiY);
		if(guiHelpFunction==1) New.addMouseListener(selectObject(New, panel));
		
		mainPanel.addComponentListener(new ComponentAdapter() {

			
			@Override
			public void componentResized(ComponentEvent e) {
				// TODO Auto-generated method stub
				float presentX=mainPanel.getWidth();
				float presentY=mainPanel.getHeight();
				
				float ratioX=presentX/initX; if(ratioX<1) ratioX=1;
				float ratioY=presentY/initY; if(ratioY<1) ratioY=1;
				
				New.setFont(new Font(New.getFont().getName(), New.getFont().getStyle(),(int)(fontsize*ratioX)));
				re_size(New,(int) (sizeX*ratioX),(int) (sizeY*ratioY),(int) (coordiX*ratioX),(int) (coordiY*ratioY));
			}
		});

		
		return New;
	}
	
	

	
	
	
}



	
