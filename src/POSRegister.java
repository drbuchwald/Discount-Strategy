/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dan
 */
public class POSRegister {

    private Receipt receipt;

    public void beginNewSale(String customerAccountNumber) {
        receipt = new Receipt(customerAccountNumber);
    }
    
    public void addNewLineItem(String productID, double qty){
        receipt.addLineItem(productID, qty);
    }
    public void displayReceipt(){
        System.out.println("Display Receipt");
    }
}

  

    
    
