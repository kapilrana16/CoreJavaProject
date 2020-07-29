package Revision2020;

public class SwapString {

	public static void main(String[] args) 
	{
		String a = "Hello";
		String b = "World";
		
		a = a+b;
		System.out.println(a);
		
		b = a.substring(0, 5);
		System.out.println("Value of b:- " + b);
		
		a = a.substring(5);
		System.out.println("value of a:- " + a);
		
		

	}

}
