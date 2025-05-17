package org.roninhub.shopping.service;

import org.roninhub.shopping.dto.auth.request.LoginRequestDto;
import org.roninhub.shopping.dto.auth.request.RegisterRequestDto;
import org.roninhub.shopping.model.User;

public interface AuthenticateService  {
	User login(LoginRequestDto request);
	
	void logout();
	
	void register(RegisterRequestDto request);
}
