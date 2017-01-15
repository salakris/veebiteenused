
package ee.ttu.idu0075._2016.ws.transportcompany;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numOfDeliveries" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="transportCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="builtDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "", propOrder = {
    "token",
    "numOfDeliveries",
    "transportCompanyName",
    "builtDate",
    "address",
    "pendingDeliveries"
})
@XmlRootElement(name = "addTransportCompanyRequest")
public class AddTransportCompanyRequest {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected BigInteger numOfDeliveries;
    @XmlElement(required = true)
    protected String transportCompanyName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar builtDate;
    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected HasPendingDeliveries pendingDeliveries;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
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
