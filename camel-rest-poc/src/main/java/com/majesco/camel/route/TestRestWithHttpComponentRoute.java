package com.majesco.camel.route;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.camel.component.jackson.JacksonDataFormat;

/**
 * Camel route that triggers by a camel-timer component and consumes RESTful Services.
 *
 * Created by biplab661592 on 9/23/2015.
 */
public class TestRestWithHttpComponentRoute extends RouteBuilder {
    JacksonDataFormat jacksonDataFormat = new JacksonDataFormat();
    @Override
    public void configure() throws Exception {

        //jacksonDataFormat.getObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //jacksonDataFormat.setUnmarshalType(UserDetails.class);

        from("timer:callRestService?delay=10000")
                .streamCaching()
                .to("direct:cxfrsRESTcall");

        /*from("direct:httpRESTcall")
                .streamCaching()
                .to("http://localhost:8080/rest-server/cxf/rest/user/get")
                .log(LoggingLevel.INFO, "${headers}")
                .log(LoggingLevel.INFO, "${body}")
                .setHeader(Exchange.HTTP_METHOD, simple("POST"))
                .setHeader(Exchange.CONTENT_TYPE, simple("application/json"))
                .to("http://localhost:8080/rest-server/cxf/rest/user/save");*/

        from("direct:cxfrsRESTcall")
                .setHeader(CxfConstants.OPERATION_NAME, simple("getUserDetails"))
                .to("cxfrs:bean:getUserDetailsRESTClient")
                .log(LoggingLevel.INFO, "===============================${body}");
    }
}
