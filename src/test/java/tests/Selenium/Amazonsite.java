package tests.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonsite {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		int linkscount=driver.findElements(By.xpath("//div[@id='nav-main']//a")).size();
		System.out.println(linkscount);
		driver.findElement(By.xpath("(//a[contains(text(),'Fashion')])[1]")).click();
		driver.close();
	}

}
