package com.col;
import java.util.*;

public class Collectionalog 
{
	public static void main(String[] args) {
	
		
		LinkedList<Integer> c=new LinkedList<Integer>();
		c.add(53);
		c.add(5);
		c.add(954);
		c.add(3);
		
		System.out.println("Maximum number: "+ Collections.max(c));
		System.out.println("Minimum number: " + Collections.min(c));
		
		Comparator <Integer> r=Collections.reverseOrder();
		Collections.sort(c,r);
		for(int i:c)
		{
			System.out.println("Reverse element: " +  i);
		}
		
		Collections.shuffle(c);
		for(int i:c)
		{
			System.out.println("Shuffled element are: " + i);
		}
	}
}