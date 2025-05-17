package org.roninhub.shopping.controller.v1;

import java.util.HashMap;
import java.util.Map;

import org.roninhub.shopping.constant.UrlConstant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UrlConstant.API_VERSION)
public class OrderController {

	@GetMapping(UrlConstant.GET_USER_ORDER)
	public Object getUserOrders() {
		return null; // No parameters
	}

	@GetMapping(UrlConstant.CRUD_USER_ORDER)
	public Object getUserCurrentOrderById(@PathVariable Integer id) {
		Map<String, Object> response = new HashMap<>();
		response.put("id", id);
		return response; // Return path variable
	}
	
	@PatchMapping(UrlConstant.UPDATE_ORDER_INFO)
	public Object updateOrderInfo(@PathVariable Integer order_id) {
		Map<String, Object> response = new HashMap<>();
		response.put("id", order_id);
		return response; // Return path variable
	}
	
	@PatchMapping(UrlConstant.CANCEL_ORDER)
	public Object cancelOrderInfo(@PathVariable Integer order_id) {
		Map<String, Object> response = new HashMap<>();
		response.put("id", order_id);
		return response; // Return path variable
	}

}
