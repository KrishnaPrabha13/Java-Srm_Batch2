package com.duplicate;
import java.util.*;

public class DuplicateTreeSet
{
	public static void main(String [] args)
	{
		String [] a = {"Ram","Ravi", "Ram", "Raj"};
		
		System.out.println("Araay list: "+ Arrays.toString(a));
		
		TreeSet <String> t = new TreeSet<String>();
		
		for(String t1: a)
		{
			if(!t.add(t1))
			{
				System.out.println("Duplicate: " + t1);
			}
		}
		System.out.println("Array List: "+ t);
		
		
		
	}
}