
package TestNG.Orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {

	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	@Test
	public void Log() throws InterruptedException {
		System.setProperty("webdriver.firefox.driver",
				"C:\\Users\\Syed Arfaat\\Downloads\\edgedriver_win64\\edgedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Page opened");

		WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
		Username.click();
		Username.sendKeys("Admin");
		System.out.println("Entered Username");

		WebElement Paasword = driver.findElement(By.xpath("//input[@name='password']"));
		Paasword.click();
		Paasword.sendKeys("admin123");
		System.out.println("Entered Password");

		WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		submit.click();
		System.out.println("Page Login");

		WebElement myInfo = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
		myInfo.click();
		System.out.println("Navigated to My info");

	}

}
