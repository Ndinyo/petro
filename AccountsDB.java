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

public class AccountsDB {

    String conString = "jdbc:postgresql://localhost:5432/Petro";
    String user = "postgres";
    String password = "abel";

    ResultSet rs = null;

    public Boolean addRecordDieselP1Accounts(int year, String month, String date, String category, String dateBought, String amount, String rate, String bPrice, String total, String gSales, String gExpenditure, String gIncome, String profit) {

        String sql_stmnt = "INSERT INTO dieselp1_accounts(year,month,date,category,datebought,amount,rate,totalbp,totalamount,grandsales,grandexpenditure,grandincome,profit) VALUES ('" + year + "','" + month + "','" + date + "','" + category + "','" + dateBought + "','" + amount + "','" + rate + "','" + bPrice + "','" + total + "','" + gSales + "','" + gExpenditure + "','" + gIncome + "','" + profit + "')";

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

    public DefaultTableModel getDieselP1Accounts() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("DP1 id");
        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Date");
        dm.addColumn("Category");
        dm.addColumn("Date Bought");
        dm.addColumn("Amount");
        dm.addColumn("Rate");
        dm.addColumn("Buying price");
        dm.addColumn("Total Buying price");
        dm.addColumn("GrandTotal Sales");
        dm.addColumn("GrandTotal Expenditure");
        dm.addColumn("GrandTotal Income");
        dm.addColumn("Profit");

        //Select
        String sql = "SELECT * FROM dieselp1_accounts";

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
                String category = rt.getString(5);
                String dateBought = rt.getString(6);
                String amount = rt.getString(7);
                String rate = rt.getString(8);
                String bPrice = rt.getString(9);
                String totalBPrice = rt.getString(10);
                String gSales = rt.getString(11);
                String gExpenditure = rt.getString(12);
                String gIncome = rt.getString(13);
                String profit = rt.getString(14);

                dm.addRow(new String[]{id, year, month, date, category, dateBought, amount, rate, bPrice, totalBPrice, gSales, gExpenditure, gIncome, profit});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Boolean deleteDieselP1Accounts(String id) {
        //SQL

        String sql = "DELETE FROM dieselp1_accounts WHERE dpone_id ='" + id + "'";

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

    public Boolean addRecordDieselP2Accounts(int year, String month, String date, String category, String dateBought, String amount, String rate, String bPrice, String total, String gSales, String gExpenditure, String gIncome, String profit) {

        String sql_stmnt = "INSERT INTO dieselp2_accounts(year,month,date,category,datebought,amount,rate,totalbp,totalamount,grandsales,grandexpenditure,grandincome,profit) VALUES ('" + year + "','" + month + "','" + date + "','" + category + "','" + dateBought + "','" + amount + "','" + rate + "','" + bPrice + "','" + total + "','" + gSales + "','" + gExpenditure + "','" + gIncome + "','" + profit + "')";

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

    public DefaultTableModel getDataDieselP2() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        //dm.addColumn("Sid");
        dm.addColumn("Date");
        dm.addColumn("Q Sold");
        dm.addColumn("Rate");
        dm.addColumn("Total Sale");
        dm.addColumn("Expenditure");
        dm.addColumn("Income");
        dm.addColumn("Year");
        dm.addColumn("Month");

        //Select
        String sql = "SELECT * FROM fuel_diesel";

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
                String qSold = rt.getString(8);
                String rate = rt.getString(9);
                String subtotal1 = rt.getString(10);
                String subtotal2 = rt.getString(14);
                String income = rt.getString(16);
                String year = rt.getString(18);
                String month = rt.getString(19);

                dm.addRow(new String[]{date, qSold, rate, subtotal1, subtotal2, income, year, month});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Boolean deleteDieselP2Accounts(String id) {
        //SQL

        String sql = "DELETE FROM dieselp2_accounts WHERE dptwo_id ='" + id + "'";

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

    public DefaultTableModel getDieselP2Accounts() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("DP2 id");
        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Date");
        dm.addColumn("Category");
        dm.addColumn("Date Bought");
        dm.addColumn("Amount");
        dm.addColumn("Rate");
        dm.addColumn("Buying price");
        dm.addColumn("Total Buying price");
        dm.addColumn("GrandTotal Sales");
        dm.addColumn("GrandTotal Expenditure");
        dm.addColumn("GrandTotal Income");
        dm.addColumn("Profit");

        //Select
        String sql = "SELECT * FROM dieselp2_accounts";

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
                String category = rt.getString(5);
                String dateBought = rt.getString(6);
                String amount = rt.getString(7);
                String rate = rt.getString(8);
                String bPrice = rt.getString(9);
                String totalBPrice = rt.getString(10);
                String gSales = rt.getString(11);
                String gExpenditure = rt.getString(12);
                String gIncome = rt.getString(13);
                String profit = rt.getString(14);

                dm.addRow(new String[]{id, year, month, date, category, dateBought, amount, rate, bPrice, totalBPrice, gSales, gExpenditure, gIncome, profit});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //Petrol
    public DefaultTableModel getDataPetrol() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        //dm.addColumn("Sid");
        dm.addColumn("Date");
        dm.addColumn("Q Sold");
        dm.addColumn("Rate");
        dm.addColumn("Total Sale");
        dm.addColumn("Expenditure");
        dm.addColumn("Income");
        dm.addColumn("Year");
        dm.addColumn("Month");

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
                String date = rt.getString(2);
                String qSold = rt.getString(8);
                String rate = rt.getString(9);
                String subtotal1 = rt.getString(10);
                String subtotal2 = rt.getString(14);
                String income = rt.getString(16);
                String year = rt.getString(18);
                String month = rt.getString(19);

                dm.addRow(new String[]{date, qSold, rate, subtotal1, subtotal2, income, year, month});
            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Boolean addRecordPetrolAccounts(int year, String month, String date, String category, String dateBought, String amount, String rate, String bPrice, String total, String gSales, String gExpenditure, String gIncome, String profit) {

        String sql_stmnt = "INSERT INTO petrol_accounts(year,month,date,category,datebought,amount,rate,totalbp,totalamount,grandsales,grandexpenditure,grandincome,profit) VALUES ('" + year + "','" + month + "','" + date + "','" + category + "','" + dateBought + "','" + amount + "','" + rate + "','" + bPrice + "','" + total + "','" + gSales + "','" + gExpenditure + "','" + gIncome + "','" + profit + "')";

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

    public Boolean deletePetrolAccounts(String id) {
        //SQL

        String sql = "DELETE FROM petrol_accounts WHERE petrol_id ='" + id + "'";

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

    public DefaultTableModel getPetrolAccounts() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Petrol id");
        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Date");
        dm.addColumn("Category");
        dm.addColumn("Date Bought");
        dm.addColumn("Amount");
        dm.addColumn("Rate");
        dm.addColumn("Buying price");
        dm.addColumn("Total Buying price");
        dm.addColumn("GrandTotal Sales");
        dm.addColumn("GrandTotal Expenditure");
        dm.addColumn("GrandTotal Income");
        dm.addColumn("Profit");

        //Select
        String sql = "SELECT * FROM petrol_accounts";

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
                String category = rt.getString(5);
                String dateBought = rt.getString(6);
                String amount = rt.getString(7);
                String rate = rt.getString(8);
                String bPrice = rt.getString(9);
                String totalBPrice = rt.getString(10);
                String gSales = rt.getString(11);
                String gExpenditure = rt.getString(12);
                String gIncome = rt.getString(13);
                String profit = rt.getString(14);

                dm.addRow(new String[]{id, year, month, date, category, dateBought, amount, rate, bPrice, totalBPrice, gSales, gExpenditure, gIncome, profit});
            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //Kerosene
    public DefaultTableModel getDataKerosene() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        //dm.addColumn("Sid");
        dm.addColumn("Date");
        dm.addColumn("Q Sold");
        dm.addColumn("Rate");
        dm.addColumn("Total Sale");
        dm.addColumn("Expenditure");
        dm.addColumn("Income");
        dm.addColumn("Year");
        dm.addColumn("Month");

        //Select
        String sql = "SELECT * FROM fuel_kerosene";

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
                String qSold = rt.getString(8);
                String rate = rt.getString(9);
                String subtotal1 = rt.getString(10);
                String subtotal2 = rt.getString(14);
                String income = rt.getString(16);
                String year = rt.getString(18);
                String month = rt.getString(19);

                dm.addRow(new String[]{date, qSold, rate, subtotal1, subtotal2, income, year, month});
            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Boolean addRecordKeroseneAccounts(int year, String month, String date, String category, String dateBought, String amount, String rate, String bPrice, String total, String gSales, String gExpenditure, String gIncome, String profit) {

        String sql_stmnt = "INSERT INTO kerosene_accounts(year,month,date,category,datebought,amount,rate,totalbp,totalamount,grandsales,grandexpenditure,grandincome,profit) VALUES ('" + year + "','" + month + "','" + date + "','" + category + "','" + dateBought + "','" + amount + "','" + rate + "','" + bPrice + "','" + total + "','" + gSales + "','" + gExpenditure + "','" + gIncome + "','" + profit + "')";

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

    public Boolean deleteKeroseneAccounts(String id) {
        //SQL

        String sql = "DELETE FROM petrol_accounts WHERE kerosene_id ='" + id + "'";

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

    public DefaultTableModel getKeroseneAccounts() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Kerosene id");
        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Date");
        dm.addColumn("Category");
        dm.addColumn("Date Bought");
        dm.addColumn("Amount");
        dm.addColumn("Rate");
        dm.addColumn("Buying price");
        dm.addColumn("Total Buying price");
        dm.addColumn("GrandTotal Sales");
        dm.addColumn("GrandTotal Expenditure");
        dm.addColumn("GrandTotal Income");
        dm.addColumn("Profit");

        //Select
        String sql = "SELECT * FROM kerosene_accounts";

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
                String category = rt.getString(5);
                String dateBought = rt.getString(6);
                String amount = rt.getString(7);
                String rate = rt.getString(8);
                String bPrice = rt.getString(9);
                String totalBPrice = rt.getString(10);
                String gSales = rt.getString(11);
                String gExpenditure = rt.getString(12);
                String gIncome = rt.getString(13);
                String profit = rt.getString(14);

                dm.addRow(new String[]{id, year, month, date, category, dateBought, amount, rate, bPrice, totalBPrice, gSales, gExpenditure, gIncome, profit});
            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    
    //Gas
    
    public DefaultTableModel getGasData() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        //dm.addColumn("gid");
        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Date");
        dm.addColumn("Category");
        dm.addColumn("Amount");
        dm.addColumn("Total Amount");
        //Select
        String sql = "SELECT * FROM lpg_gas";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            //Prepared statement
            PreparedStatement st = conn.prepareStatement(sql);

            //st.execute();
            ResultSet rt = st.executeQuery();

            while (rt.next()) {
                //String id = rt.getString(1);
                String year = rt.getString(2);
                String month = rt.getString(3);
                String date = rt.getString(4);
                String category = rt.getString(5);
                String amount = rt.getString(6);
                String total = rt.getString(7);

                dm.addRow(new String[]{ year, month, date, category, amount, total});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    
    public Boolean addRecordGasAccounts(int year, String month, String date, String category, String dateBought, String amount, String rate, String bPrice, String total, String gSales, String gIncome, String profit) {

        String sql_stmnt = "INSERT INTO gas_accounts(year,month,date,category,datebought,amount,rate,totalbp,totalamount,grandsales,grandincome,profit) VALUES ('" + year + "','" + month + "','" + date + "','" + category + "','" + dateBought + "','" + amount + "','" + rate + "','" + bPrice + "','" + total + "','" + gSales + "','" + gIncome + "','" + profit + "')";

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
    
    
    public DefaultTableModel getGasAccounts() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("G id");
        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Date");
        dm.addColumn("Category");
        dm.addColumn("Date Bought");
        dm.addColumn("Units");
        dm.addColumn("BP");
        dm.addColumn("Total Buying price");
        dm.addColumn("GrandTotal Buying price");
        dm.addColumn("GrandTotal Sales");
        dm.addColumn("GrandTotal Income");
        dm.addColumn("Profit");

        //Select
        String sql = "SELECT * FROM gas_accounts";

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
                String category = rt.getString(5);
                String dateBought = rt.getString(6);
                String amount = rt.getString(7);
                String rate = rt.getString(8);
                String bPrice = rt.getString(9);
                String totalBPrice = rt.getString(10);
                String gSales = rt.getString(11);
                String gIncome = rt.getString(12);
                String profit = rt.getString(13);

                dm.addRow(new String[]{id, year, month, date, category, dateBought, amount, rate, bPrice, totalBPrice, gSales, gIncome, profit});
            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    
    public Boolean deleteGasAccounts(String id) {
        //SQL

        String sql = "DELETE FROM gas_accounts WHERE gas_id ='" + id + "'";

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
