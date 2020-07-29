import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestClass {

	public static void main(String[] args) 
	{
		
		/*
		 * Calendar calendar = Calendar.getInstance(); Date curDate =
		 * calendar.getTime(); String dates= curDate.toString();
		 * System.out.println(dates);
		 */
		  
		  SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		  Date date = new Date(System.currentTimeMillis());
		  String a = formatter.format(date);
		  System.out.println(a.substring(8, 10));
		  
		 
		 
		

		
		 
		
	}

}
