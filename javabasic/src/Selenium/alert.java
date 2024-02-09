package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
	        WebDriver driver = new ChromeDriver(options);
		driver.get("file:///C:/Users/DELL/Desktop/G.dimple/alert.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
       driver.findElement(By.xpath("/html/body/button[1]")).click();
       Thread.sleep(4000);
       driver.switchTo().alert().accept();
      // driver.switchTo().alert().accept();
       Thread.sleep(4000);
       
      driver.close();
	}

}
