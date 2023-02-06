package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
//		read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
//		get the beans from container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
//		call the business method
		theAccountDAO.addAccount(); 
		
//		do it again
		System.out.println("\n lets call it again\n\n");
		
//		call the business method
		theAccountDAO.addAccount();
		
//		cose the context
		context.close();
	}

}
