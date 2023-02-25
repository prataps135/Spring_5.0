package com.example.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

// This is is instantiate manually
public class PlainSimpleLogic implements InitializingBean {

	// Here we inject dependency of SimpleLogic class
	@Autowired
	private SimpleLogic simplelogic;

	public PlainSimpleLogic() {
		System.out.println("Class was created.");
	}

	public void init() {
		System.out.println("Class was initialized.");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Class was initialized in afterPropertiesSet.");
	}

	public void destroy() {
		System.out.println("Class was about to destroy.");
	}

	// This is method is to check dependency of simplelogic class
	public void doSomeWork() {
		simplelogic.doSimpleWork();
	}

}
