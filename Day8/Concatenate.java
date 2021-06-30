package com.concate;
import java.util.LinkedList;
import java.util.Scanner;

public class Concatenate 
{
	public static void main(String[]args)
	{
		LinkedList <String> name = new LinkedList();
		LinkedList <String> name2 = new LinkedList();
		LinkedList <String> con = new LinkedList();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the name");
		for(int i =0;i<2;i++)
		{
			name.add(sc.nextLine());
		}
		System.out.println("Enter the another set of name: ");
		for(int i = 0;i<3;i++)
		{
			name2.add(sc.nextLine());
		}

		con.addAll(name);
		con.addAll(name2);
		System.out.println("1st list: "+name);
		System.out.println("2nd list: "+name2);
		System.out.println("Concated names: "+con);
	}

	
}
