package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Prashant Shrivastava
 */
public class PinChange extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    JButton change,back;
    JPasswordField pin,repin;
    String pinnumber;
    
    PinChange(String pinnumber){
        this.pinnumber=pinnumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm_image/atm_m.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        text.setBounds(270,280,500,35);
        image.add(text);
        
        JLabel pintext = new JLabel("New PIN:");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System", Font.BOLD,16));
        pintext.setBounds(170,320,160,25);
        image.add(pintext);
        
        pin = new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,16));
        pin.setBounds(320,320,180,25);
        image.add(pin);
        
        JLabel repintext = new JLabel("Re-enter New PIN:");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System", Font.BOLD,16));
        repintext.setBounds(170,360,180,25);
        image.add(repintext);
        
        repin = new JPasswordField();
        repin.setFont(new Font("Raleway",Font.BOLD,16));
        repin.setBounds(320,360,180,25);
        image.add(repin);
        
        change = new JButton("CHANGE");
        change.setBounds(355 , 485,150,30);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("BACK");
        back.setBounds(355 , 520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== change){
            try{            
                String npin = pin.getText();
                String rpin = repin.getText();
                if(!npin.equals(rpin)){
                    JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                    return;
                }
                else if(npin.equals("") || rpin.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Enter PIN");
                    return;
                }
                Conn conn = new Conn();
                String query1="update bank set pinnumber = '"+rpin+"' where pinnumber='"+pinnumber+"' ";
                String query2="update login set pinnumber = '"+rpin+"' where pinnumber='"+pinnumber+"' ";
                String query3="update signupthree set pinnumber = '"+rpin+"' where pinnumber='"+pinnumber+"' ";
                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);
                JOptionPane.showMessageDialog(null,"PIN Change Successfully");
                setVisible(false);
                new Transactions(rpin).setVisible(true);
                
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else{
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }
    }
    public static void main(String args[]) {
        new PinChange("").setVisible(true);
        // TODO code application logic here
    }
}
