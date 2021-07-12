package com.udp;
import java.net.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;


public class Client 
{
	public static void main(String [] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		DatagramSocket ds = new DatagramSocket();
		InetAddress ip = InetAddress.getLocalHost();
		byte b[] =null;
		
		while(true)
		{
			String inp = sc.nextLine();
			b =inp.getBytes();
			
			DatagramPacket s = new DatagramPacket(b,b.length,ip, 1234);
			
			ds.send(s);
			
			if(inp.equals("Bye"))
				break;
		}
	}
}
