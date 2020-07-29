package PalindromeNumber;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		
		int a = 252;
		
		String b = String.valueOf(a);
		
		StringBuffer sb = new StringBuffer(b);
		StringBuffer c = sb.reverse();
		String d = c.toString();
		
		if (b.equals(d))
		{
			System.out.println("the number is palindrome number");
		}
		
		else
		{
			System.out.println("The number is not a palindrome number");
		}

	}

}
