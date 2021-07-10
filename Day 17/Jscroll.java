package com.scroll;
import java.awt.*;
import javax.swing.*;

public class Jscroll extends JFrame
{
	JScrollPane s;
	
	public Jscroll()
	{
		super("JScroll");
		
		setSize(200,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		String a[] = {"Apple","Mango","Banana","Orange","Onion","Tomato","Potato"};
		
		JList l = new JList(a);
		
		s = new JScrollPane(l);
		
		getContentPane().add(s,BorderLayout.CENTER);
	}
	public static void main(String [] args)
	{
		Jscroll j = new Jscroll();
		j.setVisible(true);
		
	}
}
