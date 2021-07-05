package com.array;
import java.util.*;

public class ArrayListinteger
{
	static void front(ArrayList<Integer> r)
	{
		int mindex=0;
		for(int i = 1;i<r.size();i++)
		{
			if(r.get(mindex)>r.get(i))
			{
				mindex=i;
				
			}
		}
		int m= r.get(mindex);
		r.remove(mindex);
		r.add(0,m);
	}
	public static void main(String []args)
	{
		ArrayList<Integer> r = new ArrayList<>();
		r.add(5);
		r.add(2);
		r.add(67);
		r.add(56);
		r.add(1);
		
		System.out.println(r);
		front(r);
		System.out.println(r);
	}
}