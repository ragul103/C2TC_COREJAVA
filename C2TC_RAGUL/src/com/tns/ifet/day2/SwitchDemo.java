/**
 * 
 */
package com.tns.ifet.day2;

/**
 * 
 */
public class SwitchDemo {

	/**
	 * 
	 */
	public SwitchDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x='l';
		switch(x) 
		{
		case 'l':
		case 'L':
			
		System.out.println(x+" is a Letter");
		break;
		
		case 'd':
		case 'D':
			
		System.out.println(x+" is Digit");
		break;
		
		case 'w':
		case 'W':
			
		System.out.println(x+" is White Space");
		break;
		
		default:
			System.out.println(x+" is other than letter, digit, space");
		}

	}

}
