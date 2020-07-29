package DuplicateWordCountInString;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args)
	
	{
		
		String str = "Kapil rana is best and best is kapil best";
		
		String[] strarray = str.split(" ");   
		
		Map<String, Integer> map = new  HashMap<String,Integer>();
		for(String word : strarray)
		{
			Integer count = map.get(word);
			if(count==null)
			{
				map.put(word.toLowerCase(), 1);
			}
			else
			{
				map.put(word.toLowerCase(), ++count);
			}
		}
		
		 Set<Entry<String, Integer>> set =  map.entrySet();
		 
		for(Entry<String, Integer> recordSet : set)
		{
			if(recordSet.getValue()>1)
			{
				System.out.println(recordSet.getKey()+" and count is " + recordSet.getValue());
			}
		}
		
	}

}
