package com.tahauddin.syed;

import com.tahauddin.syed.OnlineShoppingCart.Builder;

public class OnlineShoppingCart {

	private Integer id;
	private String name;
	private String address;
	private Long budget;
	private Long discount;

	public static class Builder {

		private Integer id;
		private String name;
		private String address;
		private Long budget;
		private Long discount;

		public Builder(Integer id) {
			this.id = id;
		}

		public Builder withtName(String name) {
			this.name = name;

			return this;
		}

		public Builder withtAddress(String address) {
			this.address = address;

			return this;
		}

		public Builder withtBudget(Long budget) {
			this.budget = budget;

			return this;
		}

		public Builder withtDiscount(Long discount) {
			this.discount = discount;

			return this;
		}

		public OnlineShoppingCart build() {
			OnlineShoppingCart onlineShoppingCart = new OnlineShoppingCart();
			/*
			 * onlineShoppingCart.id = id;
			 * onlineShoppingCart.name = name; onlineShoppingCart.address = address;
			 * onlineShoppingCart.budget = budget; onlineShoppingCart.discount = discount;
			 */
			
			onlineShoppingCart.id = id;
			onlineShoppingCart.setName(this.name);
			onlineShoppingCart.setAddress(this.address);
			onlineShoppingCart.setBudget(this.budget);
			onlineShoppingCart.setDiscount(this.discount);
			
			
			return onlineShoppingCart;
		}

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getBudget() {
		return budget;
	}

	public void setBudget(Long budget) {
		this.budget = budget;
	}

	public Long getDiscount() {
		return discount;
	}

	public void setDiscount(Long discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "OnlineShoppingCart [id=" + id + ", name=" + name + ", address=" + address + ", budget=" + budget
				+ ", discount=" + discount + "]";
	}

	private OnlineShoppingCart() {
		
	}

	

}
