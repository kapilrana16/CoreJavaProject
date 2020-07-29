package RevisonFeb2020;

public class Test 
{
	int marks;
	
	public Test(int marks)
	{
		this.marks = marks;
	}
	
	public void m2()
	{
		System.out.println(marks);
		
	}
	
	
	public static void main(String args[])
	{
		Test1 t = new Test1();
		System.out.println(t.name);
		System.out.println(Test1.a);
	}
	
	
}

class Test1
{
	
	String name = "kapil";
	static String a = "test";
	
}
