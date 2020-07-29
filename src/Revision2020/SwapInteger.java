package Revision2020;

public class SwapInteger {

	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		
		a = a+b; //30
		b = a-b; //10
		a = a-b;
		System.out.println("a " + a);
		System.out.println("b " + b);

	}

}
