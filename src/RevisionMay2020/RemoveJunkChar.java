package RevisionMay2020;

public class RemoveJunkChar {

	public static void main(String[] args) 
	{
		String s = "kapil !@#$% Rana )(*&^%";
		s = s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s.toUpperCase());

	}

}
