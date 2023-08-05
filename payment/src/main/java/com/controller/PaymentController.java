package com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	
	@RequestMapping(value="/paynow/{price}")
	public  String payNow(@PathVariable("price") int price) {
		
		return "payment of "+price+" done.";
	}
	
	
}
