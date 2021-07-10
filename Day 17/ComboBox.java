package com.box;
import java.awt.*;
import javax.swing.*;

public class ComboBox 
{
	JFrame f;
	
	ComboBox()
	{
		f = new JFrame();
		String a [] = {"Apple","Mango","Banana","Orange","Onion","Tomato","Potato"};
	    JComboBox c = new JComboBox(a);
	    
	    c.setBounds(50,50,90,20);
	    f.add(c);
	    f.setSize(200,300);
	    f.setLayout(null);
	    f.setVisible(true);
	    
	}
	public static void main(String[] args)
	{
		new ComboBox();
	}
}
