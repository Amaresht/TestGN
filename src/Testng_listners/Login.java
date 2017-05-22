package Testng_listners;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	@Test(priority=1)
	public void login(){
		System.out.println("start");
		try{
		Assert.assertEquals("a", "b");
		}catch (Throwable t) {
			
			// TODO: handle exception
			System.out.println("error");
		}
		System.out.println("end");
		
	}
@Test(priority=2)
public void adminlogin(){
	
}
}
