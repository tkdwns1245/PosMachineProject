package ssz.gui;

import java.awt.Color;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import gui.util.CreateComponentUtil;

public class MainFrame  extends FrameTemplate3{
	CreateComponentUtil ccUtil = new CreateComponentUtil();
	JPanel mainPanel;
	
	JPanel topPanel;
	JPanel middlePanel;
	JPanel bottomPanel;
	
	JPanel mLeftPanel;
	JPanel mCenterPanel;
	JPanel mRightPanel;
	
	List<JButton> tableButtonList;
	JButton salesStatusButton;
	JButton goodsManageButton;
	JButton receiptManageButton;
	JButton tableManageButton;
	
	public MainFrame() {
		super.init();
	}
	
	@Override
	public void initComponent() {
		mainPanel= new JPanel();
		//Util에  default로 세팅해야 하는함
		ccUtil.setMainPanel(mainPanel);
		topPanel = ccUtil.createPanel(width,120, 0, 0);
		topPanel.setBackground(Color.RED);
		middlePanel = ccUtil.createPanel(width,300, 0,120);
		middlePanel.setBackground(Color.BLUE);
		bottomPanel = ccUtil.createPanel(width,150,0,420);
		bottomPanel.setBackground(Color.GREEN);
		
	}
	
	@Override
	public void addGui() {
		this.add(mainPanel);
		mainPanel.setLayout(null);
		mainPanel.setBackground(new Color(155,155,155));
		
		mainPanel.add(topPanel);
		mainPanel.add(middlePanel);
		mainPanel.add(bottomPanel);
	}
	
	@Override
	public void initEvent() {
		// TODO Auto-generated method stub
		
	}
}
