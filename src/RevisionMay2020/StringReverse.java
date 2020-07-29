package RevisionMay2020;

public class StringReverse {

	public static void main(String[] args) 
	{
		// Type :1

		String text = "My Name is Kapil";
		String revtext = "";
		
		String a[] = text.split(" ");
		int size = a.length;
		
		for(int i = size-1; i>=0; i--)
		{
			revtext = revtext+a[i]+" " ; //kapil
		}
		System.out.println("Type 1: " + revtext.trim());
		
		
		// Type :2
		
		String text2 = "I am number 1 qa";
		String revstring = "";
		int len = text2.length();
		for(int i=len-1; i>=0; i--)
		{
			revstring = revstring+text2.charAt(i);
		}
		System.out.println("Type 2: " + revstring);
		
		// Type :3
		
		String text3 = "How are you?";
		StringBuffer sb  = new StringBuffer(text3);
		String revString = sb.reverse().toString();
		System.out.println("Type 3: " + revString);
		

	}

}
