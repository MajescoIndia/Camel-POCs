package com.majesco.camel.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * JAX-RS annotated class that is used as a CXF resource to get UserDetails
 *
 * Created by biplab661592 on 9/23/2015.
 */
@Path("/")
@Produces("application/json")
public class GetUserEndpoint {

    @GET
    public Response getUser(@QueryParam("userName") String userName) {
        return null; // actual response will be sent from Camel Route
    }
}
