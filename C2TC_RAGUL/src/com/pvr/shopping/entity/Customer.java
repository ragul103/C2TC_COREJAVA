package com.pvr.shopping.entity;


public class Customer {
	private int id;
	private String name;
	private String city;
	private String product;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getProduct() {
		return product;
	}


	public void setProduct(String product) {
		this.product = product;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", product=" + product + "]";
	}
	
}
