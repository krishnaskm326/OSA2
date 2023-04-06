package practise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("connect to db");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("launch the browser");
	}
	@BeforeTest
	public void beforeTest() {
	System.out.println(" parallel execution");
	}
	@Test
	public void testClass() {
		System.out.println("testClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("close the browser");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("close the db");
	}
}
