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

public class DipsDB {

    String conString = "jdbc:postgresql://localhost:5432/Petro";
    String user = "postgres";
    String password = "abel";

    ResultSet rs = null;

    public Boolean addRecordDieselP1Dips(int year, String month, String date, String mopen, String mclose, String msale, String f3open, String f3close, String f3sale, String f4open, String f4close, String f4sale, String sale1, String price, String totalsale, String averagesale, String opendips, String closedips, String dipsale, String variance, String accvariance) {

        String sql_stmnt = "INSERT INTO dieselp1_dips(year,month,date,manual_open,manual_close,manual_sale,f3_open,f3_close,f3_sale,f4_open,f4_close,f4_sale,sale1,price,total_sale,average_sale,open_dips,close_dips,dip_sale,variance,acc_variance) VALUES ('" + year + "','" + month + "','" + date + "','" + mopen + "','" + mclose + "','" + msale + "','" + f3open + "','" + f3close + "','" + f3sale + "','" + f4open + "','" + f4close + "','" + f4sale + "','" + sale1 + "','"  + "','" + price + "','" + totalsale + "','" + averagesale + "','" + opendips + "','" + closedips + "','" + dipsale + "','" + variance + "','" + accvariance + "')";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            PreparedStatement pst = conn.prepareStatement(sql_stmnt);

            //pst.execute();
            int rowsAffected = pst.executeUpdate();
            conn.close();

            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

    public DefaultTableModel getDieselP1Dips() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Id");
        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Date");
        dm.addColumn("Manual Open");
        dm.addColumn("Manual Close");
        dm.addColumn("Manual Sale");
        dm.addColumn("F3");
        dm.addColumn("F3");
        dm.addColumn("F3 Sale");
        dm.addColumn("F4");
        dm.addColumn("F4");
        dm.addColumn("F4 Sale");
        dm.addColumn("Sale");
        dm.addColumn("Price");
        dm.addColumn("Total sale");
        dm.addColumn("Avg Sale");
        dm.addColumn("Opening Dips");
        dm.addColumn("Closing Dips");
        dm.addColumn("Dip sale");
        dm.addColumn("Variance");
        dm.addColumn("Accumulated Variance");

        //Select
        String sql = "SELECT * FROM dieselp1_dips";

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
                String mopen = rt.getString(5);
                String mclose = rt.getString(6);
                String msale = rt.getString(7);
                String f3open = rt.getString(8);
                String f3close = rt.getString(9);
                String f3sale = rt.getString(10);
                String f4open = rt.getString(11);
                String f4close = rt.getString(12);
                String f4sale = rt.getString(13);
                String sale1 = rt.getString(14);
                String price = rt.getString(15);
                String tsale = rt.getString(16);
                String avgsale = rt.getString(17);
                String odips = rt.getString(18);
                String cdips = rt.getString(19);
                String dipsale = rt.getString(20);
                String variance = rt.getString(21);
                String accvariance = rt.getString(22);

                dm.addRow(new String[]{id, year, month, date, mopen, mclose, msale, f3open, f3close, f3sale, f4open, f4close, f4sale, sale1, price, tsale, avgsale, odips, cdips, dipsale, variance, accvariance});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Boolean deleteDieselP1Dips(String id) {
        //SQL

        String sql = "DELETE FROM dieselp1_dips WHERE dp1_dips ='" + id + "'";

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

    public Boolean addRecordDieselP2Dips(int year, String month, String date, String mopen, String mclose, String msale, String f3open, String f3close, String f3sale, String f4open, String f4close, String f4sale, String sale1, String price, String totalsale, String averagesale, String opendips, String closedips, String dipsale, String variance, String accvariance) {

        String sql_stmnt = "INSERT INTO dieselp2_dips(year,month,date,manual_open,manual_close,manual_sale,f3_open,f3_close,f3_sale,f4_open,f4_close,f4_sale,sale1,price,total_sale,average_sale,open_dips,close_dips,dip_sale,variance,acc_variance) VALUES ('" + year + "','" + month + "','" + date + "','" + mopen + "','" + mclose + "','" + msale + "','" + f3open + "','" + f3close + "','" + f3sale + "','" + f4open + "','" + f4close + "','" + f4sale + "','" + sale1 + "','" + "','" + price + "','" + totalsale + "','" + averagesale + "','" + opendips + "','" + closedips + "','" + dipsale + "','" + variance + "','" + accvariance + "')";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            PreparedStatement pst = conn.prepareStatement(sql_stmnt);

            //pst.execute();
            int rowsAffected = pst.executeUpdate();
            conn.close();

            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

    public DefaultTableModel getDieselP2Dips() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Id");
        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Date");
        dm.addColumn("Manual Open");
        dm.addColumn("Manual Close");
        dm.addColumn("Manual Sale");
        dm.addColumn("F3");
        dm.addColumn("F3");
        dm.addColumn("F3 Sale");
        dm.addColumn("F4");
        dm.addColumn("F4");
        dm.addColumn("F4 Sale");
        dm.addColumn("Sale");
        dm.addColumn("Price");
        dm.addColumn("Total sale");
        dm.addColumn("Avg Sale");
        dm.addColumn("Opening Dips");
        dm.addColumn("Closing Dips");
        dm.addColumn("Dip sale");
        dm.addColumn("Variance");
        dm.addColumn("Accumulated Variance");

        //Select
        String sql = "SELECT * FROM dieselp2_dips";

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
                String mopen = rt.getString(5);
                String mclose = rt.getString(6);
                String msale = rt.getString(7);
                String f3open = rt.getString(8);
                String f3close = rt.getString(9);
                String f3sale = rt.getString(10);
                String f4open = rt.getString(11);
                String f4close = rt.getString(12);
                String f4sale = rt.getString(13);
                String sale1 = rt.getString(14);
                String price = rt.getString(15);
                String tsale = rt.getString(16);
                String avgsale = rt.getString(17);
                String odips = rt.getString(18);
                String cdips = rt.getString(19);
                String dipsale = rt.getString(20);
                String variance = rt.getString(21);
                String accvariance = rt.getString(22);

                dm.addRow(new String[]{id, year, month, date, mopen, mclose, msale, f3open, f3close, f3sale, f4open, f4close, f4sale, sale1, price, tsale, avgsale, odips, cdips, dipsale, variance, accvariance});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Boolean deleteDieselP2Dips(String id) {
        //SQL

        String sql = "DELETE FROM dieselp2_dips WHERE dp2_dips ='" + id + "'";

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

    public Boolean addRecordKeroseneDips(int year, String month, String date, String mopen, String mclose, String msale, String f3open, String f3close, String f3sale, String f4open, String f4close, String f4sale, String sale1, String price, String totalsale, String averagesale, String opendips, String closedips, String dipsale, String variance, String accvariance) {

        String sql_stmnt = "INSERT INTO kerosene_dips(year,month,date,manual_open,manual_close,manual_sale,f3_open,f3_close,f3_sale,f4_open,f4_close,f4_sale,sale1,price,total_sale,average_sale,open_dips,close_dips,dip_sale,variance,acc_variance) VALUES ('" + year + "','" + month + "','" + date + "','" + mopen + "','" + mclose + "','" + msale + "','" + f3open + "','" + f3close + "','" + f3sale + "','" + f4open + "','" + f4close + "','" + f4sale + "','" + sale1 + "','"  + "','" + price + "','" + totalsale + "','" + averagesale + "','" + opendips + "','" + closedips + "','" + dipsale + "','" + variance + "','" + accvariance + "')";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            PreparedStatement pst = conn.prepareStatement(sql_stmnt);

            //pst.execute();
            int rowsAffected = pst.executeUpdate();
            conn.close();

            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

    public DefaultTableModel getKeroseneDips() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Id");
        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Date");
        dm.addColumn("Manual Open");
        dm.addColumn("Manual Close");
        dm.addColumn("Manual Sale");
        dm.addColumn("F3");
        dm.addColumn("F3");
        dm.addColumn("F3 Sale");
        dm.addColumn("F4");
        dm.addColumn("F4");
        dm.addColumn("F4 Sale");
        dm.addColumn("Sale");
        dm.addColumn("Price");
        dm.addColumn("Total sale");
        dm.addColumn("Avg Sale");
        dm.addColumn("Opening Dips");
        dm.addColumn("Closing Dips");
        dm.addColumn("Dip sale");
        dm.addColumn("Variance");
        dm.addColumn("Accumulated Variance");

        //Select
        String sql = "SELECT * FROM kerosene_dips";

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
                String mopen = rt.getString(5);
                String mclose = rt.getString(6);
                String msale = rt.getString(7);
                String f3open = rt.getString(8);
                String f3close = rt.getString(9);
                String f3sale = rt.getString(10);
                String f4open = rt.getString(11);
                String f4close = rt.getString(12);
                String f4sale = rt.getString(13);
                String sale1 = rt.getString(14);
                String price = rt.getString(15);
                String tsale = rt.getString(16);
                String avgsale = rt.getString(17);
                String odips = rt.getString(18);
                String cdips = rt.getString(19);
                String dipsale = rt.getString(20);
                String variance = rt.getString(21);
                String accvariance = rt.getString(22);

                dm.addRow(new String[]{id, year, month, date, mopen, mclose, msale, f3open, f3close, f3sale, f4open, f4close, f4sale, sale1, price, tsale, avgsale, odips, cdips, dipsale, variance, accvariance});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Boolean deleteKeroseneDips(String id) {
        //SQL

        String sql = "DELETE FROM kerosene_dips WHERE k_dips ='" + id + "'";

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

    public Boolean addRecordPetrolDips(int year, String month, String date, String mopen, String mclose, String msale, String f3open, String f3close, String f3sale, String f4open, String f4close, String f4sale, String sale1, String price, String totalsale, String averagesale, String opendips, String closedips, String dipsale, String variance, String accvariance) {

        String sql_stmnt = "INSERT INTO petrol_dips(year,month,date,manual_open,manual_close,manual_sale,f3_open,f3_close,f3_sale,f4_open,f4_close,f4_sale,sale1,price,total_sale,average_sale,open_dips,close_dips,dip_sale,variance,acc_variance) VALUES ('" + year + "','" + month + "','" + date + "','" + mopen + "','" + mclose + "','" + msale + "','" + f3open + "','" + f3close + "','" + f3sale + "','" + f4open + "','" + f4close + "','" + f4sale + "','" + sale1 + "','"  + "','" + price + "','" + totalsale + "','" + averagesale + "','" + opendips + "','" + closedips + "','" + dipsale + "','" + variance + "','" + accvariance + "')";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            PreparedStatement pst = conn.prepareStatement(sql_stmnt);

            //pst.execute();
            int rowsAffected = pst.executeUpdate();
            conn.close();

            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

    public DefaultTableModel getPetrolDips() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Id");
        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Date");
        dm.addColumn("Manual Open");
        dm.addColumn("Manual Close");
        dm.addColumn("Manual Sale");
        dm.addColumn("F3");
        dm.addColumn("F3");
        dm.addColumn("F3 Sale");
        dm.addColumn("F4");
        dm.addColumn("F4");
        dm.addColumn("F4 Sale");
        dm.addColumn("Sale");
        dm.addColumn("Price");
        dm.addColumn("Total sale");
        dm.addColumn("Avg Sale");
        dm.addColumn("Opening Dips");
        dm.addColumn("Closing Dips");
        dm.addColumn("Dip sale");
        dm.addColumn("Variance");
        dm.addColumn("Accumulated Variance");

        //Select
        String sql = "SELECT * FROM petrol_dips";

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
                String mopen = rt.getString(5);
                String mclose = rt.getString(6);
                String msale = rt.getString(7);
                String f3open = rt.getString(8);
                String f3close = rt.getString(9);
                String f3sale = rt.getString(10);
                String f4open = rt.getString(11);
                String f4close = rt.getString(12);
                String f4sale = rt.getString(13);
                String sale1 = rt.getString(14);
                String price = rt.getString(15);
                String tsale = rt.getString(16);
                String avgsale = rt.getString(17);
                String odips = rt.getString(18);
                String cdips = rt.getString(19);
                String dipsale = rt.getString(20);
                String variance = rt.getString(21);
                String accvariance = rt.getString(22);

                dm.addRow(new String[]{id, year, month, date, mopen, mclose, msale, f3open, f3close, f3sale, f4open, f4close, f4sale, sale1, price, tsale, avgsale, odips, cdips, dipsale, variance, accvariance});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Boolean deletePetrolDips(String id) {
        //SQL

        String sql = "DELETE FROM petrol_dips WHERE pdips ='" + id + "'";

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
