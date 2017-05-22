package module1;

import org.testng.annotations.Test;

public class TestCases {
	@Test(priority=1,dataProviderClass=Testngarray.class,dataProvider="Testcasesdata")
	public void testA(String u,String p){
		System.out.println("Test Case1 is passed");
		
	}
	
	@Test(priority=2,dataProviderClass=Testngarray.class,dataProvider="Testcasesdata")
	public void testB(String u,String p,String email){
		System.out.println("Test Case2 is passed");
		
	}

}
