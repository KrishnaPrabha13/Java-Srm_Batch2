package com.count;
import java.util.Arrays;
import java.util.Scanner;

public class Countno
{
   public static void main(String [] args)
   {
	   String a ="h 5 tg 45 abc 6";
	   int d = 1;
	   for(int i =0;i<a.length();i++) 
	   {
		   if(a.charAt(i)>=48 && a.charAt(i)<=57)
		   {
			  d++;
		   }
	   }
	   
	   System.out.println("The total count = "+ d);
   }
}

	   