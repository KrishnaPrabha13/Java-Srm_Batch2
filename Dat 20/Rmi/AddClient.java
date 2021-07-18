package com.rmi;
import java.rmi.*;
public class AddClient {
	public static void main(String args[]) {
		try{
			AddServer st = (AddServer)Naming.lookup("rmi://"+args[0]+"/AddService");
			System.out.println(st.sum(25,8));
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}