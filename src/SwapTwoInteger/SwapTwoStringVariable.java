package SwapTwoInteger;

public class SwapTwoStringVariable {

	public static void main(String[] args) 
	{
		String a = "Hello";
		String b = "World";
		
		
		a = a+b;
		System.out.println("the value of a after append is " + a);  //HelloWorld
		
		b = a.substring(0, 5);
		a = a.substring(5);
		
		System.out.println("a is now" + a);
		System.out.println("b is now" + b);

		
		

	}

}
