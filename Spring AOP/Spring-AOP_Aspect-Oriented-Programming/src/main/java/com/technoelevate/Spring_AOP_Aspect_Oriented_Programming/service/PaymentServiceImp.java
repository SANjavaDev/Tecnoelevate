package com.technoelevate.Spring_AOP_Aspect_Oriented_Programming.service;

public class PaymentServiceImp implements PaymentService {

	@Override
	public void pay() {

		System.out.println("Amount Creadeted!");
		System.out.println("Payment Successfull!");

	}

}
