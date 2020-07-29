package MethodOverloading;

public class OverloadingDemo 
{
	
	//  Overloading cannot be achieved by changing the return type only.
	
	public void m1()
	{
		System.out.println("m1");
	}
	
	public void m1(int a)
	{
		System.out.println("m1");
	}
	
	public void m1(int a, float b)
	{
		System.out.println("m1");
	}
	
	public void m1(float a, int b)
	{
		System.out.println("m1");
	}
	
	public int m1(int a, int b)
	{
		System.out.println("m1");
		return b;
	}
	

	public static void main(String[] args) 
	{
		

	}

}
