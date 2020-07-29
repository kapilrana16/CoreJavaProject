package RevisonFeb2020;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FirstTwoMaxValues {

	public static void main(String[] args) 
	{
		int arr[] = { 15, 24, 48, 21, 43, 11, 79, 93, 93, 79};
		
//		Arrays.sort(arr);
//		int len = arr.length;
//		for(int i = len-1; i>=len-2; i--)
//		{
//			System.out.println(arr[i]);
//		}
		
		Set<Integer> set = new TreeSet<Integer>();
		for(int num : arr)
		{
			set.add(num);
		}
		
		Object a[] = set.toArray();
		int count = a.length;
		for(int i = count-1; i>=count-2; i--)
		{
			System.out.println(arr[i]);
		}
		

	}

}
