package May2020_NewQuestion;

public class PowerConcept 
{
	public static void main(String args[])
	{
		int num = 2;
		int power = 5;
		long total = 1;
		while(power>0)
		{
			total = total*num;
			power = power-1;
		}
		System.out.println(total);
		
		System.out.println(Math.pow(2, 5)); // 2nd way using math class.
	}

}
