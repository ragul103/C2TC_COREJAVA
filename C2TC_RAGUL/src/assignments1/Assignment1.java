package assignments1;
import java.util.*;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
int age= scan.nextInt();
float grade=scan.nextFloat();
scan.nextLine();
String name=scan.nextLine();
String section=scan.nextLine();
System.out.println(name);
System.out.println(age);
System.out.println(section);
System.out.println(grade);
scan.close();
	}

}