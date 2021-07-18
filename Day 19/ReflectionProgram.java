package com.reflect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class color 
{	
	public void black() 
	{
		System.out.println("Red");
	}

	private void silver() 
	{	
		System.out.println("Blue");
	}
}
public	class ReflectionProgram
{
	public static void main(String[] args) 
	{
		try
		{
			color s = new color();
		 	Class obj = s.getClass();
	        System.out.println("The name of class is " +obj.getName()+"\n");
	    	Method[] methods = obj.getDeclaredMethods();

	    	for (Method m : methods) 
	    	{
	    		System.out.println("Method Name---->" + m.getName());
	    		int modifier = m.getModifiers();
	    		System.out.println("Return Type---->" + m.getReturnType()+"\n");
		     
	    	}
		 }
	    catch (Exception e) 
		{
	    	e.printStackTrace();
	     }
	 }
}
