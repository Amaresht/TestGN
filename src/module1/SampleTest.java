package module1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	@Test(priority=1)
	public void login(){
		
		Assert.assertEquals("B", "A");
		System.out.println("login");
	}
	@Test(priority=2,dependsOnMethods={"login"})
	public void Changepassword(){
		System.out.println("Sucsessfully password changed");
	}
	@Test (priority=3,dependsOnMethods={"login"})
	public void Logout(){
		System.out.println("sucsessfully logged out");
	}

}
