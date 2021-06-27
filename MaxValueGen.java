package com.max;
import java.lang.Comparable;

public abstract class MaxValueGen 
{
	public static <S extends Comparable <S>> S max(S x , S y , S z)
	{
		S max = x;
	
		if(y.compareTo(max)>0)
				max = y;
		if(z.compareTo(max)>0)
			max = z;
		return max;
		
	}
	public static void main(String [] args)
	{
		System.out.println("Max of integer is: "+max(5,7,3));
		System.out.println("Max of Demcimal number is: "+max(5.7, 7.78,3.5));
		System.out.println("Max of string is: "+max("Hello","Welcome","Hi"));
	}

}
