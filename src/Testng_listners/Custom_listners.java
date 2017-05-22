package Testng_listners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Custom_listners extends TestListenerAdapter {
	
	public void onTestFailure(ITestResult tr){
		System.out.println("failed-"+tr.getName());
	}
	public void onTestSkip(ITestResult tr){
		System.out.println("skiped-"+tr.getName());
	}
	public void onTestSuccess(ITestResult tr){
		System.out.println("sucsess-"+tr.getName());
		
	}

}
