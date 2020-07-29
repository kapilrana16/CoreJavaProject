package RevisonJuly26;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DupValFromList_july {

	public static void main(String[] args) 
	{
		List<Object> list = Arrays.asList("anil","banil","anil","canil",1,1,2);
		
		Set<Object> set = new HashSet<Object>();
		for(Object a : list)
		{
			if(set.add(a)==false)
			{
				System.out.println("duplicte element:" + a);
			}
		}
				

	}

}
