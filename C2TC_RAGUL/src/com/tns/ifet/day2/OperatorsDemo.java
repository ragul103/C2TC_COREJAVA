/**
 * 
 */
package com.tns.ifet.day2;

/**
 * 
 */
public class OperatorsDemo {

	/**
	 * 
	 */
	public OperatorsDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int x=30;
		System.out.println("A and B value before operation :" +a+""+b);
		++a;
		int c=++a+b+a--;
		System.out.println("The value of after operation C:" +c);
		
		int d=c+++a+b--;
		System.out.println("The value of after operation d:" +d);
		System.out.println("a,b,c,d value of operation: " + a + " " + b + " " + c + " " + d);
		
		x=(10==x)?1:0;
		System.out.println("the x is equal or not equal: "+x);
	}

}
