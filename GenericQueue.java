package com.gq;
import java.util.*;

public class GenericQueue<T> 
{
	public static void main(String[] args)
	{
		Queue<String> name = new PriorityQueue<>();
	    name.add("Apple");
        name.add("Mango");
        name.add("Banana");
        System.out.println("Names in string: " + name);
        name.remove();
	    System.out.println("after removing: " + name);
	}
}