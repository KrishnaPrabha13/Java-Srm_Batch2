package com.count;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CountLabel implements ActionListener
{
	private int count = 0;
	private JFrame f;
	private JLabel l;
	private JPanel p;
	
	public CountLabel()
	{	
		f =new JFrame();
		JButton b = new JButton("Click");
		b.addActionListener(this);
		l = new JLabel("Number of times clicked: 0 ");
		
		
		p = new JPanel();
		p.setBorder(BorderFactory.createEmptyBorder(30,20,10,30));
		p.setLayout(new GridLayout(0,1));
		p.add(b);
		p.add(l);
		
		f.add(p,BorderLayout.CENTER);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setTitle("Count");
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new CountLabel();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		l.setText("Number of times clicked: " + count);
	}

}
