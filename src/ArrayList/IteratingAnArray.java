package ArrayList;

import java.util.Arrays;

public class IteratingAnArray {

	public static void main(String[] args) 
	{
		String[] name = new String[5];
		
		name[0]="kapil";
		name[1]="Anil";
		name[2]="Usha";
		name[3]="kavita";
		name[4]="sonam";
		//name[5]="sonam1";
		
		/*
		 * String A = Arrays.toString(name); 
		 * System.out.println(A);
		 */
		
		  //1. 1st way using loop
		
		  int len = name.length; 
		  System.out.println(len);
		  for(int i = 0; i<len; i++) 
		  { String a = name[i];
		  System.out.println(a); 
		  }
	
		  System.out.println("************************************");
		  
		  //2. Using ForEach loop
		  
		  for(String n:name)
		  {
			  System.out.println(n);
		  }
		
	}

}