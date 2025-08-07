package tests.Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testngconcepts1 {
	static WebDriver driver;
	@DataProvider(name="testdata")
	public Object[][] getData() {
		return new Object[][] {
			{"test1", "data1"},
			{"test2", "data2"},
			{"test3", "data3"}
		};
	}
	@BeforeSuite()
	public void launchBrowser()
{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser launched successfully");
}
	@BeforeMethod()
	
	public void loginToApplication()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Application launched successfully");
		WebElement Username=driver.findElement(By.xpath("//input[@name='username']"));
		Username.sendKeys("Admin");
		System.out.println("Username entered successfully");
		WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("admin123");
		System.out.println("Password entered successfully");
		driver.findElement(By.xpath("//button[@id='login']")).click();
		System.out.println("Login to application successfully");
	}
	@Test
	public void testcase1()
	{
	System.out.println("This is first test case executed successfully");		
	}
	@Test
	public void testcase2()
	{
	System.out.println("This is Second test case executed successfully");		
	}
	@Test
	public void testcase3()
	{
	System.out.println("This is Third test case executed successfully");		
	}
	@AfterMethod()
	public void logoutFromApplication() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//wait for alert is present
		try {
			Alert alert = wait.until(driver -> driver.switchTo().alert());
			alert.accept();
			System.out.println("Alert accepted");
		} catch (Exception e) {
			System.out.println("No alert present");
		}
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		System.out.println("Logout from application");
		System.out.println("Browser closed successfully");
	}
	
	
	@AfterSuite()
	public void closeBrowser()
{
		
	driver.quit();
}
}
