package RevisionMay2020;

public class Swap2String {

	public static void main(String[] args)
	{
		String a = "Hello";
		String b = "World";
		
		a = a + b;
		b = a.substring(0, 5);
		a = a.substring(5);
		System.out.println("a " + a);
		System.out.println("b " + b);

	}

}
