package com.table;
import java.awt.*;
import javax.swing.*;

public class TableGui
{
	JFrame f;
	
	TableGui()
	{
		f= new JFrame();
		String d [][] = {{"1", "Ram","ECE"},
						 {"2","Ravi","CSE"},
						 {"3","Raj","MECH"}};
		
		String d1 [] = {"Roll_No", "Name", "Dept"};
		JTable t = new JTable(d,d1);
		t.setBounds(30,40,200,300);
		
		JScrollPane p = new JScrollPane(t);
		f.add(p);
		f.setSize(300,200);
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new TableGui();
	}
}

