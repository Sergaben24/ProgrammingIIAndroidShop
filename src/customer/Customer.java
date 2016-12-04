/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

/**
 *
 * @author sergaben
 */
public class Customer {
      static int customerID;
    private String name;
    private String address;
    private String profession;
    private Apps app;
    private String password;

    
    
    
   
    
    public Customer(){
           
        
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Apps getApp() {
        return app;
    }

    public void setApp(Apps anapp) {
        this.app = anapp;
    }
    
    
    
    
}
