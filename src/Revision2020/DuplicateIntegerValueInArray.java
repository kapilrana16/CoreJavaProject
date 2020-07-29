package Revision2020;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateIntegerValueInArray {

	public static void main(String[] args) 
	{
		int[] value = {1,2,2,3,4,5,2,4,2};
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int a : value)
		{
			Integer counter =map.get(a);
			if(counter==null)
			{
				map.put(a, 1);
			}
			else
			{
				map.put(a, ++counter);
			}
		}
		
		Set<Integer> key = map.keySet();
		for(Integer k : key)
		{
			Integer count = map.get(k);
			//System.out.println(count);
			if(count>1)
			{
				System.out.println(k + " : " + map.get(k));
			}
		
		}
		
		HashSet<Integer> set = new HashSet<>();
		for(Integer num : value)
		{
			if(set.add(num)==false)
			{
				System.out.println("Duplicate value is:" + num);
			}
		}
		
		
	
	}

}
