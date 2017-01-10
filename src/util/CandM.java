/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
import static java.lang.Integer.parseInt;
import java.io.Serializable;
/**
 *
 * @author K1516561
 */
// Constansts and Methods
public final class CandM {
    
    
    
    public static final HashMap<String, String> constNames =  new HashMap<>();
    public static final ArrayList<String> constL = new ArrayList<>();
    public static int day,month,year;
    public static int hour,minute;    
    public static final GregorianCalendar date = new GregorianCalendar();
    
    public static final String N = "N";
    public static final String G = "G";
    public static final String SN = "SN";
    public static final String T = "T";
    public static final String E = "E";
    public static final String EN = "EN";
    public static final String divider = "|";
    public static final String horizontalDivider = "\u2500";
    
    
    private CandM(){}
    // Clear screen by printing empty lines
    
    
    
    //the below method creates an horizontal line in the console
    // int e means how many horizontal lines are going to be in the GUI and the int y means the number of spaces
    // used to format each horizontal line
    public static final void horiDivider(int horiLines,int noOfSpaces){
        
        for(int t = 0;t<horiLines;t++)
        {
        System.out.printf(" ");
        }
        for(int i =0;i<noOfSpaces;i++)
        {
        System.out.printf(horizontalDivider,"%n");
        }
        System.out.println(" "); 
    }
 
    
    public static final String getConstL(String i)
    {
        
        constL.add(N);
        constL.add(G);
        constL.add(SN);
        constL.add(T);
        constL.add(E);
        constL.add(EN);
        return constL.get(parseInt(i));     
    }
    // the below function set constants in a hashmap to be used in other parts of the program
    public static final String getConstN(String i){
        
        constNames.put(N,"News"); // N for news
        constNames.put(G,"Games"); // G for games
        constNames.put(SN,"Social Networking"); // SN for social networking
        constNames.put(T,"Travel"); // T for travel
        constNames.put(E,"Education");// E for education
        constNames.put(EN,"Entertainment"); // EN for entertainment
         return constNames.get(i);
        
        
    }
    
}
