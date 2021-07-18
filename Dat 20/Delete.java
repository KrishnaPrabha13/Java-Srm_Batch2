package com.db;
import java.sql.*;

public class Delete 
{
	public static void main(String[] args)
	{
		String jdbcURL = "jdbc:postgresql://localhost:5432/Student";
		String username = "postgres";
		String password = "123";
		
		try
		{
			Connection c= DriverManager.getConnection(jdbcURL,username,password);
			System.out.println("Database Connected");
			
			String query = "delete from std1s where name='Ram'";
			Statement s = c.createStatement();
			s.executeUpdate(query);
			System.out.println("Deleted");
			c.close();
		}
		catch(Exception e)
		{
			System.out.println("Error");
			e.printStackTrace();
		}
	}

}
