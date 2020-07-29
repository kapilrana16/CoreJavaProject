package May2020_NewQuestion;

public class FindTheLargestNumber {

	public static void main(String[] args) 
	{
		int x = 2000;
		int y = 3000;
		int z = 4000;
		
		if(x==y && x==z)
		{
			System.out.println("All value are same");
		}
		
		else if(x>y && x>z)
		{
			System.out.println("X is greatest");
		}
		
		else if(y>z)
		{
			System.out.println("Y is greatest");
		}
		else
		{
			System.out.println("Z is greatest");
		}
		
	}

}
