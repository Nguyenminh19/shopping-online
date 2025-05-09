package org.roninhub.shopping.dto.response;

public class UserLoginResponseDto {
	private String email;

	public UserLoginResponseDto(String email) {
		this.email = email;
	}

	public String getUsername() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
