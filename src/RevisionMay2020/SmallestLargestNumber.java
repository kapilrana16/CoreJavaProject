package RevisionMay2020;

public class SmallestLargestNumber {

	public static void main(String[] args) 
	{
		int a[] = {200,10,40,-300,50,1100,-51,6};
		int largest = a[0];
		int smallest = a[0];
		
		for(int i =1; i<a.length; i++)
		if(a[i]>largest)
		{
			largest = a[i]; //200
		}
		else if(a[i]<smallest)
		{
			smallest = a[i]; //10
		}
		
		System.out.println("Largest " + largest);
		System.out.println("Smallest " + smallest);

	}

}
