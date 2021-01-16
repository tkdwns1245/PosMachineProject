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
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.*;


public class Sales_Status extends CreateObject { 
	
	Container con;

	// Component º¯¼ö ¼±¾ð

	JLabel title=setLabel			(200, 50,435, 25, "¸ÅÃâ ÇöÈ²",mainPanel,20);
	
	JLabel year=setLabel			(50, 50,25, 110, "Year",mainPanel,15);
	JPanel yearListPanel=setPanel(100, 20, 75, 125, mainPanel);	
	JComboBox<Integer> yearList=new JComboBox<Integer>(new Integer[] {null,1,2,3});
	
	JLabel month=setLabel			(200, 50,195, 110, "Month",mainPanel,15);
	JPanel monthListPanel=setPanel(100, 20, 250, 125, mainPanel);	
	JComboBox<Integer> monthList=new JComboBox<Integer>(new Integer[] {null,1,2,3});
	
	JButton checkBtn=setButton(80, 20, 385,125, "Á¶È¸",mainPanel,10);	
	
	JPanel numberListPanel=setPanel(835, 325, 75, 175, mainPanel);
	JPanel numberListPanel_2=setPanel(825, 315, 5, 5, numberListPanel);

//	JPanel loginPanel;//= CO.setPanel(300,150,350,153,mainPanel);

//	

//	JLabel id=CO.setLabel				(100, 20, 60, 30, "¾Æ ÀÌ µð  : ",loginPanel,13);
//	JLabel password=CO.setLabel			(100, 20, 60, 70, "ÆÐ½º¿öµå : ",loginPanel,13);
//	JTextField idTF=CO.setTextField		(100, 20, 150, 30, 10,loginPanel);
//	JTextField passwordTF=CO.setTextField(100, 20, 150, 70, 10,loginPanel);
//
//	JButton loginBtn=CO.setButton(90, 30, 40,110, "·Î±×ÀÎ",loginPanel,12);	
//	JButton regiBtn=CO.setButton(90, 30, 180, 110, "È¸¿ø°¡ÀÔ",loginPanel,12); 
//	JButton exitBtn=CO.setButton(90, 30, 850, 500, "Á¾·á",mainPanel,12);
	
	public Sales_Status() {
		
		con=getContentPane();
		con.setLayout(new GridLayout(1,1));
		con.add(mainPanel);

		
		mainPanel.setLayout(null);
		mainPanel.setBackground(new Color(0x4F81BD));
		
		
		
		mainPanel.add(yearListPanel);
		mainPanel.add(monthListPanel);
		mainPanel.add(year);
		mainPanel.add(month);
		mainPanel.add(checkBtn);
		mainPanel.add(numberListPanel);
		
		mainPanel.add(title);
		title.setForeground(Color.white);
		title.setFont(new Font("¸¼Àº °íµñ",Font.BOLD, 20));

		
		yearListPanel.setLayout(new GridLayout(1,1));
		yearListPanel.add(yearList);
	
		monthListPanel.setLayout(new GridLayout(1,1));
		monthListPanel.add(monthList);
		
		numberListPanel.setLayout(null);
		numberListPanel.setBackground(new Color(0xFFFFFF));
		numberListPanel.add(numberListPanel_2);
		numberListPanel_2.setLayout(new GridLayout(2,6,5,5));
		numberListPanel_2.setBackground(new Color(0xFFFFFF));
		//numberListPanel.set

		ArrayList<JList> jlistList = new ArrayList<JList>();
		for(int i=0;i<12;i++) {
			jlistList.add(new JList<String>(new String[] {(i+1)+"¿ù"}));
			jlistList.get(i).setBackground(new Color(0xC6D9F1));
		
			numberListPanel_2.add(jlistList.get(i));
	}
		
//		JList[] arrlist=new JList[12];
//		for(int i=0;i<12;i++) {
//			arrlist[i]=new JList<String>(new String[] {(i+1)+"¿ù"});
//
//			arrlist[i].setBackground(new Color(0xC6D9F1));
//			
//			numberListPanel_2.add(arrlist[i]);
//		}
		
		
		
		
		
		
		
		
		
		
		

		con.setVisible(false);
		con.setSize((int)initX, (int)initY);
		
		
//		loginPanel.setSize(500,600);
//		mainPanel.add(loginPanel);
		
//		
//		loginPanel.setBackground(new Color(55,255,255));
//		mainPanel.add(titlePanel);
//		titlePanel.setBackground(new Color(50,50,50));
//		
		
//		title.setFont(new Font("¸¼Àº °íµñ",Font.BOLD, 20));
//		mainPanel.setLayout(null);
//		mainPanel.setBackground(new Color(155,155,155));
//		
//		mainPanel.add(exitBtn);
//
//		exitBtn.setFont(new Font("¸¼Àº °íµñ",Font.BOLD, 12));
//				
//		titlePanel.setLayout(new GridBagLayout());
//		

//		titlePanel.add(title);
//		titlePanel.setBackground(new Color(100,100,100));
//				
//		loginPanel.setLayout(null);
//		loginPanel.add(id);
//		loginPanel.add(password);
//		id.setFont(new Font("¸¼Àº °íµñ",Font.PLAIN,13));
//		password.setFont(new Font("¸¼Àº °íµñ",Font.PLAIN,13));
//		loginPanel.add(idTF);
//		loginPanel.add(passwordTF);
//		loginPanel.add(loginBtn);
//
//		loginPanel.add(regiBtn);	
//		


      
	
		
	}

	




}
