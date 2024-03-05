package TestNG.Orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Job extends Login {

	@SuppressWarnings("deprecation")
	@AfterMethod
	public void jobs() {

		WebDriver driver = Login.driver;
		WebElement job = driver.findElement(By.xpath("//a[normalize-space()='Job']"));
		job.click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		System.out.println("Clicked on Job");

	}
}
