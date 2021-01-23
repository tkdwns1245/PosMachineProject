package kukirun.gui;



import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.Scanner;

public class DBConnection {
	
	//DB로그인 정보
	private static final String DB_URL = "jdbc:mysql://ssjdatabase.ceqqrjstuth3.ap-northeast-2.rds.amazonaws.com";
	private static final String USERNAME = "ssjdbadmin"; // DB ID 
	private static final String PASSWORD = "tkdwnsDBAdmin"; // DB Password 
	
	//테이블 정의
	public static final String USER_TABLE="ssjplace.USER";
	public static final String MENU_TABLE="ssjplace.MENU";
	public static final String RECEIPT_TABLE="ssjplace.RECEIPT";
	public static final String SALE_DETAILS_TABLE="ssjplace.SALE_DETAILS";

	//DB연결 변수
	public static Connection conn = null; 
	public static Statement st;

	public static ResultSet rs;


	
	public DBConnection()
	{

		System.out.print("User Table 접속 : "); 
		try 
		{ 
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD); // 접속결과를 출력합니다.
			st=conn.createStatement();
			
			if (conn != null) {System.out.println("성공");} 

		} 
		
		catch (Exception e) 
		{ 
			System.out.println(e+"접속 실패"); 
		} 
	}
	
	public int getMonthSales(int year,int month)
	{

		
		try 
		{ 
			DecimalFormat df=new DecimalFormat("00");
			String sql="SELECT SUM(sumPrice) FROM "+RECEIPT_TABLE+" "
					+ "WHERE LEFT(regTime,7)='"+year+"-"+df.format(month)+"'"; 
			rs=st.executeQuery(sql); //쿼리문 실행
			
			if(rs.next()) { return rs.getInt(1);}
			else return -1;	

		} 
		
		catch (Exception e) 
		{ 
			System.out.println(e+"접속 실패"); 
		}
		return month; 
	}
	
	public int getDaySales(int year,int month,int day)
	{

		
		try 
		{ 
			DecimalFormat df=new DecimalFormat("00");
			String sql="SELECT SUM(sumPrice) FROM "+RECEIPT_TABLE+" "
					+ "WHERE LEFT(regTime,10)='"+year+"-"+df.format(month)+"-"+df.format(day)+"'"; 
			rs=st.executeQuery(sql); //쿼리문 실행
			
			if(rs.next()) { return rs.getInt(1);}
			else return -1;	

		} 
		
		catch (Exception e) 
		{ 
			System.out.println(e+"접속 실패"); 
		}
		return month; 
	}
	
	
}