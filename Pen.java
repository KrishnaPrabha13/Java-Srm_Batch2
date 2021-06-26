package com.pen;

abstract class Pen 
{
	public abstract void write();
	public abstract void refill();
}
class Fountainpen extends Pen
{
	public void changeNib()
	{
	}

	public void write() {
		System.out.println("Write with FountainPen");
	}

	public void refill() {
		System.out.println("Refill It");
	}
}
class Demo
{
	public static void main(String [] args)
	{
		Fountainpen obj = new Fountainpen();
		obj.changeNib();
	}
	
}