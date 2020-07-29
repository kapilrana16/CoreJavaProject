package RevisonFeb2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringSort {

	public static void main(String[] args)
	{
		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul","aug", "Sep", "Oct", "nov", "Dec"};

		
		ArrayList<String> mon = new ArrayList<String>();
		for(String a : inputList)
		{
			mon.add(a);
			Collections.sort(mon, String.CASE_INSENSITIVE_ORDER);
		}
		System.out.println(mon);
		
		
		

	}

}
