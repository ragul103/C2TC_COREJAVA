/**
 * 
 */
package com.demo;

/**
 * 
 */
public class Test2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10,m=30,N=4;
		int i;
		for(i=n;i<=m;i++) {
			int a=i;
			int s=0;
			while(a>0) {
				s+=a%10;
				a/=10;
			}
			if(N==s)
				System.out.println(i);
		}
	}

}
