package com.tree;
import java.util.*;

public class Treeset
{
	public static void main(String[]args)
	{
		TreeSet<Integer> n = new TreeSet<Integer>();
		n.add(5);
		n.add(10);
		n.add(2);
		
		int sum=0;
		for(Integer val:n)
		{
			System.out.println("The value is: "+val);
			sum =sum+val;
		}
		System.out.println(sum);
		
		Iterator<Integer> iterator = n.iterator();
		while(iterator.hasNext())
		{
			sum =sum+iterator.next();
		}
	}
}

