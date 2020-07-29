package DuplicateElementsInJavaArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsInJavaArray {

	public static void main(String[] args) 
	{
		String[] names = {"kapil","Anil","Sunil","Usha","Suresh","kapil","Suresh","pawan","Suresh"};
		
		//1. Using loops:
		int len = names.length;
		
		for(int i=0; i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(names[i].equalsIgnoreCase(names[j]))
				{
					System.out.println("the duplicate name is "+ names[i]);
				}	
			}
			
		}	
		
		System.out.println("***************Using HashSet******************");
		
		//2. Using HashSet:
		Set<String> set = new HashSet<String>();
		for(String name : names)
			{
				if(set.add(name)== false)
				{
					System.out.println("the duplicate name is "+ name);
				}
			}
		
		System.out.println("**************Using HashMap*******************");
		
		//3. Using HashMap: Map cannot contain duplicate keys and it stores in Key,Value pair.
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		for(String name: names)
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
		Set<String> key = map.keySet();
		for(String k : key)
		{
			int value = map.get(k);
			if(value>1)
			{
				System.out.println("Duplicate word is " + k +" and the count is " + value);
			}
		}
		
		/*
		 * Set<Entry<String,Integer>> dataset = map.entrySet();
		 * for(Entry<String,Integer> entry : dataset) 
		 * { 
		 * 		if(entry.getValue()>1) 
		 * 			{
		 * 				System.out.println("Duplicate name is "+ entry.getKey());
		 *  		} 
		 *  }
		 */
	}

}
