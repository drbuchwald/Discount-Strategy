/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dan
 */
public class NoDiscount implements DiscountStrategy{
    private double baseDiscountRate;
    private double price;
    private double quantity;
    private double minItemPurchase;
    
    public double getDiscount() {
        return 0;
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
        return "No Dicsount";
    }
    
}
