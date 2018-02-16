package newProject;

import java.util.*;

public class SortMapComparator {

	public static void main(String args[]) {
		SortMapComparator ob = new SortMapComparator();
		Employ obj = new Employ();
		HashMap<Integer, Employ> map = new HashMap<Integer, Employ>();
		Employ emp = new Employ(123, "Dinesh", 1234);
		Employ emp1 = new Employ(124, "arul", 1200);
		Employ emp2 = new Employ(115, "mahesh", 1234);
		Employ emp3 = new Employ(106, "siva", 1256);
		Employ emp4 = new Employ(127, "amalraj", 1267);
		Employ emp5 = new Employ(118, "stefenraj", 1245);
		Employ emp6 = new Employ(179, "dhanraj", 1278);
		// putting the eId and all employee properties into map
		map.put(emp.eId, emp);
		map.put(emp1.eId, emp1);
		map.put(emp2.eId, emp2);
		map.put(emp3.eId, emp3);
		map.put(emp4.eId, emp4);
		map.put(emp5.eId, emp5);
		map.put(emp6.eId, emp6);
		for (Map.Entry<Integer, Employ> o : map.entrySet()) {
			int key = o.getKey();
			Employ value = o.getValue();
			System.out.println(key + " " + value.name + "  " + value.salary);
		}
		ArrayList<Employ> list = new ArrayList(map.values());
		System.out.println("Enter which field has to be sorted");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if (input.equalsIgnoreCase("name")) {
			System.out.println("inside name");
			Collections.sort(list, new NamesComparator());
			// Collections.sort(list);
		} else if (input.equalsIgnoreCase("eid")) {
			System.out.println("indide");
			Collections.sort(list, new IdsComparator());
		} else {
			Collections.sort(list, new SalariesComparator());
		}
		System.out.println("Values after sorting :");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Employ e = (Employ) itr.next();
			System.out.println(" " + e.eId + "  " + e.name + "  " + e.salary);
		}
	}
}

class Employ {
	int eId;
	String name;
	int salary;

	public Employ() {

	}

	public Employ(int eId, String name, int salary) {
		this.eId = eId;
		this.name = name;
		this.salary = salary;
	}
}

class NamesComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Employ s1 = (Employ) o1;
		Employ s2 = (Employ) o2;
		System.out.println("object " + s1);
		return (s1.name).compareTo(s2.name);
	}
}

class IdsComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Employ s1 = (Employ) o1;
		Employ s2 = (Employ) o2;
		if (s1.eId == s2.eId)
			return 0;
		else if (s1.eId > s2.eId)
			return 1;
		else
			return -1;
	}
}

class SalariesComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Employ s1 = (Employ) o1;
		Employ s2 = (Employ) o2;
		if (s1.salary == s2.salary)
			return 0;
		else if (s1.salary > s2.salary)
			return 1;
		else
			return -1;
	}
}
