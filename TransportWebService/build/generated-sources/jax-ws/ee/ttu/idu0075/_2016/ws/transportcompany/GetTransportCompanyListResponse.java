
package ee.ttu.idu0075._2016.ws.transportcompany;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="transportCompany" type="{http://www.ttu.ee/idu0075/2016/ws/transportCompany}transportCompanyType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "transportCompany"
})
@XmlRootElement(name = "getTransportCompanyListResponse")
public class GetTransportCompanyListResponse {

    protected List<TransportCompanyType> transportCompany;

    /**
     * Gets the value of the transportCompany property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportCompany property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportCompany().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportCompanyType }
     * 
     * 
     */
    public List<TransportCompanyType> getTransportCompany() {
        if (transportCompany == null) {
            transportCompany = new ArrayList<TransportCompanyType>();
        }
        return this.transportCompany;
    }

}
