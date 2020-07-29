package RevisionMarch2020;

import java.util.Set;
import java.util.TreeSet;

public class FindFirst2MaxValue {

	public static void main(String[] args) 
	{
		int arr[] = { 150, 24, 48, 21, 43, 11, 79, 93, 93, 79};
		
		Set<Integer> set =  new TreeSet<Integer>();
		for(int a : arr)
		{
			if(!set.add(a)==false)
			{
				set.add(a);
			}
		}
		
		Object sortedarray[] = set.toArray();
		int len = sortedarray.length;
		for(int i =len-1; i>=len-2; i--)
		{
			System.out.println(sortedarray[i]);
		}

	}

}
