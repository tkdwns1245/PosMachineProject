package LMH.gui;

import java.awt.Color;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import gui.util.CreateComponentUtil;

public class ReceiptManage extends FrameTemplete {
	CreateComponentUtil ccUtil = new CreateComponentUtil();

	
	JPanel mainPanel;
	JPanel timePanel;
	
	JPanel paymentPanel;
	JPanel paymentTitlePanel;
	JPanel paymentDetail;
	JPanel paymentContent;
	JPanel tableContent;
	JPanel tableField1;
	JPanel tableValue1;
	JPanel payPrice;
	JPanel payTime;
	
	JPanel tableField2;
	JPanel tableValue2;
	JPanel total;
	JPanel history;
	JPanel times;
	JPanel price;
	
	
	JPanel detailPanel;
	JPanel detailTitlePanel;
	JPanel detail;
	JPanel detailContent;
	
	JLabel time;
	JLabel dateLabel;
	JLabel fieldName1;
	JLabel fieldName2;
		JLabel deatailLabel;
	JLabel payPriceLabel;
	JLabel payTimeLabel;
	
	JLabel totalLabel;
	JLabel historyLabel;
	JLabel priceLabel;
	JLabel timesLabel;
	
	
		
	JButton receiptPrintButton;
	JButton returnButton;
	
	JTextField itemTextField;  // ��¥ ����â ���� �ʿ�
	
	public ReceiptManage() {
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
		
		// ��������  �г�
		paymentPanel= ccUtil.createPanel(width*30/100,height*60/100, width*15/100,height*20/100);
		paymentTitlePanel = ccUtil.createPanel(width*30/100,height*45/1000, 0,0);
		paymentDetail=ccUtil.createPanel(width*30/100,height*955/1000, 0, height*45/1000);
		paymentContent=ccUtil.createPanel(width/1000*205, height/600*200, width/1000*50, height/600*60);
		tableField1=ccUtil.createPanel(width/1000*205, height/600*25, 0, 0);
		tableValue1=ccUtil.createPanel(width/1000*205, height/600*575, 0, height/600*25);
		
		payPrice=ccUtil.createPanel(width/1000*205/2, height/600*575, 0, 0);
		payTime=ccUtil.createPanel(width/1000*205/2, height/600*575, width/1000*205/2, 0);
		
		
		// �󼼳��� �г�
		detailTitlePanel = ccUtil.createPanel(width*30/100,height*45/1000, 0,0);
		detailPanel= ccUtil.createPanel(width*30/100,height*60/100, width*55/100,height*20/100);
		detail= ccUtil.createPanel(width*30/100,height*955/1000, 0, height*45/1000);
		detailContent=ccUtil.createPanel(width/1000*205, height/600*220, width/1000*50, height/600*40);
		tableField2=ccUtil.createPanel(width/1000*205, height/600*25, 0, 0);
		tableValue2=ccUtil.createPanel(width/1000*205, height/600*170, 0, height/600*25);
		total=ccUtil.createPanel(width/1000*205, height/600*25, 0, height/600*195);

		history=ccUtil.createPanel(width/1000*205/3, height/600*575, 0, 0);
		times=ccUtil.createPanel(width/1000*205/3, height/600*575, width/1000*205/3, 0);
		price=ccUtil.createPanel(width/1000*205/3, height/600*575, width/1000*205/3*2, 0);

		// ��������, �󼼳��� ���̺�
		dateLabel=ccUtil.createLabel(width*30/100,height*45/1000, width*0/100, height*0/100, "��¥����",10);
		fieldName1=ccUtil.createLabel(width/1000*00, height/600*200, width/1000*50, height/600*60, "   �����ݾ�                  �����ð�   ", 20);
		payPriceLabel=ccUtil.createLabel(width/1000*205/2, height/600*575, width*0/100, height*0/100, "20,000��",10);
		payTimeLabel=ccUtil.createLabel(width/1000*205/2, height/600*575, width*0/100, height*0/100, "17:55",10);
		
		
		deatailLabel=ccUtil.createLabel(width*30/100,height*45/1000, width*0/100, height*0/100, "�󼼳���",10);
		fieldName2=ccUtil.createLabel(width/1000*00, height/600*200, width/1000*50, height/600*60, " �� ��           ����Ƚ��          �� ��  ", 20);
		totalLabel=ccUtil.createLabel(width/1000*205, height/600*25, width*0/100, height*0/100, " �����ݾ� : 20,000��(card) ", 20);
		historyLabel=ccUtil.createLabel(width/1000*205/3, height/600*575, width*0/100, height*0/100, "�� ��",10);
		timesLabel=ccUtil.createLabel(width/1000*205/3, height/600*575, width*0/100, height*0/100, "1",10);
		priceLabel=ccUtil.createLabel(width/1000*205/3, height/600*575, width*0/100, height*0/100, "20,000��",10);
		
		
		//��ư 
		
		receiptPrintButton=ccUtil.createButton(width/10, height/600*30, width/1000*60, height/600*280, "������ ���", 12);
		returnButton=ccUtil.createButton(width/15, height/600*30, width/1000*185, height/600*280, "�� ǰ", 12);
		
		//�ؽ�Ʈ �ʵ�
		itemTextField=ccUtil.createTextField(width/1000*120, height/600*20, width/1000*50, height/600*20, 10);
		
	}

	@Override
	public void addGui() {
		this.add(mainPanel);
		
		// ��ǰ�׸� �г�
		mainPanel.setLayout(null);
		mainPanel.setBackground(new Color(155,155,155));
		mainPanel.add(timePanel);
		timePanel.add(time);
		
		mainPanel.add(paymentPanel);
		paymentPanel.setLayout(null);
		paymentPanel.setBackground(new Color(100, 100, 100));
		paymentPanel.add(paymentTitlePanel);
		paymentPanel.add(paymentDetail);
		
		paymentTitlePanel.add(dateLabel);
		
		paymentPanel.add(paymentDetail);
		paymentDetail.setLayout(null);
		paymentDetail.setBackground(new Color(30, 144, 255));

		paymentDetail.add(itemTextField);
		paymentDetail.add(paymentContent);
		paymentContent.setLayout(null);

		paymentContent.add(tableField1);
		tableField1.setBackground(new Color(186, 220, 88));
		tableField1.add(fieldName1);
		
		paymentContent.add(tableValue1);
		tableValue1.setLayout(null);
		tableValue1.add(payPrice);
		payPrice.setBackground(new Color(223, 228, 234));
		payPrice.add(payPriceLabel);
		tableValue1.add(payTime);
		payTime.add(payTimeLabel);
				
    
		// ī�װ� �г�		
		
		mainPanel.add(detailPanel);
		detailPanel.setLayout(null);
		detailPanel.setBackground(new Color(100, 100, 100));
		detailPanel.add(detailTitlePanel);
		detailPanel.add(detail);
		
		
		detailTitlePanel.add(deatailLabel);
		
		detailPanel.add(detail);
		detail.setLayout(null);
		detail.setBackground(new Color(30, 144, 255));

		detail.add(receiptPrintButton);
		detail.add(returnButton);
		detail.add(detailContent);
		detailContent.setLayout(null);
		
		detailContent.add(tableField2);
		tableField2.setBackground(new Color(186, 220, 88));
		tableField2.add(fieldName2);
			
		detailContent.add(tableValue2);
		tableValue2.setLayout(null);
	
		tableValue2.add(history);
		history.add(historyLabel);
		tableValue2.add(times);
		times.add(timesLabel);
		times.setBackground(new Color(223, 228, 234));

		tableValue2.add(price);
		price.add(priceLabel);
	
		detailContent.add(total);
		total.add(totalLabel);
		total.setBackground(new Color(236, 204, 104));

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

