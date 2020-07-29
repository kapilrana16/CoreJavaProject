package RevisonFeb2020;

public class JunkCkarRemove {

	public static void main(String[] args) 
	{
		String s = "kapil !@#$% Rana )(*&^%";
		String s1 = s.replaceAll("[^A-Za-z0-9]","");
		System.out.println(s1);
		
		String s2 = s.replaceFirst("[^A-Za-z0-9]", "L");
		System.out.println(s2);

	}

}
