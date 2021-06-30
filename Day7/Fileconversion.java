package com.count;
import java.io.*;

public class Fileconversion
{
	public static void main(String [] args)
	{
		try
		{
			FileReader filepath = new FileReader("F:\\Prabha\\Hello.txt");
			File filelow = new File("F:\\Prabha\\Hellolow.txt");
			File fileup = new File("F:\\Prabha\\Helloup.txt");
;
			BufferedReader b = new BufferedReader(filepath);
			PrintWriter l = new PrintWriter(new FileWriter(filelow));
			PrintWriter up = new PrintWriter(new FileWriter(fileup));
			
			
			String s ;			
			while((s = b.readLine())!= null)
			{
				l.write(s.toLowerCase());
				up.write(s.toUpperCase());
				System.out.println("Done");
			}
			l.close();
			up.close();
		}
		catch(Exception e)
		{
			System.out.println("File doesn't exists");
			
		}
	}
}
