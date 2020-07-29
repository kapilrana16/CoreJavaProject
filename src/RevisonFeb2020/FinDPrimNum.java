package RevisonFeb2020;

public class FinDPrimNum {

	public static void main(String[] args) 
	{
		int num = -1;
		
		if(num<=1)
		{
			System.out.println("Number is not a prime number");
			return;
		}
		
		for(int i =2; i<num; i++)
		{
			if(num%i==0)
			{
				System.out.println("Number is not a prime number");
				return;
			}
			
		}
		System.out.println("num is prime number");

	}

}
