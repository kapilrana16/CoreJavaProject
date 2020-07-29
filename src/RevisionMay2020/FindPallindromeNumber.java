package RevisionMay2020;

public class FindPallindromeNumber {

	public static void main(String[] args) 
	{
		int orgnum = 151;
		int num = orgnum;
		int newnum=0;
		
		while(num>0)
		{
			newnum = newnum*10 + num%10;
			num = num/10;
		}
		
		if(orgnum==newnum)
		{
			System.out.println("Number is pallindrme number");
		}

	}

}
