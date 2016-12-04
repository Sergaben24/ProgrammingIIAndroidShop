/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author sergaben
 */
public class Account {
     public Account(){
        
        
        
        
    }
    
    private int accountId;
    private Customer customer;
    private int amountPaidOfNotFreeApp;
    private int noOfAppsOfFreeTrialUsed;
    private int noOfPurchasedApps;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getAmountPaidOfNotFreeApp() {
        return amountPaidOfNotFreeApp;
    }

    public void setAmountPaidOfNotFreeApp(int amountPaidOfNotFreeApp) {
        this.amountPaidOfNotFreeApp = amountPaidOfNotFreeApp;
    }

    public int getNoOfAppsOfFreeTrialUsed() {
        return noOfAppsOfFreeTrialUsed;
    }

    public void setNoOfAppsOfFreeTrialUsed(int noOfAppsOfFreeTrialUsed) {
        this.noOfAppsOfFreeTrialUsed = noOfAppsOfFreeTrialUsed;
    }

    public int getNoOfPurchasedApps() {
        return noOfPurchasedApps;
    }

    public void setNoOfPurchasedApps(int noOfPurchasedApps) {
        this.noOfPurchasedApps = noOfPurchasedApps;
    }
    
}
