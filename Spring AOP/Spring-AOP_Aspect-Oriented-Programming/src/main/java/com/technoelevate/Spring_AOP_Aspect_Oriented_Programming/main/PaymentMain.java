package com.technoelevate.Spring_AOP_Aspect_Oriented_Programming.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technoelevate.Spring_AOP_Aspect_Oriented_Programming.service.PaymentService;
import com.technoelevate.Spring_AOP_Aspect_Oriented_Programming.service.PaymentServiceImp;

public class PaymentMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		PaymentService paymentService = applicationContext.getBean("payment", PaymentServiceImp.class);
		paymentService.pay();
	}

}
