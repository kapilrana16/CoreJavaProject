package May2020_NewQuestion;

public class NumberOfDigitInNumber {

	public static void main(String[] args) 
	{
		int num = 12345;
		int count = 0;
		while(num>0)
		{
			count = count + 1;
			num = num/10;
			//System.out.println(num);
			
		}
		System.out.println(count);
	}

}
