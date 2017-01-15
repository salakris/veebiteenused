/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.projekt.transport;

import ee.ttu.idu0075._2016.ws.transportcompany.AddTransportCompanyRequest;
import ee.ttu.idu0075._2016.ws.transportcompany.GetTransportCompanyListRequest;
import ee.ttu.idu0075._2016.ws.transportcompany.GetTransportCompanyListResponse;
import ee.ttu.idu0075._2016.ws.transportcompany.GetTransportCompanyRequest;
import ee.ttu.idu0075._2016.ws.transportcompany.TransportCompanyType;
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
@Path("transportCompany")
public class TransportCompanyResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TransportCompanyResource
     */
    public TransportCompanyResource() {
    }

    //http://localhost:8080/TransportWebService/webresources/transportCompany/?token=active
    
    @GET
    @Produces("application/json")
    public GetTransportCompanyListResponse getTransportCompanyList (@QueryParam("token") String token) {
        TransportWebServiceFromWSDL tcws = new TransportWebServiceFromWSDL();
        GetTransportCompanyListRequest request = new GetTransportCompanyListRequest();
        request.setToken(token);
        return tcws.getTransportCompanyList(request);
    }

    @GET
    @Path("{id : \\d+}")
    @Produces("application/json")
    public TransportCompanyType getTransportCompany(@PathParam("id") String id, @QueryParam("token") String token) {
        TransportWebServiceFromWSDL tcws = new TransportWebServiceFromWSDL();
        GetTransportCompanyRequest request = new GetTransportCompanyRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return tcws.getTransportCompany(request);
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public TransportCompanyType addTransportCompany(TransportCompanyType content, @QueryParam("token") String token) {
        TransportWebServiceFromWSDL tcws = new TransportWebServiceFromWSDL();
        AddTransportCompanyRequest request = new AddTransportCompanyRequest();
        request.setAddress(content.getAddress());
        request.setBuiltDate(content.getBuiltDate());
        request.setNumOfDeliveries(content.getNumOfDeliveries());
        request.setPendingDeliveries(content.getPendingDeliveries());
        request.setToken(token);
        request.setTransportCompanyName(content.getTransportCompanyName());
        return tcws.addTrasportCompany(request);
    }
}
