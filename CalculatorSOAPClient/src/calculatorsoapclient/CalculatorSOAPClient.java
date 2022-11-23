/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorsoapclient;

/**
 *
 * @author pwn233 {github.com/pwn233}
 */
public class CalculatorSOAPClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 1,b = 2;
        System.out.println(add(a,b));
    }

    private static int add(int num1, int num2) {
        serviceclient.CalculatorService_Service service = new serviceclient.CalculatorService_Service();
        serviceclient.CalculatorService port = service.getCalculatorServicePort();
        return port.add(num1, num2);
    }
    
}
