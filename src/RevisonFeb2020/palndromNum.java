package RevisonFeb2020;

public class palndromNum 
{
	public static void main(String args[])
	{
		int num = 121;
		int new_num = num;
		int palnum = 0;
		
		while(new_num>0)
		{
			palnum = palnum*10 + new_num%10; 
			new_num = new_num/10;
		}
		
		if(num == palnum)
		{
			System.out.println("number is pallindrone number");
		}
	}
}
