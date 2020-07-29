package EncapsulationExample;

public class Bank 
{
	private String name ;
	private int age;
	private int loanAmount;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		if(age>=18 && age<=45)
		{
		this.age = age;
		}
		else
			{
				System.out.println("Enter the valid age");
			}
	}
	public void setloanAmount(int loanAmount)
	{
		if(loanAmount>=50000 && loanAmount<= 5000000)
		{
		this.loanAmount = loanAmount;
		}
		else
			{
				System.out.println("Enter Valid Loan amount");
			}
	}
	
	public String getName()
	{
		return name;
		
	}
	public int getAge()
	{
		return age;
	
	}
	public int getloanAmount()
	{
		return loanAmount;
		
	}
	
	
}
