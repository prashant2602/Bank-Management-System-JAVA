package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

/**
 *
 * @author Prashant Shrivastava
 */
public class SignupOne extends JFrame implements ActionListener {
    
    long rn;
    JTextField nameText, fnameText,emailText,addressText, cityText, stateText,pincodeText;
    JButton next;
    JRadioButton male,female,married, unmarried;
    JDateChooser dateChooser;
    SignupOne(){
        setLayout(null);
        
        Random ran = new Random();
        rn= Math.abs((ran.nextLong()%9000L)+1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO. " + rn );
        formno.setFont(new Font("Raleway", Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details" );
        personalDetails.setFont(new Font("Raleway", Font.BOLD,20));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name:" );
        name.setFont(new Font("Raleway", Font.BOLD,20));
        name.setBounds(100,140,200,30);
        add(name);
        
        nameText = new JTextField();
        nameText.setFont(new Font("Raleway",Font.BOLD,14));
        nameText.setBounds(350,140,350,30);
        nameText.addActionListener(this);
        add(nameText);
        
        JLabel Fname = new JLabel("Father's Name:" );
        Fname.setFont(new Font("Raleway", Font.BOLD,20));
        Fname.setBounds(100,190,200,30);
        add(Fname);
        
        fnameText = new JTextField();
        fnameText.setFont(new Font("Raleway",Font.BOLD,14));
        fnameText.setBounds(350,190,350,30);
        fnameText.addActionListener(this);
        add(fnameText);
        
        JLabel dob = new JLabel("Date of Birth:" );
        dob.setFont(new Font("Raleway", Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(350,240,350,30);
        dateChooser.setForeground(Color.BLACK);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender:" );
        gender.setFont(new Font("Raleway", Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(350,290,150,30);
        male.setFont(new Font("Arial",Font.BOLD,18));
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(520,290,150,30);
        female.setFont(new Font("Arial",Font.BOLD,18));
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gGroup = new ButtonGroup();
        gGroup.add(male);
        gGroup.add(female);
        
        JLabel email = new JLabel("Email ID:" );
        email.setFont(new Font("Raleway", Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailText = new JTextField();
        emailText.setFont(new Font("Raleway",Font.BOLD,14));
        emailText.setBounds(350,340,350,30);
        emailText.addActionListener(this);
        add(emailText);
      
        JLabel marital  = new JLabel("Marital status:" );
        marital.setFont(new Font("Raleway", Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(350,390,150,30);
        married.setFont(new Font("Arial",Font.BOLD,18));
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(520,390,150,30);
        unmarried.setFont(new Font("Arial",Font.BOLD,18));
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        ButtonGroup mGroup = new ButtonGroup();
        mGroup.add(married);
        mGroup.add(unmarried);
        
        JLabel address  = new JLabel("Address:" );
        address.setFont(new Font("Raleway", Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        addressText = new JTextField();
        addressText.setFont(new Font("Raleway",Font.BOLD,14));
        addressText.setBounds(350,440,350,30);
        addressText.addActionListener(this);
        add(addressText);
        
        JLabel city  = new JLabel("City:" );
        city.setFont(new Font("Raleway", Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        cityText = new JTextField();
        cityText.setFont(new Font("Raleway",Font.BOLD,14));
        cityText.setBounds(350,490,350,30);
        cityText.addActionListener(this);
        add(cityText);
        
        JLabel state  = new JLabel("State:" );
        state.setFont(new Font("Raleway", Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        stateText = new JTextField();
        stateText.setFont(new Font("Raleway",Font.BOLD,14));
        stateText.setBounds(350,540,350,30);
        stateText.addActionListener(this);
        add(stateText);
        
        JLabel pincode  = new JLabel("Pincode:" );
        pincode.setFont(new Font("Raleway", Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        pincodeText = new JTextField();
        pincodeText.setFont(new Font("Raleway",Font.BOLD,14));
        pincodeText.setBounds(350,590,350,30);
        pincodeText.addActionListener(this);
        add(pincodeText);
        
        next = new JButton("NEXT");
        next.setBackground(Color.BLUE);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno=""+rn;
        String name = nameText.getText();
        String fname = fnameText.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="Male";
        }
        else if(female.isSelected()){
            gender="Female";
        }
        String email=emailText.getText();
        String marital=null;
        if(married.isSelected()){
            marital="Married";
        }
        else if(unmarried.isSelected()){
            marital="Unmarried";
        }
        String address=addressText.getText();
        String city=cityText.getText();
        String state=stateText.getText();
        String pincode=pincodeText.getText();
        
        
        try{
            if(name.isEmpty()){
                JOptionPane.showMessageDialog(null, "Name is Required");
              
            }
            if(fname.isEmpty()){
                JOptionPane.showMessageDialog(null, "Father's name is Required");
            }
            if(dob.isEmpty()){
                JOptionPane.showMessageDialog(null, "Date of Birth is Required");
            }
            if(email.isEmpty()){
                JOptionPane.showMessageDialog(null, "Email ID is Required");
            }
            if(address.isEmpty()){
                JOptionPane.showMessageDialog(null, "Address is Required");
            }
            if(city.isEmpty()){
                JOptionPane.showMessageDialog(null, "City is Required");
            }
            if(state.isEmpty()){
                JOptionPane.showMessageDialog(null, "State is Required");
            }
            if(pincode.isEmpty()){
                JOptionPane.showMessageDialog(null, "Pincode is Required");
            }
            if(gender==null){
                JOptionPane.showMessageDialog(null, "Gender is Required");
            }
            if(marital==null){
                JOptionPane.showMessageDialog(null, "Maritial Status is Required");
            }
            else{
                Conn c= new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
    public static void main(String args[]) {
        new SignupOne();
    }
}
