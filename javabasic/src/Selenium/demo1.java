package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//id 
		//linktext
		//class
		//name
		//xpath
		System.setProperty("webdriver.chrome.driver",".\\resource\\chromedriver.exe");
		//webDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.partialLinkText("Read all about it!")).click();
		//driver.findElement(by.)
		
	}

}
