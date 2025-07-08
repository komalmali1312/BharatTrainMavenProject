package tests.Selenium;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserActions {

	public static void main(String[] args) throws InterruptedException {
//Launch Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String maninwindowid=driver.getWindowHandle();
		System.out.println(maninwindowid);
		Thread.sleep(2000);
//Minimize Browser
		driver.manage().window().minimize();
		Thread.sleep(2000);
//Maximize Browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
//Maximize to specific resolution
		driver.manage().window().setSize(new Dimension(430,932));
		Thread.sleep(2000);
//Again maximize		
		driver.manage().window().maximize();
		Thread.sleep(2000);
//Verify Its Title
		String Actual=driver.getTitle();
		System.out.println(driver.getTitle());
		String Expected="Googleeee";
		if(Actual.equalsIgnoreCase(Expected))
			System.out.println("Correct URL Opened");	
		else
			System.out.println("Wrong URL Opened");
//Delete all cookies
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
//navigate to new URL
		driver.navigate().to("https://mvnrepository.com/");
		String secondwindowids=driver.getWindowHandle();
		System.out.println(secondwindowids);
		Thread.sleep(2000);
//navigate back and Forward
		driver.navigate().back();
		Thread.sleep(2000);
//navigate back and Forward
		driver.navigate().forward();
		Thread.sleep(2000);
//Open new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://chatgpt.com/");
		Set<String>windowIDs=driver.getWindowHandles();
		System.out.println(windowIDs);
		Thread.sleep(2000);
//Open new Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.selenium.dev/");
		Set<String>newbrowserwindowIDs=driver.getWindowHandles();
		System.out.println(newbrowserwindowIDs);
		Thread.sleep(2000);
//Close The Driver
		driver.close();
		Thread.sleep(2000);
		driver.quit();
//open new tab in incognito
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--window-size=1920,1080");
		options.addArguments("--disable-notification");
		WebDriver driver2 = new ChromeDriver(options);
		driver2.get("https://www.google.com/");
		Thread.sleep(2000);
		String maninwindowid2=driver2.getWindowHandle();
		System.out.println(maninwindowid2);
		Thread.sleep(2000);
//Close all browsers
		
		driver2.quit();
	}
}
