package RevisionMarch2020;

public class RemoveJunkCharacter {

	public static void main(String[] args) 
	{
		String s = "kapil !@#$% Rana )(*&^%";
		s = s.replaceAll("[^0-9A-Za-z]", "");
		System.out.println(s);

	}

}
