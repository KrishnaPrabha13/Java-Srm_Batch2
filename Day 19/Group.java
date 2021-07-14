package com.fgs;
import java.util.regex.Matcher;  
import java.util.regex.Pattern; 


public class Group
{
	public static void main(String[] args)
	{  
		Pattern p=Pattern.compile("hi"); 
		Matcher m=p.matcher("hihihellohihihellohi"); 
	        
		while(m.find())  
			System.out.println("Start :"+m.start()+", End : "+m.end()+", Group "+m.group());  
	}     
}

