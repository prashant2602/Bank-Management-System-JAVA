package bank.management.system;

import java.sql.*;

/**
 *
 * @author Prashant Shrivastava
 */
public class Conn {
    
    Connection c;
    Statement s;
    public Conn(){
        try{
            
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Prashant@2612");
            s=c.createStatement();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
