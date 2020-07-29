package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) 
	{
		List<Integer> values = new ArrayList<Integer>();
		values.add(1);
		values.add(5);
		values.add(3);
		values.add(5);
		
		
		Collections.sort(values); // Sort is a method that is available in Collections class and can apply on List objects.
		values.add(2, 2);  
		values.remove(1);
		Collections.replaceAll(values, 5, 2); // This method that is available in Collections class and can apply on List objects.
		
		for(int i : values)
		{
			System.out.println("values : " + i);
		} 
		
		
		ArrayList<Integer> values1 = new ArrayList<Integer>();
		values1.add(10);
		values1.add(4);
		values1.add(5);
		values1.add(2);
		
		
		System.out.println(values1.size());
		
		Collections.sort(values1);
		for(int i : values1)
		{
			System.out.println("values1 : " + i);
		} 
		
	}

}
