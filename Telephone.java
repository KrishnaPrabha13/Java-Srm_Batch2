package com.phone;

abstract class Telephone {
	public abstract void lift();
	public abstract void disconnect();
}

class SmartTelephone extends Telephone
{
	public void lift() {
		System.out.println("Phone is lifted");
	}
	
	public void disconnect()
	{
		System.out.println("Phone is disconnected");
	}
}
class Demo
{
	public static void main(String[] args)
	{
		SmartTelephone obj = new SmartTelephone();
		obj.lift();
		obj.disconnect();
	}
}