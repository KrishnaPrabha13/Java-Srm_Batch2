package com.rmi;
import java.net.*;
import java.rmi.*;

public class Addserverr
{
	public static void main(String [] args)
	{
		try
		{
			AddServerpro a = new AddServerpro();
			Naming.rebind("AddServer", a);
		}
		catch(Exception e)
		{}
		
	}

}
