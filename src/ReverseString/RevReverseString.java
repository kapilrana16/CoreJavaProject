package ReverseString;

public class RevReverseString 
{
	public static void main(String args[])
	{
		String text = "My Name is Kapil";
		String revtext = "";
		String reverse="";
		
		int len = text.length();
		for(int i=len-1; i>=0;i--)
		{
			revtext = revtext+text.charAt(i);
		}
		System.out.println(revtext);
		
		System.out.println("____________________________Using StringBuffer______________________________________");
		
		StringBuffer sb = new StringBuffer(text);
		StringBuffer a = sb.reverse();
		String b = a.toString();
		System.out.println(b);
		
		System.out.println("=================================================================");
		
		String text1 = "My Name is Kapil";
		String[] str = text1.split(" ");

		int length = str.length;
		System.out.println(length);
		
		for(int i = length-1; i>=0; i--)
		{
			reverse = reverse+str[i]+" ";
		}
		System.out.println(reverse);
		
	}
	

}
