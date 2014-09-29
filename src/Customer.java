/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dan
 */
public class Customer {
    
    private String lastName;
    private String firstName;
    private String customerAccountNumber;

    public Customer(String lastName, String firstName, String customerAccountNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.customerAccountNumber = customerAccountNumber;
    }

    public String getcustomerAccountNumber() {
        return customerAccountNumber;
    }

    public void setcustomerAccountNumber(String customerAccountNumber) {
        this.customerAccountNumber = customerAccountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + " " + lastName + "\n"
                + "Account Number: " + customerAccountNumber;
    }
}
