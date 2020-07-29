package ReverseString;

public class ReverseString {

	public static void main(String[] args) 
	{
		String s = "kapil is great";
		
		//1.  Using loops:
		String rev ="";
		int len = s.length();
		System.out.println(len);
		for(int i =len-1; i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		//2. Using StringBuffer class:
		
		String sb = "Rana";
		StringBuffer stringbuffer = new StringBuffer(sb);
		StringBuffer a = stringbuffer.reverse();
		System.out.println(a);

	}

}
