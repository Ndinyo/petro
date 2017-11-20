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
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abi
 */
public class DBUpdater {

    String conString = "jdbc:postgresql://localhost:5432/Petro";
    String user = "postgres";
    String password = "abel";

    ResultSet rs = null;

    //Insert Data
    public Boolean addRecord(String empNo, String fullName, String gender, String role, String address, String contact, String idNo, String salary, String dateJoin) {
        String sql_stmnt = "INSERT into employees(emp_no,full_name,gender,role_emp,address,contact,id_no,salary,date) VALUES ('" + empNo + "','" + fullName + "','" + gender + "','" + role + "','" + address + "','" + contact + "','" + idNo + "','" + salary + "','" + dateJoin + "')";

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

        dm.addColumn("id");
        dm.addColumn("Emp No");
        dm.addColumn("Full Name");
        dm.addColumn("Gender");
        dm.addColumn("Role");
        dm.addColumn("Address");
        dm.addColumn("Contact");
        dm.addColumn("Id No");
        dm.addColumn("Salary");
        dm.addColumn("Date");

        //Select
        String sql = "SELECT * FROM employees";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            //Prepared statement
            PreparedStatement st = conn.prepareStatement(sql);

            ResultSet rt = st.executeQuery();

            while (rt.next()) {
                String id = rt.getString(1);
                String empno = rt.getString(2);
                String name = rt.getString(3);
                String gender = rt.getString(4);
                String role = rt.getString(5);
                String address = rt.getString(6);
                String contact = rt.getString(7);
                String idno = rt.getString(8);
                String salary = rt.getString(9);
                String date = rt.getString(10);

                dm.addRow(new String[]{id, empno, name, gender, role, address, contact, idno, salary, date});
            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //Update
    public Boolean update(String id, String empNo, String fullName, String gender, String role, String address, String contact, String idNo, String salary, String date) {
        String sql = "UPDATE employees SET emp_no = '" + empNo + "',full_name='" + fullName + "',gender='" + gender + "',role_emp='" + role + "',address='" + address + "',contact='" + contact + "',id_no='" + idNo + "',salary='" + salary + "',date='" + date + "' WHERE id ='" + id + "'";

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

        String sql = "DELETE FROM employees WHERE id ='" + id + "'";

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

    
    public DefaultTableModel getEmployeeData() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        //dm.addColumn("id");
        dm.addColumn("Emp No");
        dm.addColumn("Full Name");
        dm.addColumn("Gender");
        dm.addColumn("Role");
        dm.addColumn("Id No");
        dm.addColumn("Salary");

        //Select
        String sql = "SELECT * FROM employees";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            //Prepared statement
            PreparedStatement st = conn.prepareStatement(sql);

            ResultSet rt = st.executeQuery();

            while (rt.next()) {
                //String id = rt.getString(1);
                String empno = rt.getString(2);
                String name = rt.getString(3);
                String gender = rt.getString(4);
                String role = rt.getString(5);
                String idno = rt.getString(8);
                String salary = rt.getString(9);

                dm.addRow(new String[]{empno, name, gender, role, idno, salary});
            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Boolean addAdvance(int year, String month, String date, String empNo, String fullName,  String role, String salary, String advance, String balance) {
        String sql_stmnt = "INSERT into advancepay(year,month,date,emp_no,name,role,salary,advance,balance) VALUES ('" + year + "','" + month + "','" + date + "','" + empNo + "','" + fullName + "','" + role + "','"  + salary + "','" + advance + "','" + balance + "')";

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
    
    
    public DefaultTableModel getAdvancePayData() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("id");
        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Date");
        dm.addColumn("Emp No");
        dm.addColumn("Name");
        dm.addColumn("Role");
        dm.addColumn("Salary");
        dm.addColumn("Advance");
        dm.addColumn("Balance");
        

        //Select
        String sql = "SELECT * FROM advancepay";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            //Prepared statement
            PreparedStatement st = conn.prepareStatement(sql);

            ResultSet rt = st.executeQuery();

            while (rt.next()) {
                String id = rt.getString(1);
                String year = rt.getString(2);
                String month = rt.getString(3);
                String date = rt.getString(4);
                String empno = rt.getString(5);
                String name = rt.getString(6);
                String role = rt.getString(7);
                String salary = rt.getString(8);
                String advance = rt.getString(9);
                String balance = rt.getString(10);

                dm.addRow(new String[]{id, year, month, date, empno, name, role, salary, advance,balance});
            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Boolean deleteAdvancePay(String id) {
        //SQL

        String sql = "DELETE FROM advancepay WHERE a_id ='" + id + "'";

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
    
    
    public Boolean addPaymentRecord(int year, String month, String date,String empno, String name, String role,String idno, String gender, String salary, String advance,String paid,  String expected, String amountpaid, String balance) {
        String sql_stmnt = "INSERT into salary(year,month,date,emp_no,full_name,role,idno,gender,salary,advance,paidadvance,expected,amountpaid,balance) VALUES ('" + year + "','" + month + "','" + date + "','" + empno + "','" + name + "','" + role + "','" + idno + "','" + gender + "','" + salary +"','"+advance+ "','"+paid+"','"+expected+"','"+amountpaid+"','"+balance+"')";

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
    
    
    
     public DefaultTableModel getPayments() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("ID");
        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Date");
        dm.addColumn("Emp No");
        dm.addColumn("Full Name");
        dm.addColumn("Role");
        dm.addColumn("Id No");
        dm.addColumn("Gender");
        dm.addColumn("Salary");
        dm.addColumn("Advance salary");
        dm.addColumn("Paid Advance?");
        dm.addColumn("Expected Salary");
        dm.addColumn("Salary Paid");
        dm.addColumn("Balance");
        
        

        //Select
        String sql = "SELECT * FROM salary";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            //Prepared statement
            PreparedStatement st = conn.prepareStatement(sql);

            ResultSet rt = st.executeQuery();

            while (rt.next()) {
                String id = rt.getString(1);
                String year = rt.getString(2);
                String month = rt.getString(3);
                String date = rt.getString(4);
                String empno = rt.getString(5);
                String name = rt.getString(6);
                String role = rt.getString(7);
                String idno = rt.getString(8);
                String gender = rt.getString(9);
                String salary = rt.getString(10);
                String advance = rt.getString(11);
                String paid = rt.getString(12);
                String expected = rt.getString(13);
                String salaryPaid = rt.getString(14);
                String balance = rt.getString(15);
                
                

                dm.addRow(new String[]{id,year,month,date,empno,name,role,idno,gender,salary,advance,paid,expected,salaryPaid,balance});
            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
     
     
     public Boolean deletePayments(String id) {
        //SQL

        String sql = "DELETE FROM salary WHERE s_id ='" + id + "'";

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
