package ArmstrogNumber;

public class ArmstrogNumber 
{
	public static void setNumber(int num)
	{
		
		//Armstrong Number is : 153 = (1*1*1)+(5*5*5)+(3*3*3)
		
		int sum = 0;
		int r;
		int number =  num; //153
		
		
		while(num>0)
		{
			r = num%10; //5
			sum = sum +(r*r*r); 
			num = num/10;
		}
		
		if(number == sum)
		{
			System.out.println("is a Armstrong number");
		}
		else
		{
			System.out.println("Not a armstrong number");
		}
				
	}
	
	public static void main(String[] args) 
	{
		setNumber(2);

	}

}
