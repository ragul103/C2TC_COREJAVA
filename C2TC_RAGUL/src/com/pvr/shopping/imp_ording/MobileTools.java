package com.pvr.shopping.imp_ording;
import com.pvr.shopping.interfacesample.Order;*;

public class MobileTools implements Order{

	private static MobileTools mt=new MobileTools();
	
	public static MobileTools getMt() {
		return mt;
	}

	public void setMt(MobileTools mt) {
		MobileTools.mt = mt;
	}

	private MoblileTools() {
		
	}
	public void Ordering() {
		System.out.println("I am buying bluetooth headphone.");
	}

}
