package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testdemo1 {

	public static void main(String[] args) {
		
		
		// to open  the chrome driver
  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
  // to do action on driver
  ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	//to maximize  driver window
	driver.manage().window().maximize();
	//to open the url	
	driver.get("https://www.ebay.com/");
	driver.findElement(By.id("gh-ac")).sendKeys("doll");
	}

}
