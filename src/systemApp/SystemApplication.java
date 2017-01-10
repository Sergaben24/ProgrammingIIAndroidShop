/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemApp;

import app.App;
import customer.Customer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import util.Logic;

/**
 *
 * @author K1516561
 */

public class SystemApplication {
    
    private ArrayList<App> app = new ArrayList();
    
    public static int totalNoOfAppsPurchased = 0;
    
    public SystemApplication( ){
        // default Apps in the system
        createNewApp("Google","it is and standard google app","Kenneth");
        createNewApp("Trello", "Organize your stuff please", "Jake");
        createNewApp("Facebook","Socialize with your friends", "Gary");
        createNewApp("Steam", "Makes you happy", "Gabe newell");
        createNewApp("Ryanair", "Travel around the world", "Tim");
        createNewApp("Reddit","Instant news","Aaron");
        createNewApp("Lords Mobile","Strategy in real time","Tavez");
      
    }
    
    public void createNewApp(String appName,String appDesc, String appDeveloperName){
    
            App apps = new App();
            apps.setNameOfApp(appName);
            apps.setDescription(appDesc);
            apps.setDeveloperOfApp(appDeveloperName);
            app.add(apps);
    }
    
    public App getApp(int a) { // gets app from the arraylist
       return app.get(a);
    }
    
    public int getArrayListSize(){ // returns the size of the arraylist
        return app.size();
    
    }
    
    public int getNumberIndexArrList(int a){ // returns the index of an element in the arraylist
    
        return app.indexOf(app.get(a));
    }
    //
    //public void setApp(App anapp) {
    //    this.app = anapp;
    //}
    
    
}
