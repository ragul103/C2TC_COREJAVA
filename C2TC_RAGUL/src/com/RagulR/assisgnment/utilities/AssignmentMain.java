package com.RagulR.assisgnment.utilities;

public class AssignmentMain {
	import com.RagulR.assisgnment.employees.Manager;
	import com.RagulR.assisgnment.employees.Developer;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Manager manager = new Manager();
	        manager.setName("Alice");
	        manager.setEmployeeId(101);
	        manager.setSalary(75000);
	        manager.setDepartment("HR");


	        Developer developer = new Developer();
	        developer.setName("Bob");
	        developer.setEmployeeId(102);
	        developer.setSalary(65000);
	        developer.setProgrammingLanguage("Java");


	        System.out.println("Manager Details:");
	        EmployeeUtilities.printManagerDetails(manager);

	        System.out.println("\nDeveloper Details:");
	        EmployeeUtilities.printDeveloperDetails(developer);

	}

}
