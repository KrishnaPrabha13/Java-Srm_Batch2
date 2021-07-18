package com.db;
import java.sql.*;
import java.sql.SQLException;

public class Insert
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
			
			String sql = "INSERT INTO data(id,name,gender)" + "VALUES(1,'Ram','Male')";
			Statement s = c.createStatement();
			int rows = s.executeUpdate(sql);
			if(rows>0)
			{
				System.out.println("Data inserted");
			}
			c.close();
		}
		catch(Exception e)
		{
			System.out.println("Error");
			e.printStackTrace();
		}
	}
}

