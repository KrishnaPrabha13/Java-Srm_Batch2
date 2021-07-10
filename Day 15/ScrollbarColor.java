package com.scroll;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.*;

class scroll extends JFrame implements AdjustmentListener
{
	JScrollBar brown;
    JScrollBar pink;
    JScrollBar orange;
    int cb=0;
    int cp=0;
    int co=0;

    scroll()
    {
    	super("SCROLLBAR");
	    setLayout(new FlowLayout());
	    setVisible(true);
	    setSize(300,300);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    brown = new JScrollBar(JScrollBar.HORIZONTAL);
	    pink = new JScrollBar(JScrollBar.HORIZONTAL);
	    orange = new JScrollBar(JScrollBar.HORIZONTAL);
	    
	    add(brown);
	    add(pink);
        add(orange);
        
        brown.addAdjustmentListener(this);
	    pink.addAdjustmentListener(this);
        orange.addAdjustmentListener(this);   
     }
    
    public void adjustmentValueChanged(AdjustmentEvent ae)
    {
    	if(ae.getSource()==brown)
    		cb=ae.getValue();
	    else if(ae.getSource()==pink)
	        cp=ae.getValue();
	    else if(ae.getSource()==orange)
	        co=ae.getValue();
        System.out.println(cb + ":" + cp + ":" + co);
        
        this.getContentPane().setBackground(new Color(cb,cp,co)); 
	  }
    public static void main(String args[])  
    {
    	scroll obj=new scroll();  
	}
}
