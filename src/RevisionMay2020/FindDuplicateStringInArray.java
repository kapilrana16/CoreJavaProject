package RevisionMay2020;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateStringInArray {

	public static void main(String[] args) 
	{
		String str = "Kapil rana is best and best is Kapil best";
		
		String arr[] = str.split(" ");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String name : arr)
		{
			Integer count = map.get(name);
			if(map.get(name)==null)
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
			if(map.get(k)>1)
			{
				System.out.println(k +" : " + map.get(k));
			}
		}
	}

}
