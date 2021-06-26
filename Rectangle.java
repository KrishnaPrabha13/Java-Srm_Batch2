package com.rec;

public class Rectangle 
{
	int length, breadth;
	
	public Rectangle(int length, int breadth) 
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public void area()
	{
		int a =length * breadth;
		System.out.println("The area of rectangle = "+a);
	}
	
	public void perimeter()
	{
		int p = 2* (length * breadth);
		System.out.println("The perimeter of rectangle = "+p);		
	}
}

class Square extends Rectangle
{
	static int side;
	Square(int s)
	{
		super(s,s);
		this.side = s;
		int ss= s*s;
		System.out.println("The area of square = "+ss);
	}
	public static void main(String [] args)
	{
		Square obj = new Square(5);
		Rectangle obj1 = new Rectangle(3,4);
		
		obj1.area();
		obj1.perimeter();
		obj.area();	
	}
}