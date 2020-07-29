package RevisionMarch2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class DuplicateStringValuefromList {

	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("a","b","a","c","1","1","1");
		
		HashMap<String, Integer> map =  new HashMap<String, Integer>();
		
		for(String a : list)
		{
			Integer counter = map.get(a);
			System.out.println(counter);
			if(map.get(a)==null)
			{
				map.put(a, 1);
			}
			else
			{
				map.put(a, ++counter);
			}
				
		}
		
		Set<String> set = map.keySet();
		for(String key : set)
		{
			if(map.get(key)>1)
			{
				System.out.println(key +":"+ map.get(key));
			}
		}
		

	}

}
