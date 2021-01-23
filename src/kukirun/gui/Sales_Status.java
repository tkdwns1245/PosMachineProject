package kukirun.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ListUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import gui.util.CreateComponentUtil;


public class Sales_Status extends FrameTemplate3{
	DBconnection_SalesDetail connection=new DBconnection_SalesDetail();
	
	
	CreateComponentUtil ccUtil = new CreateComponentUtil();
	JPanel mainPanel;

	
	JLabel titleLabel;
	
	JLabel yearLabel;
	JPanel yearListPanel;
	JComboBox<Integer> yearList;
	
	JLabel monthLabel;
	JPanel monthListPanel;	
	JComboBox<Integer> monthList;
	
	JButton checkBtn;
	
	JTabbedPane tab;
	JPanel contentPanel;
	JLabel contentNowLabel;
	JPanel saleCalendarPanel;
	JPanel detailPanel;
	JTable sale_table;
	ArrayList<JList> jlistList;
	ArrayList<Integer> arr= new ArrayList<Integer>();
	
	JPanel summaryPanel;
	JPanel summary_sumPrice_Panel;
	JTextField summary_sumPrice_TextField;
	JPanel summary_Count_Panel;
	JTextField summary_Count_TextField;
	
	
	
	public Sales_Status() {
		init();
	}
	
	
	@Override
	public void initComponent() {
		mainPanel = new JPanel();
		//Util��  default�� �����ؾ� �ϴ���
		ccUtil.setMainPanel(mainPanel);

		mainPanel.setLayout(null);
		mainPanel.setBackground(new Color(0x4F81BD));
		
		titleLabel=(JLabel)ccUtil.createJcomponent("l",200, 50,10, 0);
		titleLabel.setText("���� ��Ȳ");
		titleLabel.setForeground(Color.white);
		titleLabel.setFont(new Font("���� ���",Font.BOLD, 25));
		
		yearLabel=(JLabel)ccUtil.createJcomponent("l", 50, 50, 140, 0);
		yearLabel.setText("Year");
		yearLabel.setFont(new Font("���� ���",Font.BOLD, 15));

		yearListPanel=(JPanel)ccUtil.createJcomponent("p", 100, 20, 180, 15);
		yearListPanel.setLayout(new GridLayout(1,1));
		
		yearList=new JComboBox<Integer>(new Integer[] {null,2020,2021,2022});
		
		monthLabel=(JLabel)ccUtil.createJcomponent("l",200, 50,305, 0);
		monthLabel.setText("Month");
		monthLabel.setFont(new Font("���� ���",Font.BOLD, 15));
		
		
		monthListPanel=(JPanel)ccUtil.createJcomponent("p",100, 20, 360, 15);
		monthListPanel.setLayout(new GridLayout(1,1));
		
		monthList=new JComboBox<Integer>(new Integer[] {null,1,2,3,4,5,6,7,8,9,10,11,12});
		
		checkBtn=(JButton)ccUtil.createJcomponent("b",80, 20, 505,15);
		checkBtn.setText("��ȸ");
		checkBtn.setFont(new Font("���� ���",Font.BOLD, 10));
				
		tab=new JTabbedPane();
		
		contentPanel=(JPanel)ccUtil.createJcomponent("p",955, 495, 15, 55);
		contentPanel.setLayout(new GridLayout());
		contentPanel.setBackground(new Color(0x4F81BD));
		
		contentNowLabel=(JLabel)ccUtil.createJcomponent("l",200, 50, 850, 15);
		contentNowLabel.setForeground(Color.white);
		contentNowLabel.setText("�ȳ�");
		contentNowLabel.setFont(new Font("���� ���",Font.BOLD, 25));
				
		saleCalendarPanel=new JPanel();
	    saleCalendarPanel.setBackground(new Color(0xFFFFFF));
	    saleCalendarPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		detailPanel=new JPanel();
		detailPanel.setLayout(new GridLayout());
		detailPanel.setBackground(new Color(0x4F81BD));
		
		sale_table=new JTable();
		
		summaryPanel=new JPanel();
		summaryPanel.setLayout(null);
		summaryPanel.setBackground(new Color(0x4F81BD));
		
		summary_Count_Panel=(JPanel)ccUtil.createJcomponent("p",300, 50, 80, 80);
		summary_Count_Panel.setLayout(new GridLayout());
		summary_Count_Panel.setBackground(new Color(0xFFFFFF));	
		
		summary_Count_TextField=new JTextField();
		summary_Count_TextField.setFont(new Font("���� ���",Font.BOLD, 20));
		summary_Count_TextField.setHorizontalAlignment(SwingConstants.CENTER);
		
		summary_sumPrice_Panel=(JPanel)ccUtil.createJcomponent("p",300, 50, 580, 80);
		summary_sumPrice_Panel.setLayout(new GridLayout());
		summary_sumPrice_Panel.setBackground(new Color(0xFFFFFF));
		
		summary_sumPrice_TextField=new JTextField();
		summary_sumPrice_TextField.setFont(new Font("���� ���",Font.BOLD, 20));
		summary_sumPrice_TextField.setHorizontalAlignment(SwingConstants.CENTER);
		
	    jlistList=new ArrayList<JList>();
		
	}
	
	
	@Override
	public void addGui() {
		this.add(mainPanel);
		
		mainPanel.add(yearListPanel);
		mainPanel.add(monthListPanel);
		mainPanel.add(yearLabel);
		mainPanel.add(monthLabel);
		mainPanel.add(checkBtn);
		mainPanel.add(contentPanel);
		mainPanel.add(contentNowLabel);
		mainPanel.add(titleLabel);
		
		yearListPanel.add(yearList);
	
		monthListPanel.add(monthList);

		contentPanel.add(tab);
				
		tab.addTab("calendar", saleCalendarPanel);
		tab.addTab("datail", detailPanel);

		summaryPanel.add(summary_Count_Panel);

		summary_Count_Panel.add(summary_Count_TextField);
		
		summaryPanel.add(summary_sumPrice_Panel);

		summary_sumPrice_Panel.add(summary_sumPrice_TextField);
}
	
	@Override
	public void initEvent() {
		//Helper�̺�Ʈ�� �߰�
		JComponent[] jcomponentArray= {titleLabel,yearLabel,yearListPanel,contentNowLabel}; //������Ʈ �̵� �巡�� ����� �߰��� ������Ʈ��
		
		ccUtil.setComponentHelperEvent(jcomponentArray);		
		mainPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(mainPanel.getMousePosition());
			}
			
		});
		
		
		checkBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) { //�ش� ���� ���� �޷� ����� ������ ������ ����
				// TODO Auto-generated method stub
				
				if(monthList.getSelectedItem()!=null) { //month�޺��ڽ��� null�� �ƴϸ� �ش� ���� day�� ��µǴ� �޷� ����� �ش� ���� �� ������ ����
					CreateSaleCalender_Day((int) monthList.getSelectedItem()); 
					CreateMonthDetail();
				}
				else { //month�޺��ڽ��� null�̸� �⵵�� month�� ��µǴ� �޷� ����� �ش� �⵵�� �� ������ ����
					CreateSaleCalender_Month();
					CreateYearDetail();
				}
				
			}
			
		});
		
		
	}
	
	int createMonth=0;
	int[] yearMonthDay= {0,0,0};
	public void CreateSaleCalender_Month() { // �ش� �⵵�� 1~12�� �ǳ� ����
		jlistList.clear();
		saleCalendarPanel.removeAll();
		saleCalendarPanel.setLayout(new GridLayout(2,6,5,5));
		
		yearMonthDay[0]=(int) yearList.getSelectedItem();
		contentNowLabel.setText(yearMonthDay[0]+"��");
		
		
		if(yearList.getSelectedItem()==null) return;
	
		
		jlistList = new ArrayList<JList>();
		for(createMonth=0;createMonth<12;createMonth++) {
			DecimalFormat addcomma=new DecimalFormat("###,###");
			int month_sales=connection.getMonthSales((int)yearList.getSelectedItem(),(createMonth+1));
			
			
			DefaultListModel<String> lmodel=new DefaultListModel<String>();
			lmodel.addElement((createMonth+1)+"��");
			lmodel.addElement("��");
			lmodel.addElement("��");
			lmodel.addElement("��");
			lmodel.addElement("���� : "+addcomma.format(month_sales));
			
			
			JList<String> monthJlist=new JList<String>(lmodel);
			
			DefaultListCellRenderer renderer = (DefaultListCellRenderer) monthJlist.getCellRenderer();
			renderer.setHorizontalAlignment(SwingConstants.CENTER); 
			renderer.setVerticalAlignment(SwingConstants.CENTER);
			monthJlist.setBorder(BorderFactory.createEmptyBorder(35, 0, 0, 0));
			monthJlist.setFont(new Font("���� ���",Font.BOLD, 20));
		
			jlistList.add(monthJlist);			
			monthJlist.setBackground(new Color(0xC6D9F1));
			
			String name=String.valueOf(createMonth+1);
			monthJlist.setName(name);
			monthJlist.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					contentNowLabel.setText(yearMonthDay[0]+"��"+name+"��");
					CreateSaleCalender_Day(Integer.valueOf(name));
					CreateMonthDetail();
				}
				
			});
			
			
			saleCalendarPanel.add(monthJlist);			
			saleCalendarPanel.setVisible(false);
			
		}
		createMonth=0;
		System.out.println("��ȸ �Ϸ�");
	}
	
	int createDay=0;
	public void CreateSaleCalender_Day(int month) { // �ش� ���� 1~31�� �޷� ����
		
		jlistList.clear();
		saleCalendarPanel.removeAll();
		saleCalendarPanel.setLayout(new GridLayout(5,7,5,5));
		yearMonthDay[0]=(int)yearList.getSelectedItem();

		yearMonthDay[1]=month;
		
		if(monthList.getSelectedItem()!=null) contentNowLabel.setText(yearMonthDay[0]+"��"+yearMonthDay[1]+"��");
		
		if(yearList.getSelectedItem()==null) return;
		
		
		jlistList = new ArrayList<JList>();
		for(int createDay=1;createDay<32;createDay++) {
			int day_sales=connection.getDaySales((int)yearList.getSelectedItem(),month,(createDay));
			DecimalFormat addcomma=new DecimalFormat("###,###");
			
			DefaultListModel<String> lmodel=new DefaultListModel<String>();
			lmodel.addElement((createDay)+"��");
			lmodel.addElement("��");
			lmodel.addElement("���� : "+addcomma.format(day_sales));
			
			
			JList<String> dayJlist=new JList<String>(lmodel);
			
			DefaultListCellRenderer renderer = (DefaultListCellRenderer) dayJlist.getCellRenderer();
			renderer.setHorizontalAlignment(SwingConstants.CENTER); 
			renderer.setVerticalAlignment(SwingConstants.CENTER);
			dayJlist.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
			dayJlist.setFont(new Font("���� ���",Font.BOLD, 20));
			
			dayJlist.setName(String.valueOf(createDay));
		
			jlistList.add(dayJlist);			
			jlistList.get(createDay-1).setBackground(new Color(0xC6D9F1));

		
			dayJlist.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					CreateDayDetail(Integer.valueOf(dayJlist.getName()));
				}
				
			});
			
			
			saleCalendarPanel.add(dayJlist);			
			saleCalendarPanel.setVisible(false);
			
		}
		createDay=0;
		System.out.println("��ȸ �Ϸ�");
	}
	
	
	public void CreateDayDetail(int day) { //�޷¿��� Day �ǳ��� Ŭ�� ���� �� Day�� �� ������ ����
		
		jlistList.clear();
		saleCalendarPanel.removeAll();
		saleCalendarPanel.setLayout(new GridLayout(1,1,10,10));
		
		yearMonthDay[2]=day;
		
		JTable day_Sales_Table=new JTable();
		
		Object[] header = {"������ ��ȣ","�޴� ī�װ�","�޴�","�ݾ�","����","�޴��� �� �ݾ�","�� �ݾ�"};
	    Object[][] data = connection.getDayDetails(yearMonthDay[0], yearMonthDay[1], yearMonthDay[2]);
	    
	    DefaultTableModel dtm = new DefaultTableModel(data, header);
	    day_Sales_Table.setModel(dtm);
	    
	    
	    
	    DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) day_Sales_Table.getDefaultRenderer(getClass());
		renderer.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		day_Sales_Table.setDefaultRenderer(day_Sales_Table.getColumnClass(0), renderer);
	   
		
	    JScrollPane sp=new JScrollPane(day_Sales_Table);
	    sp.setBorder(new LineBorder(Color.black, 2));
	    
		saleCalendarPanel.add(sp);	
		saleCalendarPanel.setVisible(false);
			
		
		
		System.out.println("��ȸ �Ϸ�");
	}
	int test=-1;
	public void CreateYearDetail() { //�ش� �⵵�� �� ������ ����
		
	
		detailPanel.removeAll();
		detailPanel.setLayout(new GridLayout(2,1,10,10));
		
		JTable year_Sales_Table=new JTable();
		
		Object[] header = {"������ ��ȣ","�޴� ī�װ�","�޴�","�ݾ�","����","�޴��� �� �ݾ�","�� �ݾ�"};
	    Object[][] data = connection.getYearDetails(yearMonthDay[0]);
	 
	    DefaultTableModel dtm = new DefaultTableModel(data, header);
	    year_Sales_Table.setModel(dtm);
	    
	    DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) year_Sales_Table.getDefaultRenderer(getClass());
		renderer.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		year_Sales_Table.setDefaultRenderer(year_Sales_Table.getColumnClass(0), renderer);
	   
		
	    JScrollPane sp=new JScrollPane(year_Sales_Table);
	    sp.setBorder(new LineBorder(Color.black, 2));
	    
	    int salecount=0,sum=0;
	    for(int i=0; i<data.length; i++) {
	    		if(data[i][0]!=null) {
	    			salecount+=1;
	    		}
	    	
	    		
	    		if(data[i][6]!=null) {
	    			String str=(String)data[i][6];
	    			str=str.replaceAll(",", "");
	    	    	
		    		sum+=Integer.valueOf(str);
	    		}
	    		
	    }
	  
	
	    DecimalFormat addcomma=new DecimalFormat("###,###");

	    summary_Count_TextField.setText("�ǸŰǼ� : "+salecount);
	    summary_sumPrice_TextField.setText("�� �ݾ� : "+addcomma.format(sum)+"��");
	
	    
	    detailPanel.add(sp);	
	    detailPanel.add(summaryPanel);	
	 

	}
	
public void CreateMonthDetail() { //�ش� ���� �� ������ ����
		
	
		detailPanel.removeAll();
		detailPanel.setLayout(new GridLayout(2,1,10,10));
		
		JTable month_Sales_Table=new JTable();
		
		Object[] header = {"������ ��ȣ","�޴� ī�װ�","�޴�","�ݾ�","����","�޴��� �� �ݾ�","�� �ݾ�"};
	    Object[][] data = connection.getMonthDetails(yearMonthDay[0],yearMonthDay[1]);
	 
	    DefaultTableModel dtm = new DefaultTableModel(data, header);
	    month_Sales_Table.setModel(dtm);
	    
	    DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) month_Sales_Table.getDefaultRenderer(getClass());
		renderer.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		month_Sales_Table.setDefaultRenderer(month_Sales_Table.getColumnClass(0), renderer);
	   
		
	    JScrollPane sp=new JScrollPane(month_Sales_Table);
	    sp.setBorder(new LineBorder(Color.black, 2));
	    
	    int count=0,sum=0;
	    for(int i=0; i<data.length; i++) {
	    		if(data[i][0]!=null) {
	    			count+=1;
	    		}
	    		
	    		if(data[i][6]!=null) {
	    			String str=(String)data[i][6];
	    			str=str.replaceAll(",", "");
	    	    	
		    		sum+=Integer.valueOf(str);
	    		}
	    		
	    }
	    
	    DecimalFormat addcomma=new DecimalFormat("###,###");
	    
	    summary_Count_TextField.setText("�ǸŰǼ� : "+count);
	    summary_sumPrice_TextField.setText("�� �ݾ� : "+addcomma.format(sum));
	    
	    detailPanel.add(sp);	
	    detailPanel.add(summaryPanel);	

	   

	}
	

	
}
