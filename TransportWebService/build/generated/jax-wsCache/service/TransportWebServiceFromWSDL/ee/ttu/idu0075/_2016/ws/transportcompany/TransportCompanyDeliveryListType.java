
package ee.ttu.idu0075._2016.ws.transportcompany;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transportCompanyDeliveryListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transportCompanyDeliveryListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transportCompanyDelivery" type="{http://www.ttu.ee/idu0075/2016/ws/transportCompany}transportCompanyDeliveryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transportCompanyDeliveryListType", propOrder = {
    "transportCompanyDelivery"
})
public class TransportCompanyDeliveryListType {

    protected List<TransportCompanyDeliveryType> transportCompanyDelivery;

    /**
     * Gets the value of the transportCompanyDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportCompanyDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportCompanyDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportCompanyDeliveryType }
     * 
     * 
     */
    public List<TransportCompanyDeliveryType> getTransportCompanyDelivery() {
        if (transportCompanyDelivery == null) {
            transportCompanyDelivery = new ArrayList<TransportCompanyDeliveryType>();
        }
        return this.transportCompanyDelivery;
    }

}
