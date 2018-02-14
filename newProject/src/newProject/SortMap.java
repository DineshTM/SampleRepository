package newProject;

import java.util.*;

class Employe{
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
}

public class SortMap {
	public static void main(String args[]) {
		SortMap ob = new SortMap();
		Employe obj = new Employe();
		Employe emp = new Employe(123, "Dinesh", 1234);
		Map<Integer, Employe> map = new HashMap<Integer, Employe>();
		map.put(emp.eId, emp);
		Employe emp1 = new Employe(124, "arul", 1200);
		Employe emp2 = new Employe(115, "mahesh", 1234);
		Employe emp3 = new Employe(106, "siva", 1256);
		Employe emp4 = new Employe(127, "amalraj", 1267);
		Employe emp5 = new Employe(118, "stefenraj", 1245);
		Employe emp6 = new Employe(179, "dhanraj", 1278);
		map.put(emp1.eId, emp1);
		map.put(emp2.eId, emp2);
		map.put(emp3.eId, emp3);
		map.put(emp4.eId, emp4);
		map.put(emp5.eId, emp5);
		map.put(emp6.eId, emp6);

		for (Map.Entry<Integer, Employe> o : map.entrySet()) {
			int key = o.getKey();
			Employe value = o.getValue();
			System.out.println(key + " " + value.name + "  " + value.salary);
		}
		ob.get(map);

	}

	public void get(Map map) {
		ArrayList<Employe> list = new ArrayList<Employe>(map.entrySet());
		Collections.sort(list, new MyComparator() );
		System.out.println(list);
		//easy job to sort the keys 
		ArrayList list1 = new ArrayList(map.keySet());
		Collections.sort(list1);
		System.out.println(list1);
	}
}
class MyComparator implements Comparator<Employe>{
	public int compare(Employe e1,Employe e2) {
		return (e1.name).compareTo(e2.name);
	}
}