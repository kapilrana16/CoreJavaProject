package RevisonJuly26;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharInWord {

	public static void main(String[] args) 
	{
	
		String name = "kapilranan";
		
		int len = name.length(); // 9
		
		System.out.println(len);
		Set<Character> set = new HashSet<Character>();
		for(int i=0;i<len;i++)
		{
			char a = name.charAt(i);
			//System.out.println(a);
			if(set.add(a)==false)
			{
				System.out.println("Duplicate char " + a);
			}
		}
		
		
			
			
			
		

	}

}
