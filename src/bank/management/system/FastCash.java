package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

/**
 *
 * @author Prashant Shrivastava
 */
public class FastCash extends JFrame implements ActionListener{

    JButton cash1,cash2,cash3,cash4,cash5,cash6,exit;
    String pinnumber;
    FastCash(String pinnumber) {
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("atm_image/atm_m.jpg"));
        Image i2 =  i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(220,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        cash1 = new JButton("RS 100");
        cash1.setBounds(170,415,150,30);
        cash1.addActionListener(this);
        image.add(cash1);
        
        cash2 = new JButton("RS 500");
        cash2.setBounds(355,415,150,30);
        cash2.addActionListener(this);
        image.add(cash2);
        
        cash3 = new JButton("RS 1000");
        cash3.setBounds(170,450,150,30);
        cash3.addActionListener(this);
        image.add(cash3);
        
        cash4 = new JButton("RS 2000");
        cash4.setBounds(355,450,150,30);
        cash4.addActionListener(this);
        image.add(cash4);
        
        cash5 = new JButton("RS 5000");
        cash5.setBounds(170,485,150,30);
        cash5.addActionListener(this);
        image.add(cash5);
        
        cash6 = new JButton("RS 10000");
        cash6.setBounds(355,485,150,30);
        cash6.addActionListener(this);
        image.add(cash6);
        
        exit = new JButton("BACK");
        exit.setBounds(355,520,150,30);
        exit.addActionListener(this);
        image.add(exit);
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == exit){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
        else {
            String amount =((JButton)ae.getSource()).getText().substring(3);
            Conn conn = new Conn();
            try{
                ResultSet rs = conn.s.executeQuery("select * from bank where pinnumber = '"+pinnumber+"'");
                int balance =0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }
                    else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(ae.getSource()!=exit && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficent Balance");
                    return;
                }
   
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+amount+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+amount+" Debited Successfully");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                    
               
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
        
         
    }
    public static void main(String args[]) {
        // TODO code application logic here
        new FastCash("");
    }
}
