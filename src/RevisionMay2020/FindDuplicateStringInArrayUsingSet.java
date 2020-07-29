package RevisionMay2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class FindDuplicateStringInArrayUsingSet {

	public static void main(String[] args) 
	{
		String str = "Kapil rana is best and best is Kapil best";
		
		String arr[] = str.split(" ");
		
		Set<String> set = new LinkedHashSet<String>();
		for(String k : arr)
		{
			if(set.add(k)==false)
			{
				System.out.println("Duplicate word is " + k);
			}
		}
		
		System.out.println("========Set===========");
		List<Integer> list = Arrays.asList(1,5,2,3,9,5,8,4);
		
		Set<Integer> set1 = new LinkedHashSet<Integer>();
		for(Integer a : list)
		{
			set1.add(a);
		}
		System.out.println(set1);
		
		
		System.out.println("**********LIST*************");
		List<Integer> list1 = Arrays.asList(9,6,6,1,5,2,8);
		
		List<Integer> list2 = new ArrayList<Integer>();
		for(int b : list1)
		{
			list2.add(b);
		}
		//Collections.sort(list2);
		System.out.println(list2);
		
		
		
		
		

	}

}
