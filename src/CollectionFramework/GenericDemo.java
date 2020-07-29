package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo
{
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList();
		list.add(007);
		//list.add("kapil");
		int rollNum = Integer.parseInt(list.get(0).toString());
		System.out.println("-----"+rollNum);
		
		System.out.println(list.size());
		
		for(Object i : list)
			{
				System.out.println("====="+i);
			}
		
	}

}
