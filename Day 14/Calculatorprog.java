package com.cal;
import java.awt.*;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculatorprog implements ActionListener
{
	Frame f = new Frame();
	Label l1=new Label("Enter First No");
	Label l2=new Label("Enter Second No");	
	Label l3=new Label("Result");
		
	TextField tf1=new TextField();
	TextField tf2=new TextField();
	TextField tf3=new TextField();
	
	Button b1=new Button("+");
	Button b2=new Button("-");
	Button b3=new Button("*");
	Button b4=new Button("/");
	Button b5=new Button("CLEAR");
	
	Calculatorprog()
	{
		l1.setBounds(50,100, 100,20);
		l2.setBounds(50,140, 100,20);
		l3.setBounds(50,180, 100,20);
		

		tf1.setBounds(200,100,100,20);
		tf2.setBounds(200,140,100,20);
		tf3.setBounds(200,180,100,20);
		
		b1.setBounds(50,250,50,20);
		b2.setBounds(110,250,50,20);
		b3.setBounds(170,250,50,20);
		b4.setBounds(230,250,50,20);
		b5.setBounds(290,250,50,20);
	
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400,350);
		f.setLocation(500,200);
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		int n1=Integer.parseInt(tf1.getText());
		int n2=Integer.parseInt(tf2.getText());
		
		if(e.getSource()==b1)
		{
			tf3.setText(String.valueOf(n1+n2));
		}
		
		if(e.getSource()==b2)
		{
			tf3.setText(String.valueOf(n1-n2));
		}
		
		if(e.getSource()==b3)
		{
			tf3.setText(String.valueOf(n1*n2));
		}
		
		if(e.getSource()==b4)
		{
			tf3.setText(String.valueOf(n1/n2));
		}
		
		if(e.getSource()==b5)
		{
			System.exit(0);
		}
		
	}
	public static void main(String [] args)
	{
		new Calculatorprog();
	}
	}
