package PrimeNumber;

public class PracticePrimeNumber 
{

	public static boolean isPrimeNUmber(int num)
	{
		if(num<=1)
			{
			 	System.out.println(num + "is not a prime number");
			}
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
				{
					System.out.println(num + " is not a prime number");
					return false;
				}
			
		}
		
		System.out.println(num + " is a prime number");
		return true;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		isPrimeNUmber(9);

	}

}
