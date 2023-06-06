package com.example.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import javax.ws.rs.ApplicationPath;



@Component
@ApplicationPath("/api")
public class demo1 extends ResourceConfig{
	public demo1() {
		packages("Controles");
		
	}
}
