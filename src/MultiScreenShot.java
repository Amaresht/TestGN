import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiScreenShot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.firefox.marionette", "D:\\Selenium\\geckodriver.exe");
		multiScreenShot.MultiScreenShot shot = new multiScreenShot.MultiScreenShot(
				"C:\\Users\\Deccansoft6\\Desktop\\new", "Tsss");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.co.in");

		shot.multiScreenShot(driver);

		shot.elementScreenShot(driver, driver.findElement(By.id("lst-ib")));
		System.out.println("success");

	}

}
