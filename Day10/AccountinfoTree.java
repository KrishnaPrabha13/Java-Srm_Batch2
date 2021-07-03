package com.tree;
import java.util.*;

class Information
{
	private int  accountno, balance;
	 
	Information(int accountno, int balance)
	{
		this.accountno = accountno;
		this.balance = balance;
	}
		public String toString()
		{
			return ("Account No: " + accountno + " Balance: "+ balance);
		}
}

public class AccountinfoTree 
{
	public static void main(String []args)
	{
		TreeMap<String,Information> p = new TreeMap<String, Information>();
	
		p.put("1",new Information(105, 5003));
		p.put("2",new Information(110, 204455));
		p.put("3",new Information(120, 700456));
		
		Set<Map.Entry<String,Information>> s = p.entrySet();
			
		for(Map.Entry<String,Information> m:s)
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}