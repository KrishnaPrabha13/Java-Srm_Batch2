package com.rmi;
import java.rmi.*;
import java.rmi.server.*;


public class AddServerpro extends UnicastRemoteObject implements AddServer
{
	AddServerpro() throws RemoteException
	{
		super();
	}
	public int mul(int x,int y)
	{
		return x+y;
	}
}