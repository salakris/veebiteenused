
package ee.ttu.idu0075._2016.ws.transportcompany;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.ttu.idu0075._2016.ws.transportcompany package. 
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

    private final static QName _GetDeliveryResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2016/ws/transportCompany", "getDeliveryResponse");
    private final static QName _AddDeliveryResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2016/ws/transportCompany", "addDeliveryResponse");
    private final static QName _GetTransportCompanyResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2016/ws/transportCompany", "getTransportCompanyResponse");
    private final static QName _AddTransportCompanyResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2016/ws/transportCompany", "addTransportCompanyResponse");
    private final static QName _GetTransportCompanyDeliveryListResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2016/ws/transportCompany", "getTransportCompanyDeliveryListResponse");
    private final static QName _AddTransportCompanyDeliveryResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2016/ws/transportCompany", "addTransportCompanyDeliveryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.ttu.idu0075._2016.ws.transportcompany
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDeliveryRequest }
     * 
     */
    public GetDeliveryRequest createGetDeliveryRequest() {
        return new GetDeliveryRequest();
    }

    /**
     * Create an instance of {@link DeliveryType }
     * 
     */
    public DeliveryType createDeliveryType() {
        return new DeliveryType();
    }

    /**
     * Create an instance of {@link AddDeliveryRequest }
     * 
     */
    public AddDeliveryRequest createAddDeliveryRequest() {
        return new AddDeliveryRequest();
    }

    /**
     * Create an instance of {@link GetDeliveryListRequest }
     * 
     */
    public GetDeliveryListRequest createGetDeliveryListRequest() {
        return new GetDeliveryListRequest();
    }

    /**
     * Create an instance of {@link GetDeliveryListResponse }
     * 
     */
    public GetDeliveryListResponse createGetDeliveryListResponse() {
        return new GetDeliveryListResponse();
    }

    /**
     * Create an instance of {@link GetTransportCompanyRequest }
     * 
     */
    public GetTransportCompanyRequest createGetTransportCompanyRequest() {
        return new GetTransportCompanyRequest();
    }

    /**
     * Create an instance of {@link TransportCompanyType }
     * 
     */
    public TransportCompanyType createTransportCompanyType() {
        return new TransportCompanyType();
    }

    /**
     * Create an instance of {@link AddTransportCompanyRequest }
     * 
     */
    public AddTransportCompanyRequest createAddTransportCompanyRequest() {
        return new AddTransportCompanyRequest();
    }

    /**
     * Create an instance of {@link GetTransportCompanyListRequest }
     * 
     */
    public GetTransportCompanyListRequest createGetTransportCompanyListRequest() {
        return new GetTransportCompanyListRequest();
    }

    /**
     * Create an instance of {@link GetTransportCompanyListResponse }
     * 
     */
    public GetTransportCompanyListResponse createGetTransportCompanyListResponse() {
        return new GetTransportCompanyListResponse();
    }

    /**
     * Create an instance of {@link GetTransportCompanyDeliveryListRequest }
     * 
     */
    public GetTransportCompanyDeliveryListRequest createGetTransportCompanyDeliveryListRequest() {
        return new GetTransportCompanyDeliveryListRequest();
    }

    /**
     * Create an instance of {@link TransportCompanyDeliveryListType }
     * 
     */
    public TransportCompanyDeliveryListType createTransportCompanyDeliveryListType() {
        return new TransportCompanyDeliveryListType();
    }

    /**
     * Create an instance of {@link AddTransportCompanyDeliveryRequest }
     * 
     */
    public AddTransportCompanyDeliveryRequest createAddTransportCompanyDeliveryRequest() {
        return new AddTransportCompanyDeliveryRequest();
    }

    /**
     * Create an instance of {@link TransportCompanyDeliveryType }
     * 
     */
    public TransportCompanyDeliveryType createTransportCompanyDeliveryType() {
        return new TransportCompanyDeliveryType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2016/ws/transportCompany", name = "getDeliveryResponse")
    public JAXBElement<DeliveryType> createGetDeliveryResponse(DeliveryType value) {
        return new JAXBElement<DeliveryType>(_GetDeliveryResponse_QNAME, DeliveryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2016/ws/transportCompany", name = "addDeliveryResponse")
    public JAXBElement<DeliveryType> createAddDeliveryResponse(DeliveryType value) {
        return new JAXBElement<DeliveryType>(_AddDeliveryResponse_QNAME, DeliveryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportCompanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2016/ws/transportCompany", name = "getTransportCompanyResponse")
    public JAXBElement<TransportCompanyType> createGetTransportCompanyResponse(TransportCompanyType value) {
        return new JAXBElement<TransportCompanyType>(_GetTransportCompanyResponse_QNAME, TransportCompanyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportCompanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2016/ws/transportCompany", name = "addTransportCompanyResponse")
    public JAXBElement<TransportCompanyType> createAddTransportCompanyResponse(TransportCompanyType value) {
        return new JAXBElement<TransportCompanyType>(_AddTransportCompanyResponse_QNAME, TransportCompanyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportCompanyDeliveryListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2016/ws/transportCompany", name = "getTransportCompanyDeliveryListResponse")
    public JAXBElement<TransportCompanyDeliveryListType> createGetTransportCompanyDeliveryListResponse(TransportCompanyDeliveryListType value) {
        return new JAXBElement<TransportCompanyDeliveryListType>(_GetTransportCompanyDeliveryListResponse_QNAME, TransportCompanyDeliveryListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportCompanyDeliveryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2016/ws/transportCompany", name = "addTransportCompanyDeliveryResponse")
    public JAXBElement<TransportCompanyDeliveryType> createAddTransportCompanyDeliveryResponse(TransportCompanyDeliveryType value) {
        return new JAXBElement<TransportCompanyDeliveryType>(_AddTransportCompanyDeliveryResponse_QNAME, TransportCompanyDeliveryType.class, null, value);
    }

}
