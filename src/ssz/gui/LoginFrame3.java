package ssz.gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import gui.util.CreateObject;

public class LoginFrame3 extends FrameTemplate3{
	CreateObject CO=new CreateObject();
	
	JPanel mainPanel= new JPanel();
	JPanel loginPanel= CO.setPanel(width*3/10,height/4, width*35/100,height*225/1000);
	JPanel titlePanel= CO.setPanel(width*4/10,height*50/600, width*3/10,height/20);
	// 시간판넬
	JPanel timePanel = CO.setPanel(width*25/100,height*25/600, width*5/100,height*1/10);
	
	JLabel title=CO.setLabel(width*3/10, height/6, width*4/10, height/60*5, "POSmachine");
	JLabel id=CO.setLabel(width/10, height/30, width*60/1000, height*30/600, "아 이 디  : ");
	JLabel password=CO.setLabel(width/10, height/30, width*60/1000, height*70/600, "패스워드 : ");
	JLabel time=CO.setLabel(width/2, height/30, width*60/1000, height*70/600,"");
	
	JTextField idTF=CO.setTextField		(width/1000*100, height/600*20, width/1000*150, height/600*30, 10);
	JTextField passwordTF=CO.setTextField(width/1000*100, height/600*20, width/1000*150, height/600*70, 10);

	JButton loginBtn=CO.setButton(width/1000*90, height/600*30, width/1000*40, height/600*110, "로그인");	
	JButton regiBtn=CO.setButton(width/1000*90, height/600*30, width/1000*150, height/600*110, "회원가입"); 
	JButton exitBtn=CO.setButton(width/1000*90, height/600*30, width/1000*850, height/600*500, "종료");
	public LoginFrame3()
	{
		init();
	}
	
	@Override
	public void initComponent() {
		// Component 변수 선언

		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void initEvent() {
		// TODO Auto-generated method stub
		
	}
	
}
