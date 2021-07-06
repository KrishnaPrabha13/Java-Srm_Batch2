package com.string;
import java.util.*;

public class Stringreplace 
{
	public static void main(String [] args)
	{
		String s = "Welcome";
		
		System.out.println("Original String: " + s);
		System.out.println("Character found: "+ "e");
		String r = s.replace("e","q");
		System.out.println("Replaced String: " +r);
	}

}
