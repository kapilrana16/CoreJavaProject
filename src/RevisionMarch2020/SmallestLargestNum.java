package RevisionMarch2020;

public class SmallestLargestNum {

	public static void main(String[] args) 
	{
		int[] num = {200,10,40,-300,50,1100,-51,6};
		
		int largest = num[0];
		int smallest = num[0];
		
		int len = num.length;
		for(int i=1; i<len; i++)
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
		System.out.println(largest);
		System.out.println(smallest);

	}

}
