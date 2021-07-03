package com.iter;
import java.util.*;

public class IteratorListIterator 
{
	public static void main(String []args)
	{
		ArrayList<String> a= new  ArrayList<>();
		a.add("ram");
		a.add("ravi");
		a.add("raj");
		
		Iterator<String> iter = a.iterator();
		System.out.println("The iterator value");
		while(iter.hasNext())
		{
			System.out.printf(iter.next()+ " ");
		}
		
		ListIterator<String>  il = a.listIterator();
		System.out.println("\n\nThe list iterator value");
		while(il.hasNext())
		{
			System.out.printf(il.next()+" ");

		}
		System.out.println("\n\nThe previous value");
		while(il.hasPrevious())
		{
			System.out.printf(il.previous()+" ");

		}
	}
	

}
