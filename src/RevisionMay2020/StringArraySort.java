package RevisionMay2020;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StringArraySort {

	public static void main(String[] args) 
	{
		// Type 1: Using Array
		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul","aug", "Sep", "Oct", "nov", "Dec"};
		Arrays.sort(inputList,String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(inputList));
		
		//Type 2: Using Array List
		
		String[] input = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul","aug", "Sep", "Oct", "nov", "Dec"};
		input[0] = "nonu";
		List<String> list1 = new ArrayList<String>();
		for(String a : input)
		{
			list1.add(a);
		}
		Collections.sort(list1,String.CASE_INSENSITIVE_ORDER);
		Collections.reverse(list1);                             // Reverse function
		System.out.println(list1);
		
		//Type 3: Using Set
		
		String[] value = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul","aug", "Sep", "Oct", "nov", "Dec"};
		value[0] = "nonu";
		Set<String> set = new TreeSet<String>();
		for(String b : value)
		{
			set.add(b);
		}
		
		System.out.println(set);
		
	}

}
