package org.roninhub.shopping.constant;

public class UrlConstant {
	public static final String API_VERSION = "/api/v1";
	
	//for auth
	public static final String REGISTER =  "/auth/register";
	public static final String LOGIN =  "/auth/login";
	public static final String LOGOUT =  "/auth/logout";

	// for user
	public static final String CRUD_USER =  "/user/{user_id}";
	public static final String CURRENT_USER =  "/user/me";
	public static final String CREATE_USER =  "/user/create";
	
	// for products
	public static final String PRODUCTS =  "/products";
	public static final String CRUD_PRODUCTS =  "/products/{product_id}";
	
	
	// for cart
	public static final String CART_ITEMS = "/carts/items";
	public static final String CRUD_CART_ITEMS =  "/carts/items/{id}";
	public static final String USER_CARTS =  "/user/me/cart";
    public static final String UPDATE_CART_ITEMS_QUANTITY = CRUD_CART_ITEMS + "/quantity";

	// for order
    public static final String CRUD_ORDER =  "/orders/{order_id}";
    public static final String GET_USER_ORDER =  "/user/me/orders";
    public static final String CRUD_USER_ORDER =  "/user/me/orders/{order_id}";
    public static final String UPDATE_ORDER_INFO =  "/user/me/orders/{order_id}/info";
    public static final String CANCEL_ORDER =  "/user/me/orders/{order_id}/cancel";
    
    // for admin
	public static final String ADMIN_USER =   "/admin/users";
	public static final String ADMIN_CRUD_USER =   "/admin/users/{user_id}";
	public static final String BLOCK_USER =   "/admin/users/{user_id}/block";
	public static final String UNBLOCK_USER =   "/admin/users/{user_id}/unblock";
	
	public static final String ADMIN_PRODUCTS =   "/admin/products";
	public static final String CRUD_ADMIN_PRODUCTS =   "/admin/products/{product_id}";
	
	public static final String ADMIN_ORDER =   "/admin/orders";
	public static final String CRUD_ADMIN_ORDER =   "/admin/orders/{order_id}";
	public static final String UPDATE_ORDER_DETAIL =   "/admin/orders/{order_id}/status";
	public static final String GET_ORDER_HISTORY =   "/admin/orders/{order_id}/history";
}
