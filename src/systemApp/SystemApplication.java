/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemApp;

import app.App;
import customer.Customer;

/**
 *
 * @author sergaben
 */
public class SystemApplication {
      
    private App app;
    private Customer customer;
    public static int CustomerID;
    public static int totalNoOfAppsPurchased = 0;
    
    public SystemApplication(App anapp, Customer acustomer, int totalNoAppP ){
    
            setApp(anapp);
            setCustomer(acustomer);
            CustomerID = CustomerID++;
            totalNoOfAppsPurchased = totalNoAppP;  
            
    
    }
    
    public App getApp() {
        return app;
    }

    public void setApp(App anapp) {
        this.app = anapp;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer acustomer) {
        this.customer = acustomer;
    }

    
    
    
}
