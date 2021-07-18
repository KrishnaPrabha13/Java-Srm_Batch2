package com.pre;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredefinedFunction
{
	public static void main(String[] args)
	{
		Consumer<String> consumer = s-> System.out.println(s);
		List<String> s1= Arrays.asList("A","B","C","D","E");
		for(String str: s1)
		{
			consumer.accept(str);
		}
		
		
		Predicate<Integer> p = (n)-> n%2 ==0;
		boolean val =p.test(5);
		System.out.println("Is Even: " + val);
	}

}
