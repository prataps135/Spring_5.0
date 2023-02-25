package com.example.demo.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:aop-context.xml")
public class AopApplicationConfiguration {

//	@Bean
	public TraceableService traceableService() {
		return new TraceableService();
	}
	
}
