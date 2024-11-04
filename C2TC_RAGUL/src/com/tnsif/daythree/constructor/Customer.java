/**
 * 
 */
package com.tnsif.daythree.constructor;

/**
 * 
 */
public class Customer {
	private int CustomerId;
	private String CustomerName;
	private String CustomerCity;
	
	public Customer(){
		System.out.println("Default Constructor");
	}
	public Customer(int CustomerId,String CustomerCity,String CustomerName) {
		this();
		System.out.println("Parameterized Constructor");
		this.CustomerId=CustomerId;
		this.CustomerName=CustomerName;
		this.CustomerCity=CustomerCity;
	}
	
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerCity() {
		return CustomerCity;
	}
	public void setCustomerCity(String customerCity) {
		CustomerCity = customerCity;
	}
	public String toString() {
		return "Customer [CustomerName=" + 
				CustomerName + ", CustomerId=" + CustomerId + ",CustomerCity=" + CustomerCity + "]";
				}

}
