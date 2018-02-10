package newProject;

import java.lang.*;
import java.util.*;
import java.io.*;

public class MyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Try block");
			String name = null;
			name = name.substring(1, 2);
			throw new IOException("Errora");
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		MyException my = new MyException();
		my.sampleException();
		my.exampleException();
		my.ownException();
		my.inputException();

	}

	public void sampleException() {
		try {
			int arr[] = new int[5];
			System.out.println(arr[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The exception is " + e);
		}
	}

	public void exampleException() {
		try {
			File f = new File("Lines.txt");
			Scanner scan = new Scanner(f);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void ownException() {
		try {
			Class.forName("oracle");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void inputException() {
		try {
			int a = 98;
			a = a / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}
