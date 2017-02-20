package com.majesco.camel.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

/**
 * Created by bipnayak on 2/10/2017.
 */
public class SampleSoapRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("cxf:bean:weatherSoap")
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        exchange.getIn().setBody("Sample String response.");
                    }
                });
    }
}
