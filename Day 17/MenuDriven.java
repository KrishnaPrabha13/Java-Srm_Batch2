package com.menu;
import javax.swing.*;    
import java.awt.event.*; 

public class MenuDriven implements ActionListener
{    
   JFrame f;    
   JMenuBar mb;    
   JMenu file,edit,format,help;    
   JMenuItem cut,copy,paste,save,saveAs,word;   
   JTextArea ta;

   MenuDriven()
  {       
	   f=new JFrame();    
       cut=new JMenuItem("Cut");    
       copy=new JMenuItem("Copy");    
       paste=new JMenuItem("Paste");  
       save=new JMenuItem("Save"); 
       saveAs=new JMenuItem("SaveAs"); 
       word= new JMenuItem("Word Format");
        
       
       cut.addActionListener(this);    
       copy.addActionListener(this);    
       paste.addActionListener(this); 
       save.addActionListener(this);
       saveAs.addActionListener(this);
       word.addActionListener(this);
          
       mb=new JMenuBar();    
       file=new JMenu("File");    
       edit=new JMenu("Edit");    
       format=new JMenu("Format");
       help=new JMenu("Help");  
       
       edit.add(cut);
       edit.add(copy);
       edit.add(paste); 
       file.add(save);      
       file.add(saveAs);
       format.add(word);
       
       mb.add(file);
       mb.add(edit);
       mb.add(format);
       mb.add(help); 
       
       ta=new JTextArea();    
       ta.setBounds(5,5,360,320);    
       f.add(mb);f.add(ta);    
       f.setJMenuBar(mb);  
       f.setLayout(null);    
       f.setSize(300,300);    
       f.setVisible(true);    
  }
   
   public void actionPerformed(ActionEvent e) 
   {    
   }     
  
   public static void main(String[] args) 
   {   
	   new MenuDriven();   
	   }    
}    
