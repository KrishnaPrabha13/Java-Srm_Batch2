package com.lock;

class A
{
	B b;
	synchronized void a1()
	{
		System.out.println("a1 is running");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("b2 is calling");
		b.b2();
	}
	synchronized void a2()
	{
		System.out.println("a2 is running");
	}
}

class B
{
	A a;
	synchronized void b1()
	{
		System.out.println("b1 is running");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("a2 is calling");
		a.a2();
	}
	synchronized void b2()
	{
		System.out.println("b2 is calling");
	}
}
class Demo implements Runnable
{
	A aobj = new A();
	B bobj = new B();
	Demo()
	{
		Thread t = new Thread (this);
		t.start();
		aobj.b = bobj;
		bobj.a = aobj;
		aobj.a1();
	}
	public void run()
	{
		bobj.b1();
	}
	public static void main(String [] args)
	{
		Demo d = new Demo();
	}
}
