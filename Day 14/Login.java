package com.login;
import java.awt.*;

public class Login extends Frame
{
    TextField uname,passwd;
    Button b1,b2;
    Login()
    {
        super(); 
        setLayout(new FlowLayout());
        setLayout(null);
        Label n=new Label("Username:",Label.CENTER);
        Label p=new Label("Password:",Label.CENTER);
        uname=new TextField(20);
        passwd=new TextField(20);
        //passwd.setEchoChar('*');
        b1=new Button("Submit");
        b2=new Button("Cancel");
        add(n);
        add(uname);
        add(p);
        add(passwd);
        add(b1);
        add(b2);
        n.setBounds(70,90,90,60);
        p.setBounds(70,130,90,60);
        uname.setBounds(200,100,90,20);
        passwd.setBounds(200,140,90,20);
        b1.setBounds(100,260,70,40);
        b2.setBounds(180,260,70,40);
 
    }
    public static void main(String args[])
    {
    	Login ml=new Login();
        ml.setVisible(true);
        ml.setSize(400,400);
        ml.setTitle("LOGIN WINDOW");
 
    }
}