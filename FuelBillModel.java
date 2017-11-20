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

import petro.View.FuelBill;

public class FuelBillModel extends petro.View.FuelBill {
    
    private double deliveryCharges=0;
    public void sumDeliveryCharge(double fuelQuantity, double costPerLitre)
    { 
        deliveryCharges = fuelQuantity * costPerLitre; 
    }
    
    public double getDeliveryCharge()
    {
        return deliveryCharges;
    }
    
    private double fuelBillCharges=0;
    
    public void sumBillCharges()
    {
       double dCharges=0; double oCharges=0;
       
       fuelBillCharges = deliveryCharges + oCharges;
    }
    
    public double getBillCharges()
    {
        return fuelBillCharges;
    }
    
}
