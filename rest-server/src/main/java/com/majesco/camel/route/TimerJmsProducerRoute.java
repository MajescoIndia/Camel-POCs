package com.majesco.camel.route;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;

/**
 * Created by biplab661592 on 10/12/2015.
 */
public class TimerJmsProducerRoute extends RouteBuilder{
    @Override
    public void configure() throws Exception {
        onException(Exception.class)
                .handled(true);
        from("timer:toJmsQueue?delay=0")
                .setBody(simple("XXXXXXXXXXX"))
                .setHeader("testHeader", simple("hhhhhhhhhhhhh"))
                .setHeader(Exchange.CORRELATION_ID, simple("sample correlation id"))
                .to(ExchangePattern.InOut, "amq:queue:test?replyTo=testReply")
                .log(LoggingLevel.INFO, "${body}");

        from("amq:queue:test")
                .log(LoggingLevel.INFO, "${headers}")
                .setBody(simple("${body} YYYYYYYYYYYYYYYYYYYYYYYYYY"));

    }
}
