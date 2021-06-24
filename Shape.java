package com.shape;

public class Shape 
{
	public void printShape() 
	{
		System.out.println("This is This is Shape");		
	}
}
class Rectangle extends Shape
{
	public void printRec()
	{
		System.out.println("This is rectangle shape");
	}
}
class Circle extends Shape
{
	public void printCircle()
	{
		System.out.println("This is circle shape");
	}
}

class Square extends Rectangle
{
	public void printsquare()
	{
		System.out.println("This is square shape");
	}
}

class Demo
{
	public static void main(String [] args)
	{
		Square obj = new Square();
		obj.printShape();
		obj.printRec();
	}
}