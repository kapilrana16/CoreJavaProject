package StringManipulation;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) 
	{
		String str = "My name is kapil Rana";
		String str1 = "My name is kapil Rana";
		
		System.out.println(str.length());  // to find the length
		
		System.out.println(str.charAt(6)); // to find the charater at index 6
		
		System.out.println(str.indexOf('a')); // Finding the index of character. 1st occurrence
		
		System.out.println(str.indexOf('a', 5)); // 2nd occurrence of a
		
		System.out.println(str.indexOf("is"));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str.substring(11, 21)); // to get the substring
		
		System.out.println(str.trim());
		
		System.out.println(str1.replace(" ", ""));
		
		// Very very Important
		String str2 = "Jindgi_jhand_fir_bhi_ghamand";
		String[] stringarray = str2.split("_");
		//System.out.println(stringarray);
		System.out.println(Arrays.toString(stringarray));
		
		
		System.out.println(str.concat( " ji"));
		

	}

}
 
