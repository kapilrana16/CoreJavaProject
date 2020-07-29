package PrimeNumber;

public class PracticePrimeNumberRange {

	public static void isPrime(int num)
	{
		if(num<=1)
		{
			System.out.println(num + " is not a prime number");
		}
		
		kapil: for(int i=2; i<=num; i++)
			{
				for(int j=2; j<i; j++)
				{
					if(i%j==0)
					{
						continue kapil;
					}
				}
				
				System.out.println(i + "is a prime number");
			}
		
	}
	
	
	
	public static void main(String[] args) 
	{
		isPrime(20);

	}

}
