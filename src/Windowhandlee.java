import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandlee {
	WebDriver w;

	public void open() {
		System.setProperty("webdriver.firefox.marionette", "D:\\Selenium\\geckodriver.exe");
		w = new FirefoxDriver();
		w.get("http://www.hdfcbank.com");
		w.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(w.getTitle());
	}

	public void login() {
		w.findElement(By.xpath(".//*[@id='loginsubmit']")).click();
		String s = w.getWindowHandle();
		List<String> lst = new ArrayList<String>(w.getWindowHandles());
		w.switchTo().window(lst.get(1));
		w.findElement(By.xpath("//*[@alt='Continue']")).click();
		w.switchTo().window(s);
		System.out.println(w.getCurrentUrl());
	}

	public static void main(String[] args) {
		Windowhandlee handle = new Windowhandlee();
		handle.open();
		handle.login();
	}
}
