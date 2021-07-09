package com.digital;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.*;


public class DigitalWatch extends JFrame
{
	Calendar c;
	SimpleDateFormat time;
	JLabel t;
	String t1;
	
	DigitalWatch()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Digital Watcch");
		setLayout(new FlowLayout());
		setSize(200,200);
		setResizable(false);
		
		time = new SimpleDateFormat("hh:mm:ss a");
		t = new JLabel();
		t1 = time.format(Calendar.getInstance().getTime());
		t.setText(t1);
		this.add(t);
		
		setVisible(true);
	}
	public static  void main(String [] args)
	{
		DigitalWatch d = new DigitalWatch();
	}
}
