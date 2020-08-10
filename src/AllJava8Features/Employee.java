package AllJava8Features;

public class Employee
{
	String empname;
	int empnum;
	public Employee(String ename, int num) 
	{
		this.empname = ename;
		this.empnum = num;
	}
	
	public String toString()
	{
		return empname +" : "+ empnum;
	}

}
