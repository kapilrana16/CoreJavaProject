package RevisionMarch2020;

public class ReverseString {

	public static void main(String[] args)
	{
		String text = "My Name is Kapil";
//		String revtext = "";
//		String arr[] = text.split(" ");
//		int len = arr.length;
//		
//		for(int i=len-1; i>=0; i--)
//		{
//			revtext = revtext+arr[i]+" ";
//		}
//		System.out.println(revtext);
		
		int length = text.length();
		String revtext = "";
		for(int i = length-1; i>=0; i--)
		{
			revtext = revtext+text.charAt(i);
		}
		System.out.println(revtext);

	}

}
