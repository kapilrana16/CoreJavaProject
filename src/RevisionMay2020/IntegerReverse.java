package RevisionMay2020;

public class IntegerReverse {

	public static void main(String[] args)
	{
		// Type 1
		int num = 963;
		int newnum = 0;
		
		while(num>0)
		{
			newnum = newnum*10 + num%10;
			num = num/10;
		}
		System.out.println(newnum);
		
		//Type 2
		
		int num1 = 951;
		String a = "" + num1;
		StringBuffer sb = new StringBuffer(a);
		String res = sb.reverse().toString();
		int revint = Integer.parseInt(res);
		System.out.println(revint);
		
		String as = "kapilrana";
		System.out.println(as.indexOf('a',0));

	}

}
