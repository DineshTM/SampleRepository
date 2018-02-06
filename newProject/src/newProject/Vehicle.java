package newProject;

import java.util.*;

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle();
		String vehicleName = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a vehicle name");
		vehicleName = sc.nextLine();
		vehicle.convertCase(vehicleName);
		vehicle.performOperation(vehicleName);
	}

	public void convertCase(String name) {
		if (name != null && name.length() != 0) {
			name = name.trim();
			System.out.println("This is the name: " + name);
			System.out.println("This is uppercase of the vehicle name: " + name.toUpperCase());
			System.out.println("This is lowercase of the vehicle name: " + name.toLowerCase());
			System.out.println("This is last letter of the vehicle name: " + name.charAt(name.length() - 1));
		}else {
			System.out.println("INVALID!!! You didnt enter a valid vehicle name ");
		}

	}
	public void performOperation(String name) {
		if (name != null && name.length() != 0) {
			name = name.trim().toLowerCase();
			System.out.println("The index of 'a' in vehicle name is: "+name.indexOf('a'));
			System.out.println("The length of the vehicle name is: "+name.length());
			System.out.println("Replacing letter 'a' by letter 'e' in vehicle name "+name.replace('a','e'));
			System.out.println("Verifying whether name is ending with r :"+name.endsWith("r"));
			System.out.println("Verifying whether name is starting with c :"+name.startsWith("c"));
		}else {
			System.out.println("INVALID!!! You didnt enter a valid vehicle name ");
		}
	}
}
