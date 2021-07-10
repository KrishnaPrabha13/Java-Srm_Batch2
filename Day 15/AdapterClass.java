package com.adapter;
import java.awt.*;
import java.awt.event.*;

class AdapterClass extends 
{

}package com.adapter;
import java.awt.*;
import java.awt.event.*;

class AdapterClass
{
   private Frame mainFrame;
   private Label headerLabel;
   private Label statusLabel;
   private Panel controlPanel;

   public AdapterClass(){
      prepareGUI();
   }

   public static void main(String[] args){
	   AdapterClass  awtAdapterDemo = new AdapterClass();        
      awtAdapterDemo.showWindowAdapterDemo();
   }

   private void prepareGUI(){
      mainFrame = new Frame("AWT Window");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new Label();
      headerLabel.setAlignment(Label.CENTER);
      statusLabel = new Label();        
      statusLabel.setAlignment(Label.CENTER);
      statusLabel.setSize(350,100);

      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showWindowAdapterDemo(){
      headerLabel.setText("Welcome");      

      Button okButton = new Button("OK");

      final Frame aboutFrame = new Frame();
      aboutFrame.setSize(300,200);;
      aboutFrame.setTitle("WindowAdapter Demo");
      aboutFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
               aboutFrame.dispose();
         }        
      });    
      Label msgLabel = new Label("Hello Everyone");
      msgLabel.setAlignment(Label.CENTER);
      msgLabel.setSize(100,100);
      aboutFrame.add(msgLabel);
      aboutFrame.setVisible(true);
   }
}

