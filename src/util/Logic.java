/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;


import customer.Academic;
import customer.Customer;
import customer.Developer;
import customer.Student;
import java.util.ArrayList;
import java.util.Scanner;
import systemApp.SystemApplication;
import static util.CandM.horiDivider;

/**
 *
 * @author K1516561
 */

public class Logic {
    
    private String ID;
    private char selWelcome;
    private String password;
    Student student = new Student();
    Academic academic = new Academic();
    Developer developer = new Developer();
    Customer customer = new Customer();
    ArrayList<Customer> storeCustomers = new ArrayList();
    Output output = new Output();
    Scanner gnrlStrgSc = new Scanner(System.in); // General Scanner
    SystemApplication systemApp = new SystemApplication();
     
    public Logic(){
    
        
    
    }
    // method to print all the apps in the system
//    public void listAllApps(){
//        //For(int e=0;e<someContainerObject.length;e++)
//        {
//            System.out.println(account.getCustomer().getApp().getNameOfApp());
//        }
//        
//        
//    }   
    // to print the name of the customer
//    public void searchAppsSandAandC(){
//    
//        System.out.println("Search by Name of app" + " Your username:" + account.getCustomer().getName());
//        
//    }
    // to print the ID of the customer
    public void mainLogic(){
        
        
        
        int e = 0; // exit program
        do{ // first do while loop
            
            output.welcomeScreen();
            while(true)
            { // first while loop
                selWelcome = gnrlStrgSc.next().charAt(0);
                //System.out.println(selWelcome); //test input value
                if(/*selWelcome == 'L' ||*/ selWelcome == 'C' ) // first if statement
                {
                    break; 
                }
                else
                {
                    horiDivider(30,29);
                    output.characterNotValid();                   
                }
            }
            while(/*selWelcome == 'L' ||*/ selWelcome == 'C') // second while loop
            {
                      switch (selWelcome) // first switch statement
                      {
                       //***************************
                       // extension code
                       //****************************
                       /*case 'L':
                            try{ 
                                if(customer.getCustomerID() == null || customer.getPassword() == null)
                                {
                                    questionsLogic();
                                    e=1;
                                }
                                else
                                {
                                  loginLogic();
                                }
                            }catch (NullPointerException n)
                            {
                                
                                System.out.println("Exception thrown: " + n);     
                            }
                        */
                        //***************************
                       // extension code
                       //****************************    
                        case 'C':
                            signUpLogic();
                            
                            e=1;
                            
                            break;
                        default:
                            break;

                                };
                    }
   
        }while(e==0);
        
        
        
            
        
    }
   
    public void signUpLogic(){
                            
                            
                            gnrlStrgSc.nextLine();// consumes the first empty line of the scanner.
                            output.checkStuAcaDevOther();
                            //System.out.println(customer.getFirstName()); check if the firstname is set up 
                            selWelcome = gnrlStrgSc.next().charAt(0);
                            output.printEmptyLine();
                            gnrlStrgSc.nextLine();
                            switch(selWelcome)
                            { // second switch statement
                                case 's':  
                                    signUpLogicQuestions(student,"Student"); // used to set up the type of customer and its profession
                                break;
                                case 'S':  
                                    signUpLogicQuestions(student,"Student");
                                break;
                                case 'a':  
                                    signUpLogicQuestions(academic,"Academic");
                                break;
                                case 'A':  
                                     signUpLogicQuestions(academic,"Academic");
                                break;
                                case 'd':  
                                    signUpLogicQuestions(developer,"Developer");
                                break;
                                case 'D':  
                                    signUpLogicQuestions(developer,"Developer");
                                break;
                                case 'o':  
                                    signUpLogicQuestions(customer,"Other");
                                break;
                                case 'O':  
                                    signUpLogicQuestions(customer,"Other");
                                break;
                            } 
                            output.accountSuccess();
                            output.printEmptyLine();
                            pauseFlow();
                            output.clearScreen();
                            //selWelcome = gnrlStrgSc.next().charAt(0);
                            
                            
    
    
    }
    
    public void signUpLogicQuestions(Customer aCustomer,String profession){
    
                                output.clearScreen();
                                output.creationDetailsTitle();
                                output.firstNameQuestion();
                                aCustomer.setFirstName(gnrlStrgSc.nextLine());
                                output.printEmptyLine();
                                output.lastNameQuestion();
                                aCustomer.setLastName(gnrlStrgSc.nextLine());
                                output.printEmptyLine();
                                //gnrlStrgSc.nextLine();
                                output.addressQuestion();
                                aCustomer.setAddress(gnrlStrgSc.nextLine());
                                //gnrlStrgSc.nextLine();
                                output.printEmptyLine(); 
                                aCustomer.setProfession(profession);
                                aCustomer.consCustomerID();
                                aCustomer.setCustomerID();
                                System.out.println("                                               The following is your ID: " + aCustomer.getCustomerID());
                                storeCustomers.add(aCustomer);
    
                                
    }
    
    public void mainStoreInteface(){
    
        output.mainStoreTitle();
        output.mainStoreNameArea();
        System.out.println(storeCustomers.get(0).getFirstName()+ " | ");       
        output.mainStoreID();
        System.out.println(storeCustomers.get(0).getCustomerID()+ " | ");      
        //output.printEmptyLine();
        output.mainAppsMenuTitle();
        output.mainDescriptorsAppsMenu();
        for(int e = 0;e<systemApp.getArrayListSize();e++){
            String Name;
            System.out.println("       ");
            System.out.printf("%-5.5s %30.40s %40.40s %30.40s %30.40s",systemApp.getNumberIndexArrList(e),systemApp.getApp(e).getNameOfApp(),systemApp.getApp(e).getDescription(),systemApp.getApp(e).getDeveloperOfApp(),systemApp.getApp(e).getPopularity());
            
        };
        horiDivider(30,0);
        
    }
    
    public void pauseFlow(){
        
        try {
       // thread to sleep for 1000 milliseconds
                    Thread.sleep(4000);
            } catch (Exception e) {
                System.out.println(e);
        }
        
    }
    
//*********************************************************************************************************************************************************************    
  // code for further development outside of the scope of the specification
//*********************************************************************************************************************************************************************
    
//    public void loginLogic(){
//        
//        String tempID;
//        String pass;
//        output.clearScreen();
//        output.loginGui();
//        output.requestID(); 
//       
//        //System.out.println(tempID);// prints a request for ID
//        do{ // the input repeats until an existing ID is entered
//        
//                
//                tempID = gnrlStrgSc.nextLine();
//                if(customer.getCustomerID().equals(tempID) == true)                                
//                {                                                                       //
//                     break;     // Check if the ID exist    
//                }                                                                       //
//                else
//                {
//                    System.out.println("Sorry that is not a valid ID, try again");    
//                }
//                
//        }while(customer.getCustomerID().equals(tempID) == false); 
//        //    
//        gnrlStrgSc.nextLine();
//        output.requestPass(); // prints a request for password
//        do{ // the input repeats until the correct combination of ID and password is entered
//            
//                pass = gnrlStrgSc.nextLine();
//                if(customer.getCustomerID().equals(tempID) == true && customer.getPassword().equals(pass) == true) //check if the combination of ID and password matches.
//                {    
//                    break;
//                          //
//                }
//                else
//                {
//                    System.out.println("Sorry that is not a valid combination of ID and password, try again");
//                }//
//                    
//        }while(customer.getCustomerID().equals(tempID) == false && customer.getPassword().equals(pass) == false);            
//        
//        output.loginCredentialsStatement();
//        
//    
//    }
    
    
    
    
    
//************************************************************************************************************************************************************************
//
//************************************************************************************************************************************************************************    
}
