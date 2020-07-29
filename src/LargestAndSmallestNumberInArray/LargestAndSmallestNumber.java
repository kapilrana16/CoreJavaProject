package LargestAndSmallestNumberInArray;

import java.util.Arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args)
	{
		int[] num = {200,10,40,-300,50,11,-51,6};
		System.out.println(num);
		
		int largest = num[0];
		int smallest = num[0];
		System.out.println(num.length);
		
		for(int i=1; i<num.length; i++)
		{
			if(num[i]>largest)
			{
				largest = num[i];
			}
			else if(num[i]<smallest)
			{
				smallest = num[i];
			}
			
		}
		
		System.out.println(Arrays.toString(num)); // To print the Array we use "Arrays.toString(num)"
		System.out.println("the largest numbers is " + largest);
		System.out.println("The smallest number is " + smallest);
	}

}
