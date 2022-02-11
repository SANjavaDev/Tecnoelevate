package com.technoelevate.Spring_AOP_Aspect_Oriented_Programming.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	@Before("execution(* com.technoelevate.Spring_AOP_Aspect_Oriented_Programming.service.PaymentServiceImp.pay())")
	public void beforPayment() {
		System.out.println("Payment Started!");
	}

	@After("execution(* com.technoelevate.Spring_AOP_Aspect_Oriented_Programming.service.PaymentServiceImp.pay())")
	public void afterPayment() {
		System.out.println("Payment Successfully!");
	}

}
