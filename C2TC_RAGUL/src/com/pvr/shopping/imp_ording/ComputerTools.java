
package com.pvr.shopping.imp_ording;

import com.pvr.shopping.interfacesample.*;

public class ComputerTools implements Order {
	
	private static  ComputerTools ct =new ComputerTools();

	public static ComputerTools getCt() {
		return ct;
	}

	public void setCt(ComputerTools ct) {
		ComputerTools.ct = ct;
	}
	private ComputerTools(){
		
	}
	public void Ordering(){
		System.out.println("I am buying a HeadPhone.");
	}
	
}
