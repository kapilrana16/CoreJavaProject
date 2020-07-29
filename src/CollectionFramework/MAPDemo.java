package CollectionFramework;

import java.io.File;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MAPDemo {

	public static void main(String[] args) 
	{
		//Map<String, String> values = new TreeMap<String, String>(); // For sorting use TreeMap
		//Map<String, String> values = new Hashtable<String, String>(); // Thread safe / synchronized /slow
		
		Map<String, String> values = new HashMap<String, String>();   // not thread safe / fast
		
		values.put("name", "kapil");
		values.put("place", "ghaziabad@16");
		values.put("Borough", "mangattan");
		values.put("block", "01200");
		values.put("lot", "0021");
		values.put("name", "kapil");
		
		Set<String> set = values.keySet();
		
		for(String key : set)
		{
			System.out.println(key +":" + values.get(key));
			
		}
		
	
	}

}
