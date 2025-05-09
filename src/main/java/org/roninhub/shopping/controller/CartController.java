package org.roninhub.shopping.controller;

import org.roninhub.shopping.constant.UrlConstant;
import org.roninhub.shopping.dto.request.AddToCartRequestDto;
import org.roninhub.shopping.dto.response.AddToCartResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
	
	@PostMapping(UrlConstant.ADD_TO_CART)
	public Object addToCart(@RequestBody AddToCartRequestDto request) {
		return request;
	}
	
	@GetMapping(UrlConstant.VIEW_CART)
	public AddToCartResponseDto[] viewCart(@RequestBody AddToCartRequestDto request) {
		return null;
	}
}
