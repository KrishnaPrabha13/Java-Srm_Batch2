package com.thread;


public class ThreadProgram 
{
	public static void main(String[] args)
	{
		Runnable r = new Runnable()	{
			public void run()
			{
				System.out.println("Thread 1 is running");
			}
		};
		
		Thread t1 = new thread(r);
		t1.start();
		Runnable r2=()->{  
                System.out.println("Thread2 is running...");  
        };  
        Thread t2=new Thread(r2);  
        t2.start();  
    } 
		

}
