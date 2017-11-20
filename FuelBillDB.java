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

public class FuelBillDB {

    String conString = "jdbc:postgresql://localhost:5432/Petro";
    String user = "postgres";
    String password = "abel";

   
    ResultSet rs = null;

    //Insert Data
    public Boolean addRecord(String date, String company, String category, String quantity, String cost, String dCharges, String oCharges, String total, int year, String month) {

        String sql_stmnt = "INSERT INTO fuel_bill(date_delivery,delivery_company,fuel_category,quantity,fuel_cost,delivery_charges,other_charges,total,year,month) VALUES ('" + date + "','" + company + "','" + category + "','" + quantity + "','" + cost + "','" + dCharges + "','" + oCharges + "','" + total + "','"+year+"','"+month+"')";

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

        dm.addColumn("Fid");
        dm.addColumn("Date");
        dm.addColumn("Company");
        dm.addColumn("Category");
        dm.addColumn("Quantity");
        dm.addColumn("Cost");
        dm.addColumn("Charges");
        dm.addColumn("Other charges");
        dm.addColumn("Total");
        dm.addColumn("Year");
        dm.addColumn("Month");
     
        

        //Select
        String sql = "SELECT * FROM fuel_bill";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            //Prepared statement
           
            PreparedStatement st = conn.prepareStatement(sql);

            //st.execute();
            
            ResultSet rt = st.executeQuery();

            while (rt.next()) {
                String id = rt.getString(1);
                String date = rt.getString(2);
                String company = rt.getString(3);
                String category = rt.getString(4);
                String quantity = rt.getString(5);
                String cost = rt.getString(6);
                String charges = rt.getString(7);
                String oCharges = rt.getString(8);
                String totals = rt.getString(9);
                String year = rt.getString(10);
                String month = rt.getString(11);
                

                dm.addRow(new String[]{id,date,company,category,quantity,cost,charges,oCharges,totals,year,month});
             
            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //Update
    public Boolean update(String id, String date, String company, String category, String quantity, String cost, String dCharges, String oCharges, String total,int year,int month) {
        String sql = "UPDATE fuel_bill SET date_delivery = '" + date + "',delivery_company='" + company + "',fuel_category='" + category + "',quantity='" + quantity + "',fuel_cost='" + cost + "',delivery_charges='" + dCharges + "',other_charges='" + oCharges + "',total='" + total + "',year='" + year+"',month='"+month+ "' WHERE fid ='" + id + "'";

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

        String sql = "DELETE FROM fuel_bill WHERE fid ='" + id + "'";

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
    
    
    public Boolean addGasDelivery(int year, String month,String date, String company, String category, String units, String cost, String dCharges,  String total) {

        String sql_stmnt = "INSERT INTO gas_delivery(year,month,date,company,category,units,cost,charges,total) VALUES ('" + year + "','" + month + "','" + date + "','" + company + "','" + category + "','" + units + "','" + cost + "','" + dCharges + "','"+total+"')";

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
    
    
    public Boolean deleteGas(String id) {
        //SQL

        String sql = "DELETE FROM gas_delivery WHERE gd_id ='" + id + "'";

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
    
    
    public DefaultTableModel getGasData() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Gid");
        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Date");
        dm.addColumn("Company");
        dm.addColumn("Category");
        dm.addColumn("Quantity");
        dm.addColumn("Cost");
        dm.addColumn("Charges");
        dm.addColumn("Total");
        
     
        

        //Select
        String sql = "SELECT * FROM gas_delivery";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            //Prepared statement
           
            PreparedStatement st = conn.prepareStatement(sql);

            //st.execute();
            
            ResultSet rt = st.executeQuery();

            while (rt.next()) {
                String id = rt.getString(1);
                String year = rt.getString(2);
                String month = rt.getString(3);
                String date = rt.getString(4);
                String company = rt.getString(5);
                String category = rt.getString(6);
                String quantity = rt.getString(7);
                String cost = rt.getString(8);
                String charges = rt.getString(9);
                String totals = rt.getString(10);
               
                

                dm.addRow(new String[]{id,year,month,date,company,category,quantity,cost,charges,totals});
             
            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }


}
