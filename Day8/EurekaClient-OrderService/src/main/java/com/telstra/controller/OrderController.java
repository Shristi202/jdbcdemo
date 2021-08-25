package com.telstra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@GetMapping("/gotorders")
	public String displayOrder() {
		return "Here is the order details";
	}

}
