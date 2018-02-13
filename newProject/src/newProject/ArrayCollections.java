package newProject;

import java.util.*;

public class ArrayCollections {
	public static void main(String args[]) {
		ArrayList<String> arrayList = new ArrayList();
		arrayList.add("dinesh");
		arrayList.add("sam");
		arrayList.add("ramu");
		System.out.println("THE ARRAYLIST IS : " + arrayList);
		arrayList.add(3, "somu");
		arrayList.add(0, "venkat");
		arrayList.add("pankaj");
		arrayList.add("kuldeep");
		arrayList.add("jagdeep");
		System.out.println(arrayList);
		arrayList.remove(1);
		arrayList.remove(4);
		System.out.println(arrayList);
		arrayList.remove("ramu");
		System.out.println("after deleting train " + arrayList);
		System.out.println("The length of ArrayList is " + arrayList.size());
		System.out.println("the 2nd element is " + arrayList.get(1));
		System.out.println("the index of jagdeep is " + arrayList.indexOf("jagdeep"));
		System.out.println("is kuldeep exists " + arrayList.contains("kuldeeep"));
		ArrayList<String> all = new ArrayList<String>();
		all.addAll(arrayList);
		all.add("ankoor");
		System.out.println("the new collection is " + all);
		all.clear();
		System.out.println("after clearing new collection " + all);
		all.addAll(0, arrayList);
		System.out.println("the new collection is " + all);
		System.out.println("-------In object representation--------");
		Object[] obj = all.toArray();
		for (Object o : obj) {
			System.out.println(o);
		}
		all.add("Neeraj");
		all.removeAll(arrayList);
		System.out.println("after removing a collection , the new collection is " + all);
	}
}
