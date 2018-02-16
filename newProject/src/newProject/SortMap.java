package newProject;

import java.util.*;

public class SortMap {
	static String choice;

	public static void main(String args[]) {
		SortMap ob = new SortMap();
		Employe obj = new Employe();
		Map<Integer, Employe> map = new HashMap<Integer, Employe>();
		Employe emp = new Employe(123, "dinesh   ", 1234);
		Employe emp1 = new Employe(124, "arul     ", 1200);
		Employe emp2 = new Employe(115, "mahesh   ", 1234);
		Employe emp3 = new Employe(106, "siva     ", 1256);
		Employe emp4 = new Employe(127, "amalraj  ", 1267);
		Employe emp5 = new Employe(118, "stefenraj", 1245);
		Employe emp6 = new Employe(179, "dhanraj  ", 1278);
		// putting the eId and all employee properties into map
		map.put(emp.eId, emp);
		map.put(emp1.eId, emp1);
		map.put(emp2.eId, emp2);
		map.put(emp3.eId, emp3);
		map.put(emp4.eId, emp4);
		map.put(emp5.eId, emp5);
		map.put(emp6.eId, emp6);
		//Printing the map values
		for (Map.Entry<Integer, Employe> o : map.entrySet()) {
			Employe value = o.getValue();
			System.out.println(o.getKey() + " " + value.name + "  " + value.salary);
		}
		ArrayList<Employe> list = new ArrayList(map.values());
		System.out.println("Enter by which field you want to sort (eId/name/salary)");
		Scanner sc = new Scanner(System.in);
		choice = sc.next();
		Collections.sort(list);
		System.out.println("The sorted list is: ");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Employe e = (Employe) itr.next();
			System.out.println(" " + e.eId + "  " + e.name + "  " + e.salary);
		}
	}
}

class Employe<T> implements Comparable<T> {

	int eId;
	String name;
	int salary;

	public Employe() {

	}

	public Employe(int eId, String name, int salary) {
		this.eId = eId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(T t) {
		Employe e1 = (Employe) t;
		if ("eId".equalsIgnoreCase(SortMap.choice)) {
			if (eId == e1.eId)
				return 0;
			else if (eId > e1.eId)
				return 1;
			else if (eId < e1.eId)
				return -1;
		} else if ("name".equalsIgnoreCase(SortMap.choice)) {
			return (this.name).compareTo(e1.name);
		} else if ("salary".equalsIgnoreCase(SortMap.choice)) {
			// For comparing salary
			if (salary == e1.salary)
				return 0;
			else if (salary > e1.salary)
				return 1;
			else
				return -1;
		}
		return -1;
	}
}
