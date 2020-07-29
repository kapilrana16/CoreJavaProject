package InterfaceConcept;

public interface Interface1 
{
	
	public void m1();
	
	default void m2()
	{
		System.out.println("this is interface menthod m2");
	}
	
	static void m3()
	{
		System.out.println("this is interface menthod m3");
	}

}
