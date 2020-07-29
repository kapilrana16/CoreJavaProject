package RevisionMay2020;

public class FindArmstrongNumber {

	public static void main(String[] args) 
	{
		// Armstrong Number is : 153 = (1*1*1)+(5*5*5)+(3*3*3)
		int number = 1634;
		int orgnum = number;
		int num = orgnum;
		
		int count = 0;
		while(orgnum>0)
		{
			orgnum=orgnum/10;
			count = count+1;
		}
		System.out.println("No of digits in number: " + count);
		
		int newnum = 0;
		while(num>0)
		{
			int n = num%10; 
			int total = 1;
			int counter = count;
			while(counter>0)
			{
				total = total*n;
				counter = counter-1;
			}
			
			newnum = newnum + total;
			num = num/10;	
		}
		System.out.println("the new number is: " + newnum);
		if(newnum == number)
			System.out.println("Armstrong number");

	}

}
