package Simple.illustrateInheritence;

import java.util.Scanner;
import static java.lang.System.*;

/**
 * Hello world!
 *
 */

public class App {
	public static void main(String[] args) {
		
		employeeDao ed = new employeeDao();
		Scanner sc = new Scanner(System.in); 		 // Here we create object of Scanner class
		employee e = new employee();
		fresherEmployee fe = new fresherEmployee();
		experienceEmployee ee = new experienceEmployee();
		
		int empId;									 // This is a instance variable stuId
		String empFirstName; 						 // This is a instance variable stuName
		String empLastName;
		int contractPeriod;
		int increment;
		int experience;
		int hike;
	
		int count=0;
		while(count<6) {
			out.println(" Press 1 to Add Employee.\n Press 2 to Add Fresher Employee.\n Press 3 to Add Experience Employee.\n Press 4 to Get Employee details.\n Press 5 to Remove Employee.\n Press 6 or any other to Exit.");
			count = sc.nextInt();
			
			switch(count) {
			 	case 1-> {
			 		out.println("Enter your Employee id:- ");
			 		empId = sc.nextInt();
			 		e.setEmpId(empId);
			 		out.println("Enter your first name:- ");
			 		empFirstName = sc.next();
			 		e.setEmpFirstName(empFirstName);
			 		out.println("Enter your last name:- ");
			 		empLastName = sc.next();
			 		e.setEmpLastName(empLastName);
			 		ed.connect();
			 		ed.addEmployee(e);
			 	}
			 	case 2->{
			 		out.println("Enter your Employee id:- ");
			 		empId = sc.nextInt();
			 		fe.setEmpId(empId);
			 		out.println("Enter your first name:- ");
			 		empFirstName = sc.next();
			 		fe.setEmpFirstName(empFirstName);
			 		out.println("Enter your last name:- ");
			 		empLastName = sc.next();
			 		fe.setEmpLastName(empLastName);
			 		out.println("Enter your Contract period.");
			 		contractPeriod = sc.nextInt();
			 		fe.setContractPeriod(contractPeriod);
			 		out.println("Enter your Increment percentage.");
			 		increment = sc.nextInt();
			 		fe.setIncrement(increment);
			 		ed.connect();
			 		ed.addEmployee(fe);
			 	}
			 	case 3->{
			 		out.println("Enter your Employee id:- ");
			 		empId = sc.nextInt();
			 		ee.setEmpId(empId);
			 		out.println("Enter your first name:- ");
			 		empFirstName = sc.next();
			 		ee.setEmpFirstName(empFirstName);
			 		out.println("Enter your last name:- ");
			 		empLastName = sc.next();
			 		ee.setEmpLastName(empLastName);
			 		out.println("Enter how many years of experience do you have.");
			 		experience = sc.nextInt();
			 		ee.setExperience(experience);
			 		out.println("Enter yout hike percentage.");
			 		hike = sc.nextInt();
			 		ee.setHike(hike);
			 		ed.connect();
			 		ed.addEmployee(ee);
			 	}
			 	case 4->{
			 		System.out.println("Enter your id for get information of employees");
					 empId= sc.nextInt();
					 ed.connect();
					 e = ed.getEmployee(empId);
					 out.println(e);
			 	}
			 	case 5->{
			 		 out.println("Enter your id to delete employee");
					 empId = sc.nextInt();
					 ed.connect();
					 int delete = ed.removeEmployee(empId);
					 if(delete==1)                                  
						 out.println(" Employee successfully removed");
					 else
						 out.println(" Employee not found ");
			 	}
			}
		}
	}
}
