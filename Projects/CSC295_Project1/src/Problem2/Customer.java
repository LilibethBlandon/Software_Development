/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;

/*
    Lilibeth Blandon
    CSC292-01
    Project 1: Problem 2
    About: Customer class holds individual customer information.
    Class: Customer.java
*/
/**
 *
 * @author lily
 */
public class Customer {
    private String title;
    private String fName;
    private String lName;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String postCode;
    private String visaNumber;
    private String totalCost;
    private int orderNumber;

    public Customer(String title, String fName, String lName, String address1, String address2, String city, String state, String postCode, String visaNumber, String totalCost, int orderNumber) {
        this.title = title;
        this.fName = fName;
        this.lName = lName;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postCode = postCode;
        this.visaNumber = visaNumber;
        this.totalCost = totalCost;
        this.orderNumber = orderNumber;
    }

    //Getters
    public String getTitle() {
        return title;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getVisaNumber() {
        return visaNumber;
    }

    public String getTotalCost() {
        return totalCost;
    }
    
    public int getOrderNumber() {
        return orderNumber;
    }
    
    //Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setVisaNumber(String visaNumber) {
        this.visaNumber = visaNumber;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }
    
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
    public void resetEverything() {
        this.title = "";
        this.fName = "";
        this.lName = "";
        this.address1 = "";
        this.address2 = "";
        this.city = "";
        this.state = "";
        this.postCode = "";
        this.visaNumber = "";
        this.totalCost = "";
        this.orderNumber = -999;
    }

    @Override
    public String toString() {
        return "Order Number: " + orderNumber + "\nCustomer: " + title + " " + fName + " " +lName + "\nOrder Cost: $" + totalCost;
    }
    
}
