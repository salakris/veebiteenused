/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.projekt.transport;

import ee.ttu.idu0075._2016.ws.transportcompany.AddDeliveryRequest;
import ee.ttu.idu0075._2016.ws.transportcompany.DeliveryType;
import ee.ttu.idu0075._2016.ws.transportcompany.GetDeliveryListRequest;
import ee.ttu.idu0075._2016.ws.transportcompany.GetDeliveryListResponse;
import ee.ttu.idu0075._2016.ws.transportcompany.GetDeliveryRequest;
import java.math.BigInteger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
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
@Path("deliveries")
public class DeliveriesResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of DeliveriesResource
     */
    public DeliveriesResource() {
    }
    // http://localhost:8080/TransportWebService/webresources/deliveries/?token=active
    
    @GET
    @Produces("application/json")
    public GetDeliveryListResponse getDeliveryList (@QueryParam("token") String token) {
        TransportWebServiceFromWSDL tcws = new TransportWebServiceFromWSDL();
        GetDeliveryListRequest request = new GetDeliveryListRequest();
        request.setToken(token);
        return tcws.getDeliveryList(request);
    }

    @GET
    @Path("{id : \\d+}")
    @Produces("application/json")
    public DeliveryType getDelivery(@PathParam("id") String id, @QueryParam("token") String token) {
        TransportWebServiceFromWSDL tcws = new TransportWebServiceFromWSDL();
        GetDeliveryRequest request = new GetDeliveryRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return tcws.getDelivery(request);
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public DeliveryType addDelivery(DeliveryType content, @QueryParam("token") String token) {
        TransportWebServiceFromWSDL tcws = new TransportWebServiceFromWSDL();
        AddDeliveryRequest request = new AddDeliveryRequest();
        request.setType(content.getType());
        request.setToken(token);
        return tcws.addDelivery(request);
    }

    
}
