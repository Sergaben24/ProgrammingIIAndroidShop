/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author k1414758
 */
public class CustomersList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CreateFile CustomersList1 = new CreateFile();
        CustomersList1.openFile();
        CustomersList1.addRecords();
        CustomersList1.closeFile();
        // TODO code application logic here
    }
    
}
