/**
 * 
 */
package com.tns.ifet.day2;

/**
 * 
 */
public class NestedForLoopDemo {

	/**
	 * 
	 */
	public NestedForLoopDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int beg=10;
		int end=20;
		for (int i = beg; i <= end; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + "= " + i * j);
			}
			System.out.println();
		}

	}

}
