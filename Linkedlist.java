package com.linked;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist
{
	public static void main(String []args)
	{
		LinkedList <String> name = new LinkedList();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the name");
		for(int i =0;i<5;i++)
		{
			name.add(sc.nextLine());
		}
		
		System.out.println("Enter name to check; ");
		String check =sc.nextLine();
		
		System.out.println("Name "+check+" is present: "+check.contains(check));
	}
}


			
