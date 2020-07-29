package SwapTwoInteger;

public class RevSwap2String {

	public static void main(String[] args) 
	{
		String a = "kapil";
		String b = "Rana";
		
		a = a+b;
		b = a.substring(0,5);
		System.out.println(b);
		a = a.substring(5);
		System.out.println(a);

	}

}
