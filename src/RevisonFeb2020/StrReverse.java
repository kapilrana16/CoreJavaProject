package RevisonFeb2020;

public class StrReverse {

	public static void main(String[] args) 
	{
		String text = "My Name is Kapil";
		StringBuffer sb  =  new StringBuffer(text);
		StringBuffer newstring = sb.reverse();
		String revstr = newstring.toString();
		System.out.println(revstr);
		
		///////////////////////////////
		
		String text1 = "I will Win";
		String newtext = "";
		int len = text1.length();
		
		for(int i = len-1;i>=0;i--)
		{
			newtext = newtext+text1.charAt(i);
		}
		System.out.println(newtext);
		
		////////////////////////////////////
		
		String t = "My Name is Kapil";
		String t1 = "";
		
		String arr[] = t.split(" ");
		int l = arr.length;
		System.out.println(l);
		for(int i=l-1; i>=0; i--)
			{
				t1 = t1+arr[i]+" "; //
				
		
			}
		System.out.println(t1);
	}
}
