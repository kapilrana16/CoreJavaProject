package RevisonFeb2020;

public class FinDPrimNumrange {

	public static void main(String[] args) 
	{
		int num =20;
		
		if(num<=1)
		{
			System.out.println(num + "Number is not a prime number");
			return;
		}
		
		loop:for(int i =2; i<=num; i++)
		{
			for(int j = 2; j<i ; j++)
			{
				if(i%j==0)
				{
					//System.out.println(i + " is not a prime number");;
					continue loop;
				}
			}
			
			System.out.print(i + " ");
			
		}

	}

}
