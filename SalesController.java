package petro.Controller;

/**
 *
 * @author Abi
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import petro.Model.SalesModel;
import petro.View.DieselP1;
import petro.View.DieselP2;
import petro.View.Kerosene;
import petro.View.Petrol;

public class SalesController {

    private Petrol viewPetrolSales;
    private SalesModel modelPetrolSales;

    public SalesController(Petrol viewPetrolSales, SalesModel modelPetrolSales) {
        this.modelPetrolSales = modelPetrolSales;
        this.viewPetrolSales = viewPetrolSales;

        //Super ActionListeners
        this.viewPetrolSales.addSuperMeterQuantityListener(new CalculateSuperMeterQuantity());
        this.viewPetrolSales.addSubTotal1Listener(new CalculateSubTotal1());
        this.viewPetrolSales.addSubTotal2Listener(new CalculateSubTotal2());
        this.viewPetrolSales.addSuperGrandTotalListener(new CalculateSuperGrandTotal());
        this.viewPetrolSales.addSuperIncomeListener(new CalculateSuperIncome());

    }

    //Super
    class CalculateSuperMeterQuantity implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double mStart = 0, mEnd = 0;

                mStart = viewPetrolSales.getSuperMeterStart();
                mEnd = viewPetrolSales.getSuperMeterEnd();

                modelPetrolSales.calculateSuperMeterQuantity(mStart, mEnd);
                viewPetrolSales.setSuperMeterQuantity(modelPetrolSales.getCalculateSuperMeterQuantity());
            } catch (Exception serror) {
                System.out.println(serror);
            }
        }

    }

    class CalculateSubTotal1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double quantity = 0, rate = 0;

                quantity = viewPetrolSales.getSuperMeterQuantitySold();
                rate = viewPetrolSales.getSuperRate();

                modelPetrolSales.calculatesubTotal1(quantity, rate);
                viewPetrolSales.setSuperSubTotal(modelPetrolSales.getSubTotal1());
            } catch (Exception sub) {
                JOptionPane.showConfirmDialog(null, "Incorrecct entry Incase of a null field put a zero!", "Error!", JOptionPane.CANCEL_OPTION);

            }
        }
    }

    class CalculateSubTotal2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double expense1 = 0, expense2 = 0, expense3 = 0;

                
                expense1 = viewPetrolSales.getSuperExpense1();
                expense2 = viewPetrolSales.getSuperExpense2();
                expense3 = viewPetrolSales.getSuperExpense3();

                modelPetrolSales.calculateSuperExpenses(expense1, expense2, expense3);
                viewPetrolSales.setSuperSubTotal2(modelPetrolSales.getSuperExpenses());
            } catch (Exception sub) {
                JOptionPane.showConfirmDialog(null, "Incorrecct entry Incase of a null field put a zero!", "Error!", JOptionPane.CANCEL_OPTION);
            }
        }
    }

    class CalculateSuperGrandTotal implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double sub1 = 0;
                double sub2 = 0;

                sub1 = viewPetrolSales.getSuperSubTotal();
                sub2 = viewPetrolSales.getSuperSubTotal2();

                modelPetrolSales.calculateSuperGrandTotal(sub1, sub2);
                viewPetrolSales.setSupGrandTotal(modelPetrolSales.getSuperGrandTotal());
            } catch (Exception ex) {
                JOptionPane.showConfirmDialog(null, "Incorrecct entry Incase of a null field put a zero!", "Error!", JOptionPane.CANCEL_OPTION);
            }
        }
    }

    class CalculateSuperIncome implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double val1 = 0;
                double val2 = 0;

                val1 = viewPetrolSales.getSuperSubTotal();
                val2 = viewPetrolSales.getSuperSubTotal2();

                modelPetrolSales.calculateSuperIncome(val1, val2);
                viewPetrolSales.setSupIncome(modelPetrolSales.getSuperIncome());
            } catch (Exception ex) {
                JOptionPane.showConfirmDialog(null, "Incorrecct entry Incase of a null field put a zero!", "Error!", JOptionPane.CANCEL_OPTION);
            }
        }
    }

    private DieselP1 viewDieselP1Sales;
    private SalesModel modelDieselP1Sales;

    public SalesController(DieselP1 viewDieselP1Sales, SalesModel modelDieselP1Sales) {

        this.viewDieselP1Sales = viewDieselP1Sales;
        this.modelDieselP1Sales = modelDieselP1Sales;

        this.viewDieselP1Sales.addRegularMeterQuantityListener(new CalculateRegularMeterQuantity());
        this.viewDieselP1Sales.addRegularSubTotal1Listener(new CalculateRegularSubTotal1());
        this.viewDieselP1Sales.addRegularSubTotal2Listener(new CalculateRegularSubTotal2());
        this.viewDieselP1Sales.addRegularGrandTotalListener(new CalculateRegularGrandTotal());
        this.viewDieselP1Sales.addRegularIncomeListener(new CalculateRegularIncome());

    }

    //Regular
    class CalculateRegularMeterQuantity implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double mStart = 0, mEnd = 0;

                mStart = viewDieselP1Sales.getRegularMeterStart();
                mEnd = viewDieselP1Sales.getRegularMeterEnd();

                modelDieselP1Sales.calculateRegularMeterQuantity(mStart, mEnd);
                viewDieselP1Sales.setRegularMeterQuantity(modelDieselP1Sales.getCalculateRegularMeterQuantity());
            } catch (Exception serror) {
                JOptionPane.showMessageDialog(null, serror.getMessage());
            }
        }

    }

    class CalculateRegularSubTotal1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double quantity = 0, rate = 0;

                quantity = viewDieselP1Sales.getRegularMeterQuantitySold();
                rate = viewDieselP1Sales.getRegularRate();

                modelDieselP1Sales.calculateRegularsubTotal1(quantity, rate);
                viewDieselP1Sales.setRegularSubTotal1(modelDieselP1Sales.getRegularSubTotal1());
            } catch (Exception sub) {
                JOptionPane.showMessageDialog(null, sub.getMessage());
            }
        }
    }

    class CalculateRegularSubTotal2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double expense1 = 0, expense2 = 0, expense3 = 0;

                expense1 = viewDieselP1Sales.getRegularExpense1();
                expense2 = viewDieselP1Sales.getRegularExpense2();
                expense3 = viewDieselP1Sales.getRegularExpense3();

                modelDieselP1Sales.calculateRegularExpenses(expense1, expense2, expense3);
                viewDieselP1Sales.setRegularSubTotal2(modelDieselP1Sales.getRegularExpenses());
            } catch (Exception sub) {
                JOptionPane.showConfirmDialog(null, "Incorrecct entry Incase of a null field put a zero!", "Error!", JOptionPane.CANCEL_OPTION);
            }
        }
    }

    class CalculateRegularGrandTotal implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double sub1 = 0;
                double sub2 = 0;

                sub1 = viewDieselP1Sales.getRegularSubTotal1();
                sub2 = viewDieselP1Sales.getRegularSubTotal2();

                modelDieselP1Sales.calculateRegularGrandTotal(sub1, sub2);
                viewDieselP1Sales.setRegularGrandTotal(modelDieselP1Sales.getRegularGrandTotal());
            } catch (Exception ex) {
                JOptionPane.showConfirmDialog(null, "Incorrecct entry Incase of a null field put a zero!", "Error!", JOptionPane.CANCEL_OPTION);
            }
        }
    }

    class CalculateRegularIncome implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double val1 = 0;
                double val2 = 0;

                val1 = viewDieselP1Sales.getRegularSubTotal1();
                val2 = viewDieselP1Sales.getRegularSubTotal2();

                modelDieselP1Sales.calculateRegularIncome(val1, val2);
                viewDieselP1Sales.setRegularIncome(modelDieselP1Sales.getRegularIncome());
            } catch (Exception ex) {
                JOptionPane.showConfirmDialog(null, "Incorrecct entry Incase of a null field put a zero!", "Error!", JOptionPane.CANCEL_OPTION);
            }
        }
    }

    //Diesel
    private DieselP2 viewDieselP2Sales;
    private SalesModel modelDieselP2Sales;

    public SalesController(DieselP2 viewDieselP2Sales, SalesModel modelDieselP2Sales) {

        this.viewDieselP2Sales = viewDieselP2Sales;
        this.modelDieselP2Sales = modelDieselP2Sales;

        //Diesel ActionListeners
        this.viewDieselP2Sales.addDieselMeterQuantityListener(new CalculateDieselMeterQuantity());
        this.viewDieselP2Sales.addDieselSubTotal1Listener(new CalculateDieselSubTotal1());
        this.viewDieselP2Sales.addDieselSubTotal2Listener(new CalculateDieselSubTotal2());
        this.viewDieselP2Sales.addDieselGrandTotalListener(new CalculateDieselGrandTotal());
        this.viewDieselP2Sales.addDieselIncomeListener(new CalculateDieselIncome());

    }

    class CalculateDieselMeterQuantity implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double mStart = 0, mEnd = 0;

                mStart = viewDieselP2Sales.getDieselMeterStart();
                mEnd = viewDieselP2Sales.getDieselMeterEnd();

                modelDieselP2Sales.calculateDieselMeterQuantity(mStart, mEnd);
                viewDieselP2Sales.setDieselMeterQuantity(modelDieselP2Sales.getCalculateDieselMeterQuantity());
            } catch (Exception serror) {
                JOptionPane.showConfirmDialog(null, "Incorrecct entry Incase of a null field put a zero!", "Error!", JOptionPane.CANCEL_OPTION);
            }
        }

    }

    class CalculateDieselSubTotal1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double quantity = 0, rate = 0;

                quantity = viewDieselP2Sales.getDieselMeterQuantitySold();
                rate = viewDieselP2Sales.getDieselRate();

                modelDieselP2Sales.calculateDieselsubTotal1(quantity, rate);
                viewDieselP2Sales.setDieselSubTotal1(modelDieselP2Sales.getDieselSubTotal1());
            } catch (Exception sub) {
                JOptionPane.showConfirmDialog(null, "Incorrecct entry Incase of a null field put a zero!", "Error!", JOptionPane.CANCEL_OPTION);
            }
        }
    }

    class CalculateDieselSubTotal2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double expense1 = 0, expense2 = 0, expense3 = 0;

                expense1 = viewDieselP2Sales.getDieselExpense1();
                expense2 = viewDieselP2Sales.getDieselExpense2();
                expense3 = viewDieselP2Sales.getDieselExpense3();

                modelDieselP2Sales.calculateDieselExpenses(expense1, expense2, expense3);
                viewDieselP2Sales.setDieselSubTotal2(modelDieselP2Sales.getDieselExpenses());
            } catch (Exception sub) {
                JOptionPane.showConfirmDialog(null, "Incorrecct entry Incase of a null field put a zero!", "Error!", JOptionPane.CANCEL_OPTION);
            }
        }
    }

    class CalculateDieselGrandTotal implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double sub1 = 0;
                double sub2 = 0;

                sub1 = viewDieselP2Sales.getDieselSubTotal1();
                sub2 = viewDieselP2Sales.getDieselSubTotal2();

                modelDieselP2Sales.calculateDieselGrandTotal(sub1, sub2);
                viewDieselP2Sales.setDieselGrandTotal(modelDieselP2Sales.getDieselGrandTotal());
            } catch (Exception ex) {
                JOptionPane.showConfirmDialog(null, "Incorrecct entry Incase of a null field put a zero!", "Error!", JOptionPane.CANCEL_OPTION);
            }
        }
    }

    class CalculateDieselIncome implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double val1 = 0;
                double val2 = 0;

                val1 = viewDieselP2Sales.getDieselSubTotal1();
                val2 = viewDieselP2Sales.getDieselSubTotal2();

                modelDieselP2Sales.calculateDieselIncome(val1, val2);
                viewDieselP2Sales.setDieselIncome(modelDieselP2Sales.getDieselIncome());
            } catch (Exception ex) {
                JOptionPane.showConfirmDialog(null, "Incorrecct entry Incase of a null field put a zero!", "Error!", JOptionPane.CANCEL_OPTION);
            }
        }
    }

//Kerosene
    private Kerosene viewKeroseneSales;
    private SalesModel modelKeroseneSales;

    public SalesController(Kerosene viewKeroseneSales, SalesModel modelKeroseneSales) {

        this.viewKeroseneSales = viewKeroseneSales;
        this.modelKeroseneSales = modelKeroseneSales;

        this.viewKeroseneSales.addKeroseneMeterQuantityListener(new CalculateKeroseneMeterQuantity());
        this.viewKeroseneSales.addKeroseneSubTotal1Listener(new CalculateKeroseneSubTotal1());
        this.viewKeroseneSales.addKeroseneSubTotal2Listener(new CalculateKeroseneSubTotal2());
        this.viewKeroseneSales.addKeroseneGrandTotalListener(new CalculateKeroseneGrandTotal());
        this.viewKeroseneSales.addKeroseneIncomeListener(new CalculateKeroseneIncome());

    }

    class CalculateKeroseneMeterQuantity implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double mStart = 0, mEnd = 0;

                mStart = viewKeroseneSales.getKeroseneMeterStart();
                mEnd = viewKeroseneSales.getKeroseneMeterEnd();

                modelKeroseneSales.calculateKeroseneMeterQuantity(mStart, mEnd);
                viewKeroseneSales.setKeroseneMeterQuantity(modelKeroseneSales.getCalculateKeroseneMeterQuantity());
            } catch (Exception serror) {
                JOptionPane.showConfirmDialog(null, "Incorrecct entry Incase of a null field put a zero!", "Error!", JOptionPane.CANCEL_OPTION);
            }
        }

    }

    class CalculateKeroseneSubTotal1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double quantity = 0, rate = 0;

                quantity = viewKeroseneSales.getKeroseneMeterQuantitySold();
                rate = viewKeroseneSales.getKeroseneRate();

                modelKeroseneSales.calculateKerosenesubTotal1(quantity, rate);
                viewKeroseneSales.setKeroseneSubTotal1(modelKeroseneSales.getKeroseneSubTotal1());
            } catch (Exception sub) {
                JOptionPane.showConfirmDialog(null, "Incorrecct entry Incase of a null field put a zero!", "Error!", JOptionPane.CANCEL_OPTION);
            }
        }
    }

    class CalculateKeroseneSubTotal2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double expense1 = 0, expense2 = 0, expense3 = 0;

                expense1 = viewKeroseneSales.getKeroseneExpense1();
                expense2 = viewKeroseneSales.getKeroseneExpense2();
                expense3 = viewKeroseneSales.getKeroseneExpense3();

                modelKeroseneSales.calculateKeroseneExpenses(expense1, expense2, expense3);
                viewKeroseneSales.setKeroseneSubTotal2(modelKeroseneSales.getKeroseneExpenses());
            } catch (Exception sub) {
                JOptionPane.showConfirmDialog(null, "Incorrecct entry Incase of a null field put a zero!", "Error!", JOptionPane.CANCEL_OPTION);
            }
        }
    }

    class CalculateKeroseneGrandTotal implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double sub1 = 0;
                double sub2 = 0;

                sub1 = viewKeroseneSales.getKeroseneSubTotal1();
                sub2 = viewKeroseneSales.getKeroseneSubTotal2();

                modelKeroseneSales.calculateKeroseneGrandTotal(sub1, sub2);
                viewKeroseneSales.setKeroseneGrandTotal(modelKeroseneSales.getKeroseneGrandTotal());
            } catch (Exception ex) {
                JOptionPane.showConfirmDialog(null, "Incorrecct entry Incase of a null field put a zero!", "Error!", JOptionPane.CANCEL_OPTION);
            }
        }
    }

    class CalculateKeroseneIncome implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double val1 = 0;
                double val2 = 0;

                val1 = viewKeroseneSales.getKeroseneSubTotal1();
                val2 = viewKeroseneSales.getKeroseneSubTotal2();

                modelKeroseneSales.calculateKeroseneIncome(val1, val2);
                viewKeroseneSales.setKeroseneIncome(modelKeroseneSales.getKeroseneIncome());
            } catch (Exception ex) {
                JOptionPane.showConfirmDialog(null, "Incorrecct entry Incase of a null field put a zero!", "Error!", JOptionPane.CANCEL_OPTION);
            }
        }
    }
}
