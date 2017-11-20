/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abi
 */
public class SalesDB {

    String conString = "jdbc:postgresql://localhost:5432/Petro";
    String user = "postgres";
    String password = "abel";

    ResultSet rs = null;

    public Boolean addRecordSuper(String date, String pumpNo, String opening, String start, String end, String quantity, String qSold, String rate, String subtotal1, String exp1, String exp2, String exp3, String subtotal2, String grandtotal, String income, String closing, int year, String month) {

        String sql_stmnt = "INSERT INTO fuel_super(date_super,pump_no,opening_meter,meter_start,meter_end,quantity,quantity_sold,rate,subtotal_one,expense_one,expense_two,expense_three,subtotal_two,grandtotal,income,closing_meter,year,month) VALUES ('" + date + "','" + pumpNo + "','" + opening + "','" + start + "','" + end + "','" + quantity + "','" + qSold + "','" + rate + "','" + subtotal1 + "','" + exp1 + "','" + exp2 + "','" + exp3 + "','" + subtotal2 + "','" + grandtotal + "','" + income + "','" + closing + "','" + year + "','" + month + "')";

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

    public Boolean addRecordRegular(String date, String pumpNo, String opening, String start, String end, String quantity, String qSold, String rate, String subtotal1, String exp1, String exp2, String exp3, String subtotal2, String grandtotal, String income, String closing, int year, String month) {

        String sql_stmnt = "INSERT INTO fuel_regular(date_regular,pump_no,opening_meter,meter_start,meter_end,quantity,quantity_sold,rate,subtotal_one,expense_one,expense_two,expense_three,subtotal_two,grandtotal,income,closing_meter,year,month) VALUES ('" + date + "','" + pumpNo + "','" + opening + "','" + start + "','" + end + "','" + quantity + "','" + qSold + "','" + rate + "','" + subtotal1 + "','" + exp1 + "','" + exp2 + "','" + exp3 + "','" + subtotal2 + "','" + grandtotal + "','" + income + "','" + closing + "','" + year + "','" + month + "')";

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

    public Boolean addRecordDiesel(String date, String pumpNo, String opening, String start, String end, String quantity, String qSold, String rate, String subtotal1, String exp1, String exp2, String exp3, String subtotal2, String grandtotal, String income, String closing, int year, String month) {

        String sql_stmnt = "INSERT INTO fuel_diesel(date_diesel,pump_no,opening_meter,meter_start,meter_end,quantity,quantity_sold,rate,subtotal_one,expense_one,expense_two,expense_three,subtotal_two,grandtotal,income,closing_meter,year,month) VALUES ('" + date + "','" + pumpNo + "','" + opening + "','" + start + "','" + end + "','" + quantity + "','" + qSold + "','" + rate + "','" + subtotal1 + "','" + exp1 + "','" + exp2 + "','" + exp3 + "','" + subtotal2 + "','" + grandtotal + "','" + income + "','" + closing + "','" + year + "','" + month + "')";

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

    public Boolean addRecordKerosene(String date, String pumpNo, String opening, String start, String end, String quantity, String qSold, String rate, String subtotal1, String exp1, String exp2, String exp3, String subtotal2, String grandtotal, String income, String closing, int year, String month) {

        String sql_stmnt = "INSERT INTO fuel_kerosene(date_kerosene,pump_no,opening_meter,meter_start,meter_end,quantity,quantity_sold,rate,subtotal_one,expense_one,expense_two,expense_three,subtotal_two,grandtotal,income,closing_meter,year,month) VALUES ('" + date + "','" + pumpNo + "','" + opening + "','" + start + "','" + end + "','" + quantity + "','" + qSold + "','" + rate + "','" + subtotal1 + "','" + exp1 + "','" + exp2 + "','" + exp3 + "','" + subtotal2 + "','" + grandtotal + "','" + income + "','" + closing + "','" + year + "','" + month + "')";

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

    public Boolean addRecordLPGGas(int year, String month, String date, String category, String amount, String tAmount) {

        String sql_stmnt = "INSERT INTO lpg_gas(year,month,date,category,amount,total_amount) VALUES ('" + year + "','" + month + "','" + date + "','" + category + "','" + amount + "','" + tAmount + "')";

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

    //Delete
    public Boolean delete(String id) {
        //SQL

        String sql = "DELETE FROM fuel_super WHERE sid ='" + id + "'";

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

    public Boolean deleteRegular(String id) {
        //SQL

        String sql = "DELETE FROM fuel_regular WHERE rid ='" + id + "'";

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

    public Boolean deleteDiesel(String id) {
        //SQL

        String sql = "DELETE FROM fuel_diesel WHERE did ='" + id + "'";

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

    public Boolean deleteKerosene(String id) {
        //SQL

        String sql = "DELETE FROM fuel_kerosene WHERE kid ='" + id + "'";

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

    public Boolean deleteGas(String id) {
        //SQL

        String sql = "DELETE FROM lpg_gas WHERE g_id ='" + id + "'";

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

    //Retrieve Data
    public DefaultTableModel getData() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Sid");
        dm.addColumn("Date");
        dm.addColumn("Pump No");
        dm.addColumn("Opening");
        dm.addColumn("Meter Start");
        dm.addColumn("Meter End");
        dm.addColumn("Quantity");
        dm.addColumn("Q Sold");
        dm.addColumn("Rate");
        dm.addColumn("Subtotal1");
        dm.addColumn("Exp 1");
        dm.addColumn("Exp 2");
        dm.addColumn("Exp 3");
        dm.addColumn("Subtotal2");
        dm.addColumn("Grandtotal");
        dm.addColumn("Income");
        dm.addColumn("Closing");
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
                String id = rt.getString(1);
                String date = rt.getString(2);
                String pump = rt.getString(3);
                String opening = rt.getString(4);
                String start = rt.getString(5);
                String end = rt.getString(6);
                String quantity = rt.getString(7);
                String qSold = rt.getString(8);
                String rate = rt.getString(9);
                String subtotal1 = rt.getString(10);
                String exp1 = rt.getString(11);
                String exp2 = rt.getString(12);
                String exp3 = rt.getString(13);
                String subtotal2 = rt.getString(14);
                String grandtotal = rt.getString(15);
                String income = rt.getString(16);
                String closing = rt.getString(17);
                String year = rt.getString(18);
                String month = rt.getString(19);

                dm.addRow(new String[]{id, date, pump, opening, start, end, quantity, qSold, rate, subtotal1, exp1, exp2, exp3, subtotal2, grandtotal, income, closing,year,month});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public DefaultTableModel getDataRegular() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Sid");
        dm.addColumn("Date");
        dm.addColumn("Pump No");
        dm.addColumn("Opening");
        dm.addColumn("Meter Start");
        dm.addColumn("Meter End");
        dm.addColumn("Quantity");
        dm.addColumn("Q Sold");
        dm.addColumn("Rate");
        dm.addColumn("Subtotal1");
        dm.addColumn("Exp 1");
        dm.addColumn("Exp 2");
        dm.addColumn("Exp 3");
        dm.addColumn("Subtotal2");
        dm.addColumn("Grandtotal");
        dm.addColumn("Income");
        dm.addColumn("Closing");
        dm.addColumn("Year");
        dm.addColumn("Month");

        //Select
        String sql = "SELECT * FROM fuel_regular";

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
                String pump = rt.getString(3);
                String opening = rt.getString(4);
                String start = rt.getString(5);
                String end = rt.getString(6);
                String quantity = rt.getString(7);
                String qSold = rt.getString(8);
                String rate = rt.getString(9);
                String subtotal1 = rt.getString(10);
                String exp1 = rt.getString(11);
                String exp2 = rt.getString(12);
                String exp3 = rt.getString(13);
                String subtotal2 = rt.getString(14);
                String grandtotal = rt.getString(15);
                String income = rt.getString(16);
                String closing = rt.getString(17);
                String year = rt.getString(18);
                String month = rt.getString(19);

                dm.addRow(new String[]{id, date, pump, opening, start, end, quantity, qSold, rate, subtotal1, exp1, exp2, exp3, subtotal2, grandtotal, income, closing,year,month});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    
    
    public DefaultTableModel getDataRegularAccounts() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        //dm.addColumn("Sid");
        dm.addColumn("Date");
        //dm.addColumn("Pump No");
        //dm.addColumn("Opening");
        //dm.addColumn("Meter Start");
        //dm.addColumn("Meter End");
        //dm.addColumn("Quantity");
        dm.addColumn("Q Sold");
        dm.addColumn("Rate");
        dm.addColumn("Total Sale");
        //dm.addColumn("Exp 1");
        //dm.addColumn("Exp 2");
        //dm.addColumn("Exp 3");
        dm.addColumn("Expenditure");
        //dm.addColumn("Grandtotal");
        dm.addColumn("Income");
        //dm.addColumn("Closing");
        dm.addColumn("Year");
        dm.addColumn("Month");

        //Select
        String sql = "SELECT * FROM fuel_regular";

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
                //String pump = rt.getString(3);
                //String opening = rt.getString(4);
                //String start = rt.getString(5);
                //String end = rt.getString(6);
                //String quantity = rt.getString(7);
                String qSold = rt.getString(8);
                String rate = rt.getString(9);
                String subtotal1 = rt.getString(10);
                //String exp1 = rt.getString(11);
                //String exp2 = rt.getString(12);
                //String exp3 = rt.getString(13);
                String subtotal2 = rt.getString(14);
                //String grandtotal = rt.getString(15);
                String income = rt.getString(16);
                //String closing = rt.getString(17);
                String year = rt.getString(18);
                String month = rt.getString(19);

                dm.addRow(new String[]{ date,  qSold, rate, subtotal1, subtotal2, income,year,month});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public DefaultTableModel getDieselP1Profits() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Category");
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
                
                String year = rt.getString(2);
                String month = rt.getString(3);
                String category = rt.getString(5);
                String profit = rt.getString(14);
                
                dm.addRow(new String[]{year,month,category,profit});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public DefaultTableModel getDieselP2Profits() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Category");
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
                
                String year = rt.getString(2);
                String month = rt.getString(3);
                String category = rt.getString(5);
                String profit = rt.getString(14);
                
                dm.addRow(new String[]{year,month,category,profit});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public DefaultTableModel getKeroseneProfits() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Category");
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
                
                String year = rt.getString(2);
                String month = rt.getString(3);
                String category = rt.getString(5);
                String profit = rt.getString(14);
                
                dm.addRow(new String[]{year,month,category,profit});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public DefaultTableModel getPetrolProfits() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Category");
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
                
                String year = rt.getString(2);
                String month = rt.getString(3);
                String category = rt.getString(5);
                String profit = rt.getString(14);
                
                dm.addRow(new String[]{year,month,category,profit});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    
    
    public DefaultTableModel getDataDiesel() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Sid");
        dm.addColumn("Date");
        dm.addColumn("Pump No");
        dm.addColumn("Opening");
        dm.addColumn("Meter Start");
        dm.addColumn("Meter End");
        dm.addColumn("Quantity");
        dm.addColumn("Q Sold");
        dm.addColumn("Rate");
        dm.addColumn("Subtotal1");
        dm.addColumn("Exp 1");
        dm.addColumn("Exp 2");
        dm.addColumn("Exp 3");
        dm.addColumn("Subtotal2");
        dm.addColumn("Grandtotal");
        dm.addColumn("Income");
        dm.addColumn("Closing");
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
                String id = rt.getString(1);
                String date = rt.getString(2);
                String pump = rt.getString(3);
                String opening = rt.getString(4);
                String start = rt.getString(5);
                String end = rt.getString(6);
                String quantity = rt.getString(7);
                String qSold = rt.getString(8);
                String rate = rt.getString(9);
                String subtotal1 = rt.getString(10);
                String exp1 = rt.getString(11);
                String exp2 = rt.getString(12);
                String exp3 = rt.getString(13);
                String subtotal2 = rt.getString(14);
                String grandtotal = rt.getString(15);
                String income = rt.getString(16);
                String closing = rt.getString(17);
                String year = rt.getString(18);
                String month = rt.getString(19);

                dm.addRow(new String[]{id, date, pump, opening, start, end, quantity, qSold, rate, subtotal1, exp1, exp2, exp3, subtotal2, grandtotal, income, closing, year, month});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public DefaultTableModel getDataKerosene() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Kid");
        dm.addColumn("Date");
        dm.addColumn("Pump No");
        dm.addColumn("Opening");
        dm.addColumn("Meter Start");
        dm.addColumn("Meter End");
        dm.addColumn("Quantity");
        dm.addColumn("Q Sold");
        dm.addColumn("Rate");
        dm.addColumn("Subtotal1");
        dm.addColumn("Exp 1");
        dm.addColumn("Exp 2");
        dm.addColumn("Exp 3");
        dm.addColumn("Subtotal2");
        dm.addColumn("Grandtotal");
        dm.addColumn("Income");
        dm.addColumn("Closing");
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
                String id = rt.getString(1);
                String date = rt.getString(2);
                String pump = rt.getString(3);
                String opening = rt.getString(4);
                String start = rt.getString(5);
                String end = rt.getString(6);
                String quantity = rt.getString(7);
                String qSold = rt.getString(8);
                String rate = rt.getString(9);
                String subtotal1 = rt.getString(10);
                String exp1 = rt.getString(11);
                String exp2 = rt.getString(12);
                String exp3 = rt.getString(13);
                String subtotal2 = rt.getString(14);
                String grandtotal = rt.getString(15);
                String income = rt.getString(16);
                String closing = rt.getString(17);
                String year = rt.getString(18);
                String month = rt.getString(19);

                dm.addRow(new String[]{id, date, pump, opening, start, end, quantity, qSold, rate, subtotal1, exp1, exp2, exp3, subtotal2, grandtotal, income, closing, year, month});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public DefaultTableModel getGas() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("gid");
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
                String id = rt.getString(1);
                String year = rt.getString(2);
                String month = rt.getString(3);
                String date = rt.getString(4);
                String category = rt.getString(5);
                String amount = rt.getString(6);
                String total = rt.getString(7);

                dm.addRow(new String[]{id, year, month, date, category, amount, total});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //Manage My Stock
    //Retrieve Data
    public DefaultTableModel getSuperStock() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Sid");
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
                String id = rt.getString(1);
                String pump = rt.getString(3);
                String opening = rt.getString(4);
                String closing = rt.getString(17);

                dm.addRow(new String[]{id, pump, opening, closing});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public DefaultTableModel getRegularStock() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("rid");
        dm.addColumn("Pump No");
        dm.addColumn("Opening");
        dm.addColumn("Closing");

        //Select
        String sql = "SELECT * FROM fuel_regular";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            //Prepared statement
            PreparedStatement st = conn.prepareStatement(sql);

            //st.execute();
            ResultSet rt = st.executeQuery();

            while (rt.next()) {
                String id = rt.getString(1);
                String pump = rt.getString(3);
                String opening = rt.getString(4);
                String closing = rt.getString(17);

                dm.addRow(new String[]{id, pump, opening, closing});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public DefaultTableModel getDieselStock() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("did");
        dm.addColumn("Pump No");
        dm.addColumn("Opening");
        dm.addColumn("Closing");

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
                String id = rt.getString(1);
                String pump = rt.getString(3);
                String opening = rt.getString(4);
                String closing = rt.getString(17);

                dm.addRow(new String[]{id, pump, opening, closing});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public DefaultTableModel getKeroseneStock() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("kid");
        dm.addColumn("Pump No");
        dm.addColumn("Opening");
        dm.addColumn("Closing");

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
                String id = rt.getString(1);
                String pump = rt.getString(3);
                String opening = rt.getString(4);
                String closing = rt.getString(17);

                dm.addRow(new String[]{id, pump, opening, closing});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Boolean update(String id, String date, String superSale, String regular, String diesel, String kerosene) {
        String sql = "UPDATE fuel_rates SET date = '" + date + "',super='" + superSale + "',regular='" + regular + "',diesel='" + diesel + "',kerosene='" + kerosene + "' WHERE rid ='" + id + "'";

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

}
