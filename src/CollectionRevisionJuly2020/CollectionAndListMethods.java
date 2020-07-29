package CollectionRevisionJuly2020;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionAndListMethods {

	public static void main(String[] args) 
	{
		
		Collection<Integer> c = new ArrayList<Integer>();
		c.add(1);
		c.add(3);
		c.add(2);
		c.remove(1);  // Work on value.
		// Collections.sort(c);
		
		for(Integer a : c)
		{
			System.out.println(a);
		}
		
		
		System.out.println("======================================================");
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(14);
		list.add(13);
		list.add(12);
		list.add(0, 11); // There is no method in Collection Interface that can add value at particular index.
		list.remove(0);  // works on index

		Collections.sort(list); // The method sort only support list objects not collection.
		Collections.reverse(list); // The method sort only support list objects not collection.
		int num = list.get(0);
		System.out.println("The num is:" + num);
		for(Integer b : list)
		{
			System.out.println(b);
		}

	}

}
