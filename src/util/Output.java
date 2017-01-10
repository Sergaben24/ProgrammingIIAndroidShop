/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import customer.Customer;
import java.io.IOException;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import static util.CandM.*;


/**
 *
 * @author K1516561
 */
public class Output {
      
    
    public Output(){
        
        
    }

    public String printEmptyLine(){
           
        return (" ");
        
    }
    
    public  void clearScreen(){
    
        for(int i=0;i<30;i++){
                System.out.println(" ");       
        }
    
    }
    
    public void printVertLine(){
                  System.out.printf("|");  
    }
   
    public void characterNotValid(){
        
        System.out.println("                             The character inserted is not a valid one, please try again");
    }
    
    public void welcomeScreen() {
        
                
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                                    *************************************");
        System.out.println("                                    *                                   *");
        System.out.println("                                    *              Welcome              *");
        System.out.println("                                    *            Android Shop           *");
        System.out.println("                                    *                                   *");
        System.out.println("                                    *************************************");
        System.out.println(" ");
        System.out.printf("                                        Type C to create your details");
        System.out.println("                                        ");
        System.out.printf("                                                     ");
        
    }
    
    public void creationDetailsTitle(){
        
        System.out.println("                   ________________________________ Type your details below ___________________________");
        System.out.println("    ");
    }
    
    public void firstNameQuestion(){
        
       System.out.println("                                                 Please insert your first name.");
       System.out.printf("                                                            ");
    
    }
    
    public void lastNameQuestion(){
        
       System.out.println("                                                 Please insert your last name."); 
       System.out.printf("                                                            ");
    
    }
    
    public void addressQuestion(){
    
       System.out.println("                                                 Please insert your Address.");
       System.out.printf("                                                           ");
    
    }
    
    public void checkStuAcaDevOther(){ // check if it is a student, an academic, a developer or other
        
       System.out.println("                                Are you a student, an academic, a developer or other?");
       System.out.println("                          Type S for student, A for academic, D for developer and O for other.");
       System.out.printf("                                                       ");
       
    }
    
    public void accountSuccess(){
    
        System.out.println("                                       You have successfully entered all your details");
        
    }
    
    public void mainStoreTitle(){
    
        System.out.println("___________________________________________________________________ Android Shop ___________________________________________________________");
        System.out.println("    ");
    }
    
    public void mainStoreNameArea(){
        
        System.out.printf("-   Name: ");
        
    }
    
    public void mainStoreID(){
        
        System.out.printf("-   Customer ID: ");
        
    }
    
    public void mainAppsMenuTitle(){
    
        System.out.println("                                                     ******** Apps in Store ******** ");
        System.out.println("     ");
        
    }
    
    public void mainDescriptorsAppsMenu(){
    
        System.out.println("ID's app"+"                  " + "  App's Name " +"                      "+ " Description "+"                       "+"Developer's Name"+"                       "+"Popularity");
        System.out.println("                                                                                                                                "+"(People who bought that app)");
    
    }
    public void mainChooseFrom(){
        
        System.out.println("                         Options: (L)ist your apps, (B)uy an app, (T)ry an app, ");
    }
    //**************************************************
    // extension code
    //*****************************************
    /*public void insertPassword(){
        
        System.out.println("Please insert the password that you want to use.");
        System.out.printf("    ");
    }
    public void continueToLogin(){
        
        System.out.println("Please insert C to continue to the login screen");
        System.out.printf("    ");
    }
    public void loginGui(){
       
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                                    *************************************");
        System.out.println("                                    *                                   *");
        System.out.println("                                    *              Login                *");
        System.out.println("                                    *             Screen                *");
        System.out.println("                                    *                                   *");
        System.out.println("                                    *************************************");
        System.out.println(" ");
        System.out.println("                                Your ID should be something like 'SG789497'");
        horiDivider(30,29); // prints the horizontal line
        
    }
     public void requestID(){//divider
        System.out.print("                                       Please type your ID: ");
    }
    public void requestPass(){
        horiDivider(30,29);//divider
        System.out.print("                                       Please type your password: ");
        horiDivider(30,29);//divider
    }
    public void loginCredentialsStatement(){
        System.out.println("Thank you, your login credentials have been accepted");
    }
    public void printDate(){
        
        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR); 
        System.out.println(day + " / "+month+" / "+year);
    }
    public void printTime(){
        
        hour = date.get(Calendar.HOUR);
        minute = date.get(Calendar.MINUTE);   
        System.out.println(hour+ " : "+minute);
        
    }
    //*********************************************************************
    //extension code
    //**********************************************************************
    */
    
    
   
    // will display the apps of each category
    public void displayAppsCategory(){
        
        System.out.println(" Apps in the store ");
        //System.out.println(News.appName());
    }
    
    
    public void editAnAppStatement(){
    
        System.out.println("Would you like to edit this app?");
    
    }
    
    public void searchTitle(){
        
        System.out.println(" _________________________ Search Screeen __________________________");
    
    }
    public void listTitle(){
        
        System.out.println(" _________________________  Screeen ________________________________");
    
    }
    
    public void generalGUIOptions(){
          
        horiDivider(30,38);
        System.out.println("(S)earch apps by name " + "(SE)arch apps by type " + " (LI)st your apps ");
        System.out.println(" Please type the letter/s shown between brackets above");
        
    }
    public void searchAppCustomer(){
       
        System.out.println("");
        System.out.println(" ");
    }
    
    
    
    
    
    
}
