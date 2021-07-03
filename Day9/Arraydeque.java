package com.array;
import java.util.*;

public class Arraydeque
{
	public static void main(String [] args)
	{
		ArrayDeque<Integer> st = new ArrayDeque<>();
		st.push(4);
		st.push(34);	
		st.push(343);
	
		for(Integer val:st)
		{
			System.out.println(st.pop()+ " ");			
		}
	}
}
