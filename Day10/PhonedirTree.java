package com.phone;
import java.util.*;

public class PhonedirTree 
{
	public static void main(String[] args)
	{
		TreeMap<String,String> p = new TreeMap<String,String>();
		
		p.put("Ram","9898989898");
		p.put("Ravi","9797979797");
		p.put("Raj","9696969696");
		
		System.out.println("The phone number: " + p.get("Ram"));	
	}

}