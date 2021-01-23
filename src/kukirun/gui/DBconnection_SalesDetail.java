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

public class DBconnection_SalesDetail extends DBConnection{
	

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
	
	public Object[][] getDayDetails(int year,int month,int day)
	{

		
		Object[][] object2=null;
	
		
		try 
		{ 
			
			String SQL="SELECT MAX(rowCount) AS alias FROM "+SALE_DETAILS_TABLE;
			
			rs=st.executeQuery(SQL); //쿼리문 실행
			rs.next();
			int maxNum=rs.getInt(1);
			
			rs.close();
			
			DecimalFormat df=new DecimalFormat("00");
			String sql="SELECT RECEIPT.rcNumber,menu_Category,menu_Name,menu_Price,numberOf,rowSum,sumPrice "
					+ "FROM "+SALE_DETAILS_TABLE+" JOIN "+RECEIPT_TABLE+" "
							+ "ON "+RECEIPT_TABLE+".rcNumber="+SALE_DETAILS_TABLE+".rcNumber AND LEFT("+RECEIPT_TABLE+".regTime,10)='"+year+"-"+df.format(month)+"-"+df.format(day)+"'";

			rs=st.executeQuery(sql); //쿼리문 실행

			
			
			object2=new Object[maxNum][7];
		
				
			int i=0;
			while(rs.next()) {
					
			
			
				DecimalFormat addcomma=new DecimalFormat("###,###");
				for(int j=0; j<7; j++) {
					
					if(j==3 || j==5 || j==6) object2[i][j]=addcomma.format(rs.getObject(j+1));
					else object2[i][j]=rs.getObject(j+1);
					if(i>0) if(j==6 && object2[i-1][0]==object2[i][0]) { //영수증 번호와 총 금액을 반복 출력하지 않기 위해
						object2[i][0]=null;
						object2[i][6]=null;
					}
					
				}
				i++;
				
			}
			i=0;
					
			
		

		} 
		
		catch (Exception e) 
		{ 
			System.out.println(e+"접속 실패이다"); 
		}
		return object2;
		
	}
	
	public Object[][] getYearDetails(int year)
	{

		
		Object[][] object2=null;
	
		
		try 
		{ 
			
			String SQL="SELECT MAX(rowCount) AS alias FROM "+SALE_DETAILS_TABLE;
	
			rs=st.executeQuery(SQL); //쿼리문 실행
			rs.next();
			int maxNum=rs.getInt(1);
		
			rs.close();
			
			DecimalFormat df=new DecimalFormat("00");
			String sql="SELECT RECEIPT.rcNumber,menu_Category,menu_Name,menu_Price,numberOf,rowSum,sumPrice "
					+ "FROM "+SALE_DETAILS_TABLE+" JOIN "+RECEIPT_TABLE+" "
							+ "ON "+RECEIPT_TABLE+".rcNumber="+SALE_DETAILS_TABLE+".rcNumber AND LEFT("+RECEIPT_TABLE+".regTime,4)='"+year+"'";
		
		
			rs=st.executeQuery(sql); //쿼리문 실행

			
			
			object2=new Object[maxNum][7];
		
				
			int i=0;
			while(rs.next()) {
					
		
			
				DecimalFormat addcomma=new DecimalFormat("###,###");
			
				for(int j=0; j<7; j++) {
					
					if(j==3 || j==5 || j==6) object2[i][j]=addcomma.format(rs.getObject(j+1));
					else object2[i][j]=rs.getObject(j+1);
					if(i>0) if(j==6 && object2[i-1][0]==object2[i][0]) { //영수증 번호와 총 금액을 반복 출력하지 않기 위해
						object2[i][0]=null;
						object2[i][6]=null;
					}
					
				}
				i++;
				
			}
			i=0;
					
			
		

		} 
		
		catch (Exception e) 
		{ 
			System.out.println(e+"접속 실패이다"); 
		}
		return object2;
		
	}
	
	public Object[][] getMonthDetails(int year,int month)
	{

		
		Object[][] object2=null;
		
		try 
		{ 			
			String SQL="SELECT MAX(rowCount) AS alias FROM "+SALE_DETAILS_TABLE;

			rs=st.executeQuery(SQL); //쿼리문 실행
			rs.next();
			int maxNum=rs.getInt(1);

			rs.close();
			
			DecimalFormat df=new DecimalFormat("00");
			String sql="SELECT RECEIPT.rcNumber,menu_Category,menu_Name,menu_Price,numberOf,rowSum,sumPrice "
					+ "FROM "+SALE_DETAILS_TABLE+" JOIN "+RECEIPT_TABLE+" "
							+ "ON "+RECEIPT_TABLE+".rcNumber="+SALE_DETAILS_TABLE+".rcNumber AND LEFT("+RECEIPT_TABLE+".regTime,7)='"+year+"-"+df.format(month)+"'";
		
		
			rs=st.executeQuery(sql); //쿼리문 실행

			
			
			object2=new Object[maxNum][7];
		
				
			int i=0;
			while(rs.next()) {
					
		
			
				DecimalFormat addcomma=new DecimalFormat("###,###");
			
				for(int j=0; j<7; j++) {
					
					if(j==3 || j==5 || j==6) object2[i][j]=addcomma.format(rs.getObject(j+1));
					else object2[i][j]=rs.getObject(j+1);
					if(i>0) if(j==6 && object2[i-1][0]==object2[i][0]) { //영수증 번호와 총 금액을 반복 출력하지 않기 위해
						object2[i][0]=null;
						object2[i][6]=null;
					}
					
				}
				i++;
				
			}
			i=0;
					
			
		

		} 
		
		catch (Exception e) 
		{ 
			System.out.println(e+"접속 실패이다"); 
		}
		return object2;
		
	}
	


}