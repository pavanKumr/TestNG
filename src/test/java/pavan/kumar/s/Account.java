package pavan.kumar.s;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Account {
	WebDriver driver = null;

	@BeforeMethod

	public void setUp() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
	}

	@Test
	public void Forget() {

		WebElement ForgetPassword = driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a"));
		ForgetPassword.click();

	
		System.out.println("I Forget My Account");
		
	}
	@AfterClass

	public void tearDown() {
		driver.close();
	}
}
