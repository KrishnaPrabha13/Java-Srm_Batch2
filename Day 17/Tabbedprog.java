package com.tabbed;
import java.awt.*;
import javax.swing.*;

public class Tabbedprog
{
	JFrame f;
	Tabbedprog()
	{
		f = new JFrame();
		JTextArea t = new JTextArea();
		JPanel p = new JPanel();
		
		p.add(t);
		
		JPanel p1 = new JPanel();
		
		JTabbedPane tp = new JTabbedPane();
		
		tp.setBounds(50,50,200,300);
		tp.add("New",p);
		tp.add("Edit",p1);
		
		f.add(tp);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String [] args)
	{
		new Tabbedprog();
	}
}
