/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesoapclient;

import services.Employee;

/**
 *
 * @author pwn233 {github.com/pwn233}
 */
public class EmployeeSOAPCLient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp = findEmployeeById(1);
        System.out.println(emp.getName()+ " "+emp.getSalary());
        
    }

    private static Employee findEmployeeById(int id) {
        services.EmployeeWebService_Service service = new services.EmployeeWebService_Service();
        services.EmployeeWebService port = service.getEmployeeWebServicePort();
        return port.findEmployeeById(id);
    }
    
}
