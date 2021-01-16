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
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class StartGui extends CreateObject{

	// 클래스 생성자
	public StartGui() {
		CreateObject.guiHelpFunction=0;
		
		//JPanel mainPanel=new JPanel(null);
		mainPanel.setLayout(null);

		
		Mainpage mainpage=new Mainpage();
		Sales_Status sales_status=new Sales_Status();
		
	
		
		
		
		
		Container con;
		con=getContentPane();
		con.setLayout(new GridLayout());
		con.add(mainPanel);	
		
		
		JPanel top=setPanel(1000, 50, 0, 0, mainPanel);
		top.setBackground(new Color(0x4F81BD));
		top.setLayout(null);
		top.setBorder(new LineBorder(Color.black,1));
		
		JPanel content=setPanel(1000, 600, 0, 50, mainPanel);
		content.setBounds(0,50,1000,750);
		content.setBackground(new Color(0xC6D9F1));
	
		
		mainPanel.add(top);
		mainPanel.add(content);
		
		
		JButton button=setButton(80, 40, 5, 5, "삭제", top, 12);
		JButton button1=setButton(80, 40, 95, 5, "1추가", top, 12);
		JButton button2=setButton(80, 40, 185, 5, "2추가", top, 12);
		
		top.add(button);
		top.add(button1);
		top.add(button2);

		
		content.setLayout(null);
		content.add(mainpage.con);
		content.add(sales_status.con);


		content.addComponentListener(new ComponentAdapter() {

			@Override
			public void componentResized(ComponentEvent e) {
				// TODO Auto-generated method stub
				
		
				content.getComponent(1).resize(content.getWidth(),content.getHeight());
			}
			
		});
		
		
		button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
				for(int i=0;i<content.getComponentCount();i++) {
					content.getComponent(i).setVisible(false);
				}
			
			}
		});
		
		button1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
				for(int i=0;i<content.getComponentCount();i++) {
					content.getComponent(i).setVisible(false);
				}
				content.getComponent(0).setVisible(true);

			}
		});
		
		button2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

				for(int i=0;i<content.getComponentCount();i++) {
					content.getComponent(i).setVisible(false);
				}
				content.getComponent(1).setVisible(true);
			}
		});
	}
	


	public static void main(String[] args) {
		
//		CreateObject.guiHelpFunction=1;
//		//Mainpage fr = new Mainpage();
//		Sales_Status fr= new Sales_Status(1);
		


		
		
		
		
		StartGui ui=new StartGui();
		
	      
        ui.setTitle("SLR의 PosMachine");
        ui.setResizable(true);
        ui.setVisible(true);
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ui.setSize(1000, 650);

		
	

	}

}
