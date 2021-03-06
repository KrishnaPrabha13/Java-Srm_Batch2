package com.rmidb

import java.sql.*; 
import java.util.*;  

public class ImplExample implements Hello {  
   
 
   public List<Student> getStudents() throws Exception {  
      List<Student> list = new ArrayList<Student>();   
    
     
      String JDBC_DRIVER = "com.mysql.jdbc.Driver";   
      String DB_URL = "jdbc:mysql://localhost:3306/details";  
    
      String USER = "myuser"; 
      String PASS = "password";  
      
      Connection conn = null; 
      Statement stmt = null;  
      

      Class.forName("com.mysql.jdbc.Driver");   
      

      System.out.println("Connecting to a selected database..."); 
      conn = DriverManager.getConnection(DB_URL, USER, PASS); 
      System.out.println("Connected database successfully...");  
      

      System.out.println("Creating statement..."); 
      
      stmt = conn.createStatement();  
      String sql = "SELECT * FROM student_data"; 
      ResultSet rs = stmt.executeQuery(sql);  
 
      while(rs.next()) { 

         int id  = rs.getInt("id"); 
         
         String name = rs.getString("name"); 
         String branch = rs.getString("branch"); 
         
         int percent = rs.getInt("percentage"); 
         String email = rs.getString("email");  
         
       
         Student student = new Student(); 
         student.setID(id); 
         student.setName(name); 
         student.setBranch(branch); 
         student.setPercent(percent); 
         student.setEmail(email); 
         list.add(student); 
      } 
      rs.close(); 
      return list;     
   }  
}