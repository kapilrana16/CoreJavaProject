package RevisonFeb2020;

public class SmallestLargest {

	public static void main(String[] args) {
		int[] num = {200,10,40,-300,50,1100,-51,6};
		int maxnum = num[0];
		int minnum = num[0];
		
		int len = num.length;
		for(int i =1; i<len; i++)
		{
			if(num[i]>maxnum)
				{
					maxnum = num[i]; // 200
				}
			else if(num[i]<minnum)
				{
					minnum = num[i]; // 40
				}
			
			
		}
		
		System.out.println(maxnum);
		System.out.println(minnum);

	}

}
