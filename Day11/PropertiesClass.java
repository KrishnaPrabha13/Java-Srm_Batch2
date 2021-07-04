package com.properties;
import java.util.*;
import java.io.*;


class PropertiesClass
{
	public static void main(String [] args) throws Exception
	{
		Properties p = new Properties();
		
		p.put("Name: ", "Ram");
		p.put("Email: ", "ram@gmail.com");
		
		try
		{
			FileOutputStream f = new FileOutputStream("p.data");
			p.store(f,"Details");
		}
		catch(FileNotFoundException e)
		{}
		System.out.println("Stored");
		try
		{
			FileInputStream f1 = new FileInputStream("p.data");
			p.load(f1);
		}
		catch(FileNotFoundException e)
		{}
		
		Set s = p.keySet();
		for(Object n:s)
		{
			System.out.println(n +" "+ p.getProperty((String)n));
		}
	}
}