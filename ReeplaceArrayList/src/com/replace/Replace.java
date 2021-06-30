package com.replace;

import java.util.ArrayList;
import java.util.Scanner;

public class Replace 
{
	public static void main(String [] args)
	{
		ArrayList<String>  name = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the name: ");
	    for(int i=0;i<5;i++)
	    {
	    	name.add(sc.nextLine());
	    }
	    System.out.println(name);
	   
	    name.set(2,"preetha");
	    System.out.println("after replacing");
	    
	    System.out.println(name);
	}
}


