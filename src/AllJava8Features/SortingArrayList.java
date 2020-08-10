package AllJava8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingArrayList {

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(10,15,11,24,17,23);
		Comparator<Integer> c = (a,b) -> (a<b)?-1:(a>b)?1:0;
		list.sort(c);
		System.out.println(list);
		list.stream().forEach(System.out::println);
		List<Integer> list1 = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		list1.stream().forEach(System.out::println);
	
	}

	

}
