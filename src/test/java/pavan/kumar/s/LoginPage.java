package pavan.kumar.s;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver = null;

	@BeforeMethod

	public void setUp()  throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);

		
		
		
	}

	@Test
	public void swayampakula() throws InterruptedException {

		WebElement emailId = driver.findElement(By.id("email"));
		emailId.sendKeys("pavanyamini45@gmail.com");
		Thread.sleep(2000);

		WebElement newPassword = driver.findElement(By.id("pass"));
		newPassword.sendKeys("powerstar244");
		Thread.sleep(1000);
	//u_0_u
		
		WebElement logIn = driver.findElement(By.id("u_0_u"));
		logIn.click();
		
			System.out.println("I Login to My Facebook");
		
	}

	@AfterClass

	public void tearDown() {
		driver.close();
	}

}
