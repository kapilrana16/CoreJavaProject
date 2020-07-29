package RevisonFeb2020;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicValuefromList {

	public static void main(String[] args) 
	{
		List<Object> list = Arrays.asList("a","b","a","c","1","1","1");
		
		
		Set<Object> set = new HashSet<Object>();
		for(Object val : list)
		{
			if(set.add(val)==false)
			{
				System.out.print(val + " ");
			}
			
		}

	}

}
