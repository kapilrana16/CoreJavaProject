package May2020_NewQuestion;

import java.util.Scanner;

public class CenturyYearAndLeapYear {

	public static void main(String[] args) 
	{
		// Leap Year except ending with "00" is divided by 4.
		// Century year is divided by 100.
		// Century leap year - A year ending in "00" that is divisible by 400 is a century leap year. For example, the years 1600, 2000, and 2400.
		
		boolean leap = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		
		if(year%4 == 0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					leap = true;
					System.out.println("Year is a Century Leap Year");
				}
				else
				{
					leap = false;
					System.out.println("Year is not a leap year as the year ends with '00'  and it is not  divisible by 400");
				}
			}
			else
			{
				leap = true;
				System.out.println("Year is a leap year but not a centrury leap year.");
			}
		}
		else
		{
			leap = false;
			System.out.println("Year is not a leap year");
		}

	}

}
