package newProject;
import java.util.*;

class Employee {
	int employeeId;
	String employeeName;
	int age;
	String designation;
	int salary;
	Scanner sc = new Scanner(System.in);
    Employee(){
    	System.out.println("Employee Details");
    }
	void getInfo() {
		System.out.println("Enter employee id: ");
		employeeId = sc.nextInt();
		System.out.println("Enter employee name: ");
		employeeName = sc.next();
		System.out.println("Enter employee age: ");
		age = sc.nextInt();
		System.out.println("Enter employee designation: ");
		designation = sc.next();
		System.out.println("Enter employee salary: ");
		salary = sc.nextInt();
	}
}

class Manager extends Employee {
	String managerName;
	String dateOfJoining;
	Manager(){
		super();
		System.out.println(" This is Manager class");

	}
   
	void getManagerInfo() {
	
		System.out.println("Getting Manager details:");
		System.out.print("Enter employee id : ");
		employeeId = sc.nextInt();
		System.out.println();
		System.out.print("Enter manager name : ");
		this.managerName = sc.next();
		System.out.println("Enter date of joining: ");
		this.dateOfJoining = sc.next();
		System.out.println("Enter salary : ");
		salary = sc.nextInt();
	}

	void displayManagerInfo() {
		if (designation.equals("manager")) {
			System.out.println("Employee id: " + employeeId);
			System.out.println("Manager name: " + managerName);
			System.out.println("Date of Joining: " + dateOfJoining);
			System.out.println("Salary: " + salary);
		}
	}

}

public class Staff extends Manager {
	public static void main(String args[]) {
		Staff emp = new Staff();
		emp.getInfo();
		emp.getManagerInfo();
		emp.displayManagerInfo();
		Manager manage = new Manager();
	}
}