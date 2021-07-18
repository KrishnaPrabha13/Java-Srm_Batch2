package com.rmidb;

import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry; 
import java.util.*;  

public class Client {  
   private Client() {}  
   public static void main(String[] args)throws Exception {  
      try { 
 
         Registry registry = LocateRegistry.getRegistry(null); 
    
       
         Hello stub = (Hello) registry.lookup("Hello"); 
    
        
         List<Student> list = (List)stub.getStudents(); 
         for (Student s:list)v { 
          
            System.out.println("ID: " + s.getId()); 
            System.out.println("name: " + s.getName()); 
            System.out.println("branch: " + s.getBranch()); 
            System.out.println("percent: " + s.getPercent()); 
            System.out.println("email: " + s.getEmail()); 
         }  
     
      } catch (Exception e) { 
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}