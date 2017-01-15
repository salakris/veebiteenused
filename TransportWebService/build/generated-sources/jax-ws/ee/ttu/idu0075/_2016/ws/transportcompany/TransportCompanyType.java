
package ee.ttu.idu0075._2016.ws.transportcompany;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for transportCompanyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transportCompanyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="numOfDeliveries" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="transportCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="builtDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="pendingDeliveries" type="{http://www.ttu.ee/idu0075/2016/ws/transportCompany}hasPendingDeliveries"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transportCompanyType", propOrder = {
    "id",
    "numOfDeliveries",
    "transportCompanyName",
    "address",
    "builtDate",
    "pendingDeliveries"
})
public class TransportCompanyType {

    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    protected BigInteger numOfDeliveries;
    @XmlElement(required = true)
    protected String transportCompanyName;
    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar builtDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected HasPendingDeliveries pendingDeliveries;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the numOfDeliveries property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfDeliveries() {
        return numOfDeliveries;
    }

    /**
     * Sets the value of the numOfDeliveries property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfDeliveries(BigInteger value) {
        this.numOfDeliveries = value;
    }

    /**
     * Gets the value of the transportCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportCompanyName() {
        return transportCompanyName;
    }

    /**
     * Sets the value of the transportCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportCompanyName(String value) {
        this.transportCompanyName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the builtDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBuiltDate() {
        return builtDate;
    }

    /**
     * Sets the value of the builtDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBuiltDate(XMLGregorianCalendar value) {
        this.builtDate = value;
    }

    /**
     * Gets the value of the pendingDeliveries property.
     * 
     * @return
     *     possible object is
     *     {@link HasPendingDeliveries }
     *     
     */
    public HasPendingDeliveries getPendingDeliveries() {
        return pendingDeliveries;
    }

    /**
     * Sets the value of the pendingDeliveries property.
     * 
     * @param value
     *     allowed object is
     *     {@link HasPendingDeliveries }
     *     
     */
    public void setPendingDeliveries(HasPendingDeliveries value) {
        this.pendingDeliveries = value;
    }

}
