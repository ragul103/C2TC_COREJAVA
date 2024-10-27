/**
 * 
 */
package com.tns.ifet.day2;

/**
 * 
 */
public class NestedIfElseDemo {

	/**
	 * 
	 */
	public NestedIfElseDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=45,b=18,c=5;
		if(a>b)
			if(a>c)
				System.out.println("a is greater than");
			else
				System.out.println("c is greater than");
		else
			if(c>b)
				System.out.println("c is greater than");
			else
				System.out.println("b is greater than");
	}

}
