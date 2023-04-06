package practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RunDataProvider {
@Test(dataProvider = "data")
public void dataProvider(String src,String dest){
	System.out.println("From  "+src+"  To  "+dest);
}

@DataProvider
public Object[][] data()
{
	Object[][] obj=new Object[2][2];
	obj[0][0]= "krishna";
	obj[0][1] = "moorthi";
	obj[1][0]= "salem";
	obj[1][1] = "tamilnadu";
	return obj;
	
}
}
