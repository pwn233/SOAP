/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellosoapclient;

/**
 *
 * @author pwn233 {github.com/pwn233}
 */
public class HelloSOAPClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(hello("Johnny"));
    }

    private static String hello(java.lang.String name) {
        serviceclient.HelloWebService_Service service = new serviceclient.HelloWebService_Service();
        serviceclient.HelloWebService port = service.getHelloWebServicePort();
        return port.hello(name);
    }
    
}
