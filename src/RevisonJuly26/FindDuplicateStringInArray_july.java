package RevisonJuly26;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateStringInArray_july {

	public static void main(String[] args) 
	{
		String str = "Kapil rana is best and best is Kapil best";
		
		String arr[] = str.split(" ");
		Set set =  new HashSet();
		for(String s : arr)
		{
			if(set.add(s)==false)
			{
				System.out.println("Duplicate word " + s);
			}
		}
		

	}

}
