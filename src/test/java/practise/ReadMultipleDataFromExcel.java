package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws Throwable {
Connection con=null;
try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/osa","root","root");
			Statement state = con.createStatement();
			String query = "select * from users;";
			ResultSet result = state.executeQuery(query);
			String query2 = "select count(*) from users;";
			// ResultSet count = state.executeQuery(query2);
			//int count=result.getFetchSize();
			
			while(result.next())
			{
				System.out.println(result.getString(1)+" "+result.getString(2)+""+result.getString(3));
			}
				}
catch (Exception e) {
}
finally {
	con.close();
}
	}}
