package MissingNumberInArray;

public class MissingNumberInArray {

	public static void main(String[] args) 
	{
		int[] a = {1,2,3,5};
		int sum = 0;
		int sum1 = 0;
		
		int len = a.length;
		System.out.println("Length is :" + len);
		
		for(int i =0; i<len; i++)
			{
				sum = sum+a[i];
			}
		System.out.println("The total is " + sum);

		
		for(int j=1;j<=5;j++)
			{
				sum1 = sum1+j;
			}
		System.out.println("The anoher sum is "+ sum1);
		
		int missingnumber = sum1-sum;
		System.out.println("The missing number is "+ missingnumber);
	}

}
