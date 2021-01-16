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
	public JPanel createPanel(int sizeX,int sizeY,int coordiX,int coordiY) { //panel�� �� ��ư�� �Ҽ� �� �ǳ�
		JPanel tmpPanel=new JPanel();
		tmpPanel.setSize(sizeX,sizeY);
		tmpPanel.setLocation(coordiX,coordiY);
		return tmpPanel;
	}
	
	public JLabel createLabel(int sizeX,int sizeY,int coordiX,int coordiY,String Text,int fontsize) { //panel�� �� ��ư�� �Ҽ� �� �ǳ�
		JLabel New=new JLabel(Text);
		New.setSize(sizeX,sizeY);
		New.setLocation(coordiX,coordiY);
		
		return New;
	}
	
	public JTextField createTextField(int sizeX,int sizeY,int coordiX,int coordiY,int length) { //panel�� �� ��ư�� �Ҽ� �� �ǳ�
		JTextField New=new JTextField(length);
		New.setSize(sizeX,sizeY);
		New.setLocation(coordiX,coordiY);
		
		return New;
	}
	public JButton createButton(int sizeX,int sizeY,int coordiX,int coordiY,String Text,int fontsize) {
		JButton New=new JButton(Text);
		New.setSize(sizeX,sizeY);
		New.setLocation(coordiX,coordiY);
		return New;
	}
	
	//helper ����� �߰��ϴ� �̺�Ʈ
	public void setComponentHelperEvent(JComponent component)
	{
		JPanel parentPanel = (JPanel)component.getParent();
		if(guiHelpFunction==1)
		{
			component.addMouseListener(createMouseAdapter(component, parentPanel));
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
	
					reSize(component,(int) (component.getWidth()*ratioX),(int) (component.getHeight()*ratioY),(int) (component.getX()*ratioX),(int) (component.getY()*ratioY));
					}
				}
			});
		}catch(NullPointerException npe) {
			npe.printStackTrace();
			System.out.println("mainPanel �� setting�ϰ� ������ּ���.");
		}
	}
	//�гο� ����� �̺�Ʈ ����� �� �����ϴ� �Լ�(Ŭ�� �� moveComponent�� panel ������ drag�Ҽ� �ְ� �̺�Ʈ �߰�/����)
	public MouseAdapter createMouseAdapter (JComponent moveComponent,JPanel panel) {
		
		MouseAdapter m1=new MouseAdapter() {
			int func=-1;
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("abc");
				if(func==-1) {
					panel.addMouseMotionListener(new MouseAdapter() {
						@Override
						public void mouseDragged(MouseEvent e) {
							// TODO Auto-generated method stub
							moveComponent.move((int)panel.getMousePosition().getX(),(int)panel.getMousePosition().getY());
							System.out.println(moveComponent.getX()+","+moveComponent.getY());
						}
					}); 
					System.out.println("������ ���");
				}
				else if(func==1) {
					panel.removeMouseMotionListener(new MouseAdapter() {
						@Override
						public void mouseDragged(MouseEvent e) {
							// TODO Auto-generated method stub
							moveComponent.move((int)panel.getMousePosition().getX(),(int)panel.getMousePosition().getY());
							System.out.println(moveComponent.getX()+","+moveComponent.getY());
						}
					});
					System.out.println("������ ����");
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



	
