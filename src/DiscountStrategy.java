/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dan
 */
public interface DiscountStrategy {
   
    double getBaseDiscountRate();

    double getDiscount();

    double getMinItemPurchase();

    double getPrice();

    double getQty();

    void setBaseDiscountRate(double baseDiscountRate);

    void setMinItemPurchase(double minItemPurchase);

    void setPrice(double price);

    void setQty(double qty);

    String message();
 
}
