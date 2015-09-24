package com.majesco.camel.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

/**
 * Camel Route to serve get User REST endpoint
 *
 * Created by biplab661592 on 9/23/2015.
 */
public class GetUserRoute extends RouteBuilder{

    private static final String REST_ENDPOINT = "cxfrs:bean:getUserRESTServer?bindingStyle=SimpleConsumer&inInterceptors=#requestValidationInterceptors";
    @Override
    public void configure() throws Exception {
        from(REST_ENDPOINT)
                .log(LoggingLevel.INFO, "${headers}")
                .beanRef("userService", "getUserDetail")
                .marshal().json(JsonLibrary.Jackson)
                .beanRef("userProcessor", "convertToResponse");
    }
}
