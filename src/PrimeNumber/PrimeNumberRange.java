package PrimeNumber;

public class PrimeNumberRange
{

	int i = 0;
	
	public static void isPrimeNumber(int num) // 7
	{
		int i = 0;
		if(num<=1)
		{
			System.out.println(num + " is  not a prime number");
			
		}
		
		loop: for(int j = 2; j<=num; j++) // num 9
		{
				for(i=2; i<j; i++)
				{
					if(j%i==0)
					 {
						continue loop;
					 }
					
				}
				System.out.print(j + " ");
				
		}
				
	}
	
	public static void main(String[] args) 
	{
		isPrimeNumber(9);
	}
	

}
