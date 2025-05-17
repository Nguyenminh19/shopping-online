package org.roninhub.shopping.controller.v1;

import java.util.HashMap;
import java.util.Map;

import org.roninhub.shopping.constant.UrlConstant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController(UrlConstant.API_VERSION)
public class ProductController {

	
	@GetMapping(UrlConstant.PRODUCTS)
	public ResponseEntity<Object> getProducts() {
		return null;
	}
	
	@GetMapping(UrlConstant.CRUD_PRODUCTS)
	public Object getProductById(@PathVariable Integer id) {
		Map<String, Object> response = new HashMap<>();
        response.put("id", id);
		return response;
	}
}
