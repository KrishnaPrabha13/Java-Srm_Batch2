package com.hash;
import java.util.*;


public class Hashsetobj 
{
	public static void main(String [] args)
	{
		HashSet<String> h = new HashSet<>();
		
		h.add("Ram");
		h.add("Ravi");
		h.add("Raj");
		
		Iterator i = h.iterator();
		System.out.println("The String List: ");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		HashSet<Integer> h1 = new HashSet<>();
		h1.add(4);
		h1.add(76);
		h1.add(3);
		
		Iterator i1 = h1.iterator();
		System.out.println("The Integer List: ");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}
}

	