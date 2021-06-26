package com.person;

public class Person 
{
	String name, address,phone_num;
	int age;
	double salary;
	
	void setData(String n,int a, String add,String pn, double s)
	{
		name=n;
		age=a;
		address=add;
		phone_num=pn;
		salary=s;
	}
	void displayData()
	{
		System.out.println("Employee Name: "+ name);
		System.out.println("Employee Age: "+ age);
		System.out.println("Employee Address: "+ address);
		System.out.println("Employee Phone number: "+ phone_num);
		System.out.println("Employee Salary: "+ salary);
		
	}
		
	public void PrintSalary()
	{
		System.out.println("Salary: "+salary);
	}
}

class Employee extends Person
{
	public void Specialization()
	{
		System.out.println("Specialization: Trainee");
	}
	
	public void Department()
	{
		System.out.println("Department: Java");
	}
}

class Manager extends Person
{
	public void Specialization()
	{
		System.out.println("Specialization: Developer");
	}
	
	public void Department()
	{
		System.out.println("Department: Java");
	}
}

class Demo
{
	public static void main(String []args)
	{
		System.out.println("Person Deatils\n");
		Employee obj = new Employee();
		
		System.out.println("Employee Deatils\n");
		
		obj.setData("Ram",45,"Chennai","9898989898",30000);
		obj.displayData();
		obj.Specialization();
		obj.Department();

		System.out.println();
		System.out.println("Manager Detail\n");

		obj.setData("Ravi",45,"Chennai","9898989898",50000);
		obj.displayData();
		obj.Specialization();
		obj.Department();
		
	}
}
