package com.rmi;

import java.rmi.*;
import java.rmi.registry.*;
public class AddServer {
	public static void main(String args[]) {
		try {
			Addserverr addService=new Addserverr();
			Naming.rebind("AddService",addService);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}