package RevisionMarch2020;

import java.util.HashMap;
import java.util.Set;

public class DupeIntegerVal {

	public static void main(String[] args) 
	{
		int[] value = {1,2,2,3,4,5,2,4,2};
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Integer a : value)
		{
			Integer counter = map.get(a);
			if(map.get(a)==null)
			{
				map.put(a, 1);
			}
			else
			{
				map.put(a,++counter);
			}
		}
		
		Set<Integer> set = map.keySet();
		for(int key : set)
		{
			if(map.get(key)>1)
			{
				System.out.println(key +":"+ map.get(key));
			}
		}
		
		

	}

}
