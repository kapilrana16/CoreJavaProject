package RevisionMay2020;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class FindDupCountIntValUsingEntrySet {

	public static void main(String[] args) 
	{
		int[] value = {1,2,2,3,4,5,2,4,2,-2,-2};
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Integer a : value)
		{
			Integer count = map.get(a);
			if(map.get(a)==null)
			{
				map.put(a, 1);
			}
			else
			{
				map.put(a, ++count);
			}
		}	
		
		Set<Entry<Integer, Integer>>  set = map.entrySet();
		for(Entry<Integer, Integer> k : set)
		{
			if(k.getValue()>1)
			{
				System.out.println(k.getKey() + " : " + k.getValue());
			}
		}
			
		
		
		
		

	}

}
