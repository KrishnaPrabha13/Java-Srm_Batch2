package com.tcp;
import java.net.*;
import java.io.*;

public class Server 
{
	public static void main(String [] args)
	{
		try
		{
			ServerSocket s1 = new ServerSocket(3333);
			Socket s =s1.accept();
			
			DataInputStream d = new DataInputStream(s.getInputStream());
			String s2 = (String)d.readUTF();
			System.out.println(s2);
			s1.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
