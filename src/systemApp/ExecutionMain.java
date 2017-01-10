/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemApp;

import util.Logic;

/**
 *
 * @author sergaben
 */
public class ExecutionMain {
    
    
    public static void main(String[] args){
        SystemApplication system = new SystemApplication();
        Logic logic = new Logic();
        logic.mainLogic();
        logic.mainStoreInteface();
        
        
        }
    
    
    
}
