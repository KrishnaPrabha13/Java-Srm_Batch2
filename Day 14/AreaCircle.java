package com.circle;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaCircle extends Frame implements ActionListener
{
	Label radius=new Label("Enter Radius");
	TextField radiusValue=new TextField();
	Button cal = new Button("Calculate Area");
	Label res1=new Label();
		 			
	AreaCircle()
	{
		radius.setBounds(50, 150, 100, 30);
		radiusValue.setBounds(150, 150, 150, 30);
		cal.setBounds(50, 250, 100, 30);
		res1.setBounds(50,300,100,30);
			
		add(radius);
		add(radiusValue);
		add(cal);
		add(res1);
			
		cal.addActionListener(this);		
	}
	

		@Override
	public void actionPerformed(ActionEvent e)
	{
		int radius1=Integer.parseInt(radiusValue.getText());		
		double area=3.14*radius1*radius1;
		res1.setText("Area="+String.valueOf(area));	
	}
	public static void main(String args[])
	{
		AreaCircle frame = new AreaCircle();
		frame.setTitle("CIRCLE AREA CALCULATION");
	    frame.setVisible(true);
        frame.setBounds(10, 10, 370, 400);	  
        frame.setResizable(false);
	}
}
