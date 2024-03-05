package TestNG.Orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Immigration extends Login {

	@AfterMethod
	public void immigrationTest() {
		WebDriver driver = Login.driver;

		WebElement Username2 = driver.findElement(By.xpath(" (//a[normalize-space()='Immigration'])[1]"));
		Username2.click();
		System.out.println("Navigated to Immigration");

		WebElement Addbutton = driver.findElement(By.xpath(" (//button[@type='button'][normalize-space()='Add'])[1]"));
		Addbutton.click();
		System.out.println("Button Clicked");

		WebElement Radio1 = driver.findElement(By
				.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[2]"));
		Radio1.click();
		System.out.println("Radio Button Clicked");

		WebElement number1 = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[2]"));
		number1.click();
		number1.sendKeys("123456");
		System.out.println("Number Button Clicked");

		WebElement Issdate = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		Issdate.click();
		Issdate.sendKeys("2023-01-01");
		System.out.println("Issue Date Selected");

		WebElement Expdate = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"));
		Expdate.click();
		Expdate.sendKeys("2026-01-01");
		System.out.println("Expiry Date Selected");

		WebElement Eligiblestatus = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[4]"));
		Eligiblestatus.click();
		Eligiblestatus.sendKeys("Yes");
		System.out.println("Eligible Button Clicked");

		WebElement Revdate = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]"));
		Revdate.click();
		Revdate.sendKeys("2023-08-03");
		System.out.println("Review Date Selected");

		WebElement Comments = driver.findElement(By.xpath("(//textarea[@placeholder='Type Comments here'])[1]"));
		Comments.click();
		Comments.sendKeys("This is Immigration");
		System.out.println("Comments Button Clicked");

		WebElement Save = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		Save.click();
		System.out.println("Data is Saved");

	}
}
