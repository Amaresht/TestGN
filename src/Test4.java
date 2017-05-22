import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4 {
	@Test(priority = 1)
	public void Login() {
		Assert.assertEquals("A", "A");
		System.out.println("logged in");

	}

	@Test(priority = 2, dependsOnMethods = { "Login" })
	public void Changepassword() {
		System.out.println("sucsessfully chenged");

	}

	@Test(priority = 3, dependsOnMethods = { "Login" })
	private void Logout() {
		// TODO Auto-generated method stub
		System.out.println("sucsessfull logged out");

	}

}
