package org.roninhub.shopping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.roninhub.shopping.constant.UrlConstant;
import org.roninhub.shopping.dto.request.UserLoginRequestDto;
import org.roninhub.shopping.dto.request.UserRegisterRequestDto;
import org.roninhub.shopping.dto.response.UserLoginResponseDto;
import org.roninhub.shopping.dto.response.UserRegisterResponseDto;

@RestController
public class UserController {

	@PostMapping(UrlConstant.USER_REGISTER)
	public Object register(@RequestBody UserRegisterRequestDto request) {
		// create user
		UserRegisterResponseDto res = new UserRegisterResponseDto();
		res.setName(request.getName());
		res.setEmail(request.getEmail());
		return res;
	}
	
	@PostMapping(UrlConstant.USER_LOGIN)
	public Object login(@RequestBody UserLoginRequestDto request) {
		// create user
		return new UserLoginResponseDto(request.getEmail());
	}
	
	@GetMapping(UrlConstant.GET_DETAIL_USER)
	public Object getUser(@PathVariable(name = "user_id") int id) {
		return id;
	}
}
