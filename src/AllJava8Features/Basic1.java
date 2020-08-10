package AllJava8Features;

import java.util.function.*;

public class Basic1 {
	
	
	// test Comment
	public static void main(String[] args) 
	{
		// Find out the square root.
		Function<Integer, Integer> f = i -> i*i;
		System.out.println(f.apply(10));
		
		//Find the Even number
		Predicate<Integer> p = i->i%2==0;
		boolean b = p.test(10);
		if(b==true)
		{
			System.out.println("Even number");
		}
		
		//How to get the length of a string
		Function<String, Integer> fs = s -> s.length();
		System.out.println(fs.apply("kapil"));
		
		// Find the vene number
		int a =10;
		String res = (a%2==0)?"Even":(a%2!=0)?"false":"0";
		System.out.println(res);
		

	}

}
