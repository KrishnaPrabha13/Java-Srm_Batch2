package com.aj;

class AliveJionThread extends Thread
{
	public void  run()
	{
		try
		{
			for(int i=0; i<5;i++)
			{
				System.out.println("Fruits");
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			
		}
	}
}
class MyRunnable implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0; i<5;i++)
			{
				System.out.println("Vegtables");
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			
		}
	}
}
class Demo
{
	public static void main(String [] args)throws Exception
	{
		AliveJionThread t1 = new AliveJionThread();
		Runnable r = new MyRunnable();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("Thread End");
		
		if(t1.isAlive())
		{
			System.out.println("T1 is Alive:"+t1.isAlive());
		}
		else
			
		{
			System.out.println("T1 is Not Alive:"+t1.isAlive());
			
		}
	}
}