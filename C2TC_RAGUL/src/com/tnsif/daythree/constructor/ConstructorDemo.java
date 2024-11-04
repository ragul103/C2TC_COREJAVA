/**
 * 
 */
package com.tnsif.daythree.constructor;
import java.util.*;
/**
 * 
 */
public class ConstructorDemo {

	/**
	 * 
	 */
	public ConstructorDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String Name, City;
		int id;
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Customer Name : ");
		Name=sc.nextLine();
		
		System.out.print("Enter Customer City : ");
		City=sc.nextLine();
		System.out.println(" ");
		
		Customer c1=new Customer();
		
		c1.setCustomerName(Name);
		c1.setCustomerId(id);
		c1.setCustomerCity(City);
		
		System.out.println(c1);
		
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Customer Name : ");
		Name=sc.nextLine();
		
		System.out.print("Enter Customer City : ");
		City=sc.nextLine();
		
		Customer c2=new Customer(id, City, Name); 

		System.out.println(c2);
		sc.close();


	}

}
