package com.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class TestJDBCOracleOnAWS {
	public static void main(String[] args) {
		int choice=0;
		
		do {
			System.out.println("Choose an Option");
			System.out.println("1. List a deprtment");
			System.out.println("2. Add a deprtment");
			System.out.println("3. Update a deprtment");
			System.out.println("4. Modify a deprtment");
			System.out.println("5. Insert using StoredProcedure");
			
			Scanner sc=new Scanner(System.in);
			choice = sc.nextInt();
		switch (choice) {
		case 1:
		{  
			String QUERY = "select deptno,dname,loc from dept";
			try(Connection con = ConnectionUtil.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(QUERY))
			    {	
					while(rs.next()){
					int no = rs.getInt("deptno");
					String name = rs.getString("dname");
					String location = rs.getString("loc");
					System.out.println("Connection");
					System.out.println(no + "," +name+ "," +location );
				}//try
			} catch (SQLException e) {e.printStackTrace(); }
			break;
		}
		case 2: 
		{
			String QUERY = "insert into dept values(80, 'Marketing', 'Reston')";
			try(Connection con = ConnectionUtil.getConnection();
					Statement stmt = con.createStatement())
				{ int result = stmt.executeUpdate(QUERY);
				System.out.println(" Result is :"+result);
			     if (result==1) 
			    	System.out.println(" Data Inserted");
			     else
			    	 System.out.println(" Issue in data insertion ");
			    } catch (SQLException e) {e.printStackTrace(); }
			break;
		}
		case 3:
		{	int n= rowUpdate();
			System.out.println("Row updated");
			break;
		}
		case 4: 
		{
			int n=rowDelete();
			 System.out.println("Row deleted : "+n);
			break;
		}
		case 5: 
		{
			insertUsingProcedure();
			 System.out.println("Row inserted using procedure");
			break;
		}	
	}	
	}while(choice!=6);
	}
	
	public static int rowUpdate()
	{
		int row=0;
		String QUERY = "UPDATE dept SET dname='IT80' WHERE deptno=?";
		 try (Connection conn = ConnectionUtil.getConnection();
	             java.sql.PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) 
	     {	preparedStatement.setInt(1, 80);
	        row = preparedStatement.executeUpdate();
	         // rows affected
	         System.out.println(row);
	    	 
	     }catch( SQLException e)
	     {
	    	 System.out.println(" Row cannot be updated");
	     }
		   return row;
	}
	
	public static int rowDelete()
	{
		int row=0;
		String QUERY = "Delete from dept where deptno = ?";
	     try (Connection conn = ConnectionUtil.getConnection();
	             java.sql.PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) 
	     {		
	    	 preparedStatement.setInt(1, 80);
	        row = preparedStatement.executeUpdate();
	         // rows affected
	         System.out.println(row);
	    	 
	     }catch( SQLException e)
	     {
	    	 System.out.println(" Row cannot be deleted");
	     }
		   return row; 
	}
	
	
	private static void insertUsingProcedure() {
		 try (Connection conn = ConnectionUtil.getConnection();
		 CallableStatement stmt=conn.prepareCall("{call INSERTROWS(?,?,?)}"))
	     {	 stmt.setInt(1,77);  
			 stmt.setString(2,"dept77");  
			 stmt.setString(3,"loc77");
			 stmt.execute();
	     } catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
		

