package RevisionMarch2020;

import java.util.HashSet;

public class DupeIntegerValue {

	public static void main(String[] args) 
	{
		int[] value = {1,2,2,3,4,5,2,4,2};
		
		HashSet<Integer> has = new HashSet<Integer>();
		for(int a : value)
		{
			if(has.add(a)==false)
			{
				System.out.println(a + "is Duplicate");
			}
		}
		

	}

}
