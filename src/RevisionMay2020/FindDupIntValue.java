package RevisionMay2020;

import java.util.HashSet;
import java.util.Set;

public class FindDupIntValue {

	public static void main(String[] args) 
	{
		
		int[] value = {1,2,2,3,4,5,2,4,2};
		
		Set<Integer> val = new HashSet<Integer>();
		for(int a : value)
		{
			if(val.add(a)==false)
			{
				System.out.println("Duplicate Value " + a);
			}
		}

	}

}
