package RevisonJuly26;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDupIntValue_keySet 
{
	
	public static void main(String args[])
	{
		List<Integer> list = Arrays.asList(1,2,2,3,4,5,2,4,2);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	 
		for(Integer a : list )
		{
			Integer count = map.get(a);
			if(map.get(a)==null)
			{
				map.put(a, 1);
			}
			else
			{
				map.put(a, ++count);
			}
		}
		Set<Integer> key = map.keySet();
		for(Integer k : key)
		{
			if(map.get(k)>1)
			{
				System.out.println(k +" value is "+ map.get(k));
			}
		}
	}

}
