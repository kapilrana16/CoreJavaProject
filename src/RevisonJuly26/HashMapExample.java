package RevisonJuly26;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args)
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		
		Set<String> kset =  map.keySet();
		for(String a : kset)
		{
			System.out.println(a + " : " +map.get(a));
		}
		
		map.forEach((k,v)->System.out.println("Key "+ k +", value " + v));
		

	}

}
