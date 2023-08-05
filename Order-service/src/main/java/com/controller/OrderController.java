package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value = "/pay/{price}")
	public String invokePayment(@PathVariable("price") int price) {
			
		System.out.println("called...");
		String url="http://client2/paynow/"+price;
				
		String res=restTemplate.getForObject(url,String.class);
		
		return res;
	}
}
