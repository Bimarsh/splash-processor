package com.splash.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FacebookConsumerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:///home/bimarsh/projects/splash-processor/splash-processor/consumer")
                .to("file:///home/bimarsh/projects/splash-processor/splash-processor/consumer/out/");
    }
}
