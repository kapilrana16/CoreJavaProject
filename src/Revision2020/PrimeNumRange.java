package Revision2020;

public class PrimeNumRange {

	public static void main(String[] args) 
	{
		int num = 19;
		
		if(num<=1)
			{
				System.out.println(num + " is not a prime number");
			}
		
		for(int i=2; i<=num;i++) // i = 6
			{
				for(int j=2;j<i;j++)
					{
						if(i%j==0) // 6/2
							{
								//System.out.println(i +" is not a prime number");
								break;
							}
					}
				System.out.print(i + " ");
			}

	}

}
