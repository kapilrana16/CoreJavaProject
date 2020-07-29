import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class TestClasses 
{
	public static void main(String args[])
	{
	Collection values = new ArrayList();
	values.add(1);
	values.add("kapil");
	
	for(Object i : values)
	{
		System.out.println(i);
	}
	}
}
