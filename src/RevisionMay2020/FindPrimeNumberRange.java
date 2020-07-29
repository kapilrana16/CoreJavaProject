package RevisionMay2020;

public class FindPrimeNumberRange {

	public static void main(String[] args) 
	{
		int num = 20;
		//int i = 6;
		if(num<=1)
		{
			System.out.println("num is not a prime number");
		}
		
		loop:for(int i=2; i<=num; i++)
		{
			for(int j=2; j<i;j++)
			{
				if(i%j==0)
				{
					continue loop;
				}
			}
			
			System.out.print(i + " ");
		}
		

	}

}
