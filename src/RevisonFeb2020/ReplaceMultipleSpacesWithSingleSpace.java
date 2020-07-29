package RevisonFeb2020;

public class ReplaceMultipleSpacesWithSingleSpace {

	public static void main(String[] args)
	{

		String s = "kapil  is     great   ";
		s = s.replaceAll("\\s{2,}", " ");
		System.out.println(s.trim());
	}

}
