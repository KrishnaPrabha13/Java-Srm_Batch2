package com.conv;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Temperature extends JFrame implements ActionListener
{
	private Container c1;
	private JLabel l1, result;
	private JTextField t1;
	private JRadioButton r1,r2;
	
	Temperature()
	{
		setTitle("Temperature");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		c1=getContentPane();
		c1.setLayout(null);
		
		l1 = new JLabel("Temperature");
		l1.setBounds(10,20,100,20);
		c1.add(l1);
		
		t1 = new JTextField();
		t1.setBounds(120,20,100,20);
		c1.add(t1);
		
		r1 = new JRadioButton("Fahrenheit");
		r1.setBounds(100,50,100,30);
		c1.add(r1);
		
		r2 = new JRadioButton("Celsius");
		r2.setBounds(200,50,100,30);
		c1.add(r2);
		
		result = new JLabel("Result");
		result.setBounds(10,120,150,20);
		c1.add(result);
		
		
		r1.addActionListener(this);
		r2.addActionListener(this);
		
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== r1)
		{
			double a= Double.parseDouble(t1.getText());
			double f = (a*1.8)+32;
			result.setText("Result- F to C: " + f);
		}
		
		if(e.getSource()== r2)
		{
			double a= Double.parseDouble(t1.getText());
			double c = (a-32)*1.8;
			result.setText("Result- C to F: " + c);
		}
	}
}
public  class Temperatueconv 
{
	public static void main(String [] args)
	{
		Temperature c = new Temperature();
	}
}
