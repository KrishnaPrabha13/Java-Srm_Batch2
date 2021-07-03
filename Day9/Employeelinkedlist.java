package com.emp;

import java.util.*;

class Information
{
	private String eno, name, des;
	
	Information(String eno, String name, String des)
	{
		this.eno = eno;
		this.name =name;
		this.des = des;
	}
	public String toString() {
		return ("Employee No: "+ eno +","+ " Employee Name: " + name+ "," +" Designation: "+ des);
	}
}
public class Employeelinkedlist
{
	public static void main(String [] args)
	{
		LinkedList<Information>  emp = new  LinkedList<Information>();
		
		emp.add(new Information("111", "Ram","Developer"));
		emp.add(new Information("112", "Ravi","Developer"));
		emp.add(new Information("113", "Raj", "Developer"));
		emp.add(new Information("114", "Priya","Developer"));
		emp.add(new Information("115", "Mahe","Developer"));

	
		for(Information info: emp)
		{
			System.out.println(info);
		}
	}
}
