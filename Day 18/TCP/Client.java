package com.tcp;
import java.net.*;
import java.io.*;


public class Client
{
	public static void main(String [] args)
	{
		try
		{
			Socket s = new Socket("localhost", 3333);
			DataOutputStream d = new DataOutputStream(s.getOutputStream());
			d.writeUTF("Welcome Server");
			d.flush();
			d.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
