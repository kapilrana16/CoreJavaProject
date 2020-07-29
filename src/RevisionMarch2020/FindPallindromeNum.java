package RevisionMarch2020;

public class FindPallindromeNum {

	public static void main(String[] args) 
	{
		int num = 123;
		int newnum = 0;
		
		while(num>0)
		{
			newnum = newnum*10 + num%10;
			num = num/10;
		}
		System.out.println(newnum);
	}

}
