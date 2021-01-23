package LMH.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
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
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import gui.util.CreateComponentUtil;


public class GoodsManage extends FrameTemplete {
	CreateComponentUtil ccUtil = new CreateComponentUtil();
	
	
	JPanel mainPanel;
	JPanel timePanel;
	
	JPanel itemPanel;
	JPanel itemTitlePanel;
	JPanel itemDetail;
	JPanel itemContent;
	JPanel tableContent;
	JPanel tableField;
	JPanel tableValue;
	JPanel name;
	JPanel price;
	JPanel order;
	
	JPanel categoryPanel;
	JPanel categoryTitlePanel;
	JPanel categoryDetail;
	JPanel categoryContent;
	
	JLabel time;
	JLabel itemLabel;
	JLabel fieldName;
	JLabel categoryLabel;
	JLabel nameLabel;
	JLabel priceLabel;
	JLabel orderLabel;
	
		
	JButton itemAddButton;
	JButton categoryAddButton;
	
	JButton itemDelButton;
	JButton categoryDelButton;
	JButton saveButton;
	
	JTextField itemTextField;
	JTextField categoryTextField;
	
	public GoodsManage() {
		init();
	}
	@Override
	public void initComponent() {
		mainPanel = new JPanel();
		//Util��  default�� �����ؾ� �ϴ���
		ccUtil.setMainPanel(mainPanel);
		//�ð��� �г�, ���̺�
		timePanel= ccUtil.createPanel(width*23/100,height*4/100, width*5/100,height*50/1000);
		time=ccUtil.createLabel(width*3/10, height/6, width*4/10, height/60*5, "",10);
		
		//��ǰ�׸�  �г�
		itemPanel= ccUtil.createPanel(width*30/100,height*60/100, width*15/100,height*20/100);
		itemTitlePanel = ccUtil.createPanel(width*30/100,height*45/1000, 0,0);
		itemDetail=ccUtil.createPanel(width*30/100,height*955/1000, 0, height*45/1000);
		itemContent=ccUtil.createPanel(width/1000*205, height/600*200, width/1000*50, height/600*60);
		tableField=ccUtil.createPanel(width/1000*205, height/600*25, 0, 0);
		tableValue=ccUtil.createPanel(width/1000*205, height/600*575, 0, height/600*25);
		name=ccUtil.createPanel(width/1000*205/3, height/600*575, 0, 0);
		price=ccUtil.createPanel(width/1000*205/3, height/600*575, width/1000*205/3, 0);
		order=ccUtil.createPanel(width/1000*205/3, height/600*575, width/1000*205/3*2, 0);


		// ī�װ� �г�
		categoryTitlePanel = ccUtil.createPanel(width*30/100,height*45/1000, 0,0);
		categoryPanel= ccUtil.createPanel(width*30/100,height*60/100, width*55/100,height*20/100);
		categoryDetail= ccUtil.createPanel(width*30/100,height*955/1000, 0, height*45/1000);
		categoryContent=ccUtil.createPanel(width/1000*205, height/600*200, width/1000*50, height/600*60);


		//��ǰ�׸�, ī�װ� ������ 
		itemLabel=ccUtil.createLabel(width*30/100,height*45/1000, width*0/100, height*0/100, "�Ǹ��׸�()",10);
		fieldName=ccUtil.createLabel(width/1000*00, height/600*200, width/1000*50, height/600*60, "�� ��            �� ��            �� ��", 20);
		categoryLabel=ccUtil.createLabel(width*30/100,height*45/1000, width*0/100, height*0/100, "ī�װ�",10);
		nameLabel=ccUtil.createLabel(width/1000*205/3, height/600*575, width*0/100, height*0/100, "�� ��",10);
		priceLabel=ccUtil.createLabel(width/1000*205/3, height/600*575, width*0/100, height*0/100, "�� ��",10);
		orderLabel=ccUtil.createLabel(width/1000*205/3, height/600*575, width*0/100, height*0/100, "�� ��",10);
		
		//��ư 
		saveButton=ccUtil.createButton(width/15, height/600*30, width/1000*60, height/600*280, "�� ��", 12);
		itemAddButton=ccUtil.createButton(width/15, height/600*30, width/1000*190, height/600*15, "�� ��", 12);
		categoryAddButton=ccUtil.createButton(width/15, height/600*30, width/1000*190, height/600*15, "�� ��", 12);
		itemDelButton=ccUtil.createButton(width/15, height/600*30, width/1000*180, height/600*280, "�� ��", 12);
		categoryDelButton=ccUtil.createButton(width/15, height/600*30, width/1000*185, height/600*280, "�� ��", 12);
		
		//�ؽ�Ʈ �ʵ�
		itemTextField=ccUtil.createTextField(width/1000*120, height/600*20, width/1000*50, height/600*20, 10);
		categoryTextField=ccUtil.createTextField(width/1000*120, height/600*20, width/1000*50, height/600*20, 10);
		
	}

	@Override
	public void addGui() {
		this.add(mainPanel);
		
		// ��ǰ�׸� �г�
		mainPanel.setLayout(null);
		mainPanel.setBackground(new Color(155,155,155));
		mainPanel.add(timePanel);
		timePanel.add(time);
		
		mainPanel.add(itemPanel);
		itemPanel.setLayout(null);
		itemPanel.setBackground(new Color(100, 100, 100));
		itemPanel.add(itemTitlePanel);
		itemPanel.add(itemDetail);
		
		itemTitlePanel.add(itemLabel);
		
		itemPanel.add(itemDetail);
		itemDetail.setLayout(null);
		itemDetail.setBackground(new Color(30, 144, 255));

		itemDetail.add(itemTextField);
		itemDetail.add(itemAddButton);
		itemDetail.add(saveButton);
		itemDetail.add(itemDelButton);
		itemDetail.add(itemContent);
		itemContent.setLayout(null);

		itemContent.add(tableField);
		itemContent.add(tableValue);
		tableValue.setLayout(null);
		tableValue.add(name);


		name.add(nameLabel);
		tableValue.add(price);
		price.add(priceLabel);
		price.setBackground(new Color(223, 228, 234));
		tableValue.add(order);
		order.add(orderLabel);
		
		tableField.setBackground(new Color(186, 220, 88));
		tableField.add(fieldName);

		
         
		
		// ī�װ� �г�		
		
		mainPanel.add(categoryPanel);
		categoryPanel.setLayout(null);
		categoryPanel.setBackground(new Color(100, 100, 100));
		categoryPanel.add(categoryTitlePanel);
		categoryPanel.add(categoryDetail);
		
		
		categoryTitlePanel.add(categoryLabel);
		
		categoryPanel.add(categoryDetail);
		categoryDetail.setLayout(null);
		categoryDetail.setBackground(new Color(30, 144, 255));

		categoryDetail.add(categoryTextField);
		categoryDetail.add(categoryAddButton);
		categoryDetail.add(categoryDelButton);
		categoryDetail.add(categoryContent);
		
				
	}
	@Override
	public void initEvent() {
	}
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
				String day1 = (year +"�� " + month + "�� " + date + "�� " + ampm + " " + hour + ":0" + min + ":0" + sec );
				time.setText(day1);
			} else if((min>10) && (sec<10)) {
				String day2 = (year +"�� " + month + "�� " + date + "�� " + ampm + " " + hour + ":" + min + ":0" + sec );
				time.setText(day2);
			} else if((min<10) && (sec>10)) {
				String day3 = (year +"�� " + month + "�� " + date + "�� " + ampm + " " + hour + ":0" + min + ":" + sec );
				time.setText(day3);
			} else {
				String day4 = (year +"�� " + month + "�� " + date + "�� " + ampm + " " + hour + ":" + min + ":" + sec );
				time.setText(day4);
			}
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				
		}
				
		}
		
	}