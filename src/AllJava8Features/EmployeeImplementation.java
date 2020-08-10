package AllJava8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class EmployeeImplementation {

	public static void main(String[] args) 
	{ 
		
		ArrayList<Employee> l =  new ArrayList<Employee>();
		l.add(new Employee("Kapil", 234));
		l.add(new Employee("Anil", 434));
		l.add(new Employee("Snil", 134));
		l.add(new Employee("Tnil", 634));
		
		Comparator<Employee> c = (e1,e2) -> (e1.empnum<e2.empnum)?-1:(e1.empnum>e2.empnum)?+1:0; // Sorting according to Number
		Collections.sort(l, c);
		System.out.println(l);
		
		Comparator<Employee> c1 = (e1,e2) ->e1.empname.compareTo(e2.empname); // // Sorting according to Name
		Collections.sort(l, c1);
		System.out.println(l.get(0));   // get the value at particular Index
		l.stream().forEach(System.out::println);  // Iterating all values using stream API

	}

}
