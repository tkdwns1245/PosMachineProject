package LMH.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import gui.util.CreateComponentUtil;


public class GoodsManageFrame extends FrameTemplete {
	 
	JPanel mainPanel; 
	CreateComponentUtil ccUtil = new CreateComponentUtil();
	JPanel timePanel = ccUtil.createPanel(300,150,350,153);
	JLabel time = ccUtil.createLabel(100, 20, 60, 70, "", 13);
	
	JPanel titlePanel;
	JPanel joinPanel;
	JPanel bottomPanel;
	
	JLabel titleLabel;
	JLabel idLabel;
	JLabel passwordLabel;
	
	JButton okButton;
	JButton cancelButton;
	JButton exitBtn;
	
	JTextField idTextField;
	JTextField passwordTextField;

	
	public GoodsManageFrame(){
		init();
	}
	
	@Override
	public void initComponent() {
		ccUtil.setMainPanel(mainPanel);
		joinPanel= ccUtil.createPanel(width*3/10,height/4, width*35/100,height*225/1000);
		titlePanel= ccUtil.createPanel(width*4/10,height*50/600, width*3/10,height/20);
		
		titleLabel=ccUtil.createLabel(width*3/10, height/6, width*4/10, height/60*5, "회원가입",10);
		idLabel=ccUtil.createLabel(width/10, height/30, width*60/1000, height*30/600, "아 이 디  : ",10);
		passwordLabel=ccUtil.createLabel(width/10, height/30, width*60/1000, height*70/600, "패스워드 : ",10);
		
		idTextField=ccUtil.createTextField(width/1000*100, height/600*20, width/1000*150, height/600*30, 10);
		passwordTextField=ccUtil.createTextField(width/1000*100, height/600*20, width/1000*150, height/600*70, 10);
		
		okButton=ccUtil.createButton(width/1000*90, height/600*30, width/1000*40, height/600*110, "회원가입",10);	
		cancelButton=ccUtil.createButton(width/1000*90, height/600*30, width/1000*150, height/600*110, "취소",10);
	}
	

	
// 시계기능 구현
	@Override
	public void run() {
		while(true) {
			Calendar t = Calendar.getInstance();
			int year = t.get(Calendar.YEAR);
			int month = t.get(Calendar.MONTH)+1;
			int date = t.get(Calendar.DATE);
			int amPm = t.get(Calendar.AM_PM);
			int hour = t.get(Calendar.HOUR);
			int min = t.get(Calendar.MINUTE);
			int sec = (t.get(Calendar.SECOND) < 10) ? 0 + t.get(Calendar.SECOND) : t.get(Calendar.SECOND);
			String ampm=amPm==Calendar.AM? "AM":"PM";
			
						
			if((min<10) && (sec<10)) {
				String day1 = (year +"년 " + month + "월 " + date + "일 " + ampm + " " + hour + ":0" + min + ":0" + sec );
				time.setText(day1);
			} else if((min>10) && (sec<10)) {
				String day2 = (year +"년 " + month + "월 " + date + "일 " + ampm + " " + hour + ":" + min + ":0" + sec );
				time.setText(day2);
			} else if((min<10) && (sec>10)) {
				String day3 = (year +"년 " + month + "월 " + date + "일 " + ampm + " " + hour + ":0" + min + ":" + sec );
				time.setText(day3);
			} else {
				String day4 = (year +"년 " + month + "월 " + date + "일 " + ampm + " " + hour + ":" + min + ":" + sec );
				time.setText(day4);
			}
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
			
	}
	
	@Override
	public void addGui()
	{
		this.add(mainPanel);
		mainPanel.setLayout(null);
		mainPanel.setBackground(new Color(155,155,155));
		mainPanel.add(timePanel);
		timePanel.add(time);
		time.setBackground(new Color(52, 152, 219));
	
		mainPanel.add(exitBtn);	
	}
	
	@Override
	public void initEvent() {
	}
		
}
