package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
/**
 *
 * @author Prashant Shrivastava
 */

public class SignupThree extends JFrame implements ActionListener {
    JRadioButton savingAccount, fixedDepositAccount, currentAccount, recurringDepositAccount;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit, cancel;
    String formno;
    SignupThree(String formno){
        this.formno=formno;
        
        setLayout(null);
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD,22));
        l1.setBounds(280,40, 400, 40);
        add(l1);
        
        
        JLabel type = new JLabel("Account Type " );
        type.setFont(new Font("Raleway", Font.BOLD,20));
        type.setBounds(100,140,200,30);
        add(type);
        
        savingAccount = new JRadioButton("Saving Account");
        savingAccount.setBounds(100,180,280,20);
        savingAccount.setFont(new Font("Arial",Font.BOLD,18));
        savingAccount.setBackground(Color.WHITE);
        add(savingAccount);
        
        fixedDepositAccount = new JRadioButton("Fixed Deposit Account");
        fixedDepositAccount.setBounds(380,180,280,20);
        fixedDepositAccount.setFont(new Font("Arial",Font.BOLD,18));
        fixedDepositAccount.setBackground(Color.WHITE);
        add(fixedDepositAccount);
        
        currentAccount = new JRadioButton("Current Account");
        currentAccount.setBounds(100,220,280,20);
        currentAccount.setFont(new Font("Arial",Font.BOLD,18));
        currentAccount.setBackground(Color.WHITE);
        add(currentAccount);
        
        recurringDepositAccount = new JRadioButton("Recurring Deposit Account");
        recurringDepositAccount.setBounds(380,220,280,20);
        recurringDepositAccount.setFont(new Font("Arial",Font.BOLD,18));
        recurringDepositAccount.setBackground(Color.WHITE);
        add(recurringDepositAccount);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(savingAccount);
        groupaccount.add(fixedDepositAccount);
        groupaccount.add(currentAccount);
        groupaccount.add(recurringDepositAccount);
        
        JLabel card = new JLabel("Card Number " );
        card.setFont(new Font("Raleway", Font.BOLD,20));
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4148" );
        number.setFont(new Font("Raleway", Font.BOLD,20));
        number.setBounds(330,300,400,30);
        add(number);
        
        JLabel carddetail = new JLabel("Your 16 Digit Card Number" );
        carddetail.setFont(new Font("Raleway", Font.BOLD,12));
        carddetail.setBounds(100,330,400,30);
        add(carddetail);
        
        JLabel pin = new JLabel("PIN:" );
        pin.setFont(new Font("Raleway", Font.BOLD,20));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX" );
        pnumber.setFont(new Font("Raleway", Font.BOLD,20));
        pnumber.setBounds(330,370,400,30);
        add(pnumber);
        
        JLabel pindetail = new JLabel("Your 4 Digit PIN" );
        pindetail.setFont(new Font("Raleway", Font.BOLD,12));
        pindetail.setBounds(100,400,400,30);
        add(pindetail);
        
        JLabel services = new JLabel("Services Required:" );
        services.setFont(new Font("Raleway", Font.BOLD,20));
        services.setBounds(100,450,400,30);
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,20);
        add(c1);
        
        c2 = new JCheckBox("Internet banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,20);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,530,200,20);
        add(c3);
        
        c4 = new JCheckBox("EMAIL & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,530,200,20);
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,560,200,20);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,560,200,20);
        add(c6);
        
        c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge ");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,620,600,20);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD,14));
        submit.setBounds(250,670,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD,14));
        cancel.setBounds(420,670,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        
        
        setSize(850,820);
        setLocation(350, 0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== submit){
            String accountType = null;
            if(savingAccount.isSelected()){
                accountType = "Saving Account";
            }
            else if(fixedDepositAccount.isSelected()){
                accountType = "Fixed Deposit Account";
            }
            else if(currentAccount.isSelected()){
                accountType = "Current Account";
            }
            else if(recurringDepositAccount.isSelected()){
                accountType = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000) + 5040936000000000L);
            
            String pinnumber = ""+ Math.abs((random.nextLong()% 9000) + 1000L);
            
            String facility = "";
            if(c1.isSelected()){
                facility=facility + "ATM Card";
            }
            else if(c2.isSelected()){
                facility=facility + " Internet banking";
            }
            if(c3.isSelected()){
                facility=facility + " Mobile Banking";
            }
            if(c4.isSelected()){
                facility=facility + " EMAIL & SMS Alerts";
            }
            if(c5.isSelected()){
                facility=facility + "Cheque Book";
            }
            if(c6.isSelected()){
                facility=facility + "  E-Statement";
            }
    
            
            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type os Required");
                    
                }
                else{
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                    String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null,"Card Number: " + cardnumber +"\n Pin:" + pinnumber);
                    setVisible(false);
                    new Login().setVisible(true);
                }
                
            }
            catch(Exception e){
                System.out.println(e);
            }
            
        }
        else if(ae.getSource()== cancel){
        }
    }
    public static void main(String args[]){
        new SignupThree("");
    }
        
    
}
