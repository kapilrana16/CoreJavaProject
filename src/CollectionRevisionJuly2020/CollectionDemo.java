package CollectionRevisionJuly2020;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class CollectionDemo {

	public static void main(String[] args) 
	{
		
		 Collection<Object> col = new ArrayList(); 
		  col.add(2); 
		  col.add("kapil");
		  col.add(20.2);
		  col.remove(2);
		  
		  
		  Iterator<Object> itr = col.iterator(); 
		  while(itr.hasNext()) 
		  {
		  System.out.println(itr.next()); 
		  }
		 
		
		System.out.println("===========================================================================");
		
		List list = new ArrayList();
		list.add(1.1);
		list.add("kapilrana");
		list.add(210);
		list.add(0, "Anil");            // Collection interface do not have this method. but List interface have.
		
		int count = list.size();
		System.out.println("==============Using for each loop================");
		for(Object a : list)
		{
			System.out.println(a);
		}
		
		System.out.println("================Using For loop========================");
		for(int i=0;i<count; i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("================After adding two collection ========================");
		list.addAll(col);
		for(Object a : list)
		{
			System.out.println(a);
		}
		
		

	}

}
