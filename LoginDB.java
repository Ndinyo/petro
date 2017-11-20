/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petro;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Abi
 */
public class LoginDB {
    
    String conString = "jdbc:postgresql://localhost:5432/Petro";
    String user = "postgres";
    String passWord = "abel";

    ResultSet rs = null;
    
    public Boolean addUser(String first, String last, String username, String password, String confirmpassword, String role) {

        String sql_stmnt = "INSERT INTO login(first_name,last_name,username,password,confirmpassword,role) VALUES ('" + first + "','" + last + "','" + username + "','" + password + "','" + confirmpassword + "','" + role+"')";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, passWord);

            PreparedStatement pst = conn.prepareStatement(sql_stmnt);

            int rowsAffected = pst.executeUpdate();
            conn.close();

            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }
   
    public Boolean checkUser(String u, String p)
    {
        String sql = "SELECT username, password from login WHERE username =? and password=?";
        
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, passWord);
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, u);
            pst.setString(2, p);
           
            
            ResultSet results = pst.executeQuery();
            
            if (results.next())
            {
                JOptionPane.showMessageDialog(null, "Welcome User!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Access Denied!");
            }
            results.close();
            conn.close();
            return true;
        }
        catch(Exception ex)
        {
            return false;
        }
    }
}
