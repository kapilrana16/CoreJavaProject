package RevisonFeb2020;

public class RevInt {

	public static void main(String[] args) 
	{
		int num = 123;
		
		int num1 = 0;
		while(num>0)
		{
			num1 = num1*10 + num%10;
			num = num/10;
			
		}
		System.out.println(num1);
		
		////////////////////////////////////////
		
		int numb = 123;
		
		String numb1 = String.valueOf(numb);
		StringBuffer sb = new StringBuffer(numb1);
		StringBuffer s1 = sb.reverse();
		String s = s1.toString();
		System.out.println(s);

	}

}
