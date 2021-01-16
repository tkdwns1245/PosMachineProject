package gui.util;

import java.awt.*;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class CreateObject{

	
	public MouseAdapter moveObject(JButton object,JPanel mainPanel) {
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
	
	public MouseAdapter moveObject(JLabel object,JPanel mainPanel) {
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
	
	public MouseAdapter moveObject(JPanel object,JPanel mainPanel) {
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
	
	public MouseAdapter moveObject(JTextField object,JPanel mainPanel) {
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

	
	public MouseListener selectObject(JButton object,JPanel mainPanel) {
		
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
	
	public MouseListener selectObject(JLabel object,JPanel mainPanel) {

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
	
	public MouseListener selectObject(JPanel object,JPanel mainPanel) {

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
	
	public MouseListener selectObject(JTextField object,JPanel mainPanel) {

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

	
	public JPanel setPanel(int sizeX,int sizeY,int coordiX,int coordiY) {
		JPanel New=new JPanel();
		New.setSize(sizeX,sizeY);
		New.setLocation(coordiX,coordiY);
		return New;
	}
	
	public JLabel setLabel(int sizeX,int sizeY,int coordiX,int coordiY,String Text) {
		JLabel New=new JLabel(Text);
		New.setSize(sizeX,sizeY);
		New.setLocation(coordiX,coordiY);
		return New;
	}
	
	public JTextField setTextField(int sizeX,int sizeY,int coordiX,int coordiY,int length) {
		JTextField New=new JTextField(length);
		New.setSize(sizeX,sizeY);
		New.setLocation(coordiX,coordiY);
		return New;
	}
	
	public JButton setButton(int sizeX,int sizeY,int coordiX,int coordiY,String Text) {
		JButton New=new JButton(Text);
		New.setSize(sizeX,sizeY);
		New.setLocation(coordiX,coordiY);
		return New;
	}
}

	
