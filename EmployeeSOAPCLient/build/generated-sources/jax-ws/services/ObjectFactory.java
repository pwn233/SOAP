
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindEmployeeById_QNAME = new QName("http://services/", "findEmployeeById");
    private final static QName _Employee_QNAME = new QName("http://services/", "employee");
    private final static QName _FindEmployeeByIdResponse_QNAME = new QName("http://services/", "findEmployeeByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindEmployeeByIdResponse }
     * 
     */
    public FindEmployeeByIdResponse createFindEmployeeByIdResponse() {
        return new FindEmployeeByIdResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link FindEmployeeById }
     * 
     */
    public FindEmployeeById createFindEmployeeById() {
        return new FindEmployeeById();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmployeeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findEmployeeById")
    public JAXBElement<FindEmployeeById> createFindEmployeeById(FindEmployeeById value) {
        return new JAXBElement<FindEmployeeById>(_FindEmployeeById_QNAME, FindEmployeeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "employee")
    public JAXBElement<Employee> createEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmployeeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findEmployeeByIdResponse")
    public JAXBElement<FindEmployeeByIdResponse> createFindEmployeeByIdResponse(FindEmployeeByIdResponse value) {
        return new JAXBElement<FindEmployeeByIdResponse>(_FindEmployeeByIdResponse_QNAME, FindEmployeeByIdResponse.class, null, value);
    }

}
