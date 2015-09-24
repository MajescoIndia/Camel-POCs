package com.majesco.camel.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * Created by biplab661592 on 9/23/2015.
 */
@Path("/")
public class GetUserEndpoint {

    @GET
    public Response getUser(@QueryParam("userName") String userName) {
        return null;
    }
}
