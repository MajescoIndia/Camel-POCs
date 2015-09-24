package com.majesco.camel.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by biplab661592 on 9/24/2015.
 */
@Path("/")
public class GetUserEndpoint {

    @GET
    public Response getUserDetails() {
        return null;
    }
}
