package org.roninhub.shopping.dto.auth.request;

public class RegisterRequestDto {
	private String email;
	private String password;
	private String fullname;
	private String status;
	private String role;

	public RegisterRequestDto(String email, String password, String fullname, String status, String role) {
		this.email = email;
		this.password = password;
		this.fullname = fullname;
		this.status = status;
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
