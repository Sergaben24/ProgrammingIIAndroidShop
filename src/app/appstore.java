/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;        
/**
 *
 * @author k1555577
 */
public class App  {
    private String Acquire;
    private bolean AcquirePurchace;
    private bolean numberOfPurchace;
    private double costofPurchace;
    private String type;
    private int popularity;
    private String customer;
    private int developerOfApp;
    private String appId;
    private String downloads
    
    public Scanner input = new Scanner(System.in);

    public App() {

    }

    public App(String Acquire;) {
        this.appName = Acquire;
        
}
    public App(String Acquire, double costofPurchace, boolean numberOfPurchace;) 
{
        this.Acquire=Acquire;
        this.costofPurchace=costofPurchace;
        this.numberOfPurchace=numberOfPurchace;
    }
 public String getAcquire() {
        return this.Acquire;
    }

    public void setAcquire(String Aquire) {
        this.Acquire = Aquire;
    }
public int getdeveloperOfApp() {
        return developerOfApp;
    }

    public void setdeveloperOfApp(int developerOfApp) {
        this.developerOfApp = developerOfApp;
    }
public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }
    
public void setnumberOfPurchace(boolean numberOfPurchace) {
        this.numberOfPurchace = numberOfPurchace;
    }

    public double getcostofPurchace() {
        return costofPurchace;
    }
    public String getdownloads() {
        return downloads;
    }

    public void setdownloads(String downloads) {
        this.downloads = downloads;
    }
    
    /**
     *
     * @return
     */
    public double getcostofPurchace() {
        return costofPurchace;
    }

    /**
     *
     * @param costofPurchace
     */
    public void setcostofPurchace(double costofPurchace) {
        this.costofPurchace = costofPurchace;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
