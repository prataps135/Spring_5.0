package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Section2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Section2Application.class, args);
		System.out.println(context.getBean(PlainSimpleLogic.class));
		System.out.println(context.getBean(PlainSimpleLogic.class));
		System.out.println(context.getBean(PlainSimpleLogic.class));
		context.getBean(PlainSimpleLogic.class).doSomeWork();
	}

}
