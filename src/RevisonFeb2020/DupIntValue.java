package RevisonFeb2020;

import java.util.HashSet;

public class DupIntValue {

	public static void main(String[] args) 
	{
		int[] value = {1,2,2,3,4,5,2,4,2};
		HashSet<Integer> set =  new HashSet<Integer>();
		for(Integer num : value)
			{
				if(set.add(num)==false)
				{
					System.out.println(num + " is a duplicate number");
				}
			}
		
		

	}

}
