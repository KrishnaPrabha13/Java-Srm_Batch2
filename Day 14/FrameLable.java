package com.frame;
import java.awt.*;

public class FrameLable extends Frame 
{
	FrameLable(String f)
	{
		super(f);
		Label l1 = new Label("Hello", Label.CENTER);
		add(l1);
	}
	public static void main(String[] args)
	{
		FrameLable l = new FrameLable("Frame");
		
		l.setSize(100,100);
		l.setVisible(true);
	}

}
