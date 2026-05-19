
package airlinemanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


 
public class AddCustomer extends JFrame implements ActionListener {
    JTextField tfName,tfphone,tfaadhar,tfnationality,tfaddress; JRadioButton rbmale,rbfemale;
    public AddCustomer(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel heading=new JLabel("ADD CUSTOMER DETAILS");
        heading.setBounds(220,20,1000,35);
         heading.setFont(new Font("Tahoma",Font.PLAIN,32));
         heading.setForeground(Color.BLUE);
        add(heading);
        JLabel lblName=new JLabel("NAME");
        lblName.setBounds(60,80,150,25);
         lblName.setFont(new Font("Tahoma",Font.PLAIN,16));
         lblName.setForeground(Color.RED);
        add(lblName);
       tfName =new JTextField();
       tfName.setBounds(220,80,150,25);
       add(tfName);
               JLabel lblnationality=new JLabel("NATIONALITY");
        lblnationality.setBounds(60,130,150,25);
         lblnationality.setFont(new Font("Tahoma",Font.PLAIN,16));
         lblnationality.setForeground(Color.RED);
        add(lblnationality);
        tfnationality =new JTextField();
       tfnationality.setBounds(220,130,150,25);
       add(tfnationality);
             JLabel lblaadhar=new JLabel("AADHAR NUMBER");
        lblaadhar.setBounds(60,180,150,25);
         lblaadhar.setFont(new Font("Tahoma",Font.PLAIN,16));
         lblaadhar.setForeground(Color.RED);
        add(lblaadhar);
      tfaadhar =new JTextField();
       tfaadhar.setBounds(220,180,150,25);
       add(tfaadhar);      
       JLabel lbladdress=new JLabel("ADDRESS");
        lbladdress.setBounds(60,230,150,25);
         lbladdress.setFont(new Font("Tahoma",Font.PLAIN,16));
         lbladdress.setForeground(Color.RED);
        add(lbladdress);
        tfaddress =new JTextField();
       tfaddress.setBounds(220,230,150,25);
       add(tfaddress);
        JLabel lblgender=new JLabel("Gender");
        lblgender.setBounds(60,280,150,25);
         lblgender.setFont(new Font("Tahoma",Font.PLAIN,16));
         lblgender.setForeground(Color.RED);
        add(lblgender);
        ButtonGroup gendergroup=new ButtonGroup();
       rbmale=new JRadioButton("MALE");
       rbmale.setBounds(220,280,70,25);
        rbmale.setBackground(Color.cyan);
       add(rbmale);
        JRadioButton rbfemale=new JRadioButton("FEMALE");
       rbfemale.setBounds(300,280,80,25);
       rbfemale.setBackground(Color.YELLOW);
       add(rbfemale);
       gendergroup.add(rbmale);
       gendergroup.add(rbfemale);
       JLabel lblphone=new JLabel("PHONE");
        lblphone.setBounds(60,330,150,25);
         lblphone.setFont(new Font("Tahoma",Font.PLAIN,16));
         lblphone.setForeground(Color.RED);
        add(lblphone);
        tfphone=new JTextField();
       tfphone.setBounds(220,330,150,25);
       add(tfphone);
       JButton save=new JButton("SAVE");
        save.setBackground(Color.BLACK);
        save.setForeground(Color.MAGENTA);
       save.setBounds(220,380,150,25);
       save.addActionListener(this);
       add(save);
       
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("airlinemanagement/images/emp.png"));
        JLabel Image=new JLabel(img);
		 Image.setBounds(20,40,1000,450);
		 add(Image);
     
        setSize(900,600);
        setLocation(300,150);
        setVisible(true);
        
    }
   

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        String name=tfName.getText();
        String nationality=tfnationality.getText();
         String aadhar=tfaadhar.getText();
        String address=tfaddress.getText();
       
        
        String gender=null;
        String phone=tfphone.getText();
        if(rbmale.isSelected()){
            gender="Male";
        }else{
            gender="female";
        }
        try{
            Conn conn=new Conn();
           String query = "INSERT INTO passenger VALUES('"+name+"','"+nationality+"','"+aadhar+"','"+address+"','"+gender+"','"+phone+"')";

            conn.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
            setVisible(false);
            

            
            
            
        }catch(Exception e){
            e.printStackTrace();

        }
        
        
        
        
    }
     public static void main(String[]args){
        new AddCustomer();
        
    }
    
}
