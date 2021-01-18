package ssz.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import gui.util.CreateComponentUtil;

public class JoinFrame extends FrameTemplate3{
	CreateComponentUtil ccUtil = new CreateComponentUtil();
	JPanel mainPanel;

	JPanel titlePanel;
	JPanel joinPanel;
	JPanel bottomPanel;
	
	JLabel titleLabel;
	JLabel idLabel;
	JLabel passwordLabel;
	
	JButton okButton;
	JButton cancelButton;
	
	JTextField idTextField;
	JTextField passwordTextField;
	
	public JoinFrame() {
		init();
	}
	@Override
	public void initComponent() {
		mainPanel = new JPanel();
		//Util에  default로 세팅해야 하는함
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
	@Override
	public void addGui() {
		this.add(mainPanel);
		mainPanel.setLayout(null);
		mainPanel.setBackground(new Color(155,155,155));
		mainPanel.add(joinPanel);
		mainPanel.add(titlePanel);
		
		titlePanel.setLayout(new GridBagLayout());
		titlePanel.setBackground(new Color(100,100,100));
		titleLabel.setForeground(Color.white);
		titleLabel.setFont(new Font("맑은 고딕",Font.BOLD, 20));
		titlePanel.add(titleLabel);
				
		joinPanel.setLayout(null);
		idLabel.setFont(new Font("맑은 고딕",Font.PLAIN,13));
		passwordLabel.setFont(new Font("맑은 고딕",Font.PLAIN,13));
		joinPanel.add(idLabel);
		joinPanel.add(passwordLabel);
		
		joinPanel.add(idTextField);
		joinPanel.add(passwordTextField);
		joinPanel.add(okButton);
		joinPanel.add(cancelButton);	

		
		
	}
	@Override
	public void initEvent() {
	}
	
}
