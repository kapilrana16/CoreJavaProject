package InterfaceConcept;

public class TestClass
{
//	@Override
//	public void m1() 
//	{
//		System.out.println("this is method m1 written in TestClass");
//		
//	}
//	
	public void m2()
	{
		System.out.println("this is method m2 written in Test Class");
	}

	public static void main(String[] args) 
	{
		Interface1.m3();
//		TestClass tc =  new TestClass();
//		tc.m1();
//		tc.m2();
		
		Interface1 i1 = () -> System.out.println("this is method m1 written in TestClass");
		i1.m1();
		i1.m2();
		TestClass tc =  new TestClass();
		tc.m2();
		
	}

	

}
