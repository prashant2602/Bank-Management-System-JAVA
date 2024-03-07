package bank.management.system;

import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author Prashant Shrivastava
 */
public class Login extends JFrame implements ActionListener {
    JButton login,signup,clr;
    JTextField cardText;
    JPasswordField pinText;
    Login(){
        setTitle("Automated Teller Machine");
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm_image/atm.png"));
        Image i2 = i1.getImage().getScaledInstance(80, 80,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        JLabel text = new JLabel("Welcome to the Bank");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        
        cardText = new JTextField();
        cardText.setBounds(300,150,250, 30);
        cardText.setFont(new Font("arial",Font.BOLD,16));
        add(cardText);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Ralway",Font.BOLD,28));
        pin.setBounds(120,220,150,30);
        add(pin);
        
        pinText = new JPasswordField();
        pinText.setBounds(300,220,250, 30);
        pinText.setFont(new Font("arial",Font.BOLD,16));
        add(pinText);
        
        login = new JButton("LOGIN");
        login.setBounds(300, 280,110,30);
        login.setBackground(Color.BLUE);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        
        clr = new JButton("CLEAR");
        clr.setBounds(440, 280,110,30);
        clr.setBackground(Color.BLUE);
        clr.setForeground(Color.WHITE);
        clr.addActionListener(this);
        add(clr);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 330,250,30);
        signup.setBackground(Color.BLUE);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(800,480);
        setVisible(true);
        setLocation(350,200); 
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== clr){
            cardText.setText("");
            pinText.setText("");
        }
        else if(ae.getSource()== login){
            Conn conn = new Conn();
            String cardnumber = cardText.getText();
            String pinnumber = pinText.getText();
            String query = "select * from login where cardnumber ='"+cardnumber+"' and pinnumber = '"+pinnumber+"' ";
           
            try{
                ResultSet rs=conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Credentials");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
                    
            
        }
        else if(ae.getSource()== signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    
        
    
    public static void main(String args[]) {
        new Login();
    }
}
