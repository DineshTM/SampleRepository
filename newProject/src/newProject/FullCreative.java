package newProject;
import java.util.*;
abstract class Organisation {
	String companyAddress = new String("Ascendas Tech Park");
	abstract void printDetails();
	abstract void getDetails();
}

public class FullCreative extends Organisation {
	int employeeId=0;
	int age=0;
	String name = new String();
	String designation = new String();
	String dateOfJoining = new String();
    Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		FullCreative creative = new FullCreative();
		creative.getDetails();
		creative.printDetails();
	}

	void printDetails() {
	  System.out.println();
      System.out.println("Details:");
	  System.out.println(companyAddress);
	  System.out.println(employeeId);
	  System.out.println(name);
	  System.out.println(age);
	  System.out.println(designation);
	  System.out.println(dateOfJoining);
	}

	void getDetails() {
      System.out.println("Enter the employeeId");
      employeeId = sc.nextInt();
      System.out.println("Enter the employee name");
      name = sc.next();
      System.out.println("Enter the employee age");
      age = sc.nextInt();
      System.out.println("Enter the employee designation");
      designation = sc.next();
      System.out.println("Enter the employee's date of joining");
      dateOfJoining = sc.next();
      System.out.println("---------------------------------------");
	}
}
