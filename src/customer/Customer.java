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
    private String firstname;
    private String surname;
    private String address1;
    private String address2;
    private String postcode;
    private String city;
    private String profession;
    private Apps app;  //remove?
    private account number apps brought
    private account number apps on trial     //correct so vairable are written the same accross classes
    private String accounttype;
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

      
      
      
    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

      
      
      
    public String getSurName() {
        return surname;
    }

    public void setSurName(String name) {
        this.surname = name;
    
    
    
    
    
    }
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    
    
    
          
    
    }
     public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

  
      
      
      
      
    public Apps getnumber() {
        return app;
    }

    public void setApp(Apps anapp) {            
        this.app = anapp;
    }
    
      
      
      
      
    public Account getappspaid                        //number of apps paid
        return appspaid
    }

    public void setappstrial(String appspaid)
        this.app = appspaid;
    




    }
      public Account getappstrial() {                 //number of apps on trial
        return app;
    }

    public void setApp(String appstrial)
        this.app = appstrial;
    }
    
    
}
