package com.sidhartha.spring.aop.entity;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
public class Home 
{
	 public void Display()
	 {
		 System.out.println("----welcome to home page---"); 
	 }	
}