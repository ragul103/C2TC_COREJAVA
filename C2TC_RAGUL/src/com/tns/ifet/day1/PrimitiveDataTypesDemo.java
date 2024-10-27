/**
 * 
 */
package com.tns.ifet.day1;

/**
 * 
 */
public class PrimitiveDataTypesDemo {

	/**
	 * 
	 */
	public PrimitiveDataTypesDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bytemin=127;
		byte bytemax=-128;
		System.out.println("Min range of byte is " +bytemin+"Max range of byte is "+bytemax);
		
		short shortmin=32767;
		short shortmax=-32768;
		System.out.println("Min range of short is "+shortmin+"Max range of short is "+shortmax);
		
		int intmin=2147483647;
		int intmax=-2147483648;
		System.out.println("Min range of integer is "+intmin+"Max range of integer is "+intmax);
		
		long longmax=9223372036854775807L;
		long longmin=-9223372036854775807L;
		System.out.println("Min range of long is "+longmin+"Max range of long is "+longmax);
		
		float f=3234.141243278345f;
		double d=-3456.14124512345678902345678914d;
		System.out.println("Min range of float is "+f+"Max range of double is "+d);
		
		boolean b=false;
		System.out.println("Boolean Value is "+b);
	}

}