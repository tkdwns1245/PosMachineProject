package ssz.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gui.util.CreateComponentUtil;

public class MainFrame  extends FrameTemplate3{
	CreateComponentUtil ccUtil = new CreateComponentUtil();
	Font plainFont = new Font("",Font.PLAIN,10);
	
	JPanel mainPanel;
	BorderLayout mainLayout = new BorderLayout();
	FlowLayout bottomSecondLayout = new FlowLayout();
	FlowLayout middleLayout = new FlowLayout();
	
	JPanel topPanel;
	JPanel middlePanel;
	JPanel bottomPanel;
	JPanel bottomFirstPanel;
	JPanel bottomSecondPanel;
	
	JPanel leftPanel;
	JPanel rightPanel;
	
	JPanel timePanel;
	JLabel dayLabel;
	JLabel timeLabel;
	JLabel idLabel;
	JLabel pagingLabel;
	
	JButton logoutButton;
	JButton leftPagingButton;
	JButton rightPagingButton;
	
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
		
		//mainPanel 초기화
		mainPanel= new JPanel();
		mainPanel.setLayout(mainLayout);
		mainPanel.setBackground(new Color(155,155,155));
		
		//Util에  default로 세팅해야 하는함
		ccUtil.setMainPanel(mainPanel);
		
		//topPanel 초기화
//		topPanel = (JPanel)ccUtil.createJcomponent("p",width,120, 0, 0);
		topPanel = new JPanel();
		topPanel.setBackground(Color.RED);
		topPanel.setLayout(new FlowLayout(FlowLayout.LEFT,65,10));
		idLabel = new JLabel("아이디");
		idLabel.setBorder(BorderFactory.createEmptyBorder(0, 475,0, 0));
		logoutButton = new JButton("로그아웃");
		
		//time패널 초기화
		timePanel = new JPanel();
		
		//label초기화
		dayLabel = new JLabel("2021/01/01");
		timeLabel = new JLabel("PM 04:09");
		
//		middlePanel = (JPanel)ccUtil.createJcomponent("p",width,300, 0,120);
		middlePanel = new JPanel();
		middlePanel.
		middlePanel.setBackground(Color.BLUE);
		
//		bottomPanel = (JPanel)ccUtil.createJcomponent("p",width,150,0,420);
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));
		bottomFirstPanel = new JPanel();
		bottomSecondPanel = new JPanel();
		bottomSecondLayout.setAlignment(FlowLayout.CENTER);
		bottomSecondLayout.setHgap(50);
		pagingLabel = new JLabel("1/3");
		
		bottomSecondPanel.setLayout(bottomSecondLayout);
		bottomPanel.setBackground(Color.GREEN);
		
//		leftPanel = (JPanel)ccUtil.createJcomponent("p",width,150,0,420);
		leftPanel = new JPanel();
		leftPanel.setLayout(new FlowLayout(FlowLayout.CENTER,5,220));
		leftPanel.setBackground(Color.YELLOW);
		
		rightPanel = new JPanel();
		rightPanel.setLayout(new FlowLayout(FlowLayout.CENTER,5,220));
		rightPanel.setBackground(Color.MAGENTA);
		
		leftPagingButton = new JButton("<<<");
		rightPagingButton = new JButton(">>>");
		
		salesStatusButton = new JButton("매출현황");
		goodsManageButton = new JButton("물품관리");
		receiptManageButton = new JButton("영수증관리");
		tableManageButton = new JButton("테이블관리");
		
	}
	
	@Override
	public void addGui() {
		this.add(mainPanel);
		
		timePanel.add(dayLabel);
		timePanel.add(timeLabel);
		topPanel.add(timePanel);
		topPanel.add(idLabel);
		topPanel.add(logoutButton);
		
		leftPanel.add(leftPagingButton);
		rightPanel.add(rightPagingButton);
		
		bottomFirstPanel.add(pagingLabel);
		bottomSecondPanel.add(salesStatusButton);
		bottomSecondPanel.add(goodsManageButton);
		bottomSecondPanel.add(receiptManageButton);
		bottomSecondPanel.add(tableManageButton);
		bottomPanel.add(bottomFirstPanel);
		bottomPanel.add(bottomSecondPanel);
		
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(middlePanel, BorderLayout.CENTER);
		mainPanel.add(bottomPanel, BorderLayout.SOUTH);
		mainPanel.add(leftPanel, BorderLayout.WEST);
		mainPanel.add(rightPanel, BorderLayout.EAST);
	}
	
	@Override
	public void initEvent() {
		//Helper이벤트를 추가
		JComponent[] jcomponentArray= {timePanel,leftPagingButton}; //컴포넌트 이동 드래그 기능을 추가할 컴포넌트들
		
		ccUtil.setComponentHelperEvent(jcomponentArray);		
		mainPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(mainPanel.getMousePosition());
			}
			
		});
		
	}
}
