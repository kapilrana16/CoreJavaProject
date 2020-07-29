package Revision2020;

public class TestPalindromeNumber {

	public static void main(String[] args) 
	{
		int num = 351;
		
		int num1 = num;
		
		int newnum = 0;
		
		while(num1!=0)
		{
			newnum = newnum*10 + num1%10;
			num1 = num1/10;
		}
		
		System.out.println("num is: " + num);
		System.out.println("Newnum is: " + newnum);
		
		if(num == newnum)
		{
			System.out.println("Number is palindrome number");
			return;
		}
		
		System.out.println("Number is not a palidrome number");
		
		
		
		System.out.println("======================using String buffer==================================");
		
		int z = 351;
		String k = String.valueOf(z);
		StringBuffer sb = new StringBuffer(k);
		String rev = sb.reverse().toString();
		if(k.equals(rev))
			{
				System.out.println(z + " is palindrome number");
			}
		System.out.println(z + " is not a palindrome number");
		
	}

}
