package com.emptree;

import java.util.*;

class Information
{
	String eno, name, des;
	
	public Information(String eno, String name, String des)
	{
		this.eno = eno;
		this.name =name;
		this.des = des;
	}
}

public class EmployeeTreeMap 
{
	public static void main(String []args)
	{
		Map<String, Information> tm = new TreeMap<String, Information>();
		
		Information i1 = new Information("101","Ram","Developer");

		Information i2 = new Information("102","Raj","Developer");

		Information i3 = new Information("103","Ravi","Developer");
	
		tm.put("1", i1);
		tm.put("2", i2);
		tm.put("3", i3);
		
		
		for(Map.Entry<String, Information> entry:tm.entrySet())
		{
			String key = entry.getKey();
			Information i = entry.getValue();
			System.out.println(key +  "Details");
			
			System.out.println(i.eno + " " + i.name + " " + i.des+ "\n" );
		}
	}
}