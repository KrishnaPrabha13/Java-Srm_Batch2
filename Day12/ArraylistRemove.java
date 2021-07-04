package com.array;
import java.util.*;

public class ArraylistRemove
{
	public static void main(String []args) throws Exception
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("This");
		a.add("Hello");
		a.add("Bottle");
		a.add("Put");
		
		System.out.println(a+"\n");
		
		for(int i =0;i<a.size();i++)
		{
			String s =a.get(i);
			if(s.length()%2 !=0)
			{
				a.remove(s);
			}
		}
		System.out.println("The even length string: "+"\n");
		
		System.out.println(a);
	}
}
