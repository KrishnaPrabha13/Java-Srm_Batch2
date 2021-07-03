package com.hash;
import java.util.*;

public class Hashtableclass
{
	 public static void main(String args[]) 
	 {  
		  Hashtable<String, Integer> h = new Hashtable<String,Integer>(); 
		  
		     h.put("Ram" ,60);    
		     h.put("Priya", 47);   
		     h.put("Ravi", 64);    
		     h.put("Mahe",35);   
		     
		     System.out.println("Before remove: "+ h);      
		     
		     h.remove("Priya");  
		     System.out.println("After remove: "+ h); 
		     
		     if(h.containsKey("Mahe"))
		     {
		    	 Integer a = h.get("Mahe");
		    	 System.out.println("Age of Mahe: " + a);
		     }
	 }
	 
}
