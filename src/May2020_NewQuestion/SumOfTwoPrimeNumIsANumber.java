package May2020_NewQuestion;

import javax.swing.text.StyledEditorKit.BoldAction;

public class SumOfTwoPrimeNumIsANumber {

	public static void main(String[] args) 
	{
		// To find out a number can be expressed by adding two prime number.
		
		int num = 34;
		
		for(int j=1;j<=num/2;j++)
		{
		
			if(checkPrimeNumber(j))
			{
				if(checkPrimeNumber(num-j))
				{
					System.out.println(num +" = "+ j + " + " + (num-j));
				}
			}
		
		}

	}
	
	public static boolean checkPrimeNumber(int num)
	{
		boolean isprime = true;
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				isprime = false;
				return false;
			}
		}
		
		
		return true;
		
	}

}
