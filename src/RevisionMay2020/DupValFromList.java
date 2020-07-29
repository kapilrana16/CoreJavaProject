package RevisionMay2020;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DupValFromList {

	public static void main(String[] args) 
	{
		List<Object> list = Arrays.asList("anil","banil","anil","canil",1,1,2);
		
		Map<Object,Integer> map = new HashMap<Object,Integer>();
		for(Object a : list)
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
		
		Set<Object> key = map.keySet();
		for(Object k :key)
		{
			if(map.get(k)>1)
			{
				System.out.println(k +" : "+ map.get(k));
			}
		}
		

	}

}
