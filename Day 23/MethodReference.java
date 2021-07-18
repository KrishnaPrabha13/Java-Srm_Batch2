package com.method;

interface Method<M>{
	int fun(M[] val, M v);
}
class Fun
{
	
	static<M> int count(M[] val, M v)
	{
		int count = 0;
		for(int i=0;i<val.length; i++)
			if(val[i] ==v)
				count++;
		return count;
	}
}

public class MethodReference 
{
	static<M> int op(Method m,M[] val,M v)
	{
		return m.fun(val, v);
	}
	public static void main(String[] args)
	{
		Integer[] val = {1,2,3,3,2,4,3,3};
		String[] s = {"one","one","three"};
		int count;
		count = op(Fun :: count,val,3);
		System.out.println("3 Contains : "+ count + "times");
		
		count = op(Fun :: count,s,"one");
		System.out.println("One  Contains : "+ count + "times");
	}
}

