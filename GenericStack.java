package com.stack;
import java.util.*;

public class GenericStack<T>
{
	public static void main(String[] args)
	{
		Stack<String> name = new Stack<>();
	    name.add("Apple");
        name.add("Mango");
        name.add("Banana");
        System.out.println("Names in string: " + name);
        name.pop();
	    System.out.println("after removing: " + name);
	}

}
