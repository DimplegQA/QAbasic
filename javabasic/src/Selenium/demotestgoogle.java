package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demotestgoogle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
	     WebDriver driver = new ChromeDriver(options);
	        driver.get("https://www.google.com/");
	      //  driver.manage().window().minimize();
	      driver.manage().window().maximize();
	      driver.findElement(By.id("APjFqb")).sendKeys("selenium");
	     // driver.findElement(By.)
	     //   driver.findElement(By.id("APjFqb")).sendKeys("java");
	        driver.findElement(By.className("gNO89b")).click();
	      //  driver.navigate().to("https://www.shopify.com/in");
	        //driver.close();
}}
