package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class diffbw_close_quit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/gmail/about/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.google.com/gmail/about/");
		driver.findElement(By.linkText("Sign in")).click();
			driver.findElement(By.linkText("Help")).click();
		 
		 Thread.sleep(4000);
		 driver.quit();
		 // driver.close();

	}

}
