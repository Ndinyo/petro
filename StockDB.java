
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

public class StockDB {
    
    String conString = "jdbc:postgresql://localhost:5432/Petro";
    String user = "postgres";
    String password = "abel";

    ResultSet rs = null;
    
    
    public DefaultTableModel getPetrolFuel() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        //dm.addColumn("Pid");
        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Date");
        dm.addColumn("Amount(Litres)");
        

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
                //String id = rt.getString(1);
                String year = rt.getString(10);
                String month = rt.getString(11);
                String date = rt.getString(2);
                String amount = rt.getString(5);
                

                dm.addRow(new String[]{year, month, date,amount});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public DefaultTableModel getPetrolFuelSales() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        //dm.addColumn("Pid");
        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Date");
        dm.addColumn("Pump No");
        dm.addColumn("Opening");
        dm.addColumn("Closing");
        

        //Select
        String sql = "SELECT * FROM fuel_super";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            //Prepared statement
            PreparedStatement st = conn.prepareStatement(sql);

            //st.execute();
            ResultSet rt = st.executeQuery();

            while (rt.next()) {
                //String id = rt.getString(1);
                String year = rt.getString(18);
                String month = rt.getString(19);
                String date = rt.getString(2);
                String pumpNo = rt.getString(3);
                String opening = rt.getString(4);
                String closing = rt.getString(17);

                dm.addRow(new String[]{year, month, date,pumpNo,opening,closing});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
