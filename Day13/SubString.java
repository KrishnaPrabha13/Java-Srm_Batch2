package com.string;
import java.util.*;

public class SubString
{
	public static void SubString(String s, int n)
	{
		for(int i = 0; i<n;i++)
		{
			for(int j=i+1;j<=n;j++)
				System.out.println(s.subSequence(i, j));
		}
	}
	public static void main(String []args)
	{
		String s = "abcd";
		SubString(s, s.length());
	}

}
