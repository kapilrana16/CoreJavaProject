package RevisionMarch2020;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class DuplicateIntegerValueFromList {

	public static void main(String[] args) 
	{
		List<Object> list = Arrays.asList("a","b","a","c","1",1,1);
		HashMap<Object, Integer> map = new HashMap<Object, Integer>();
		for(Object a : list)
		{
			Integer count = map.get(a); /// this giving me null every time..
			//System.out.println(count);
			if(map.get(a)==null)
			{
				map.put(a, 1);
			}
			else
			{
				map.put(a, ++count);
			}
		}
		
		Set<Object> set = map.keySet();
		for(Object k : set)
		{
			if(map.get(k)>1)
			{
				System.out.println(k + " : " + map.get(k));
			}
		}

	}

}
