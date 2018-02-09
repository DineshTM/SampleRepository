package newProject;

import java.util.*;
class Lecturer {
	String id;
	String name;
	String designation;
	int age;
	int salary;
	Scanner sc = new Scanner(System.in);
	Lecturer() {
      
	}
	Lecturer(String id, String name, String designation, int age) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.age = age;
	}
	int get() {
		System.out.println("Enter the salary for the lecturer");
		salary = sc.nextInt();
		return salary;
	}

}

class Proffessor extends Lecturer {
	String proffessorId;
	Proffessor() {
		super("123", "vijay", "Principal", 50);
		proffessorId = super.id;
	}
	@Override
	int get() {
		super.get();
		System.out.println("Enter the salary for the proffessor");
		salary = sc.nextInt();
		return salary;
	}
}

public class Principal extends Proffessor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal obj = new Principal();
		int salary;
		salary= obj.get();
		System.out.println("The salary of the employee is :" + salary);
	}
}
