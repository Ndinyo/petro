
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petro.Model;



/**
 *
 * @author Abi
 */
public class SalesModel {

    private double quantity = 0;

    public void calculateSuperMeterQuantity(double mStart, double mEnd) {
        quantity = mEnd - mStart;
    }

    public double getCalculateSuperMeterQuantity() {
        return quantity;
    }

    private double subTotal1 = 0;

    public void calculatesubTotal1(double quantityS, double superRate) {
        subTotal1 = superRate * quantityS;
    }

    public double getSubTotal1() {
        return subTotal1;
    }

    private double totalExpenses = 0;

    public void calculateSuperExpenses(double expense1, double expense2, double expense3) {
  
        totalExpenses = expense1 + expense2 + expense3;
    }

    public double getSuperExpenses() {
        return totalExpenses;
    }

    private double gTotal = 0;

    public void calculateSuperGrandTotal(double sub1, double sub2) {
        gTotal = sub1 + sub2;

    }

    public double getSuperGrandTotal() {
        return gTotal;
    }

    private double superIncome = 0;

    public void calculateSuperIncome(double val1, double val2) {
        superIncome = val1 - val2;
    }

    public double getSuperIncome() {
        return superIncome;
    }

    
    
    //Calculations for Regular
    private double regQuantity = 0;

    public void calculateRegularMeterQuantity(double mStart, double mEnd) {
        regQuantity = mEnd - mStart;
    }

    public double getCalculateRegularMeterQuantity() {
        return regQuantity;
    }

    private double regSubTotal1 = 0;

    public void calculateRegularsubTotal1(double quantityS, double superRate) {
        regSubTotal1 = superRate * quantityS;
    }

    public double getRegularSubTotal1() {
        return regSubTotal1;
    }

    private double regTotalExpenses = 0;

    public void calculateRegularExpenses(double expense1, double expense2, double expense3) {
    
        regTotalExpenses = expense1 + expense2 + expense3;
    }

    public double getRegularExpenses() {
        return regTotalExpenses;
    }

    private double regTotal = 0;

    public void calculateRegularGrandTotal(double sub1, double sub2) {
        regTotal = sub1 + sub2;

    }

    public double getRegularGrandTotal() {
        return regTotal;
    }

    private double regularIncome = 0;

    public void calculateRegularIncome(double val1, double val2) {
        regularIncome = val1 - val2;
    }

    public double getRegularIncome() {
        return regularIncome;
    }

    //Calculations for Diesel
    private double dieselQuantity = 0;

    public void calculateDieselMeterQuantity(double mStart, double mEnd) {
        dieselQuantity = mEnd - mStart;
    }

    public double getCalculateDieselMeterQuantity() {
        return dieselQuantity;
    }

    private double dieselSubTotal1 = 0;

    public void calculateDieselsubTotal1(double quantityS, double superRate) {
        dieselSubTotal1 = superRate * quantityS;
    }

    public double getDieselSubTotal1() {
        return dieselSubTotal1;
    }

    private double dieselTotalExpenses = 0;

    public void calculateDieselExpenses(double expense1, double expense2, double expense3) {
       
        dieselTotalExpenses = expense1 + expense2 + expense3;
    }

    public double getDieselExpenses() {
        return dieselTotalExpenses;
    }

    private double dieselTotal = 0;

    public void calculateDieselGrandTotal(double sub1, double sub2) {
        dieselTotal = sub1 + sub2;
    }

    public double getDieselGrandTotal() {
        return dieselTotal;
    }

    private double dieselIncome = 0;

    public void calculateDieselIncome(double val1, double val2) {
        dieselIncome = val1 - val2;
    }

    public double getDieselIncome() {
        return dieselIncome;
    }

    //Calculations for Kerosene
    private double keroseneQuantity = 0;

    public void calculateKeroseneMeterQuantity(double mStart, double mEnd) {
        keroseneQuantity = mEnd - mStart;
    }

    public double getCalculateKeroseneMeterQuantity() {
        return keroseneQuantity;
    }

    private double keroseneSubTotal1 = 0;

    public void calculateKerosenesubTotal1(double quantityS, double superRate) {
        keroseneSubTotal1 = superRate * quantityS;
    }

    public double getKeroseneSubTotal1() {
        return keroseneSubTotal1;
    }

    private double keroseneTotalExpenses = 0;

    public void calculateKeroseneExpenses(double expense1, double expense2, double expense3) {
        
        keroseneTotalExpenses = expense1 + expense2 + expense3;
    }

    public double getKeroseneExpenses() {
        return keroseneTotalExpenses;
    }

    private double keroseneTotal = 0;

    public void calculateKeroseneGrandTotal(double sub1, double sub2) {
        keroseneTotal = sub1 + sub2;
    }

    public double getKeroseneGrandTotal() {
        return keroseneTotal;
    }

    private double keroseneIncome = 0;

    public void calculateKeroseneIncome(double val1, double val2) {
        keroseneIncome = val1 - val2;
    }

    public double getKeroseneIncome() {
        return keroseneIncome;
    }

}
