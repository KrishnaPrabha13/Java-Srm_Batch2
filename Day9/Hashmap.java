package com.hash;
import java.util.*;

public class Hashmap 
{
	public static void main(String[] args)
	{
		HashMap<String,String> hm = new HashMap<>();
		hm.put("1","Ram");
		hm.put("2", "Ravi");
		hm.put("3", "Raj");
		for(String i: hm.keySet())
		{
			System.out.println("KEY: "+ i +"  "+  "VALUE: "+ hm.get(i));
		}
	}

}
