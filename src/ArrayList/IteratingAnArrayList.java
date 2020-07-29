package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingAnArrayList {

	public static void main(String[] args) 
	{
		List<String> names = new ArrayList<String>();
		names.add("kapil");
		names.add("Anil");
		names.add("sunil");
		
		System.out.println(names);
		
		System.out.println("**********Using ForEach loop and Lambda Expression**********");
		
		// 1. Using ForEach  and Lambda Expression:
		names.forEach(name->{System.out.println(name);});
		
		
		System.out.println("************Using Iterator**********");
		
		// 2. Using Iterator:
		Iterator<String> itr = names.iterator();
		while(itr.hasNext())
			{
				String name = itr.next();
				System.out.println(name);
			}
		
		System.out.println("********Using \"EachRemaining\" loop and Lambda Expression**********");
		
		//3. Using "EachRemaining" loop and Lambda Expression:
		
		itr = names.iterator();
		itr.forEachRemaining(TeamNames->{System.out.println(TeamNames);});
		
		System.out.println("***********Using For Each loop*********");
		
		//4. Using For Each loop
		
		for(String name: names)
		{
			System.out.println(name);
		}
		
		System.out.println("**************Using for loop*************");
		
		//5. Using for loop
		int size = names.size();
		for(int i =0; i< size; i++)
		{
			System.out.println(names.get(i));
		}
		
		System.out.println("***********************Using ListIterator******************");
		
		//6: Using "ListIterator"
		
		 ListIterator<String> listitr =  names.listIterator(names.size());
		 while(listitr.hasPrevious())
		 {
			 String namelist = listitr.previous();
			 System.out.println(namelist);
		 }

	}

}
