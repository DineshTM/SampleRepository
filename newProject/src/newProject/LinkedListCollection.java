package newProject;
import java.util.*;
public class LinkedListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList<String> list =new LinkedList<String>();
      list.add("suresh");
      list.add("ramesh");
      list.addLast("mahesh");
      list.add("ganesh");
      list.add("mahesh");
      list.add("aadhvik");
      list.add(2,"selvam");
      System.out.println("List is "+list);
      list.addFirst("amul");
      System.out.println("List is "+list);
      System.out.println("last index of "+list.lastIndexOf("mahesh"));
      System.out.println("is list contains aadhvik :"+list.contains("aadhvik"));
      System.out.println();
      Iterator<String> itr = list.iterator();
      while(itr.hasNext()) {
    	  System.out.println(itr.next());
      }
	}
}
