package tests.Selenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DemoQAWebSite {
	public static WebDriver driver= new ChromeDriver();
	public static JavascriptExecutor js = (JavascriptExecutor) driver;
	public static void main(String[] args) throws InterruptedException {
//Launch the Browser
		//WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//Open DemoQA URL
		driver.get("https://demoqa.com/profile");
		
//Check visibility of Elements Icon and click on Element
		WebElement Elements=driver.findElement(By.xpath("(//*[contains(text(),'Elements')])[2]"));
		Assert.assertTrue(Elements.isDisplayed(), "Elements is not displayed");
		WebElement ElementsList=driver.findElement(By.xpath("(//*[contains(text(),'Elements')])[2]/following-sibling::div"));
		ElementsList.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//Check Elements List Count
		List<WebElement>ElementsCountlist=driver.findElements(By.xpath("//div[@class='element-list collapse show']/ul/li"));
		System.out.println("List Elements Present in Elements:"+ElementsCountlist.size());
		
//Text Box
		Menupointselection("Text Box");
//Add Details in Text Box Field form
		WebElement Fullname=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		Fullname.clear();
		WebElement email=driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
		WebElement currentaddr=driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
		WebElement permanantaddr=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		Fullname.sendKeys("Komal Ananda Mali");
		email.sendKeys("Komalmali1312@gmail.com");
		currentaddr.sendKeys("A/P Rahimatpur Tal.Koregaon Dist.Satara");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(permanantaddr));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", permanantaddr);
		permanantaddr.sendKeys("A/P Rahimatpur Tal.Koregaon Dist.Satara");
	    WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
//CheckBox Menu
		js.executeScript("arguments[0].scrollIntoView(true);", Elements);
		Menupointselection("Check Box");
		WebElement checkboxheading=driver.findElement(By.xpath("//h1[text()='Check Box']"));
		wait.until(ExpectedConditions.visibilityOf(checkboxheading));
		WebElement checkboxoption=driver.findElement(By.xpath("//span[text()='Home']"));
		WebElement checkboxexpand=driver.findElement(By.xpath("//button[@title='Expand all']"));
		checkboxexpand.click();
		WebElement checkoption=driver.findElement(By.xpath("//span[text()='Classified']"));
		js.executeScript("arguments[0].scrollIntoView(true);", checkoption);
		if(!checkoption.isSelected())
			checkoption.click();
//Radio Button Menu
		js.executeScript("arguments[0].scrollIntoView(true);", Elements);
		Menupointselection("Radio Button");
		WebElement Radiobuttonheading=driver.findElement(By.xpath("//h1[text()='Radio Button']"));
		wait.until(ExpectedConditions.visibilityOf(Radiobuttonheading));
		WebElement Questionexist=driver.findElement(By.xpath("//div[text()='Do you like the site?']"));
		Assert.assertTrue(Questionexist.isDisplayed(), "Questionexist is not displayed");
		radiobuttonoptions("impressiveRadio");
//WebTables
		js.executeScript("arguments[0].scrollIntoView(true);", Elements);
		Menupointselection("Web Tables");
		WebElement table=driver.findElement(By.xpath("//h1[text()='Web Tables']"));
		wait.until(ExpectedConditions.visibilityOf(table));
		//Get Count of Columns and Rows
		List<WebElement>rows=driver.findElements(By.xpath("(//div[@class='rt-table']/child::div)[2]/div"));
		int Rowcount=rows.size();
		System.out.println(Rowcount);
		List<WebElement>columns=driver.findElements(By.xpath("//div[@class='rt-table']/div/div[@role='row']/div"));
		int columnscount=columns.size();
		System.out.println(columnscount);
		List<WebElement>columnheadres=driver.findElements(By.xpath("//div[@class='rt-table']/div/div[@role='row']/div"));
		for(WebElement header:columnheadres)
		{
			System.out.println(header.getText());
		}
		//Get all values from WebTable
		for(int i=1;i<Rowcount;i++)
		{
			for(int j=1;j<columnscount;j++)
			{
				System.out.println(driver.findElement(By.xpath("((//div[@class='rt-table']/child::div)[2]/div)["+i+"]/div/div["+j+"]")).getText());
			}
		}
		//Pagination
		WebElement Pagination=driver.findElement(By.xpath("//span[@class='select-wrap -pageSizeOptions']/select"));
		js.executeScript("arguments[0].scrollIntoView(true);", Pagination);
		Select se=new Select(Pagination);
		se.selectByVisibleText("5 rows");
		//Get Count of Rows
		List<WebElement>newRowCount=driver.findElements(By.xpath("(//div[@class='rt-table']/child::div)[2]/div"));
		int newRowCounts=newRowCount.size();
		System.out.println(newRowCounts);
		Assert.assertEquals(newRowCounts, 5);
//Buttons
		js.executeScript("arguments[0].scrollIntoView(true);", Elements);
		Menupointselection("Buttons");
		WebElement Buttonsheading=driver.findElement(By.xpath("//h1[text()='Buttons']"));
		wait.until(ExpectedConditions.visibilityOf(Buttonsheading));
		Actions act=new Actions(driver);
		act.doubleClick(buttonoptions("Double Click Me")).perform();
		System.out.println(("doubleClickMessage"));
		act.doubleClick(buttonoptions("Right Click Me")).perform();
		System.out.println(("rightClickMessage"));
		act.doubleClick(buttonoptions("Click Me")).perform();
		System.out.println(("dynamicClickMessage"));
//Links
		js.executeScript("arguments[0].scrollIntoView(true);", Elements);
		Menupointselection("Links");
		WebElement Linksheading=driver.findElement(By.xpath("//h1[text()='Links']"));
		wait.until(ExpectedConditions.visibilityOf(Linksheading));
		List<WebElement>links=driver.findElements(By.xpath("//div[@id='linkWrapper']/child::p/a"));
		System.out.println(("Total Links are:"+links.size()));
		String currentPageURL=driver.getCurrentUrl();
		for(WebElement link:links)
		{
			
			String Hrefvalue=link.getAttribute("href");
			if(!Hrefvalue.isEmpty())
			{
				js.executeScript("arguments[0].click();", link);
				if(driver.getCurrentUrl().equals(currentPageURL))
					System.out.println("Broken Link is:"+Hrefvalue);
				else
					System.out.println("Valid Link is:"+Hrefvalue);
			}
			else
				System.out.println("Empty Link is:"+Hrefvalue);
		}
//Broken Images and Links
		js.executeScript("arguments[0].scrollIntoView(true);", Elements);
		Menupointselection("Broken Links - Images");
		WebElement Brokenlinksheading=driver.findElement(By.xpath("//h1[text()='Broken Links - Images']"));
		wait.until(ExpectedConditions.visibilityOf(Brokenlinksheading));
		
		List<WebElement>Images=driver.findElements(By.xpath("//img"));
		System.out.println(("Total Images are:"+links.size()));
		for(WebElement image:Images)
		{
			long width=(long) js.executeScript("return arguments[0].naturalWidth;", image);
			long height=(long) js.executeScript("return arguments[0].naturalHeight;", image);
			if (width == 0 || height == 0) {
	            System.out.println("Broken Image: " + image.getAttribute("src"));
	        } else {
	            System.out.println("Valid Image: " + image.getAttribute("src"));
	        }
	    }
//Upload and Download
		js.executeScript("arguments[0].scrollIntoView(true);", Elements);
		Menupointselection("Upload and Download");
		WebElement uploadandDownlod=driver.findElement(By.xpath("//h1[text()='Upload and Download']"));
		wait.until(ExpectedConditions.visibilityOf(uploadandDownlod));
		WebElement downloadbutton=driver.findElement(By.xpath("//div//a[@id='downloadButton']"));
		downloadbutton.click();
		WebElement uploadbutton=driver.findElement(By.xpath("//input[@id='uploadFile']"));
		uploadbutton.sendKeys("D:\\BharatTechnologyProject\\manual notes.pdf");
		Thread.sleep(2000);
//Alerts, Frame & Windows
		WebElement Alertsframeswindows=driver.findElement(By.xpath("//div[contains(text(),'Alerts, Frame & Windows')]"));
		js.executeScript("arguments[0].scrollIntoView(true);", Alertsframeswindows);
		Alertsframeswindows.click();
//Windows
		Menupointselection("Browser Windows");
		WebElement WindowsHeading=driver.findElement(By.xpath("//h1[text()='Browser Windows']"));
		wait.until(ExpectedConditions.visibilityOf(WindowsHeading));
		WebElement newTabbutton=driver.findElement(By.xpath("//div[@id='tabButtonWrapper']/child::button[text()='New Tab']"));
		newTabbutton.click();
		switchtonewwindow();
		WebElement newwindowbutton=driver.findElement(By.xpath("//div[@id='windowButtonWrapper']/child::button[text()='New Window']"));
		js.executeScript("arguments[0].click();", newwindowbutton);
		switchtonewwindow();
		WebElement newwindowmsg=driver.findElement(By.xpath("//div[@id='msgWindowButtonWrapper']/child::button[text()='New Window Message']"));
		js.executeScript("arguments[0].click();", newwindowmsg);
		switchtonewwindow();
		//driver.quit();
		Thread.sleep(5000);
//Alerts
		
		//driver.get("https://demoqa.com/profile");
		WebElement Alertsframesmenu=driver.findElement(By.xpath("//div[contains(text(),'Alerts, Frame & Windows')]"));
		wait.until(ExpectedConditions.visibilityOf(Alertsframesmenu));
		js.executeScript("arguments[0].scrollIntoView(true);", Alertsframesmenu);
		Alertsframesmenu.click();
		WebElement alerts=driver.findElement(By.xpath("//span[text()='Alerts']"));
		wait.until(ExpectedConditions.visibilityOf(alerts));
		js.executeScript("arguments[0].click();", alerts);
	   // Menupointselection("Alerts");
	    WebElement AlertsHeading=driver.findElement(By.xpath("//h1[text()='Alerts']"));
		wait.until(ExpectedConditions.visibilityOf(AlertsHeading));
		WebElement NormalAlert=driver.findElement(By.xpath("//button[@id='alertButton']"));
		NormalAlert.click();
		Alert al=driver.switchTo().alert();
		al.accept();
		WebElement TimerAlert=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		TimerAlert.click();
		wait.until(ExpectedConditions.alertIsPresent());
		al.dismiss();
		WebElement ConfirmationAlert=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		ConfirmationAlert.click();
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(al.getText());
		al.accept();
		WebElement PromptAlert=driver.findElement(By.xpath("//button[@id='promtButton']"));
		PromptAlert.click();
		wait.until(ExpectedConditions.alertIsPresent());
		al.sendKeys("Promptalert");
		System.out.println(al.getText());
		al.dismiss();
	}
	public static void Menupointselection(String Menu)
	{
		
		WebElement Menus=driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/li/span[text()='"+Menu+"']"));
		Menus.click();
	}
	public static void radiobuttonoptions(String radio)
	{
		WebElement radiooptions=driver.findElement(By.xpath("//div[text()='Do you like the site?']/parent::div/child::div/input[@id='"+radio+"']"));
		js.executeScript("arguments[0].click();", radiooptions);
	}
	//button[text()='Click Me']
	public static WebElement buttonoptions(String Buttontext)
	{
		WebElement button=driver.findElement(By.xpath("//button[text()='"+Buttontext+"']"));
		return button;
	}
	public static String buttonactionstext(String actionresult)
	{
		String actions=driver.findElement(By.xpath("//p[@id='"+actionresult+"']")).getText();
		return actions;
	}
	public static void switchtonewwindow()
	{
		Set<String>WindowIDs=driver.getWindowHandles();
		String OriginalWindow=driver.getWindowHandle();
		for(String WindowID:WindowIDs)
		{
		if(!WindowID.equals(OriginalWindow))
		{
			  driver.switchTo().window(WindowID);  // Switch to the new window or tab
              break; 
		}
	}
		String Title=driver.getTitle();
		driver.close();
		System.out.println(Title);
		driver.switchTo().window(OriginalWindow);
	}
}
