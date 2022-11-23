/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author pwn233 {github.com/pwn233}
 */
@WebService(serviceName = "CalculatorService")
public class CalculatorService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
        return num1+num2;
    }

    /**
     * This is a sample web service operation
     */
    
}
