package com.fgs;


public class FindGroupSplit 
{
	public static void main(String [] args)
	{
		String s = "abc@gmail.com";
		
		String [] a = s.split("@");
		
		for(String a1: a)
		{
			System.out.println(a1);
		}
		
	}

}
