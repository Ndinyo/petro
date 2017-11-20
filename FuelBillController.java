/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petro.Controller;

/**
 *
 * @author Abi
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import petro.View.FuelBill;
import petro.Model.FuelBillModel;

//Controls interactions between view and Model
public class FuelBillController {
    
    private FuelBill theView;
    private FuelBillModel theModel;
    
    public FuelBillController(FuelBill theView, FuelBillModel theModel)
    {
        this.theView = theView;
        this.theModel = theModel;
        
        this.theView.addComputeDeliveryCharge(new CalculateDeliveryCharge());
        
        
        this.theView.addComputeTotalListener(new CalculateBillListener());
    }
    
    class CalculateDeliveryCharge implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                double quantity=0; double costPerLitre=0;
                
                quantity = theView.getQuantity();
                costPerLitre = theView.getCostPerLitre();
                
                theModel.sumDeliveryCharge(quantity, costPerLitre);
                theView.setDeliveryCost(theModel.getDeliveryCharge());
            }
            catch(Exception er)
            {
                System.out.println(er);
                theView.displayErrorMessage("Incorrect values");
            }
        }
    }
    
    class CalculateBillListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            
            double dCharge=0; double oCharge=0;
            try
            {
                
                
                dCharge = theView.getDeliveryCosts();
                oCharge = theView.getOtherCharges();
                
                theModel.sumBillCharges();
                theView.setComputeTotal(theModel.getBillCharges() + oCharge);
                
            }
            catch(Exception ex)
            {
                //JOptionPane.showMessageDialog(theModel, "Error in input", "error!", JOptionPane.CANCEL_OPTION);
            }
        }
    }
}
