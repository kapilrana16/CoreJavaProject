package RevisionMay2020;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class FindFirst2MaxValue {

	public static void main(String[] args) 
	{
		int arr[] = { 15, 24, 48, 21, 43, 11, 79, 99, 93, 99};
		
		// First method
		
		Arrays.sort(arr);
		int size = arr.length;
		for(int i = size-1; i>=size-2; i--)
		{
			System.out.println(arr[i]);
		}
		
		// Second method
			
		int arry[] = { 15, 24, 48, 21, 43, 11, 79, 109, 101, 109};
		
		TreeSet<Integer> set1 =  new TreeSet<Integer>();
		for(int a : arry)
		{
			set1.add(a);
		}
		
		//System.out.println(set1);
		
		TreeSet<Integer> reverseset = (TreeSet<Integer>) set1.descendingSet();
		
		Object[] values = reverseset.toArray();
		//int len = values.length;
		for(int i=0; i<=1; i++)
		{
			System.out.println(values[i]);
		}
	
	}
}
