package FebRevSeleniumAPI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) throws SQLException 
	{
		String url = "jdbc:mysql://db-staging-props.sitecomp.li:3306/";
		String username = "kapil";
		String password = "test1234";
		
		//Class.forName(com.mysql.jdbc.Driver);
		Connection con = DriverManager.getConnection(url,username,password);
		Statement st =  con.createStatement();
		ResultSet rs = st.executeQuery("Select * from users");
		while(rs.next())
		{
			String user = rs.getString("user_name");
		}
		
		con.close();
		

	}

}
