package Revision2020;

public class IntegerReverse 
{
	// % means reminder
	// / mean Answer
	
	public static void main(String[] args) 
	{
		int num = 123;
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println(rev);
		
		
		System.out.println("==================USING STRING BUFFER======================");
		
		int numb = 789;
		String number = String.valueOf(numb);
		
		StringBuffer sb = new StringBuffer(number);
		System.out.println(sb.reverse());
	}

}
