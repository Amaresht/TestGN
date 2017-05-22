package module1;

import org.testng.annotations.Test;

@Test(dataProviderClass=Testngarray.class,dataProvider="Dataprovider")
public class login {
	public void LoginTest(String Username,String Password,String expResult,String Browser ){
		System.out.println(Username+"-----"+Password);

}
}
