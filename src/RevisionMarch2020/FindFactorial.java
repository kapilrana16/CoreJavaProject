package RevisionMarch2020;

public class FindFactorial {

	public static void main(String[] args) 
	{
		int num = 5; // 4*3*2*1
		int newnum =1;
		while(num>0)
		{
			 newnum = newnum*num;
			 num = num-1;
		}
		System.out.println(newnum);

	}

}
