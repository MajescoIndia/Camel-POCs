package com.majesco.camel.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * This {@link ExceptionMapper} is meant to intercept and handle all {@link Exception}
 *
 * Created by biplab661592 on 9/23/2015.
 */
public class CxfRestExceptionMapper implements ExceptionMapper<Exception> {
    @Override
    public Response toResponse(Exception e) {
        return null;
    }
}
