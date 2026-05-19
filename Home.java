/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinemanagement;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.reflect.Array.set;
import javax.swing.ImageIcon;



import static java.lang.reflect.Array.set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



/**
 *
 * @author rp367
 */
class Home extends JFrame implements ActionListener{

	 public Home() {
             ImageIcon li=new ImageIcon(ClassLoader.getSystemResource("airlinemanagement/images/front.jpg"));
		 JLabel Image=new JLabel(li);
		 Image.setBounds(0,0,1600,800);
                 
		 add(Image);
		 JLabel heading=new JLabel("AIRLINE INDIA WELCOMES YOU");
                 heading.setBounds(500,20,1000,40);
		 Image.add(heading);
                 heading.setForeground(Color.red);
                 heading.setFont(new Font("Tahoma",Font.PLAIN,36));
		JMenuBar menubar=new JMenuBar();
                setJMenuBar(menubar);
                JMenu details=new JMenu("Details");
                menubar.add(details);
                JMenuItem flightDetails=new JMenuItem("Flight Details");
                flightDetails.addActionListener(this);
		 details.add(flightDetails);
                  JMenuItem customerDetails=new JMenuItem("Add Customer Details");
                  customerDetails.addActionListener(this);
		 details.add(customerDetails);
               /*   JMenuItem reservationDetails=new JMenuItem("Reservation Details");
		 details.add(reservationDetails);*/
                  JMenuItem bookFlight=new JMenuItem("Book  Flight");
                  bookFlight.addActionListener(this);
		 details.add(bookFlight);
                  JMenuItem journeyDetails=new JMenuItem("Journey Details");
                  journeyDetails.addActionListener(this);
		 details.add(journeyDetails);
                  JMenuItem ticketcancellation=new JMenuItem("Ticket Cancellation");
                  ticketcancellation.addActionListener(this);
		 details.add(ticketcancellation);
                 JMenu ticket=new JMenu("Ticket");
                menubar.add(ticket);
                JMenuItem boardingpass=new JMenuItem("Boarding Pass");
                 boardingpass.addActionListener(this);
		 ticket.add(boardingpass);
                 
		 setLayout(null);
		 
		 setExtendedState(JFrame.MAXIMIZED_BOTH);
		 setLocation(600,250);
		 setVisible(true);
	 }
	 public void actionPerformed(ActionEvent e) {
             String text=e.getActionCommand();
             if(text.equals("Add Customer Details")){
             new AddCustomer();
             
         }else if(text.equals("Flight Details")){
                 new FlightInfo();
                 }
         else if(text.equals("Book  Flight")){
             new BookFlight();
         }
         else if(text.equals("Journey Details")){
             new journeyDetails();
             
		
	 }
             else if(text.equals("Ticket Cancellation")){
             new Cancel();
             
		
	 }
              else if(text.equals("Boarding Pass")){
             new BoardingPass();
             
		
	 }
         }
        
		 
	 
	 public static void main(String[]args) {
		new Home();
	 
	 }
}

