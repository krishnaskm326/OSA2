package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ValidateInsertedData {

	public static void main(String[] args) throws Throwable {
Connection con=null;
int result=0;
try {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/osa","root","root");
		Statement state=con.createStatement();
		String query="insert into users values('logesh',763906,'ktm',103);";
	result=state.executeUpdate(query);
}
catch (Exception e) {
}
finally {
	if(result==1)

		{
			System.out.println("data is updated");
		}
		else {
			System.out.println("data is not updated");
		}
		
	}
}

}
