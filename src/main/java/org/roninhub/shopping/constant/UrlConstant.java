package org.roninhub.shopping.constant;

public class UrlConstant {
	public static final String API_VERSION = "/api/v1";

	// for user
	public static final String USER_REGISTER = API_VERSION + "/auth/user/register";
	public static final String USER_LOGIN = API_VERSION + "/auth/user/login";
	public static final String GET_DETAIL_USER = API_VERSION + "/user/{user_id}";
	public static final String GET_PRODUCTS = API_VERSION + "/products";
	public static final String GET_PRODUCT_DETAIL = API_VERSION + "/products/{product_id}";
	public static final String ADD_TO_CART = API_VERSION + "/cart/{product_id}";
	public static final String VIEW_CART = API_VERSION + "/cart/{cart_id}";
	public static final String DELETE_PRODUCT_FROM_CART = API_VERSION + "/cart/{product_id}";
	public static final String VIEW_ORDER_DETAIL = API_VERSION + "/orders/{order_id}";
	public static final String UPDATE_ORDER = API_VERSION + "/orders/{order_id}";
	public static final String CANCEL_ORDER = API_VERSION + "/orders/{order_id}";

	// for admin
	public static final String ADMIN_LOGIN = API_VERSION + "/auth/admin/login";
	public static final String VIEW_USER = API_VERSION + "/users";
	public static final String DISABLE_USER = API_VERSION + "/users/{user_id}";
	public static final String ADD_PRODUCT = API_VERSION + "/products";
	public static final String UPDATE_PRODUCT = API_VERSION + "/products";
	public static final String DELETE_PRODUCT = API_VERSION + "/products/{product_id}";
}
