
package petro;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Abi
 */
public class JasperReports {

    String m_where;
    String m_report_source = "/petro/";
    String m_sql_stmt = null;
    Map parametersMap = new HashMap();

    protected void showReport() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(m_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(m_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMap, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }

    String p_where;
    String p_report_source = "/petro/";
    String p_sql_stmt = null;
    Map parametersMapPetrol = new HashMap();

    protected void showReportPetrolStock() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(p_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(p_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMapPetrol, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }

    String dp1_where;
    String dp1_report_source = "/petro/";
    String dp1_sql_stmt = null;
    Map parametersMapDP1 = new HashMap();

    protected void showReportDieselP1Stock() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(dp1_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(dp1_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMapDP1, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }

    String dp2_where;
    String dp2_report_source = "/petro/";
    String dp2_sql_stmt = null;
    Map parametersMapDP2 = new HashMap();

    protected void showReportDieselP2Stock() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(dp2_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(dp2_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMapDP2, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }

    String k_where;
    String k_report_source = "/petro/";
    String k_sql_stmt = null;
    Map parametersMapKerosene = new HashMap();

    protected void showReportKeroseneStock() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(k_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(k_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMapKerosene, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }

    String psale_where;
    String psale_report_source = "/petro/";
    String psale_sql_stmt = null;
    Map parametersMapPetrolSale = new HashMap();

    protected void showReportPetrolSale() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(psale_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(psale_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMapPetrolSale, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }

    String dp1sale_where;
    String dp1sale_report_source = "/petro/";
    String dp1sale_sql_stmt = null;
    Map parametersMapDieselP1Sale = new HashMap();

    protected void showReportDieselP1Sale() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(dp1sale_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(dp1sale_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMapDieselP1Sale, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }

    String dp2sale_where;
    String dp2sale_report_source = "/petro/";
    String dp2sale_sql_stmt = null;
    Map parametersMapDieselP2Sale = new HashMap();

    protected void showReportDieselP2Sale() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(dp2sale_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(dp2sale_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMapDieselP2Sale, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }

    String kerosenesale_where;
    String kerosenesale_report_source = "/petro/";
    String kerosenesale_sql_stmt = null;
    Map parametersMapKeroseneSale = new HashMap();

    protected void showReportKeroseneSale() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(kerosenesale_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(kerosenesale_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMapKeroseneSale, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }

    String gassale_where;
    String gassale_report_source = "/petro/";
    String gassale_sql_stmt = null;
    Map parametersMapgasSale = new HashMap();

    protected void showReportGasSale() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(gassale_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(gassale_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMapgasSale, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }

    String salary_where;
    String salary_report_source = "/petro/";
    String salary_sql_stmt = null;
    Map parametersMapSalarySale = new HashMap();

    protected void showReportSalary() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(salary_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(salary_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMapSalarySale, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }

    String expenses_where;
    String expenses_report_source = "/petro/";
    String expenses_sql_stmt = null;
    Map parametersMapExpensesSale = new HashMap();

    protected void showReportExpenses() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(expenses_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(expenses_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMapExpensesSale, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }
    
    String gasdelivery_where;
    String gasdelivery_report_source = "/petro/";
    String gasdelivery_sql_stmt = null;
    Map parametersMapGasDelivery = new HashMap();

    protected void showReportGasDelivery() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(gasdelivery_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(gasdelivery_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMapGasDelivery, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }
    
    String gasaccounts_where;
    String gasaccounts_report_source = "/petro/";
    String gasaccounts_sql_stmt = null;
    Map parametersMapGasAccounts = new HashMap();

    protected void showReportGasAccounts() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(gasaccounts_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(gasaccounts_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMapGasAccounts, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }
    
    String dieselp1accounts_where;
    String dieselp1accounts_report_source = "/petro/";
    String dieselp1accounts_sql_stmt = null;
    Map parametersMapDieselP1Accounts = new HashMap();

    protected void showReportDieselP1Accounts() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(dieselp1accounts_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(dieselp1accounts_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMapDieselP1Accounts, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }
    
     String dieselp2accounts_where;
    String dieselp2accounts_report_source = "/petro/";
    String dieselp2accounts_sql_stmt = null;
    Map parametersMapDieselP2Accounts = new HashMap();

    protected void showReportDieselP2Accounts() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(dieselp2accounts_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(dieselp2accounts_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMapDieselP2Accounts, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }
    
    String keroseneaccounts_where;
    String keroseneaccounts_report_source = "/petro/";
    String keroseneaccounts_sql_stmt = null;
    Map parametersMapKeroseneAccounts = new HashMap();

    protected void showReportKeroseneAccounts() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(keroseneaccounts_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(keroseneaccounts_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMapKeroseneAccounts, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }
    
    String petrolaccounts_where;
    String petrolaccounts_report_source = "/petro/";
    String petrolaccounts_sql_stmt = null;
    Map parametersMapPetrolAccounts = new HashMap();

    protected void showReportPetrolAccounts() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(petrolaccounts_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(petrolaccounts_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMapPetrolAccounts, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }
    
    String dp1dips_where;
    String dp1dips_report_source = "/petro/";
    String dp1dips_sql_stmt = null;
    Map parametersDP1DipsMap = new HashMap();

    protected void showReportDP1Dips() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(dp1dips_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(dp1dips_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersDP1DipsMap, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }
    
    String dp2dips_where;
    String dp2dips_report_source = "/petro/";
    String dp2dips_sql_stmt = null;
    Map parametersDP2DipsMap = new HashMap();

    protected void showReportDP2Dips() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(dp2dips_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(dp2dips_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersDP2DipsMap, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }
    
    String kdips_where;
    String kdips_report_source = "/petro/";
    String kdips_sql_stmt = null;
    Map parametersKeroseneDipsMap = new HashMap();

    protected void showReportKeroseneDips() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(kdips_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(kdips_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersKeroseneDipsMap, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }
    
    String pdips_where;
    String pdips_report_source = "/petro/";
    String pdips_sql_stmt = null;
    Map parametersPetrolDipsMap = new HashMap();

    protected void showReportPetrolDips() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Petro";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(pdips_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(pdips_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersPetrolDipsMap, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }
}
