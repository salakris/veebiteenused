/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.projekt.transport;

import ee.ttu.idu0075._2016.ws.transportcompany.DeliveryType;
import ee.ttu.idu0075._2016.ws.transportcompany.GetDeliveryListResponse;
import ee.ttu.idu0075._2016.ws.transportcompany.GetTransportCompanyListResponse;
import ee.ttu.idu0075._2016.ws.transportcompany.TransportCompanyDeliveryListType;
import ee.ttu.idu0075._2016.ws.transportcompany.TransportCompanyDeliveryType;
import ee.ttu.idu0075._2016.ws.transportcompany.TransportCompanyType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author salakris
 */
@WebService(serviceName = "TransportCompanyService", portName = "TransportCompanyPort", endpointInterface = "ee.ttu.idu0075._2016.ws.transportcompany.TransportCompanyPortType", targetNamespace = "http://www.ttu.ee/idu0075/2016/ws/transportCompany", wsdlLocation = "WEB-INF/wsdl/TransportWebServiceFromWSDL/transportService.wsdl")
public class TransportWebServiceFromWSDL {
    
    private int nextDeliveryId = 1;
    private int nextCompanyId = 1;
    static List<DeliveryType> deliveryList = new ArrayList<DeliveryType>();
    static List<TransportCompanyType> transportCompanyList = new ArrayList<TransportCompanyType>();
    static List<TransportCompanyDeliveryType> transportCompanyDeliveryList = new ArrayList<TransportCompanyDeliveryType>();

    public DeliveryType getDelivery(ee.ttu.idu0075._2016.ws.transportcompany.GetDeliveryRequest parameter) {
        DeliveryType dt = null;
        if (parameter.getToken().equalsIgnoreCase("active")) {
            for (int i = 0; i < deliveryList.size(); i++) {
                if (deliveryList.get(i).getId().equals(parameter.getId())) {
                    dt = deliveryList.get(i);
                }
            }
        }
        return dt;
    }

    public DeliveryType addDelivery(ee.ttu.idu0075._2016.ws.transportcompany.AddDeliveryRequest parameter) {
        DeliveryType dt = new DeliveryType();
        if (parameter.getToken().equalsIgnoreCase("active")) {
            dt.setType(parameter.getType());
            dt.setId(BigInteger.valueOf(nextDeliveryId++));
            deliveryList.add(dt);
        }
        return dt;
    }

    public GetDeliveryListResponse getDeliveryList(ee.ttu.idu0075._2016.ws.transportcompany.GetDeliveryListRequest parameter) {
        GetDeliveryListResponse response = new GetDeliveryListResponse();
        if (parameter.getToken().equalsIgnoreCase("active")) {
            for (DeliveryType deliveryType : deliveryList) {
                response.getPackageDelivery().add(deliveryType);
            }
        }
        return response;
    }

    public TransportCompanyType getTransportCompany(ee.ttu.idu0075._2016.ws.transportcompany.GetTransportCompanyRequest parameter) {
        TransportCompanyType tct = null;
        if (parameter.getToken().equalsIgnoreCase("active")) {
            for (int i = 0; i < transportCompanyList.size(); i++) {
                if (transportCompanyList.get(i).getId().equals(parameter.getId())) {
                    tct = transportCompanyList.get(i);
                }
            }
        }
        return tct;
    }

    public TransportCompanyType addTrasportCompany(ee.ttu.idu0075._2016.ws.transportcompany.AddTransportCompanyRequest parameter) {
        TransportCompanyType tct = new TransportCompanyType();
        if (parameter.getToken().equalsIgnoreCase("active")) {
            tct.setTransportCompanyName(parameter.getTransportCompanyName());
            tct.setNumOfDeliveries(parameter.getNumOfDeliveries());
            tct.setAddress(parameter.getAddress());
            tct.setBuiltDate(parameter.getBuiltDate());
            tct.setPendingDeliveries(parameter.getPendingDeliveries());
            tct.setId(BigInteger.valueOf(nextCompanyId++));

            transportCompanyList.add(tct);
        }
        return tct;
    }

    public GetTransportCompanyListResponse getTransportCompanyList(ee.ttu.idu0075._2016.ws.transportcompany.GetTransportCompanyListRequest parameter) {
        GetTransportCompanyListResponse response = new GetTransportCompanyListResponse();
        if (parameter.getToken().equalsIgnoreCase("active")) {
            for (TransportCompanyType transportCompanyType : transportCompanyList) {
                if (parameter.getNumOfDeliveries() != null) {
                    if (transportCompanyType.getNumOfDeliveries().equals(parameter.getNumOfDeliveries())) {
                        response.getTransportCompany().add(transportCompanyType);
                    }
                } else {
                    response.getTransportCompany().add(transportCompanyType);
                }

                //response.getTransportCompany().add(transportCompanyType);
            }
        }
        return response;
    }

    public TransportCompanyDeliveryListType getTransportCompanyDeliveryList(ee.ttu.idu0075._2016.ws.transportcompany.GetTransportCompanyDeliveryListRequest parameter) {
        TransportCompanyDeliveryListType response = new TransportCompanyDeliveryListType();
        if (parameter.getToken().equalsIgnoreCase("active")) {
            for (TransportCompanyDeliveryType transportCompanyType : transportCompanyDeliveryList) {
                if (transportCompanyType.getTransportCompanyId().equals(parameter.getCompanyId())) {
                    response.getTransportCompanyDelivery().add(transportCompanyType);
                }
            }
        }
        return response;
    }

    public TransportCompanyDeliveryType addTransportCompanyDelivery(ee.ttu.idu0075._2016.ws.transportcompany.AddTransportCompanyDeliveryRequest parameter) {
        BigInteger deliveryId;
        BigInteger companyId;
        ArrayList<BigInteger> companyIdList = new ArrayList<>();
        ArrayList<BigInteger> deliveryIdList = new ArrayList<>();
        TransportCompanyDeliveryType tcdlt = new TransportCompanyDeliveryType();
        //BigInteger companyId = null;
        if (parameter.getToken().equalsIgnoreCase("active")) {
            for (int i = 0; i < deliveryList.size(); i++) {
                deliveryIdList.add(deliveryList.get(i).getId());
            }
            for (int i = 0; i < transportCompanyList.size(); i++) {
                companyIdList.add(transportCompanyList.get(i).getId());
            }

            for (int i = 0; i < deliveryIdList.size(); i++) {
                deliveryId = deliveryIdList.get(i);
                if (deliveryId.equals(parameter.getDeliveryId())) {
                    tcdlt.setDeliveryId(parameter.getDeliveryId());
                    break;
                }
            }

            for (int i = 0; i < companyIdList.size(); i++) {
                companyId = companyIdList.get(i);
                if(companyId.equals(parameter.getTransportCompanyId())) {
                    //set
                    tcdlt.setTransportCompanyId(parameter.getTransportCompanyId());
                    break;
                }
            }

            if (tcdlt.getDeliveryId() == null || tcdlt.getTransportCompanyId() == null) {
                return null;
            }
            else {
                tcdlt.setDeliveryPrice(parameter.getDeliveryPrice());
                transportCompanyDeliveryList.add(tcdlt);
            }

        }

        return tcdlt;
    }
    
}
