package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		list.add("kapil");
		list.add("Anil");
		list.add("usha");
		String name = list.get(1);
		System.out.println(name);
	}

}
