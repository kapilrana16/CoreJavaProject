package Revision2020;

public class StringhReverse {

	public static void main(String[] args) 
	{
		String text = "My Name is Kapil";
		String rev = "";
		
		
		int len = text.length();
		System.out.println(len);
		
		for(int i=15; i>=0;i--)
		{
			rev = rev + text.charAt(i);
		}
		System.out.println(rev);
		
		System.out.println("======================Using String Buffer==============================");
		
		StringBuffer sb = new StringBuffer(text);
		System.out.println(sb.reverse());
		
		
		System.out.println("======================Using Array Concept===========================");
		String reverse = "";
		String[] arr = text.split(" ");
		int length = arr.length;
		System.out.println(length);
		
		for(int i=length-1;i>=0;i--)
		{
			reverse = reverse+arr[i]+" ";
		}
		System.out.println(reverse);
		//System.out.println(reverse.trim());
		

	}

}
