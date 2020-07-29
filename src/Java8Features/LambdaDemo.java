package Java8Features;


/**
 * Lambda is an anonymous function or nameless function.
 * It does not have name, return type and modifiers.
 * It is also called as Closures.
 * @author kapil.rana
 *
 *IF WE WANT TO CALL LAMBDA EXPRESSION THEN FOR THAT CASE FUNCTIONAL INTERFACES IS REQUIRED
 */
public class LambdaDemo 
{
	
	public void show() 
	{
		System.out.println("Test");
	}
	// () -> System.out.println("Test");
	
	
	public void sum(int a , int b)
	{
		System.out.println(a+b);
	}
	// (a,b) ->System.out.println(a+b);
	
	
	public int square(int a)
	{
		return a*a;	
	}
	// a -> return a*a; // If there is only one argument then we can remove the braces.
	// a -> a*a; // we can remove the return statement.
}
