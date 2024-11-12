package com.pvr.shopping;
import com.pvr.shopping.entity.Customer;
import com.pvr.shopping.imp_ording.ComputerTools;
import com.pvr.shopping.imp_ording.MobileTools;
import com.pvr.shopping.interfacesample.Order;

public class ShoppingDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setId(101);
		c1.setName("Ragul");
		c1.setCity("Cuddalore");
		c1.setProduct("computertools");
		
		Order order;
		
		String choice=c1.getProduct();
		if(choice.equals("mobiletools"))   
		{
			order=MobileTools.getMt();
		}
		else {
			order=ComputerTools.getCt();
		}
		order.Ordering();
	}

}
