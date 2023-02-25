package com.example.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// This class instantiate by Spring automatically
@Component
public class SimpleLogic implements InitializingBean {

	public SimpleLogic() {
		System.out.println("Class was created.");
	}

	@PostConstruct
	public void init() {
		System.out.println("Class was initialized.");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Class was initialized in afterPropertiesSet.");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Class was about to destroy.");
	}

	public void doSimpleWork() {
		System.out.println("work from simpleLogic");
	}

}
