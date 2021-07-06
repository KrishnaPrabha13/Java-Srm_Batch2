package com.palin;
import java.util.*;

public class PanlidromeStiing
{
	static boolean check(String word)
	{
		int n= word.length();
		word= word.toLowerCase();
		for(int i= 0;i<n;i++,n--)
			if(word.charAt(i)!= word.charAt(n-1))
				return false;
		return true;
	}
	static int count(String s)
	{
		s=s+"";
		String word= "";
		int c=0;
		for(int i=0;i<s.length(); i++)
		{
			char ch =s.charAt(i);
			if(ch!= ' ')
				word = word+ch;
			else 
			{
				if(check(word))
					c++;
				word="";
			}
		}
		return c;
	}
	public static void main(String [] args)
	{
		System.out.println(count("Hello Madam Welcome"));
	}
}
