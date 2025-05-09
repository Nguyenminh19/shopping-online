package org.roninhub.shopping.controller;

import org.roninhub.shopping.constant.UrlConstant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping(UrlConstant.GET_PRODUCTS)
	public Object getProducts() {
		return null;
	}
	
	@GetMapping(UrlConstant.GET_PRODUCT_DETAIL)
	public Object getDetailProduct(@PathVariable(name = "product_id") int id) {
		return id;
	}
}
