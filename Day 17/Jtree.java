package com.tree;
import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class Jtree 
{
	JFrame f;
	Jtree()
	{
		f = new JFrame();
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
		
		DefaultMutableTreeNode vegetables = new DefaultMutableTreeNode("Vegtables");
		root.add(vegetables);
		
		
		DefaultMutableTreeNode onion = new DefaultMutableTreeNode("Onion");
		DefaultMutableTreeNode tomato = new DefaultMutableTreeNode("Tomato");
		DefaultMutableTreeNode potato = new DefaultMutableTreeNode("Potato");
		
		vegetables.add(onion);
		vegetables.add(tomato);
		vegetables.add(potato);
				
		DefaultMutableTreeNode fruits = new DefaultMutableTreeNode("Fruits");
		root.add(fruits);
		
		DefaultMutableTreeNode apple = new DefaultMutableTreeNode("Apple");
		DefaultMutableTreeNode mango = new DefaultMutableTreeNode("Mango");
		DefaultMutableTreeNode banana = new DefaultMutableTreeNode("Banana");

		fruits.add(apple);
		fruits.add(mango);
		fruits.add(banana);
		
		
		JTree t = new JTree(root);
		f.add(t);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String [] args)
	{
		new Jtree();
	}

}
