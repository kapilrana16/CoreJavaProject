package RevisonJuly26;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDupCountIntValUsingEntrySet_july {

	public static void main(String[] args) 
	{
		int[] value = {1,2,2,3,4,5,2,4,2,-2,-2};
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(Integer a : value)
		{
			Integer count = map.get(a);
			if(count==null)
			{
				map.put(a, 1);
			}
			else
			{
				map.put(a, ++count);
			}
		}
		
		Set<Entry<Integer, Integer>> keyset = map.entrySet();
		for(Entry<Integer, Integer> k : keyset)
		{
			
			if(k.getValue()>1)
			{
				
				System.out.println(k +" and the count is " + map.get(k));
			}
		}
	}

	}

