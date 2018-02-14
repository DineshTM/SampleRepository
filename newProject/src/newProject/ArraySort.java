package newProject;

import java.util.*;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySort obj = new ArraySort();
		ArrayList<String> list = new ArrayList<String>();
		list.add("joseph");
		list.add("john");
		list.add("henry");
		list.add("mark");
		list.add("peter");
		list.add("sam");
		list.add("jenny");
		list.add("williams");
		list.add("anderson");
		list.add("joel");
		list.add("jam");
		System.out.println("The arraylist is " + list);
		obj.sort(list);
		Collections.sort(list);
		System.out.println("The sorted arraylist through default collections sort  is :" + list);

	}

	public void sort(ArrayList list) {
		// Creating a separate arraylist to copy list from main since reference list
		// cannot be accessed to convert toArray()
		ArrayList<String> list2 = new ArrayList<String>();
		list2.addAll(list);
		String[] arr = new String[list.size()];
		arr = list2.toArray(arr);
		String tmp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++)
				if (arr[i].compareTo(arr[j]) > 0) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
		}
		System.out.println("The array elements after sorting ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
