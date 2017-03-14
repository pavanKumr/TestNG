package pavan.kumar.s;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FacebookOpenPage {
	WebDriver driver = null;

	@BeforeClass

	public void setUp() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);

	}

	@Test
	public void pavan() {
		System.out.println("I opend the Facebook page");
	}

	@AfterClass

	public void tearDown() {
		driver.close();
	}

}
