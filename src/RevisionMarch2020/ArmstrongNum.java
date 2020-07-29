package RevisionMarch2020;

public class ArmstrongNum {

	public static void main(String[] args) 
	{
		int number = 153;
		int num = number;
		int val = 0;
		
		while(num>0)
		{	
			int r = num%10;
			val = val + r*r*r ;
			num = num/10;
		}
		
		System.out.println(val);
		if(number == val)
		{
			
			System.out.println("ArmsStrong Number");
		}
		

	}

}
