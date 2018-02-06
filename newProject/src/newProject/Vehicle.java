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
}
