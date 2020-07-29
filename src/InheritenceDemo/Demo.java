package InheritenceDemo;

public class Demo extends InheritenceDemo
{
	
	public void m1()
	{
		System.out.println("this m1 in demo class method ");
	}
	
	public void m3()
	{
		System.out.println("m3");
	}
	
	public void m4(int a)
	{
		System.out.println("this is Demo class method " + a);
	}
	
	public static void main(String args[])
	{
		InheritenceDemo d =  new InheritenceDemo(); // If we want to call parent specific methods only.
		d.m1();
		
		InheritenceDemo d1 =  new Demo(); // Using parent reference we can call only methods available in parent class, Child specific methods are not available.
		d1.m1();
		d1.m4();
		
		Demo d2 = new Demo(); // Using Child reference we can call methods available in both Parent and Child.
		d2.m1();
	
		
	}

}
