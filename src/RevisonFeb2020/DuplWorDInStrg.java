package RevisonFeb2020;

import java.util.HashSet;
import java.util.Set;

public class DuplWorDInStrg {

	public static void main(String[] args) 
	{

		String str = "Kapil rana is best and best is Kapil best";
		String arr[] = str.split(" ");
		
		Set<String> set =  new HashSet<String>();
		for(String name : arr)
		{
			if(set.add(name)==false)
			{
				System.out.println(name +" is duplicate");
			}
		}
		

	}

}
