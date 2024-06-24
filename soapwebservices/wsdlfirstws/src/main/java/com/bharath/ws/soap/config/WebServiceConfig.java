package com.bharath.ws.soap.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bharath.ws.soap.CustomerOrdersWsImpl;

@Configuration
public class WebServiceConfig {

	private final Bus bus;

    public WebServiceConfig(Bus bus) {
        this.bus = bus;
    }

    @Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, new CustomerOrdersWsImpl());
		endpoint.publish("/customerordersservice");
		return endpoint;

	}

}
