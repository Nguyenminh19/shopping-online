package org.roninhub.shopping.controller.v1;

import java.util.HashMap;
import java.util.Map;

import org.roninhub.shopping.constant.UrlConstant;
import org.roninhub.shopping.dto.cart.request.CartAddItemRequestDto;
import org.roninhub.shopping.dto.cart.request.CartUpdateItemRequestDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UrlConstant.API_VERSION)
public class CartController {

	@GetMapping(UrlConstant.USER_CARTS)
	public Object getCarts() {
		return null;
	}

	@PostMapping(UrlConstant.CART_ITEMS)
	public Object addToCart(@RequestBody CartAddItemRequestDto request) {
		return request;
	}

	@PatchMapping(UrlConstant.UPDATE_CART_ITEMS_QUANTITY)
	public Object updateCartItemQuantity(@PathVariable Integer id, @RequestBody CartUpdateItemRequestDto request) {
		return request;
	}

	@DeleteMapping(UrlConstant.CRUD_CART_ITEMS)
	public Object removeFromCart(@PathVariable Long id) {
		Map<String, Object> response = new HashMap<>();
		response.put("id", id);
		return response; // Return path variable
	}
	
	@DeleteMapping(UrlConstant.USER_CARTS)
    public Object clearCart() {
        return null; // No parameters
    }
}
