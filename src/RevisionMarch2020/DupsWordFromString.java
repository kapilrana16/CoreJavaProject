package RevisionMarch2020;

import java.util.HashSet;
import java.util.Set;

public class DupsWordFromString {

	public static void main(String[] args) 
	{
		String str = "Kapil rana is best and best is Kapil best";
		String word[] = str.split(" ");
		
		Set<String> set = new HashSet<String>();
		for(String a : word)
		{
			if(set.add(a)==false)
			{
				System.out.print(a + " ");
			}
		}

	}

}
