package RevisonFeb2020;

import java.util.HashMap;
import java.util.Set;

public class DuplWorDInString {

	public static void main(String[] args) 
	{
		String str = "Kapil rana is best and best is Kapil best";
		String arr[] = str.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String name : arr)
		{
			Integer counter = map.get(name);
			if(map.get(name)==null)
			{
				map.put(name,1);
			}
			else
			{
				map.put(name,++counter);
				
			}
			
		}
		
		Set<String> keys =  map.keySet();
		for(String key : keys)
		{
			if(map.get(key)>1)
			{
				System.out.println(key + " : " + map.get(key));
			}
		}
	}

}
