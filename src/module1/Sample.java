package module1;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	@BeforeSuite
	public void beforesuite(){
		System.out.println("---Beforesuite---");
	}
	@AfterSuite
	public void aftersuite(){
		System.out.println("---AfterSuite----");
	}
	@BeforeTest
	public void Login(){
		System.out.println("S loged in  ");
	}
	@AfterTest
	public void Logout(){
		System.out.println("logged out");
		
	}
	@BeforeMethod
	public void beforemethod(){
		System.out.println("---Before Method---");
	}
	@AfterMethod
	public void aftermethod(){
		System.out.println("--Aftermethod---");
	}
	
@Test(priority=2)
public void f(){
	System.out.println("Test 1");
	String Expected="a";
	String Actual="a";
	Assert.assertEquals(Expected, Actual);
}
@Test(priority=1)
public void c(){
	System.out.println("Test 2");
}
@Test(priority=3)
public void a(){
	System.out.println("hello");
}
}
