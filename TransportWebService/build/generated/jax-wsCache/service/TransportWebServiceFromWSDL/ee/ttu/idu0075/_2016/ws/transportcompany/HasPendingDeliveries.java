
package ee.ttu.idu0075._2016.ws.transportcompany;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hasPendingDeliveries.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="hasPendingDeliveries"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO"/&gt;
 *     &lt;enumeration value="YES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "hasPendingDeliveries")
@XmlEnum
public enum HasPendingDeliveries {

    NO,
    YES;

    public String value() {
        return name();
    }

    public static HasPendingDeliveries fromValue(String v) {
        return valueOf(v);
    }

}
