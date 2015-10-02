package com.majesco.camel.route;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.majesco.schemas.sample.UserDetails;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;

/**
 * Camel Route to serve save User REST endpoint
 *
 * Created by biplab661592 on 9/23/2015.
 */
public class SaveUserRoute extends RouteBuilder {

    JacksonDataFormat jacksonDataFormat = new JacksonDataFormat();

    private static final String REST_ENDPOINT = "cxfrs:bean:saveUserRESTServer?bindingStyle=SimpleConsumer&inInterceptors=#requestValidationInterceptors";
    @Override
    public void configure() throws Exception {
        jacksonDataFormat.getObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        jacksonDataFormat.setUnmarshalType(UserDetails.class);
        from(REST_ENDPOINT)
                .log(LoggingLevel.INFO, "${headers}")
                //.streamCaching()
                .marshal().json(JsonLibrary.Jackson)
                .log(LoggingLevel.INFO, "==========================${body}")
                .unmarshal(jacksonDataFormat)
                .beanRef("userService", "saveUserDetails")
                .marshal().json(JsonLibrary.Jackson)
                .log("----------------------${body}")
                .beanRef("userProcessor", "convertToResponse");
                //.log("++++++++++++++++++++${body}");
    }
}
