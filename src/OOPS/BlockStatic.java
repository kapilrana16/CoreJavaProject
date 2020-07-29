package OOPS;

public class BlockStatic
{

	static
	{
		String z = "12";
		final int a = 10;
		final int b = 20;
		int c = 30;
		System.out.println("staic block executed");
	}
	public static void main(String[] args) 
	{
		FunctionaInterface fi = ()->{System.out.println("this is kapil rana");};
		fi.show();

	}

}
