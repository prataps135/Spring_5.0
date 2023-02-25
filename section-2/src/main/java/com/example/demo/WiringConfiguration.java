package com.example.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class WiringConfiguration {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public PlainSimpleLogic plainSimpleLogic() {
		return new PlainSimpleLogic();
	}
}
