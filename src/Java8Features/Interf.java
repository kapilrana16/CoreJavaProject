package Java8Features;

interface Interf 
{
	/**
	 *  Every variable in interface is always public static and final.
	 *  instance block and static block is not applicable
	 *  Class is always public and abstract.
	 *  No constructor
	 */
	final int num = 10;  //
	
	public void add(int a, int b);
	
	
	default void m1()
	{
		System.out.println("This is default method in interface");
	}
	
	static void m2()
	{
		System.out.println("This is static method in interface");
	}

}
