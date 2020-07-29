package RevisonFeb2020;

import java.util.HashMap;
import java.util.Set;

public class DuplicateIntValue {

	public static void main(String[] args) 
	{
		int[] value = {1,2,2,3,4,5,2,4,2,-2,-2};
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Integer num : value)
		{
			Integer count = map.get(num);
			if(map.get(num)==null)
			{
				map.put(num, 1);
			}
			else
			{
				map.put(num, ++count);
			}
		}
		
		Set<Integer> set = map.keySet();
		for(Integer key : set)
		{
			if(map.get(key)>1)
			{
				System.out.println(key + " : " + map.get(key) );
			}
		}
		
		
		
		
		
		
		

	}

}
