package CollectionRevisionJuly2020;

public class StaticKeywordDemo 
{
	static int a = 1;
	int b = 2;
	final static int po;
	static
	{
		po = 101;
		System.out.println("static block:" + po);
	}
	public void show1(int a, int b)
	{
		System.out.println(this.a = a);
		System.out.println(this.b = b);
		
	}
	
	public static void show2(int i, int j)
	{
		int ia=21;
		int ja=22;
		System.out.println(a);
		System.out.println(ia = i);
		System.out.println(po);
		
		
	}

	public static void main(String[] args) 
	{
		
		StaticKeywordDemo.show2(35, 36);

	}

}
