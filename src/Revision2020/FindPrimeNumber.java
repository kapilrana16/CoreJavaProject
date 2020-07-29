package Revision2020;

public class FindPrimeNumber {

	public static void main(String[] args) 
	{
		int num = 4;
		
		if(num<=1)
		{
			System.out.println(num +" is not a prime number");
		}
		
		for(int i =2; i<num;i++)
		{
			if(num%i==0) 
				{
					System.out.println(num +" is not a prime number");
					break;
				}
		  
		}
		System.out.println(num +" is a prime number");
	}

}
