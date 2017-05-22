import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import multiScreenShot.MultiScreenShot;

public class multi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette", "D:\\Selenium\\geckodriver.exe");
		MultiScreenShot shot = new MultiScreenShot("C:\\Users\\Deccansoft6\\Desktop\\new/", "ts");
		WebDriver s = new FirefoxDriver();
		s.get("http:\\www.google.co.in");

		shot.multiScreenShot(s);

		shot.elementScreenShot(s, s.findElement(By.id("lst-ib")));
		System.out.println("**************");
	}

}
