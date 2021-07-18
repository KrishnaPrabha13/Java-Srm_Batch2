package com.lambda;
import java.util.ArrayList;

public class LamdaParameter 
{
	public static void main(String [] args)
	{
		ArrayList<String> a = new ArrayList<>();
	
		a.add("Welcome");
		a.add("All");
		System.out.println("Array List: "+ a);
		
		a.replaceAll(e-> e.toUpperCase());
		System.out.println("Updayted Array List: "+ a);
		
		
	}
	

}
