package com.hash;
import java.util.*;

public class HashTableIterator
{
	public static void main(String []args)
	{
		Hashtable<String, Integer> h = new Hashtable<String,Integer>();
		
		h.put("Ram", 56);
		h.put("Ravi",34);
		h.put("Raj",23);
		
		Set<String> keys = h.keySet();
		
		Iterator<String> iter = keys.iterator();
		
		while(iter.hasNext())
		{
			String s =iter.next();
			
			System.out.println("Name: "+ s + ", Age: "+ h.get(s));
		}
	}
}
