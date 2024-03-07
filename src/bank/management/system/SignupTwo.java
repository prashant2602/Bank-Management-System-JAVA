package bank.management.system;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

/**
 *
 * @author Prashant Shrivastava
 */
public class SignupTwo extends JFrame implements ActionListener{
    
    /**
     * @param args the command line arguments
     */
    
    JTextField pan, aadhar;
    JButton next;
    JRadioButton eno,eyes,syes, sno;
    JComboBox religion,income,education,occupation,category;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD,38));
        additionalDetails.setBounds(140,20,600,40);
        add(additionalDetails);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details" );
        personalDetails.setFont(new Font("Raleway", Font.BOLD,20));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
        JLabel name = new JLabel("Religion: " );
        name.setFont(new Font("Raleway", Font.BOLD,20));
        name.setBounds(100,140,200,30);
        add(name);
        
        String valReligion[]= {"HINDU", "MUSLIM","SIKH","CHRISTIAN","Others"};
        religion = new JComboBox(valReligion);
        religion.setBounds(350,140,350,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel Fname = new JLabel("Category: " );
        Fname.setFont(new Font("Raleway", Font.BOLD,20));
        Fname.setBounds(100,190,200,30);
        add(Fname);
        
        String valCategory[]= {"General", "OBC","SC","ST","Others"};
        category = new JComboBox(valCategory);
        category.setBounds(350,190,350,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        JLabel dob = new JLabel("Income:" );
        dob.setFont(new Font("Raleway", Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        String incomeCategory[]= {"NULL", "< 1,50,000","<2,50,000",",5,00,000","Upto 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(350,240,350,30);
        income.setBackground(Color.WHITE);
        add(income);
 
        JLabel gender = new JLabel("Educational" );
        gender.setFont(new Font("Raleway", Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
 
        JLabel email = new JLabel("Qualication:" );
        email.setFont(new Font("Raleway", Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
        String educationValues[]= {"Non-Graduation", "Graduation","Doctrate","others"};
        education = new JComboBox(educationValues);
        education.setBounds(350,315,350,30);
        education.setBackground(Color.WHITE);
        add(education);
      
        JLabel marital  = new JLabel("Occupation:" );
        marital.setFont(new Font("Raleway", Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        String occupationValues[]= {"Salaried", "Self-Employed","Business","Student","Retired","others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(350,390,350,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        
        
        JLabel address  = new JLabel("PAN NO:" );
        address.setFont(new Font("Raleway", Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(350,440,350,30);
        pan.addActionListener(this);
        add(pan);
        
        JLabel city  = new JLabel("Aadhar NO:" );
        city.setFont(new Font("Raleway", Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(350,490,350,30);
        aadhar.addActionListener(this);
        add(aadhar);
        
        JLabel state  = new JLabel("Senior citizen:" );
        state.setFont(new Font("Raleway", Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(350,540,100,30);
        syes.setFont(new Font("Arial",Font.BOLD,18));
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(520,540,100,30);
        sno.setFont(new Font("Arial",Font.BOLD,18));
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup mGroup = new ButtonGroup();
        mGroup.add(syes);
        mGroup.add(sno);
        
        
        
        JLabel pincode  = new JLabel("Existing Account:" );
        pincode.setFont(new Font("Raleway", Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(350,590,100,30);
        eyes.setFont(new Font("Arial",Font.BOLD,18));
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(520,590,100,30);
        eno.setFont(new Font("Arial",Font.BOLD,18));
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup existingGroup = new ButtonGroup();
        existingGroup.add(eyes);
        existingGroup.add(eno);
        
        
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
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome= (String)income.getSelectedItem();
        String seducation= (String)education.getSelectedItem();
        String soccupation= (String)occupation.getSelectedItem();
        String span= pan.getText();
        String saadhar= aadhar.getText();
        String seniorcitizen=null;
        if(syes.isSelected()){
            seniorcitizen="YES";
        }
        else if(sno.isSelected()){
            seniorcitizen="NO";
        }
        
        String existingaccount=null;
        if(eyes.isSelected()){
            existingaccount="YES";
        }
        else if(eno.isSelected()){
            existingaccount="NO";
        }
      
        
        
        try{
            if(sreligion.isEmpty()){
                JOptionPane.showMessageDialog(null, "Name is Required");
              
            }
            if(scategory.isEmpty()){
                JOptionPane.showMessageDialog(null, "Father's name is Required");
            }
            if(sincome.isEmpty()){
                JOptionPane.showMessageDialog(null, "Date of Birth is Required");
            }
            if(seducation.isEmpty()){
                JOptionPane.showMessageDialog(null, "Email ID is Required");
            }
            if(soccupation.isEmpty()){
                JOptionPane.showMessageDialog(null, "Address is Required");
            }
            if(span.isEmpty()){
                JOptionPane.showMessageDialog(null, "City is Required");
            }
            if(saadhar.isEmpty()){
                JOptionPane.showMessageDialog(null, "State is Required");
            }
            if(seniorcitizen==null){
                JOptionPane.showMessageDialog(null, "Gender is Required");
            }
            if(existingaccount==null){
                JOptionPane.showMessageDialog(null, "Maritial Status is Required");
            }
              else{
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
          
            }
           
           
            
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String args[]) {
        new SignupTwo("");
    }
}
