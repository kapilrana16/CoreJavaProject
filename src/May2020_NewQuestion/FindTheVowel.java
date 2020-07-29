package May2020_NewQuestion;

import java.util.Arrays;
import java.util.List;

public class FindTheVowel {

	public static void main(String[] args) 
	{
		// Type 1
		char c = 'b';
		
		if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u')
		{
			System.out.println("Char is vowel");
		}
		else
		{
			System.out.println("Char is consonant");
		}
		
		// Type 2
		
		switch (c) 
		{
		case 'a':
			System.out.println("Char is vowel");
			break;
		case 'e':
			System.out.println("Char is vowel");
			break;
		case 'i':
			System.out.println("Char is vowel");
			break;
		case 'o':
			System.out.println("Char is vowel");
			break;
		case 'u':
			System.out.println("Char is vowel");
			break;

		default:
			System.out.println("Char is not a vowel");
		}
		
		
		// Type 3 : Using Array list
		
		System.out.println("*************Using Array list************");
		
		char s = 'n';
		List<Character> list = Arrays.asList('a','e','i');
		for(char ch : list)
		{
			if(ch==s)
			{
				System.out.println("This charatcer is a vowel");
				return;
			}
			
		}
		System.out.println("Not a vowel");
		
	}

}
