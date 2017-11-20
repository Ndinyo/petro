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
import javax.swing.table.DefaultTableModel;

public class ExpenditureDB {

    String conString = "jdbc:postgresql://localhost:5432/Petro";
    String user = "postgres";
    String password = "abel";

    ResultSet rs = null;

    public Boolean addRecord(int year, String month, String date, String type, String amount, String total) {

        String sql_stmnt = "INSERT INTO expenses(year,month,date,type,amount,total_amount) VALUES ('" + year + "','" + month + "','" + date + "','" + type + "','" + amount + "','" + total + "')";

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

    public Boolean deleteExpense(String id) {
        //SQL

        String sql = "DELETE FROM expenses WHERE exp_id ='" + id + "'";

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

    public DefaultTableModel getExpenseData() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Eid");
        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Date");
        dm.addColumn("Expense Type");
        dm.addColumn("Amount");
        dm.addColumn("Total Amount");
        

        //Select
        String sql = "SELECT * FROM expenses";

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
                String type = rt.getString(5);
                String amount = rt.getString(6);
                String total = rt.getString(7);
              
                

                dm.addRow(new String[]{id, date, year, month,date,type,amount,total});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
