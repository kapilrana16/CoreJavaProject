package Java8Features;

public class Test {

	public static void main(String[] args) 
	{
		Interf i = (a,b) -> System.out.println(a+b);
		i.add(10, 20);
		i.m1();
		Interf.m2();  // static method can be call using interface name
		System.out.println(Interf.num);
		
	}

}
