//Package to connect sql database. [JDBC]

package db;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * @author Dubey Himanshu & Arushi.
 */

public class DbConnect {
    public static Connection c;
    public static Statement st;
    static{
        try{
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb"+"?useSSL=false", "root", "Put your password here");
            st=c.createStatement();
        }catch(Exception ex){
         JOptionPane.showMessageDialog(null, ex);  
        }
    }
}
