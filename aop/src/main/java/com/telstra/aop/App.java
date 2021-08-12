package com.telstra.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.concept.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/telstra/aop/config.xml");
        System.out.println( "Hello World!" );
        PaymentService p = context.getBean("payment",PaymentService.class);
        p.makePayment();
    }
}
