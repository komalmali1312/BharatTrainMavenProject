package tests.Selenium;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment21 {

	public static void main(String[] args) throws InterruptedException {
//		1. Launch browser window
		WebDriver driver= new ChromeDriver();

//		2. Maximize the browser window
		driver.manage().window().maximize();
//		3. Delete all the cookies
		driver.manage().deleteAllCookies();
//		4. Enter URL and Launch the application (https://parabank.parasoft.com/parabank/index.htm)
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
//		5. Verify application title
		String AppTitle=driver.getTitle();
		System.out.println("Application Tilte is:"+AppTitle);
		Assert.assertEquals(AppTitle,"ParaBank | Welcome | Online Banking","Title does not match");
//		6. Verify application logo
		WebElement ApplicationLogo=driver.findElement(By.xpath("//img[@class=\"admin\"]"));
		Boolean ApplicationLogoDisplayed=ApplicationLogo.isDisplayed();
		Assert.assertTrue(ApplicationLogoDisplayed, "Logo not Displayed");
		System.out.println("application logo Displayed satus is:"+ApplicationLogoDisplayed);
//		7. Verify application caption
		String Caption=driver.findElement(By.xpath("//p[@class='caption']")).getText();
		System.out.println("Application Caption is:"+Caption);
		Assert.assertEquals(Caption,"Experience the difference","Caption does not match");
//		8. Enter Invalid credentials in Username and Password textboxes
		WebElement Username=driver.findElement(By.xpath("//input[@class='input' and @name='username']"));
		Username.clear();
		Username.sendKeys("admin");
		Thread.sleep(2000);
		WebElement Password=driver.findElement(By.xpath("//input[@class='input' and @name='password']"));
		Password.clear();
		//Password.sendKeys("admin");
		Thread.sleep(2000);
		WebElement LoginButton=driver.findElement(By.xpath("//div[@class='login']/child::input[@value='Log In']"));
//		9. Click on Login Button
		LoginButton.click();
//		10. Verify error message is displayed (The username and password could not be verified.)	
		WebElement Errormsg=driver.findElement(By.cssSelector("#rightPanel>p[class='error']"));
		System.out.println("Error msg is:"+Errormsg.getText());
//		11. Click on Adminpage link
		WebElement AdminPage=driver.findElement(By.cssSelector("ul.leftmenu>li>a[href='admin.htm']"));
		AdminPage.click();
//		12. Wait for admin page
		WebElement adminpage=driver.findElement(By.xpath("//h1[@class='title']"));
		Boolean adminpageDisplayed=adminpage.isDisplayed();
		System.out.println("ADMIN PAGE Displayed satus is:"+adminpageDisplayed);
//		13. Select Data access mode as ' SOAP'
		WebElement SOAPModeselect=driver.findElement(By.xpath("//input[@id='accessMode1' and @value='soap']"));
		SOAPModeselect.click();
//		14. Scrolldown till Loan provider
	    WebElement LoanProvider=driver.findElement(By.xpath("//b[text()='Loan Provider:']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", LoanProvider);
//		15. Select Loanprovider as 'Web Service'
		WebElement LoanProviderdrpdown=driver.findElement(By.xpath("//select[@id='loanProvider']"));
		Select se=new Select(LoanProviderdrpdown);
		se.selectByVisibleText("Web Service");
//		16. Click on Submit button
		WebElement SubmitButton=driver.findElement(By.xpath("//input[@class='button' and @value='Submit']"));
		SubmitButton.click();
//		17.wait for Successful submission message
		Thread.sleep(2000);
		WebElement SuccesSubmitionmsg=driver.findElement(By.xpath("//b[text()='Settings saved successfully.']"));
		Boolean Submittionstatus=SuccesSubmitionmsg.isDisplayed();
		System.out.println("SuccesSubmitionmsg Displayed satus is:"+Submittionstatus);
//		18.Click on Services Link
		WebElement ServicesPage=driver.findElement(By.cssSelector("ul.leftmenu>li>a[href='services.htm']"));
		ServicesPage.click();
//		19.Wait for Services page
		WebElement servicepage=driver.findElement(By.xpath("//span[text()='Available Bookstore SOAP services:']"));
		Boolean servicepageDisplayed=servicepage.isDisplayed();
		System.out.println("Services PAGE Displayed satus is:"+servicepageDisplayed);
//		20.Scrolldown till Bookstore services
		WebElement Bookstore=driver.findElement(By.xpath("//span[text()='Bookstore services:']"));
		js.executeScript("arguments[0].scrollIntoView(true);", Bookstore);
//		21.Get total rows, columns in the bookstore service table
		WebElement Table=driver.findElement(By.xpath("//span[text()='Bookstore services:']/preceding-sibling::table/following::table[1]/tbody"));
		List<WebElement>rows=driver.findElements(By.xpath("//span[text()='Bookstore services:']/preceding-sibling::table/following::table[1]/tbody/tr"));
		System.out.println("Total Rows of BookStore Services are:"+rows.size());
		List<WebElement>coloumns=driver.findElements(By.xpath("//span[text()='Bookstore services:']/preceding-sibling::table/following::table[1]/tbody/tr[1]/td"));
		System.out.println("Total Colns of BookStore Services are:"+coloumns.size());
//		22.Get Column headers of book store services table
		int TotalCols=coloumns.size();
		int TotalRows=rows.size();
		for(int i=1;i<=TotalCols;i++)
		{
		WebElement ColumnHeaders=driver.findElement(By.xpath("//span[text()='Bookstore services:']/preceding-sibling::table/following::table[1]/tbody/tr[1]/td["+i+"]"));
		System.out.println("Column Header Value is:"+ColumnHeaders.getText());
		}
		
//		23.Get all the data from book store service table
		for(int r=2;r<TotalRows;r++)
		{
			for(int c=1;c<=TotalCols;c++)
			{
System.out.print(driver.findElement(By.xpath("//span[text()='Bookstore services:']/preceding-sibling::table/following::table[1]/tbody/tr["+r+"]/td["+c+"]")).getText());	
			}
			System.out.println();
		}
//		24.Close browser window
	    driver.close();
	}

}
