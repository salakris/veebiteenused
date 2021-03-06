
package ee.ttu.idu0075._2016.ws.transportcompany;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transportCompanyDeliveryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transportCompanyDeliveryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transportCompanyId" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="deliveryId" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="deliveryPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transportCompanyDeliveryType", propOrder = {
    "transportCompanyId",
    "deliveryId",
    "deliveryPrice"
})
public class TransportCompanyDeliveryType {

    @XmlElement(required = true)
    protected BigInteger transportCompanyId;
    @XmlElement(required = true)
    protected BigInteger deliveryId;
    protected double deliveryPrice;

    /**
     * Gets the value of the transportCompanyId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransportCompanyId() {
        return transportCompanyId;
    }

    /**
     * Sets the value of the transportCompanyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransportCompanyId(BigInteger value) {
        this.transportCompanyId = value;
    }

    /**
     * Gets the value of the deliveryId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeliveryId() {
        return deliveryId;
    }

    /**
     * Sets the value of the deliveryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeliveryId(BigInteger value) {
        this.deliveryId = value;
    }

    /**
     * Gets the value of the deliveryPrice property.
     * 
     */
    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    /**
     * Sets the value of the deliveryPrice property.
     * 
     */
    public void setDeliveryPrice(double value) {
        this.deliveryPrice = value;
    }

}
