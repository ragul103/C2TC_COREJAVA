package assignments1;

public class Commision {
	String Name;
	String Address;
	long Phone;
	long Sales_amount;

	Commision(){
		Name = "Surya";
		Address = "Cuddalore";
		Phone = 6374763404l;
		Sales_amount = 100001l;
	}

	public void commision_rate(long Sales_amount){
	
		if(Sales_amount>=100000) {
			System.out.println("Commission = 10%");
		}
	
		else if(Sales_amount>=50000 && Sales_amount<100000) {
			System.out.println("Commission = 5%");
		}
	
		else if(Sales_amount>=30000 && Sales_amount<50000) {
			System.out.println("Commission = 3%");
		}
		else {
			System.out.println("No Commission");
		}
	
	}
	
	public static void main(String[] args) {
		Commision c1 = new Commision();
		c1.commision_rate(c1.Sales_amount);
	}
}

