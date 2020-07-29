package Revision2020;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordInString {

	public static void main(String[] args) 
	{
		String str = "Kapil rana is best and best is kapil best";
		
		String[] arrnames = str.split(" ");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String name : arrnames)
		{
			Integer count = map.get(name);
			if(count==null)
			{
				map.put(name.toLowerCase(), 1);
			}
			else
			{
				map.put(name.toLowerCase(), ++count);
			}
		}
		
		Set<Entry<String, Integer>> set = map.entrySet();
		
		for(Entry<String, Integer> words : set)
		{
			if(words.getValue()>1)
			{
				System.out.println(words);
			}
		}
		

	}

}
