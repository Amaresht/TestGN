package module1;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class wind {
	WebDriver w;
	public void open(){
		System.setProperty("webdriver.firefox.marionette", "D:\\Selenium\\geckodriver.exe");
		 w=new FirefoxDriver();
		 w.get("http://www.hdfcbank.com/");
		 System.out.println(w.getTitle());
		
	}
	public void login(){
		w.findElement(By.xpath(".//*[@id='loginsubmit']")).click();
		String q=w.getWindowHandle();
		List<String> lst=new ArrayList<String>(w.getWindowHandles());
		w.switchTo().window(lst.get(1));
		w.findElement(By.xpath("//*[@alt='Continue']")).click();
		w.close();
		w.switchTo().window(q);
		System.out.println(w.getCurrentUrl());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wind s=new wind();
		s.open();
		s.login();
		

	}

}
