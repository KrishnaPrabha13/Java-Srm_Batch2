package com.up;
import java.util.regex.*;
import java.util.Scanner;

public class UsernamePassword
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your Username: ");
	    String s = sc.next();
	    
	    System.out.println("Enter your Password: ");
	    String s1 = sc.next();
	    
	    String regex ="^[a-z0-9_-]{5,15}$";
	    boolean u = s.matches(regex);
	    
	    String regex1 ="^[a-z0-9_-]{5,15}$";
	    boolean  p = s1.matches(regex);
	    
	    
	    if(u)
	    {
	    	System.out.println("Username is valid");
		}
		else
		{
			System.out.println("Usernameis not valid");
	    }
	    
	    if(p)
	    {
	    	System.out.println("Password is valid");
		}
		else
		{
			System.out.println("Password is not valid");
	    }
	}
}
