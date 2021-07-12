package com.udp;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server
{
	public static void main(String [] args) throws IOException
	{
		DatagramSocket ds = new DatagramSocket(1234);
		byte[] r= new byte[655525];
		
		DatagramPacket Dp =null;
		
		while(true)
		{
			Dp = new DatagramPacket (r,r.length);
			ds.receive(Dp);
			System.out.println("This is Client Side: " + data(r));
			
			if(data(r).toString().equals("Bye"))
			{
				System.out.println("Client Exit");
				break;
			}
			
			r = new byte[65535];
		}
	}
	public static StringBuilder data(byte[] a)
	{
		if(a==null)
			return null;
		
		StringBuilder ret = new StringBuilder();
		int i = 0;
		
		while(a[i] !=0)
		{
			ret.append((char) a[i]);
			i++;
		}
		return  ret;
	}
}
