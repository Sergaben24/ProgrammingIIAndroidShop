/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author sergaben
 */
public class App {
     public Apps(){
        
    
    
    
    }
    
    private boolean acquire;
    private int numberOfPurchases;
    private int costOfPurchase;
    private ArrayList<String> type;
    private Stack<Customer>  listOfCustomer = new Stack();

    private int popularity;
    private Customer customer;
    private String developerOfApp;
    private String nameOfApp;
    private String description;
    private int appId;
    
    
    
    public Stack getListOfCustomer() {
        return listOfCustomer;
    }

    public void setListOfCustomer(Customer customers) {
        listOfCustomer.push(customers);
    }
    public boolean isAcquire() {
        return acquire;
    }

    public void setAcquire(boolean acquire) {
        this.acquire = acquire;
    }

    public int getNumberOfPurchases() {
        return numberOfPurchases;
    }

    public void setNumberOfPurchases(int numberOfPurchases) {
        this.numberOfPurchases = numberOfPurchases;
    }

    public int getCostOfPurchase() {
        return costOfPurchase;
    }

    public void setCostOfPurchase(int costOfPurchase) {
        this.costOfPurchase = costOfPurchase;
    }

    public ArrayList<String> getType() {
        return type;
    }

    public void setType(ArrayList<String> type) {
        this.type = type;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer acustomer) {
        this.customer = acustomer;
    }

    public String getDeveloperOfApp() {
        return developerOfApp;
    }

    public void setDeveloperOfApp(String developerOfApp) {
        this.developerOfApp = developerOfApp;
    }

    public String getNameOfApp() {
        return nameOfApp;
    }

    public void setNameOfApp(String nameOfApp) {
        this.nameOfApp = nameOfApp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }
    
}
