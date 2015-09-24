package com.majesco.camel.rest;

import com.majesco.schemas.sample.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by biplab661592 on 9/23/2015.
 */
@Path("/")
public class SaveUserEndpoint {

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response saveUser(UserDetails userDetails){
        return null;
    }
}
