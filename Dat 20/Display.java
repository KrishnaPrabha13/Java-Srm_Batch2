package com.db;

import java.sql.*;

public class Statement_Example
{
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String dburl = "jdbc:mysql://localhost/STOREDB";	   
	   static final String dbuser = "root";
	   static final String dbpass = "root";
	   
public static void main(String[] args)
{
	Connection con = null;
	Statement stmt = null;
	
	try 
	{

	    con = DriverManager.getConnection(dburl, dbuser, dbpass);	    
	  
	    stmt=con.createStatement();
	   
	    String querySelect="SELECT * FROM ITEM";
	    ResultSet rset=stmt.executeQuery(querySelect);
	    while(rset.next())
	    {
	    	System.out.println("ID: "+rset.getInt(1) + ", PRODUCT: " + rset.getString(2) + ", Price: " + rset.getString(3));
	    }
	} 
	
	catch (SQLException e) 
	{
	    System.err.println("Cannot connect ! ");
	    e.printStackTrace();
	}
	
	finally {
	    System.out.println("Closing the connection.");
	    if (con != null) try { con.close(); } catch (SQLException ignore) {}
	}
	
}
}
Output

ID: 1, PRODUCT: MousePad, Price: 190