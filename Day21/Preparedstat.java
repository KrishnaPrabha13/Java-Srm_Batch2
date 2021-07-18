package com.gui;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


class Preparedstat extends JFrame implements ActionListener
{

	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2;
	
	PreparedStatement p;
	
	Preparedstat()
	{
		l1 = new JLabel ("Roll No ");
		l2 = new JLabel ("Name    ");
		l3 = new JLabel ("Gender  ");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		b1 = new JButton("Display");
		b1.addActionListener(this);
		b2 = new JButton("Exit");
		b2.addActionListener(this);
		
		setLayout(new GridLayout(4,2));
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection c= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Student","postgres","123");
			System.out.println("Database Connected");
			//p = c.prepareStatement("select* from people where roll_no='?'");
		}
		catch(Exception e)
		{
			System.out.println("Failed");
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		
	}
	
	public static void main(String[] args)
	{
		Preparedstat ps = new Preparedstat();
		ps.setSize(300,300);
		ps.setVisible(true);
	}
}