package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.aop.TraceableService;

@SpringBootApplication
public class Section3Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Section3Application.class);
		ConfigurableApplicationContext ctx = app.run(args);

		ctx.getBean(TraceableService.class).hello("aop");
	}

}
