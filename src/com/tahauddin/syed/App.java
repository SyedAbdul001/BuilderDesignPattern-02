package com.tahauddin.syed;

public class App {

	public static void main(String[] args) {
		
		OnlineShoppingCart onlineShoppingCart = new OnlineShoppingCart.Builder(101)
		.withtName("Syed")
		.withtAddress("Hyderabad")
		.withtBudget(50000L)
		.withtDiscount(20L)
		.build();
		
		
	//	System.out.println(onlineShoppingCart);
		
		String address = onlineShoppingCart.getAddress();
		System.out.println(address);
	}

}
