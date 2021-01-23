package gui.util;

import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CreateComponentUtil{

	static int guiHelpFunction=1;
	
	float initX=1000,initY=600;
	JPanel mainPanel;

	public CreateComponentUtil() {
	}
	public void setMainPanel(JPanel mainPanel)
	{
		this.mainPanel = mainPanel;
	}
	
	public JComponent createJcomponent(String type,int sizeX,int sizeY,int coordiX,int coordiY) {
		JComponent component;
		
		switch(type){
			case "p" : component=new JPanel(); break;
			case "P" : component=new JPanel(); break;
			
			case "l" : component=new JLabel(); break;
			case "L" : component=new JLabel(); break;
			
			case "tf" : component=new JTextField(); break;
			case "TF" : component=new JTextField(); break;
			case "tF" : component=new JTextField(); break;
			case "Tf" : component=new JTextField(); break;
			
			case "b" : component=new JButton(); break;
			case "B" : component=new JButton(); break;
			default : component=null;
		}
		
		component.setSize(sizeX,sizeY);
		component.setLocation(coordiX,coordiY);
		
		return component;
		
	}
	
//	public JPanel createPanel(int sizeX,int sizeY,int coordiX,int coordiY) { //panel은 이 버튼이 소속 될 판넬
//		JPanel tmpPanel=new JPanel();
//		tmpPanel.setSize(sizeX,sizeY);
//		tmpPanel.setLocation(coordiX,coordiY);
//		return tmpPanel;
//	}
//	
//	public JLabel createLabel(int sizeX,int sizeY,int coordiX,int coordiY,String Text,int fontsize) { //panel은 이 버튼이 소속 될 판넬
//		JLabel New=new JLabel(Text);
//		New.setSize(sizeX,sizeY);
//		New.setLocation(coordiX,coordiY);
//		
//		return New;
//	}
//	
//	public JTextField createTextField(int sizeX,int sizeY,int coordiX,int coordiY,int length) { //panel은 이 버튼이 소속 될 판넬
//		JTextField New=new JTextField(length);
//		New.setSize(sizeX,sizeY);
//		New.setLocation(coordiX,coordiY);
//		
//		return New;
//	}
//	public JButton createButton(int sizeX,int sizeY,int coordiX,int coordiY,String Text,int fontsize) {
//		JButton New=new JButton(Text);
//		New.setSize(sizeX,sizeY);
//		New.setLocation(coordiX,coordiY);
//		return New;
//	}
	
	//helper 기능을 추가하는 이벤트
	int i=0; //컴포넌트 번호
	public void setComponentHelperEvent(JComponent[] component)
	{
		
		for(i=0;i<component.length;i++)
		{
			if(component[i].getParent()==null)System.out.println("여기"+i);
		JPanel parentPanel = (JPanel)component[i].getParent();
		if(guiHelpFunction==1)
		{
			component[i].addMouseListener(createMouseAdapter(component[i], parentPanel));
		}
		try {
			mainPanel.addComponentListener(new ComponentAdapter() {
	
				@Override
				public void componentResized(ComponentEvent e) {
					// TODO Auto-generated method stub
					if(parentPanel.getLayout()==null)
					{
					float presentX=mainPanel.getWidth();
					float presentY=mainPanel.getHeight();
					
					float ratioX=presentX/initX; if(ratioX<1) ratioX=1;
					float ratioY=presentY/initY; if(ratioY<1) ratioY=1;
					
				
					reSize(component[i],(int) (component[i].getWidth()*ratioX),(int) (component[i].getHeight()*ratioY),(int) (component[i].getX()*ratioX),(int) (component[i].getY()*ratioY));
					}
				}
			});
		}catch(NullPointerException npe) {
			npe.printStackTrace();
			System.out.println("mainPanel 을 setting하고 사용해주세요.");
		}
		}
		i=0;
	}
	//패널에 등록할 이벤트 어댑터 를 생성하는 함수(클릭 시 moveComponent를 panel 내에서 drag할수 있게 이벤트 추가/제거)
	public MouseAdapter createMouseAdapter (JComponent moveComponent,JPanel panel) {
		
		MouseAdapter getComponentPosition=new MouseAdapter() { //moveComponent가 마우스를 따라가며 panel에서의 위치를 프린트하는 마우스 어뎁터

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				moveComponent.move((int)panel.getMousePosition().getX(),(int)panel.getMousePosition().getY());
				System.out.println(moveComponent.getX()+","+moveComponent.getY());
			}
			
		};
		
		MouseAdapter m1=new MouseAdapter() {
			int func=-1;
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
			
				if(func==-1) {
					panel.addMouseMotionListener(getComponentPosition);

					System.out.println("리스너 등록");
				}
				else if(func==1) {
					panel.removeMouseMotionListener(getComponentPosition);

					System.out.println("리스너 삭제");
				}
				func*=-1;
				
			}

		};
		return m1;
	};
	public void reSize(JComponent hey,int sizeX,int sizeY,int coordiX,int coordiY)
	{
		
		hey.resize(sizeX,sizeY);
		hey.move(coordiX,coordiY);
		
	}
}



	
