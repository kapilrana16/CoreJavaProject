package Revision2020;

public class JunkCharRemoving {

	public static void main(String[] args)
	{
		String s = "kapil !@#$% Rana )(*&^%";
		
		
		String s1 = "kapil!@#$% Rana )(*&^%";
		
		String news = s.replaceAll("[^0-9A-Za-z]", "");
		System.out.println(news);
		
		String a = news.substring(0, 5);
		String b = news.substring(5);
		String c = a + " " +b;
		System.out.println(c);
		
		
		
	}

}
