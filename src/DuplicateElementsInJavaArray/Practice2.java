package DuplicateElementsInJavaArray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice2 {

	public static void main(String[] args)
	{
		String[] names = {"kapil","anil","sunil","rohit","kapil","sapna","usha","rohit"};
		
		// 1. Using HastSet:
		
		HashSet<String> set = new HashSet<String>();
		for(String name: names)
		 {
			if(set.add(name)== false)
			 {
				System.out.println(name);
			 }
		 }
		
		
		System.out.println("------------------------------------------------------");
		// 2. Using HashMap
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String name:names)
		 {
			Integer count = map.get(name);
			if(count==null)
			 {
				map.put(name, 1);
			 }
			else
			{
				map.put(name, ++count);
			}
		 }
		
		Set<Entry<String, Integer>> dataset =  map.entrySet();
		for(Entry<String, Integer> data : dataset)
			{
				if(data.getValue()>1)
					System.out.println(data.getKey());
			}
		
		
	}

}
