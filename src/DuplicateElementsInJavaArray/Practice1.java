package DuplicateElementsInJavaArray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice1 {

	public static void main(String[] args) 
	{
		String[] names = {"kapil","Anil","Sunil","Usha","Suresh","kapil","Suresh","pawan"};
		
		//1. Using HashSet:
		Set<String> set = new  HashSet<String>();
		for(String name : names)
		{
			if(set.add(name)== false)
			{
				System.out.println("Duplicate name is " + name);
			}
		}
		
		// 2. Using HashMap:
		Map<String, Integer> map = new  HashMap<String, Integer>();
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
		for(Entry<String, Integer> entry : dataset)
			{
				if(entry.getValue()>1)
				{
					System.out.println("duplicate names are : " + entry.getKey());
				}
			}
		
	}

}
