package com.sidhartha.spring.aop.entity;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Login 
{
	 @After("execution(public void Display())")
	 public void login()
	 {
		 System.out.println("please login.......");
	 }	
}