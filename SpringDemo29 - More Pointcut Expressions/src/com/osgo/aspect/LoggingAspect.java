package com.osgo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect
{
	@Before("allGetters() && allCircleMethods()")					// Conditional AND statement (&&)
	public void loggingAdvice()
	{
		System.out.println("Advice run.  Get method called.");
	} // end method loggingAdvice
	
	
	@Before("allGetters()")
	public void secondAdvice()
	{
		System.out.println("Second Advice executed.");
	} // end method secondAdvice
	
	
	@Pointcut("execution(* get*())")
	public void allGetters()
	{
	} // end dummy method allGetters
	
	
/*
	@Pointcut("execution(* * com.osgo.model.Circle.*(..)")
	public void allCircleMethods()
	{
	} // end dummy method allCircleMethods()
*/
	
	@Pointcut("within(com.osgo.model.Circle)")						// applies to all methods in the Circle class.
	// @Pointcut("within(com.osgo.model.*)")						// applies to all classes and methods in the model package
	// @Pointcut("within(com.osgo.model..*)")						// applies to all classes and methods in all sub-packages of the model package
	public void allCircleMethods()
	{
	} // end dummy method allCircleMethods()
	
	// @Pointcut(args())
	
	
} // end Class LoggingAspect
