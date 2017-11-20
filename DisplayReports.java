package petro;

/**
 *
 * @author Abi
 */
public class DisplayReports extends JasperReports {

    public void showEmployees() throws ClassNotFoundException {
        m_report_source = "fueldelivery.jrxml";
        m_sql_stmt = "SELECT * FROM fuel_bill";
        showReport();
    }

    public void showPetrolStock() throws ClassNotFoundException {
        p_report_source = "petrolsale.jrxml";
        p_sql_stmt = "SELECT * FROM fuel_super";
        showReportPetrolStock();
    }

    public void showDieselP1Stock() throws ClassNotFoundException {
        dp1_report_source = "dieselp1.jrxml";
        dp1_sql_stmt = "SELECT * FROM fuel_regular";
        showReportDieselP1Stock();
    }

    public void showDieselP2Stock() throws ClassNotFoundException {
        dp2_report_source = "dieselp2.jrxml";
        dp2_sql_stmt = "SELECT * FROM fuel_diesel";
        showReportDieselP2Stock();
    }

    public void showKeroseneStock() throws ClassNotFoundException {
        k_report_source = "kerosene.jrxml";
        k_sql_stmt = "SELECT * FROM fuel_kerosene";
        showReportKeroseneStock();
    }

    public void showPetrolSale() throws ClassNotFoundException {
        psale_report_source = "petrosale.jrxml";
        psale_sql_stmt = "SELECT * FROM fuel_super";
        showReportPetrolSale();
    }

    public void showDieselP1Sale() throws ClassNotFoundException {
        dp1sale_report_source = "dieselp1sale.jrxml";
        dp1sale_sql_stmt = "SELECT * FROM fuel_regular";
        showReportDieselP1Sale();
    }

    public void showDieselP2Sale() throws ClassNotFoundException {
        dp2sale_report_source = "dieselp2sale.jrxml";
        dp2sale_sql_stmt = "SELECT * FROM fuel_diesel";
        showReportDieselP2Sale();
    }

    public void showKeroseneSale() throws ClassNotFoundException {
        kerosenesale_report_source = "kerosenesale.jrxml";
        kerosenesale_sql_stmt = "SELECT * FROM fuel_kerosene";
        showReportKeroseneSale();
    }

    public void showGasSale() throws ClassNotFoundException {
        gassale_report_source = "gassale.jrxml";
        gassale_sql_stmt = "SELECT * FROM lpg_gas";
        showReportGasSale();
    }

    public void showSalary() throws ClassNotFoundException {
        salary_report_source = "salary.jrxml";
        salary_sql_stmt = "SELECT * FROM salary";
        showReportSalary();
    }

    public void showExpenses() throws ClassNotFoundException {
        expenses_report_source = "expenses.jrxml";
        expenses_sql_stmt = "SELECT * FROM expenses";
        showReportExpenses();
    }

    public void showGasDelivery() throws ClassNotFoundException {
        gasdelivery_report_source = "gasdelivery.jrxml";
        gasdelivery_sql_stmt = "SELECT * FROM gas_delivery";
        showReportGasDelivery();
    }

    public void showGasAccounts() throws ClassNotFoundException {
        gasaccounts_report_source = "gasaccounts.jrxml";
        gasaccounts_sql_stmt = "SELECT * FROM gas_accounts";
        showReportGasAccounts();
    }

    public void showDieselP1Accounts() throws ClassNotFoundException {
        dieselp1accounts_report_source = "dieselp1_accounts.jrxml";
        dieselp1accounts_sql_stmt = "SELECT * FROM dieselp1_accounts";
        showReportDieselP1Accounts();
    }

    public void showDieselP2Accounts() throws ClassNotFoundException {
        dieselp2accounts_report_source = "dieselp2_accounts.jrxml";
        dieselp2accounts_sql_stmt = "SELECT * FROM dieselp2_accounts";
        showReportDieselP2Accounts();
    }

    public void showKeroseneAccounts() throws ClassNotFoundException {
        keroseneaccounts_report_source = "kerosene_accounts.jrxml";
        keroseneaccounts_sql_stmt = "SELECT * FROM kerosene_accounts";
        showReportKeroseneAccounts();
    }

    public void showPetrolAccounts() throws ClassNotFoundException {
        petrolaccounts_report_source = "petrol_accounts.jrxml";
        petrolaccounts_sql_stmt = "SELECT * FROM petrol_accounts";
        showReportPetrolAccounts();
    }

    //Dips
    public void showDieselP1Dips() throws ClassNotFoundException {
        dp1dips_report_source = "dp1dips.jrxml";
        dp1dips_sql_stmt = "SELECT * FROM dieselp1_dips";
        showReportDP1Dips();
    }
    
    public void showDieselP2Dips() throws ClassNotFoundException {
        dp2dips_report_source = "dp2dips.jrxml";
        dp2dips_sql_stmt = "SELECT * FROM dieselp2_dips";
        showReportDP2Dips();
    }
    
    public void showKeroseneDips() throws ClassNotFoundException {
        kdips_report_source = "kerosenedips.jrxml";
        kdips_sql_stmt = "SELECT * FROM kerosene_dips";
        showReportKeroseneDips();
    }
    
    public void showPetrolDips() throws ClassNotFoundException {
        pdips_report_source = "petroldips.jrxml";
        pdips_sql_stmt = "SELECT * FROM petrol_dips";
        showReportPetrolDips();
    }
}
