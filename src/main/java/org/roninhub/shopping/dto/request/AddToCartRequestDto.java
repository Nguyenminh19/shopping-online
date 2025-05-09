package org.roninhub.shopping.dto.request;

public class AddToCartRequestDto {
	private int cartId;
	private int userId;
	private int product_id;
	private int quantity;

	public AddToCartRequestDto(int cartId, int userId, int product_id, int quantity) {
		this.cartId = cartId;
		this.userId = userId;
		this.product_id = product_id;
		this.quantity = quantity;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
