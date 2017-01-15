/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.projekt.transport;

import ee.ttu.idu0075._2016.ws.transportcompany.AddTransportCompanyDeliveryRequest;
import ee.ttu.idu0075._2016.ws.transportcompany.GetTransportCompanyDeliveryListRequest;
import ee.ttu.idu0075._2016.ws.transportcompany.TransportCompanyDeliveryListType;
import ee.ttu.idu0075._2016.ws.transportcompany.TransportCompanyDeliveryType;
import java.math.BigInteger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author salakris
 */
@Path("transportCompanyDelivery")
public class TransportCompanyDeliveryResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TransportCompanyDeliveryResource
     */
    public TransportCompanyDeliveryResource() {
    }
    
    //http://localhost:8080/TransportWebService/webresources/transportCompanyDelivery/1?token=active

    @GET
    @Path("{companyId : \\d+}")
    @Produces("application/json")
    public TransportCompanyDeliveryListType getTransportCompanyList (@PathParam("companyId") String id, @QueryParam("token") String token) {
        TransportWebServiceFromWSDL tcws = new TransportWebServiceFromWSDL();
        GetTransportCompanyDeliveryListRequest request = new GetTransportCompanyDeliveryListRequest();
        request.setCompanyId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return tcws.getTransportCompanyDeliveryList(request);
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public TransportCompanyDeliveryType addTransportCompanyDelivery(TransportCompanyDeliveryType content, @QueryParam("token") String token) {
        TransportWebServiceFromWSDL tcws = new TransportWebServiceFromWSDL();
        AddTransportCompanyDeliveryRequest request = new AddTransportCompanyDeliveryRequest();
        request.setDeliveryId(content.getDeliveryId());
        request.setDeliveryPrice(content.getDeliveryPrice());
        request.setToken(token);
        request.setTransportCompanyId(content.getTransportCompanyId());
        return tcws.addTransportCompanyDelivery(request);
    }
}
