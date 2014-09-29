/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dan
 */
public class FlateRateDiscount implements DiscountStrategy{
    private double baseDiscountRate = 0.10;
    private double price;
    private double quantity;
    private double minItemPurchase = 3;
    
    //method to check that the number of items purchased is over three
    //and calculate the percent off if so.
    
    public double getDiscount(){
        double discount = 0;
        
        if(quantity >= getMinItemPurchase()){
            discount = baseDiscountRate * price * quantity;
        }
        return discount;
        
    }

    public double getBaseDiscountRate() {
        return baseDiscountRate;
    }

    public void setBaseDiscountRate(double baseDiscountRate) {
        this.baseDiscountRate = baseDiscountRate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getMinItemPurchase() {
        return minItemPurchase;
    }

    public void setMinItemPurchase(double minItemPurchase) {
        this.minItemPurchase = minItemPurchase;
    }
    

     public String message(){
        return "Flat-Rate Discount";
    }
    
    
}
