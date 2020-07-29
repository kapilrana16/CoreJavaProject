package RevisionMarch2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class StringSorting {

	public static void main(String[] args) 
	{
		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul","aug", "Sep", "Oct", "nov", "Dec"};
		
		List<String> mon = new ArrayList<String>();
		for(String a : inputList)
		{
			mon.add(a);
			
		}
		Collections.sort(mon, String.CASE_INSENSITIVE_ORDER);
		System.out.println(mon);

	}

}
