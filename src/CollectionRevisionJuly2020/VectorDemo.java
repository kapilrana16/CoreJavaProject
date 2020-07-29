package CollectionRevisionJuly2020;

import java.util.Vector;

public class VectorDemo {

	// Dynamic Array, Came in JDK 1.0 and List came in 1.2
	// Array List --> Increase capacity by 50% / not thread safe / fast
	// Vector --> Increase capacity by 100% / thread safe /slow
	
	public static void main(String[] args) 
	{
		Vector<Integer> v = new Vector();
		v.add(3);
		v.add(2);
		v.add(0, 6);
		
		int cap = v.capacity();
		System.out.println(cap);
		
		int size = v.size();
		System.out.println(size);
		
		
		v.forEach(System.out::println);

	}

}
