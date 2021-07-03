package com.compare;

import java.util.*;

class detail
{
	private int roll;
	private String name;
	String getName()
	{
		return name;
	}
	detail(int roll,String name){
		this.roll = roll;
		this.name = name;
	}
	public String toString(){
		return("Roll No:  "+ roll + " " + "Name: " + name);
	}
		
}
class demo implements Comparator<detail>
{		
	public int compare(detail s1, detail s2)
	{		
		String a1 = s1.getName();
		String a2 = s2.getName();
		return (a1.compareTo(a2));
	}
}

public class Comparatorproj
{
	public static void main(String[]args)
	{
		TreeSet<detail> s = new TreeSet<detail>(new demo());			
		s.add(new detail(1,"Ram"));
		s.add(new detail(24,"Mahe"));	
		s.add(new detail(15,"Priya"));
			
		for(detail a:s)
		{
			System.out.println(a);
		}
	}
}
