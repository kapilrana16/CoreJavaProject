package PrimeNumber;

public class PrimeNumber 
{
	public static boolean isPrimeNumber(int num) // 5
	{
		if(num<=1)
		{
			System.out.println(num + " is  not a prime number");
			return false;
			
		}
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)	
			 {
				System.out.println(num + " is  not a prime number");
				return false;
				
			 }
		}
		System.out.println(num + " is a prime number");
		return true;
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		isPrimeNumber(4);
	}

}
