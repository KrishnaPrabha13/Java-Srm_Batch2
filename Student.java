package com.std;
import java.util.Scanner;

class MarkException extends Exception
{
	 MarkException(String str)
	{
		super(str);
	}
}
public class Student
{
	private static int rollno, mark;
	private static  String name;
	
	static void validation() throws  MarkException
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Rollno: ");
		rollno = s.nextInt();
		System.out.println("Name: ");
		name = s.next();
		System.out.println("Mark: ");
		mark = s.nextInt();
		
		if(mark<50)
			throw new MarkException("Mark is low");
		else if(mark>50 && mark<80)
			throw new MarkException("Mark is average");
		else
			throw new MarkException("Mark is high");
	}
	
	public static void main(String [] args)
	{
		try 
		{
			validation();
		}
		catch(Exception e)
		{
			System.out.println("Mark Exception: " +e);
		}
	}
}
