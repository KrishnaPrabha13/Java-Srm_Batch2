package com.pub;

public class Publication 
{
	private String title;
	private float price;
	
	Publication(String title, float price)
	{
		this.title = title;
		this.price = price;
	}
	
	void display()
	{
		System.out.println("Title: "+title);
		System.out.println("Price: "+price);
	}
}
class Book extends Publication
{
	private int page;

	Book (String title, float price, int page)
	{
		super(title,price);
		this.page = page;
	}
	void display()
	{
		super.display();
		System.out.println("No of pages: "+page);
	}
}

class Cd extends Book
{
	private int playingtime;

	Cd (String title, float price, int page, int playingtime)
	{
		super(title,price,page);
		this.playingtime = playingtime;
	}
	void display()
	{
		super.display();
		System.out.println("No of playingtime: "+ playingtime);
	}
}
class Demo
{
	public static void main(String[] args)
	{
		Publication obj = new Cd ("Programing",950.0f,1000,30);
		obj.display();
	}
}