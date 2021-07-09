package com.cal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator extends JFrame implements ActionListener
{
	private Container c1;
	private JLabel l1,l2,result;
	private JTextField t1,t2;
	private JButton b1,b2,b3,b4,b5;
	Calculator()
	{
		setTitle("Calculator");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		c1=getContentPane();
		c1.setLayout(null);
		
		l1 = new JLabel("Enter Number");
		l1.setBounds(10,20,100,20);
		c1.add(l1);
		
		t1 = new JTextField();
		t1.setBounds(120,20,100,20);
		c1.add(t1);
		
		l2 = new JLabel("Enter Number");
		l2.setBounds(10,50,100,20);
		c1.add(l2);
		
		t2 = new JTextField();
		t2.setBounds(120,50,100,20);
		c1.add(t2);
		
		b1 = new JButton("+");
		b1.setBounds(10,80,50,30);
		c1.add(b1);
		
		b2 = new JButton("-");
		b2.setBounds(70,80,50,30);
		c1.add(b2);

		b3 = new JButton("X");
		b3.setBounds(130,80,50,30);
		c1.add(b3);

		b4 = new JButton("/");
		b4.setBounds(190,80,50,30);
		c1.add(b4);
		
		b5= new JButton("CLEAR");
		b5.setBounds(250,80,80,30);
		c1.add(b5);
		
		result = new JLabel("Result");
		result.setBounds(10,120,150,20);
		c1.add(result);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b1)
		{
			float  a= Float.parseFloat(t1.getText());
			float b= Float.parseFloat(t2.getText());
			float c  = a+b;
			result.setText("Result: "+c);
		}
		
		if(e.getSource() == b2)
		{
			float  a= Float.parseFloat(t1.getText());
			float b= Float.parseFloat(t2.getText());
			float c  = a-b;
			result.setText("Result: "+c);
		}
		
		if(e.getSource() == b3)
		{
			float  a= Float.parseFloat(t1.getText());
			float b= Float.parseFloat(t2.getText());
			float c  = a*b;
			result.setText("Result: "+c);
		}
		
		if(e.getSource() == b4)
		{
			float  a= Float.parseFloat(t1.getText());
			float b= Float.parseFloat(t2.getText());
			float c  = a/b;
			result.setText("Result: "+c);
		}
		if(e.getSource()==b5)
		{
			System.exit(0);
		}
	}
}
public class CalculatorSwing
{
	public static void main(String[] args)
	{
		Calculator c = new Calculator();	
	}
}
