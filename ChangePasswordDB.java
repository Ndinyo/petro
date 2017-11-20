/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petro;

/**
 *
 * @author Abi
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ChangePasswordDB {
    
    String conString = "jdbc:postgresql://localhost:5432/Petro";
    String user = "postgres";
    String passWord = "abel";

    ResultSet rs = null;
    
   public Boolean changePassword(String username, String password, String confirmPassword) {

        //String sql_stmnt = "UPDATE login(username,password,confirmpassword) VALUES ('" + username + "','" + password + "','" + confirmPassword + "')";

        
        String sql = "UPDATE login set password ='" + password + "',confirmpassword='" + confirmPassword + "'WHERE username='" + username + "'";

        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, passWord);

            PreparedStatement pst = conn.prepareStatement(sql);

            int rowsAffected = pst.executeUpdate();
            conn.close();

            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }
    
    
    
}
