/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dan
 */
public class Product {
    
    private String productID;
    private String productName;
    private double costOfProduct;

    public Product(String productID, String productName, double costOfProduct) {
        this.productID = productID;
        this.productName = productName;
        this.costOfProduct = costOfProduct;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCostOfProduct() {
        return costOfProduct;
    }

    public void setCostOfProduct(double costOfProduct) {
        this.costOfProduct = costOfProduct;
    }
    
   
    
}
