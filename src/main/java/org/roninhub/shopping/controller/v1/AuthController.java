package org.roninhub.shopping.controller.v1;

import org.roninhub.shopping.constant.UrlConstant;
import org.roninhub.shopping.dto.auth.request.LoginRequestDto;
import org.roninhub.shopping.dto.auth.request.RegisterRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UrlConstant.API_VERSION)
public class AuthController {
	
	
	@PostMapping(UrlConstant.LOGIN)
	public ResponseEntity<?> login(@RequestBody LoginRequestDto request) {
		return null;
	}
	
	@PostMapping(UrlConstant.LOGOUT)
    public Object logout() {
		// TBD
        return null; // Return request body
    }
	
	@PostMapping(UrlConstant.REGISTER)
    public Object register(@RequestBody RegisterRequestDto request) {
		// TBD
        return request; // Return request body
    }
}
