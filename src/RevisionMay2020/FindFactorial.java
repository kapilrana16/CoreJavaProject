package RevisionMay2020;

public class FindFactorial {

	public static void main(String[] args) 
	{
		int num = 5; // 5*4*3*2*1
		int fact = 1;
		for(int i=num; i>0 ; i--)
		{
			fact = i*fact;
			
		}
		System.out.println(fact);

	}

}
