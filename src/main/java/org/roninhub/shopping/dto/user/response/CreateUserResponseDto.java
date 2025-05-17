package org.roninhub.shopping.dto.user.response;

public class CreateUserResponseDto {

	private int id;
	private String email;
	private String fullname;
	private String status;
	private String role;

	public CreateUserResponseDto(int id, String email, String fullname, String status, String role) {
		super();
		this.id = id;
		this.email = email;
		this.fullname = fullname;
		this.status = status;
		this.role = role;
	}

	public CreateUserResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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