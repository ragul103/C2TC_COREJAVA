package assignments1;

public class Circle {
	
	int radius;
	String colour;
	
	public void getInput(int radius, String colour) {
		this.radius = radius;
		this.colour = colour;
	}
	
	public void calcArea(int r) {
		float pi = 3.1415f;
		float Area = pi * r * r;
		System.out.println(Area);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.getInput(5, "Black");
		c1.calcArea(5);
	}

}
