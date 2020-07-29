package RevisionMarch2020;

public class RevInt {

	public static void main(String[] args) 
	{
		int a = 321;
		
		String b = String.valueOf(a);
		StringBuffer sb = new StringBuffer(b);
		StringBuffer sr = sb.reverse();
		String finstr = sr.toString();
		System.out.println(finstr);

	}

}
