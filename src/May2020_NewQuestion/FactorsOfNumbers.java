package May2020_NewQuestion;

public class FactorsOfNumbers 
{
	// 10 --> 1,2,5,10
	public static void main(String args[])
	{
	
	int num = 60;
	
	for(int i =1; i<=num; i++)
	{
		if(num%i==0)
		{
			System.out.print(i+" ");
		}
	}
	
	}
}
