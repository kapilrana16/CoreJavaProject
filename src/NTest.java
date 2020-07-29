
public class NTest {

	public static void main(String[] args) 
	{
		double[] I = {3,8,6,8,8,5};
		double max = I[0];
		int sol = 0;
		for(int i =1; i<I.length; i++)
		{
			if(I[i]>=max)
			{
				max = I[i];
				sol = i;
			}
		}
		System.out.println(sol);
	}

}
