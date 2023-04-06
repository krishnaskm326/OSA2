package practise;

import org.testng.annotations.Test;

public class Dp_Test1 {

	@Test(dataProviderClass = Dp_test2.class,dataProvider = "data")
	public void getData(String src,String dest,String location){
		System.out.println("From  "+src+"  To  "+dest+"----.location  "+location);
	}
}
