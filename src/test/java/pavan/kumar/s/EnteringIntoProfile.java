package pavan.kumar.s;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnteringIntoProfile {
	WebDriver driver = null;

	@BeforeMethod

	private void setUp()  throws InterruptedException {

		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
	}
	
	//public void LoginPage() throws InterruptedException {

//		WebElement emailId = driver.findElement(By.id("email"));
//		emailId.sendKeys("pavanyamini45@gmail.com");
//		Thread.sleep(2000);
//
//		WebElement newPassword = driver.findElement(By.id("pass"));
//		newPassword.sendKeys("powerstar24");
//		Thread.sleep(2000);
//
//		//.//*[@id='u_0_u']
//
//		WebElement logIn = driver.findElement(By.id("u_0_u"));
//		logIn.click();
//	}

	@Test
	public void f() throws InterruptedException {
		WebElement emailId = driver.findElement(By.id("email"));
		emailId.sendKeys("pavanyamini45@gmail.com");
		Thread.sleep(2000);

		WebElement newPassword = driver.findElement(By.id("pass"));
		newPassword.sendKeys("powerstar24");
		Thread.sleep(2000);

		//.//*[@id='u_0_u']

		WebElement logIn = driver.findElement(By.id("u_0_u"));
		logIn.click();
		Thread.sleep(2000);
		
		WebElement profileClick = driver.findElement(By.className("_2s25"));
		profileClick.click();
		Thread.sleep(1000);

		WebElement about = driver.findElement(By.className("_6-6 _6-7"));
		about.click();
		Thread.sleep(1000);
	
		System.out.println("I am Entering to My Profile");
	}

	@AfterClass

	public void tearDown() {
		driver.close();
	}
}
