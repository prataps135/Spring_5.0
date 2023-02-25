package com.example.demo.aop.aspectj;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ExecutionTracerAspect {
	@Pointcut("execution(* com.example.demo.aop.*.*(..))")
	private void allMethods() {}
	
	@Around("allMethods()")
	public Object trace(ProceedingJoinPoint pjp) throws Throwable{
		Object[] args = pjp.getArgs();
		String signature = pjp.getSignature().toString();
		Object retVal = pjp.proceed(args);
		System.out.println("Method "+ signature +" was called with next arguments "+Arrays.toString(args));
		return retVal;
	}
}
