package com.serial;
import java.io.*;

class Std implements Serializable
{
	private int rno; 
	private String name;
	private String gender;
	
	Std(int rno,String name,String gender)
	{
		this.rno = rno ;
		this.name = name;
		this.gender = gender;
	}
	public String toString()
	{
		return ("Roll NO: "+rno +"," + "Name: "+ name +"," + "Gender: "+ gender);
	}
	
}
class Serialzation
{
	public static void main(String [] args) throws IOException, ClassNotFoundException
	{
		try
		{
			Std e1 = new Std(505 , "Ram", "Male");
			Std e2 = new Std(506 , "Ravi", "Male");
			Std e3 = new Std(507, "Raj", "Male");
			
			System.out.println("Serialzation");
			
			System.out.println("Object : " +e1);
			System.out.println("Object : " +e2);
			System.out.println("Object : " +e3);
			FileOutputStream fos = new FileOutputStream("std");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			
			os.writeObject(e1);
			os.writeObject(e2);
			os.writeObject(e3);
			os.flush();
			os.close();
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		} 
		
		try
		{
			FileInputStream fin = new FileInputStream("std");
			ObjectInputStream ois = new ObjectInputStream(fin);
			
			Std e1 = (Std)ois.readObject();
			Std e2 = (Std)ois.readObject();
			Std e3 = (Std)ois.readObject();
			
			ois.close();
			System.out.println("Deserilazation");
			System.out.println("Object: " + e1);
			System.out.println("Object: " + e2);
			System.out.println("Object: " + e3);
		}
		catch(IOException ie)
		{}
		
	}
}
