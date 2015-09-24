package com.majesco.camel.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

/**
 * Created by biplab661592 on 9/23/2015.
 */
public class SaveUserRoute extends RouteBuilder {

    private static final String REST_ENDPOINT = "cxfrs:bean:saveUserRESTServer?bindingStyle=SimpleConsumer&inInterceptors=#requestValidationInterceptors";
    @Override
    public void configure() throws Exception {
        from(REST_ENDPOINT)
                .log(LoggingLevel.INFO, "${headers}")
                .log(LoggingLevel.INFO, "==========================${body.userName}")
                .beanRef("userService", "saveUserDetails")
                .marshal().json(JsonLibrary.Jackson)
                .beanRef("userProcessor", "convertToResponse");
    }
}
