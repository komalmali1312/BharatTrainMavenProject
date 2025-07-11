package tests.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocatorsParabank {

	public static void main(String[] args) {
//To Launch Website on Chrome		
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
//Logo Locator
		driver.findElement(By.className("admin"));
		driver.findElement(By.cssSelector("img.admin"));
		driver.findElement(By.xpath("//img[@class='admin']"));
//PARABANK Logo
		driver.findElement(By.className("logo"));
		driver.findElement(By.cssSelector("img.logo"));
		driver.findElement(By.xpath("//img[@class='logo']"));
//'Experience the difference' Text below the PARABANK Logo
		driver.findElement(By.xpath("//p[text()='Experience the difference']"));
		driver.findElement(By.cssSelector("p.caption"));
//Solutions Option Locator
		driver.findElement(By.cssSelector("#headerPanel>ul.leftmenu>li.Solutions"));
//AboutUs Option Locator
		driver.findElement(By.xpath("(//a[text()='About Us'])[1]"));
//Services Option Locator
		driver.findElement(By.xpath("(//a[text()='Services'])[1]"));
//Products Option Locator
		driver.findElement(By.xpath("(//a[text()='Products'])[1]"));
//Locations Option Locator
		driver.findElement(By.xpath("(//a[text()='Locations'])[1]"));
//Admin Page Option Locator
		driver.findElement(By.xpath("(//a[text()='Admin Page'])[1]"));
//Headpanel Locator
		driver.findElement(By.id("headerPanel"));
//Headpanel Images Options-Home
		driver.findElement(By.cssSelector("div#headerPanel>ul>li.home"));
//Headpanel Images Options-About Us
		driver.findElement(By.cssSelector("div#headerPanel>ul.button>li.aboutus"));
//Headpanel Images Options-Contact	
		driver.findElement(By.cssSelector("div#headerPanel>ul.button>li.contact"));
//Customer Login
		driver.findElement(By.xpath("//h2[text()='Customer Login']"));
//Username Header
		driver.findElement(By.xpath("//b[text()='Username']"));
//Username TextBox
		driver.findElement(By.cssSelector("div.login>input[name='username']"));
//Password Header
		driver.findElement(By.xpath("//b[text()='Password']"));
//Password TextBox
		driver.findElement(By.cssSelector("div.login>input[name='password']"));
//Sign In Button
		driver.findElement(By.cssSelector("div.login>input[type='submit']"));
//'Forgot login Info' Locator
		driver.findElement(By.xpath("(//a[text()='Forgot login info?'])[1]"));
//'Register' Locator
		driver.findElement(By.partialLinkText("Regis"));
//Right Panel Services Image
		driver.findElement(By.cssSelector("#rightPanel>span.services"));
//ATM Services
		driver.findElement(By.cssSelector("#rightPanel>ul.services>li.captionone"));
//Withdraw funds
		driver.findElement(By.xpath("//a[text()='Withdraw Funds']"));
//Transfer Funds
		driver.findElement(By.xpath("(//a[text()='Transfer Funds'])[1]"));
//Check Balances
		driver.findElement(By.xpath("//a[text()='Check Balances']"));
//Make Deposits
		driver.findElement(By.xpath("//a[text()='Make Deposits']"));
//Online Services
		driver.findElement(By.cssSelector("#rightPanel>ul.servicestwo>li.captiontwo"));
//Bill Pay
		driver.findElement(By.xpath("//a[text()='Bill Pay']"));
//Account History
		driver.findElement(By.xpath("//a[text()='Account History']"));
//Transfer Funds
		driver.findElement(By.xpath("(//a[text()='Transfer Funds'])[2]"));
//Read More
		driver.findElement(By.xpath("(//a[text()='Read More'])[1]"));
//Latest News
		driver.findElement(By.xpath("//h4[text()='Latest News']"));
//Date
		driver.findElement(By.cssSelector("ul.events>li.captionthree"));
//'Parabank is now reopened' Text Locator
		driver.findElement(By.xpath("//a[text()='ParaBank Is Now Re-Opened']"));
//'New! Online Bill Pay' Text Locator
		driver.findElement(By.xpath("//h4[text()='Latest News']"));
//'New! Online Account Transfer' Text Locator
		driver.findElement(By.xpath("//a[text()='New! Online Bill Pay']"));
//Read More second Option
		driver.findElement(By.xpath("(//a[text()='Read More'])[2]"));
//Home
		// driver.findElement(By.cssSelector("#footerPanel>ul>li>a[href='index.htm']"));
		driver.findElement(By.xpath("//a[text()='Home']"));
//|About Us
		driver.findElement(By.xpath("(//a[text()='About Us'])[2]"));
//|Services
		driver.findElement(By.xpath("(//a[text()='Services'])[2]"));
//|Products
		driver.findElement(By.xpath("(//a[text()='Products'])[2]"));
//|Locations
		driver.findElement(By.xpath("(//a[text()='Locations'])[2]"));
//|Forum
		driver.findElement(By.xpath("//a[text()='Forum']"));
//|Site Map
		driver.findElement(By.xpath("//a[text()='Site Map']"));
//|Contact Us
		driver.findElement(By.xpath("//a[text()='Contact Us']"));
//© Parasoft. All rights reserved.
		driver.findElement(By.cssSelector("p.copyright"));
//Visit us at:www.parasoft.com	
		driver.findElement(By.cssSelector("ul.visit"));

		System.out.println("All Locators working Properly");
		driver.close();
	}

}
