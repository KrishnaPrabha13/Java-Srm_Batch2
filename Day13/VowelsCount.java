package com.vowels;
import java.util.*;

public class VowelsCount 
{
	public static void main(String args[]){
	      int v = 0, w=1;
	      System.out.println("Enter a String:");
	      Scanner sc = new Scanner(System.in);
	      String s = sc.nextLine();

	      for (int i=0 ; i<s.length(); i++){
	         char ch = s.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
	            v ++;
	         }
	         else if(ch==' '){
	        	w++; 
	         }
	      }
	      System.out.println("Number of Words: "+w);
	      System.out.println("Number of vowels: "+v);
	   }
}
