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

public class LoginFrame3 extends FrameTemplate3{
	JPanel mainPanel;
	CreateComponentUtil ccUtil = new CreateComponentUtil();
	Font plainFont = new Font("",Font.PLAIN,10);
	
	JPanel loginPanel;
	JPanel titlePanel;
	// 시간판넬
	JPanel timePanel;
	
	JLabel title;
	JLabel id;
	JLabel password;
	JLabel time;
	
	JTextField idTextField;
	JTextField passwordTextField;

	JButton loginBtn;
	JButton regiBtn; 
	JButton exitBtn;
	
	public LoginFrame3(){
		super.init();
	}
	
	@Override
	public void initComponent() {
		mainPanel= new JPanel();
		//Util에  default로 세팅해야 하는함
		ccUtil.setMainPanel(mainPanel);
		loginPanel= (JPanel)ccUtil.createJcomponent("p",width*3/10,height/4, width*35/100,height*225/1000);
		titlePanel= (JPanel)ccUtil.createJcomponent("p",width*4/10,height*50/600, width*3/10,height/20);
		timePanel = (JPanel)ccUtil.createJcomponent("p",width*25/100,height*25/600, width*5/100,height*1/10);
		
		title= (JLabel)ccUtil.createJcomponent("l",width*3/10, height/6, width*4/10, height/60*5);
		title.setText("POSmachine");
		title.setFont(plainFont);
		
		id= (JLabel)ccUtil.createJcomponent("l",width/10, height/30, width*60/1000, height*30/600);
		id.setText("아 이 디 : ");
		id.setFont(plainFont);
		
		password= (JLabel)ccUtil.createJcomponent("l",width/10, height/30, width*60/1000, height*70/600);
		password.setText("패스워드 : ");
		password.setFont(plainFont);
		
		idTextField= (JTextField)ccUtil.createJcomponent("tf",width/1000*100, height/600*20, width/1000*150, height/600*30);
		idTextField.setColumns(10);
		
		passwordTextField= (JTextField)ccUtil.createJcomponent("tf",width/1000*100, height/600*20, width/1000*150, height/600*70);
		passwordTextField.setColumns(10);
		
		loginBtn= (JButton)ccUtil.createJcomponent("b",width/1000*90, height/600*30, width/1000*40, height/600*110);	
		loginBtn.setText("로그인");
		loginBtn.setFont(plainFont);
		
		regiBtn= (JButton)ccUtil.createJcomponent("b",width/1000*90, height/600*30, width/1000*150, height/600*110); 
		regiBtn.setText("회원가입");
		regiBtn.setFont(plainFont);
		
		exitBtn= (JButton)ccUtil.createJcomponent("b",90, 30, 850, 500);
		exitBtn.setText("종료");
		exitBtn.setFont(plainFont);
	}
	@Override
	public void initEvent() {
		//Helper이벤트를 추가
		JComponent[] jcomponentArray= {titlePanel,title,time,exitBtn}; //컴포넌트 이동 드래그 기능을 추가할 컴포넌트들
		
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
		loginPanel.add(idTextField);
		loginPanel.add(passwordTextField);
		loginPanel.add(loginBtn);

		loginPanel.add(regiBtn);	
	}
}
