/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Model.Employee;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author pwn233 {github.com/pwn233}
 */
@WebService(serviceName = "EmployeeWebService")
public class EmployeeWebService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeSOAPPU");

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findEmployeeById")
    public Employee findEmployeeById(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        EntityManager em = emf.createEntityManager();
        Employee emp = em.find(Employee.class, id);
        return emp;
    }
    

    
    private void persist(Object object) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    /**
     * This is a sample web service operation
     */
    
    
    
}
