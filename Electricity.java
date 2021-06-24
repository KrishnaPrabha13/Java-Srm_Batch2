package com.ele;
import java.util.Scanner;

public class Electricity {
	public static void main(String[] args)
	{
		int consumer_no;
		String consumer_name;
		double previous_reading;
		double current_reading;
		String conn_type;
		double units;
		double bill_amt = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter consumer no: ");
		consumer_no =sc.nextInt();
		
		System.out.println("Enter consumer name: ");
		consumer_name = sc.next();
		
		System.out.println("Enter previous_reading: ");
		previous_reading =sc.nextDouble();
		
		System.out.println("Enter current_reading: ");
		current_reading =sc.nextDouble();
		
		System.out.println("Enter connection type(Dom/Con): ");
		conn_type =sc.next();
		
		sc.close();
		
		
		units = current_reading - previous_reading;
		
		if(conn_type.equals("Dom")) 
		{
			if(units<100)
				bill_amt = units*1;
			
			else if (units>100 && units<200)
				bill_amt = units*2.50;
			
			else if (units>200 && units<500)
				bill_amt= units*4;
			
			else 
				bill_amt = units*6;
		}
		
		else if(conn_type.equals("Con"))
		{
			if(units<100)
				bill_amt = units*2;
			
			else if (units>100 && units<200)
				bill_amt = units*4.50;
			
			else if (units>200 && units<500)
				bill_amt= units*6;
			
			else
				bill_amt = units*7;
		}
		System.out.println("The bill amount = "+ bill_amt);
	}
}
