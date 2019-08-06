package com.nagarro.javabrains.aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

// To convert normal class into Aspect
public class LoggingAspect {

	
	//An aspect can contain number of Advices.These Advice method can be configured to run on particular method run
	//This is standart AOP annotation that we can use to make our advice method run before our target method.
	/*
	 * @Before("execution(public String com.nagarro.javabrains.model.Circle.getName())"
	 * ) public void LoggingAdvice() {
	 * System.out.println("Advice run,Method Called"); }
	 */
	
	@Before("execution(public * get*(...))") 
	public void LoggingAdvice() {
		System.out.println("Advice run,Method Called");
	}
	
	@Before("execution(* * get*())") 
	public void LoggingAdvicee() {
		System.out.println("Advice run,Method Called");
	}
	
	@Pointcut("execution(* * get*())")
	public void allGetters() {
		
	}
}
