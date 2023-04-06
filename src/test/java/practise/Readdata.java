package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Readdata {
	static Connection con;
	public static void main(String[] args) throws Throwable {
		//Connection con=null;
		try {
			//step1: create object for driver
			Driver driver=new Driver();
			//step2:  Register the database
			DriverManager.registerDriver(driver);
			//step3:  get connection for the database
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/osa","root","root");
			//step4:  create statement
			Statement state=con.createStatement();
			String query="rename table users to user;";
			//steps5:  execute query
			ResultSet result=state.executeQuery(query);
			while(result.next())
			{
				System.out.println(result.getString(1)+" "+result.getString(2)+""+result.getString(3));
			}
		}
		catch(Exception e) {
					}
		finally {
	con.close();
}
		}
}