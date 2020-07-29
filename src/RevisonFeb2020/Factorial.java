package RevisonFeb2020;

public class Factorial {

	public static void main(String[] args) 
	{
		int num = 4; // 4*3*2*1
		int fact = 1;
		
		while(num>0)
		{
			fact = fact * num;
			num = num -1;
		}
		System.out.println(fact);

	}

}
