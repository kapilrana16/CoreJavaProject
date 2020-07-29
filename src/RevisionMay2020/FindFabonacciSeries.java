package RevisionMay2020;

public class FindFabonacciSeries {

	public static void main(String[] args) 
	{
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b);
		int num = 10;
		for(int i =2; i<=num; i++)
		{
			int c = a + b;
			a = b;
			b = c;
			System.out.print(" "+c);
			
		}

	}

}
