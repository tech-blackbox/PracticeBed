package com.test;

import javax.json.stream.JsonGenerator;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.logging.LoggingFeature;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("restservices")
public class MyRestServices extends ResourceConfig {
    public MyRestServices() {
    	
    	register(LoggingFeature.class);
        property(JsonGenerator.PRETTY_PRINTING, true);
        register(JacksonFeature.class);
    	packages("com.fasterxml.jackson.jaxrs.json");
        packages("com.test");
    }
}