package module1;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

;

public class SampleTestng {
	@BeforeTest
	public void x(){
		System.out.println("--Before Test---");
	}
	@AfterTest
	public void z(){
		System.out.println("---Ater Test---");
	}
	@BeforeMethod
	public void y(){
		System.out.println("---BeforeMetod---");
	}
	@AfterMethod
	public void e(){
		System.out.println("---AftrMetthod---");
	}
	@BeforeSuite
	public void q(){
		System.out.println("---BeforeSuite---");
	}
	@AfterSuite
	public void k(){
		System.out.println("---AfterSuite---");
	}

@Test(priority=1)
public void c(){
	System.out.println("hello");
}
@Test(priority=2)
public void f(){
String s ="aaa";
String t="ttt";
org.testng.Assert.assertEquals(s, t);

//System.out.println("selenium");
	
}
@Test(priority=3) 
public void a(){
	System.out.println("TestNG");
	
}



	}


