package ReverseInteger;

public class RevReverseInteger {

	public static void main(String[] args) 
	{
		int num = 1234;
		int rev = 0;
		
		
		while(num!=0)
		{
			rev = rev*10+num%10; //4
			num = num/10;
		}
		System.out.println(rev);
	}

}
