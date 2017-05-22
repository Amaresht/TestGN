import org.testng.annotations.Test;

public class Test5 {

	@Test(dataProviderClass = Test3.class, dataProvider = "userdetails")
	public void testA(String u, String p) {

	}

	@Test(dataProviderClass = Test3.class, dataProvider = "userdetails")
	public void testB(String u, String p, String Ml) {

	}
}
