package RevisionMarch2020;

public class FabonacciSeries {

	public static void main(String[] args) 
	{
		int a=0,b=1,c;
		int num = 20;
		
		System.out.print(a + " " + b);
		for(int i = 2; i<num; i++)
		{
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}

	}

}
