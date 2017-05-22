package module1;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testngarray {
		//@Test
		//public void Login(){
			//System.out.println("login Succsufully");
	
//		}
					//@Test
			//public void R(){
				//String z="dddd";
				//String x="dddd";
				//Assert.assertEquals(z, x);
			//	Assert.assertTrue(2>1, "pass");
				
				
			//}
		@AfterMethod
		public void aftermethod(){
			System.out.println("completed");
		}
			@Test(dataProvider="getdata")
			public void LoginTest(String Username,String Password,String expResult,String Browser ){
				System.out.println(Username+"-----"+Password);
			}
			@DataProvider(name="Dataprovider")
			public Object[][] getdata(){
				Object[][] obj=new Object[3][4];
			
				obj[0][0]="U1";
				obj[0][1]="Password";
				obj[0][2]="pass";
				obj[0][3]="Mozilla";
				
				obj[1][0]="U2";
				obj[1][1]="Password";
				obj[1][2]="pass";
				obj[1][3]="Chrome";
				
				obj[2][0]="U3";
				obj[2][1]="P3";
				obj[2][2]="Fail";
				obj[2][3]="IE";
				
				return obj;
			}
			@DataProvider(name="Testcasesdata")
			public Object[][] Testcasedata(Method m){
				Object[][] obj=null;
			if(m.getName().equals("testA")){
				obj=new Object[2][2];
				obj[0][0]="U4";
				obj[0][1]="Password4";
				
				obj[1][0]="U5";
				obj[1][1]="Password5";
				
				return obj;
			}else if(m.getName().equals("testB")){
				obj=new Object[2][3];
				obj[0][0]="U6";
				obj[0][1]="Password5";
				obj[0][2]="abc@gmail.com";
						}
			obj[1][0]="U7";
			obj[1][1]="Password7";
			obj[1][2]="xyz@gmail.com";
				
				return obj;
	
			}
}
			
		
		




