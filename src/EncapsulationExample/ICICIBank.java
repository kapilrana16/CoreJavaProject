package EncapsulationExample;

public class ICICIBank {

	public static void main(String[] args) 
	{
		Bank bank = new Bank();
		bank.setName("kapil");
		bank.setAge(18);
		bank.setloanAmount(5000000);
		
		System.out.println(bank.getName());
		System.out.println(bank.getAge());
		System.out.println(bank.getloanAmount());

	}

}
