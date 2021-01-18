package ssz.gui;

import java.awt.Color;


import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import gui.util.CreateComponentUtil;

public class LoginFrame3 extends FrameTemplate3{
	JPanel mainPanel;
	CreateComponentUtil ccUtil = new CreateComponentUtil();
	
	JPanel loginPanel;
	JPanel titlePanel;
	// �ð��ǳ�
	JPanel timePanel;
	
	JLabel title;
	JLabel id;
	JLabel password;
	JLabel time;
	
	JTextField idTF;
	JTextField passwordTF;

	JButton loginBtn;
	JButton regiBtn; 
	JButton exitBtn;
	
	public LoginFrame3(){
		super.init();
	}
	
	@Override
	public void initComponent() {
		mainPanel= new JPanel();
		//Util��  default�� �����ؾ� �ϴ���
		ccUtil.setMainPanel(mainPanel);
		loginPanel= ccUtil.createPanel(width*3/10,height/4, width*35/100,height*225/1000);
		titlePanel= ccUtil.createPanel(width*4/10,height*50/600, width*3/10,height/20);
		timePanel = ccUtil.createPanel(width*25/100,height*25/600, width*5/100,height*1/10);
		title=ccUtil.createLabel(width*3/10, height/6, width*4/10, height/60*5, "POSmachine",10);
		id=ccUtil.createLabel(width/10, height/30, width*60/1000, height*30/600, "�� �� ��  : ",10);
		password=ccUtil.createLabel(width/10, height/30, width*60/1000, height*70/600, "�н����� : ",10);
		time=ccUtil.createLabel(width/2, height/30, width*60/1000, height*70/600,"",10);
		idTF=ccUtil.createTextField(width/1000*100, height/600*20, width/1000*150, height/600*30, 10);
		passwordTF=ccUtil.createTextField(width/1000*100, height/600*20, width/1000*150, height/600*70, 10);
		loginBtn=ccUtil.createButton(width/1000*90, height/600*30, width/1000*40, height/600*110, "�α���",10);	
		regiBtn=ccUtil.createButton(width/1000*90, height/600*30, width/1000*150, height/600*110, "ȸ������",10); 
		exitBtn=ccUtil.createButton(90, 30, 850, 500, "����",10);
	}
	@Override
	public void initEvent() {
		//Helper�̺�Ʈ�� �߰�
		JComponent[] jcomponentArray= {titlePanel,title,time,exitBtn}; //������Ʈ �̵� �巡�� ����� �߰��� ������Ʈ��
		
		ccUtil.setComponentHelperEvent(jcomponentArray);		
		mainPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(mainPanel.getMousePosition());
			}
			
		});
	}
	@Override
	public void addGui()
	{
		this.add(mainPanel);
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
	}
}
