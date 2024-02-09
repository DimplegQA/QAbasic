package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
	        WebDriver driver = new ChromeDriver(options);		
	        driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 driver.findElement(By.className("gLFyf")).sendKeys("java");
		 
		 Thread.sleep(4000);
		// driver.findElement(By.className("gLFyf")).submit();
		 Thread.sleep(4000);
		 driver.navigate().to("https://www.facebook.com/");
		 Thread.sleep(2000);//Phone number, username, or email
		 driver.findElement(By.id("email")).sendKeys("Dimple");
		 Thread.sleep(4000);
		 driver.navigate().refresh();
		 Thread.sleep(4000);
		 driver.navigate().back();
		 Thread.sleep(4000);
		 driver.navigate().forward();
		 Thread.sleep(4000);
		 driver.quit();
	}

}
