/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinemanagement;
import java.awt.Color;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 *  @author rp367
 */
class login extends JFrame implements ActionListener{
    	 JButton submit,Reset,close;
	 JTextField tusername;
	 JPasswordField p;
         
	 public login() {
             
		
		 getContentPane().setBackground(Color.cyan);
		 setLayout(null);
		 JLabel labelusername=new JLabel("Username");
		 
		 labelusername.setBounds(20, 20, 100, 20);
		 add(labelusername);
		 tusername=new JTextField();
		 tusername.setBounds(130, 20, 200, 20);
		 add(tusername);
		 
		 
         JLabel labelpassword=new JLabel("Password");
		 
		 labelpassword.setBounds(20, 60, 100, 20);
		 add(labelpassword);
		  p=new JPasswordField();
		 p.setBounds(130, 60, 200, 20);
		  Reset=new JButton("Reset");
		Reset.setBounds(40, 120, 120, 20);
		Reset.addActionListener(this);
		add(Reset);
		 submit=new JButton("Submit");
		submit.setBounds(190, 120, 120, 20);
		submit.addActionListener(this);
		add(submit);
		close=new JButton("Close");
		close.setBounds(130, 160, 120, 20);
		close.addActionListener(this);
		add(close);
		 add(p);
		 setSize(400,250);
		 setLocation(600,250);
		 setVisible(true);
	 }
	 public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==submit) {
			 String username=tusername.getText();
			 String Password=p.getText();
			 try {
				 Conn c=new Conn();
				 String query="Select*from login where username='"+ username+"'and Password='"+Password+"' ";
				ResultSet rs= c.s.executeQuery(query);
				if(rs.next()) {
                                    new Home();
					
				}else {
					JOptionPane.showMessageDialog(null,"Invalid Username or Password");
					setVisible(false);
				}
				 
			 }
			 catch(Exception e1) {
				 e1.printStackTrace();
				 
			 }
		 }
		 else if(e.getSource()==close){
			 setVisible(false);
			 
			 
		 }
		 else if(e.getSource()==Reset) {
			 tusername.setText("");
			 p.setText("");
			
			
		}
	 }
		 
	 
	 public static void main(String[]args) {
		new login();
	 
	 }
}

