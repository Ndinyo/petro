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
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class RatesDB {
    
    String conString = "jdbc:postgresql://localhost:5432/Petro";
    String user = "postgres";
    String password = "abel";
    
    ResultSet rs = null;
    
    public Boolean addRecord(String date, String superRate, String regular, String diesel, String kerosene) {

        String sql_stmnt = "INSERT INTO fuel_rates(date,super,regular,diesel,kerosene) VALUES ('" + date + "','" + superRate + "','" + regular + "','" + diesel + "','" + kerosene + "')";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            PreparedStatement pst = conn.prepareStatement(sql_stmnt);

            int rowsAffected = pst.executeUpdate();
            conn.close();

            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }
    
    //Retrieve Data
    public DefaultTableModel getData() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        //dm.addColumn("Rid");
        dm.addColumn("Date Set");
        dm.addColumn("Petrol");
        dm.addColumn("Diesel P1");
        dm.addColumn("Diesel P2");
        dm.addColumn("Kerosene");

        //Select
        String sql = "SELECT * FROM fuel_rates";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            //Prepared statement
           
            PreparedStatement st = conn.prepareStatement(sql);

            //st.execute();
            
            ResultSet rt = st.executeQuery();

            while (rt.next()) {
                //String id = rt.getString(1);
                String date = rt.getString(2);
                String superRate = rt.getString(3);
                String regular = rt.getString(4);
                String diesel = rt.getString(5);
                String kerosene = rt.getString(6);
                

                dm.addRow(new String[]{date,superRate,regular,diesel,kerosene});
             
            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    //Update
    public Boolean update(String id, String date, String superRate, String regular, String diesel, String kerosene) {
        String sql = "UPDATE fuel_rates SET date = '" + date + "',super='" + superRate + "',regular='" + regular + "',diesel='" + diesel + "',kerosene='" + kerosene + "' WHERE rid ='" + id + "'";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            //Statement
            PreparedStatement st = conn.prepareStatement(sql);

            st.execute();

            conn.close();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

    //Delete
    public Boolean delete(String id) {
        //SQL

        String sql = "DELETE FROM fuel_rates WHERE rid ='" + id + "'";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            PreparedStatement st = conn.prepareStatement(sql);

            //EXecute
            st.execute();

            conn.close();

            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }
    
}
