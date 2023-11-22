package com.sidhartha.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.sidhartha.spring.aop.configuration.Appconfig;
import com.sidhartha.spring.aop.entity.Home;
import com.sidhartha.spring.aop.entity.Login;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        Home h = context.getBean(Home.class); 	
        h.Display();	 	
    }
}