package ReverseInteger;

public class ReverseInteger {

	
	public static void main(String[] args) 
	{
		// 1. First Solution 
		int num = 123;
		int rev=0;
		
		while(num!=0)
			{
				rev = rev * 10 + num % 10; // 
				num = num / 10; // 
			}
		
		System.out.println("the reverse number is :" + rev);
		
		// Using StringBuffer method
		
		int num1 = 23456;
		String a = String.valueOf(num1); // Converting integer to string.
		System.out.println(a);
		
		StringBuffer sb = new StringBuffer(a);
		StringBuffer a1 = sb.reverse();
		System.out.println("2nd output " +a1);
		
		

	}

}
