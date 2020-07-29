package RevisionMay2020;

public class FindPrimeNumb {

	public static void main(String[] args) 
	{
		int num = 13;
		if(num<=1)
		{
			System.out.println("Number is not a prime number");

		}
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				System.out.println(num + " is not a prime number");
				return;
			}
		}
		System.out.println(num +" is a prime number");
			
	}

}
