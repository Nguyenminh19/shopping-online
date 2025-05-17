package org.roninhub.shopping.controller.v1;

import org.roninhub.shopping.constant.UrlConstant;
import org.roninhub.shopping.dto.user.request.CreateUserRequestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UrlConstant.API_VERSION)
public class UserController {
	
	@GetMapping(UrlConstant.CURRENT_USER)
	public Object getCurrentUser() {
		return null;
	}
	
	@PostMapping(UrlConstant.CREATE_USER)
	public Object createUser(@RequestBody CreateUserRequestDto request) {
		return null;
	}
}
