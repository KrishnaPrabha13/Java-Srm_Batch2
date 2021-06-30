package com.copy;

import java.io.*;

public class Copyfile
{
	public static void main(String [] args)
	{
		try
		{
			FileReader filepath = new FileReader("F:\\Prabha\\Hello.txt");
			BufferedReader b = new BufferedReader(filepath);
			File filedest = new File("F:\\Dest\\Hellonew.txt");
			PrintWriter c = new PrintWriter(new FileWriter(filedest));
			
			String s ;			
			while((s = b.readLine())!= null)
			{
				c.write(s);
				System.out.println("Copied");
			}
			c.close();
		}
		catch(Exception e)
		{
			System.out.println("Failure already file is copied");
		}
	}
}

