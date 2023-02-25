package com.example.demo.aop.spring;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object[] args = invocation.getArguments();
		String signature = invocation.getMethod().toString();

		Object result = invocation.proceed();
		System.out.println(
				"===\nMethod " + signature + "was called with next arguments " +
				Arrays.toString(args) + "\n===");
		return result;

	}

}
