package Simple.illustrateInheritence;

import java.util.Scanner;
import static java.lang.System.*;

/**
 *@author as980(Ashutosh Kumar)
 *Program to illustrate inheritence in hibernate program.
 *
 */

public class App {
	public static void main(String[] args) {
		
		employeeDao ed = new employeeDao();				//employeedao object created.
		Scanner sc = new Scanner(System.in); 		 	// Scanner object created.
		employee e = new employee();   					//Employee object created.
		fresherEmployee fe = new fresherEmployee();
		experienceEmployee ee = new experienceEmployee();
		
		int empId;									 // Instance variables declared which is used in main class.
		String empFirstName; 						 
		String empLastName;
		int contractPeriod;
		int increment;
		int experience;
		int hike;
	
		int count=0;					
		while(count<6) {				//while loop is used so that user can use the program until he/she want to use it.
			out.println(" Press 1 to Add Employee.\n Press 2 to Add Fresher Employee.\n Press 3 to Add Experience Employee.\n Press 4 to Get Employee details.\n Press 5 to Remove Employee.\n Press 6 or any other to Exit.");
			count = sc.nextInt();
			
			switch(count) {						//Employee name and id is being taken from the user. 
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
			 		ed.addEmployee(e);				//Employee details are transfered to employeedao class.
			 	}
			 	case 2->{							//Fresher Employee details are being taken from the user.
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
			 		ed.addEmployee(fe);						//Fresher Employee details are transfered to employeedao class.
			 	}
			 	case 3->{									//Experience Employee details are being taken from the user.
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
			 	case 4->{									//Here we are fetching the employee details to display.
			 		System.out.println("Enter your id for get information of employees");
					 empId= sc.nextInt();
					 ed.connect();											
					 e = ed.getEmployee(empId);
					 out.println(e);
			 	}
			 	case 5->{								//Here we are removing the employee from the database.
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
