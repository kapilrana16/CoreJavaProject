package RemoveJunkCharacter;

public class RemoveJunkCharacter
{
	public static String s = "kapil !@#$% Rana )(*&^%";
	
	public static String s1 = "kapil!@#$% Rana )(*&^%";
	
	public static void main(String args[])
	{
	
		//1. Replacing All special Character:
		 s= s.replaceAll("[^0-9A-Za-z]", ""); 
		 System.out.println(s);
		 
		//2. Replacing FIRST special Character:
		s1= s1.replaceFirst("[^0-9A-Za-z]", "");
		System.out.println(s1);
	
	}
	
}
