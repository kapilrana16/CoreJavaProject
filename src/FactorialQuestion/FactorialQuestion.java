package FactorialQuestion;

import java.util.ArrayList;
import java.util.List;

public class FactorialQuestion {
	
	
	//List<Integer> list = new ArrayList<Integer>();

	// What is Factorial on 4 : 4*3*2*1 = 24.
	
	public static int factOF(int num)
	{
		int fact =1;
		
		for(int i=num; i>=1; i--)
		{
			fact = fact*i; 
		}
		
		return fact;
		
		
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println(factOF(3));
			
	}

}
