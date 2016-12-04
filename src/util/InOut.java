/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.IOException;

/**
 *
 * @author sergaben
 */
public class InOut {
    public void welcomeScreen() throws IOException{
        
        System.out.println("*************************************");
        System.out.println("*                                   *");
        System.out.println("*              Welcome              *");
        System.out.println("*                                   *");
        System.out.println("*************************************");
        System.out.println(" Press enter to continue");
        System.in.read();
              
    }
}
