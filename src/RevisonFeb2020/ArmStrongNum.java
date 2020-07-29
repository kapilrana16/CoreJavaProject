package RevisonFeb2020;

public class ArmStrongNum {

	public static void main(String[] args) 
	{
		//Armstrong Number is : 153 = (1*1*1)+(5*5*5)+(3*3*3)
		
		int sum = 153;
		int num1 = 0;
		
		while(sum>0)
		{
			int num = sum%10; //3
			num1 = num1+num*num*num;
			sum = sum/10;
		}
		
		System.out.println(num1);
		

	}

}
