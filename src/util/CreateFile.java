/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author k1414758
 */
import java.io.*;
import java.lang.*;
import java.util.*;

public class CreateFile {
    
    private Formatter x;
    public CreateFile(){};
    public void openFile(){
        try{
            x = new Formatter("CustomerList1.txt");
        }
        catch(Exception e) {
            System.out.println ("error");
        }
    }
    
    public void addRecords(){
        x.format("%s %s %s", "Customer Name", "Address", "Profession");
    }
    public void closeFile(){
        x.close();
    }
}
