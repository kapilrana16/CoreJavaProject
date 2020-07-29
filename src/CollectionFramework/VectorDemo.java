package CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo 
{
	// Vector is basically a dynamic array in which you can increase the size by 100%.
	
	public static void main(String args[])
	{
		
		ArrayList<Integer> list = new ArrayList<Integer>();  // Increase capacity by 50% / not thread safe / fast
		
		Vector<Integer> v1 = new Vector<Integer>(); // Increase capacity by 100% / thread safe /slow
		v1.add(1);
		v1.add(1);
		v1.add(1);
		v1.add(1);
		v1.add(1);
		v1.add(1);
		v1.add(1);
		v1.add(1);
		v1.add(1);
		v1.add(1);
		v1.add(1);		
		
		System.out.println(v1.size());
	}

}
