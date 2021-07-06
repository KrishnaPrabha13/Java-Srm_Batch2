package com.obj;
import java.util.*;

public class Classobject
{
	public static void main (String[]args)
	{
		Object obj = new String ("Welcome");
		Class a = obj.getClass();
		System.out.println("Class 1 Object: "+ a);
		
		
		Object obj1 = new Integer(3);
		Class b = obj1.getClass();
		System.out.println("Class 2 Object: "+ b);
	}

}
