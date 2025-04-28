package org.roninhub.shopping.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {
	@GetMapping("/hello-word")
	public String hello() {
		return new String("Hello shpping online project");
	}
	
}
