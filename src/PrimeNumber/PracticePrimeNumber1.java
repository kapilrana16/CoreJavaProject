package PrimeNumber;

public class PracticePrimeNumber1 
{
	public static boolean getPrimeNumber(int num)
	{
		if(num <=1)
		{
			System.out.println(num + "not a prime number");
			return false;
			
		}
		
		for(int i =2; i<num; i++)
		{
			if(num%i==0)
				{
					System.out.println(num +" is not a prime number");
					return false;
				}
		}
		
		System.out.println(num + " is a prime number");
		return true;
	}

	
	
	
	public static void main(String[] args) 
	{
		getPrimeNumber(5);
		
	
	}

}
