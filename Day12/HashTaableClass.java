package com.table;
import java.util.*;

class Information
{
	private String name;
	private int age ;
	
	Information(String name,int age )
	{
		this.name=name;
		this.age=age;
	}
	public String toString(){
        return( "Name = " + name + " Age = " + age);
    }

}    

public class HashTaableClass
{    
	public static void main(String[] args) 
	{    
  
		HashSet<Information> h = new HashSet<Information>();    
    
    
	    h.add(new Information ("Ram",43));  
	    h.add(new Information ("Raj",56));  
	    h.add(new Information ("Ravi",24));  
	   
	    Iterator<Information> itr = h.iterator();
	     
        while (itr.hasNext()) { 
           System.out.println(itr.next()+" ");
        } 
	}
	    
}