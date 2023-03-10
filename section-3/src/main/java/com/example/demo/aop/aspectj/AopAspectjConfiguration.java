package com.example.demo.aop.aspectj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AopAspectjConfiguration {
	
	@Bean
	public ExecutionTracerAspect executionTraserAspect() {
		return new ExecutionTracerAspect();
	}

}
