package com.keyvalue;
import java.util.*;

public class HashMapLargeKey 
{
	public static void main(String[] args)
	{
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(1,56);
		hm.put(2,34);
		hm.put(3,15);
		hm.put(4,65);
	
		int maxkey = Collections.max(hm.keySet());
	    int minvalue = Collections.min(hm. values());
	    System.out.println(maxkey);
		System.out.println(minvalue);
		
		System.out.println("The Largest key: "+maxkey+ " And" + " The Smallest Value: "+ minvalue);
	}
}


