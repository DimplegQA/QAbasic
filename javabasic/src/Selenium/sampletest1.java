package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sampletest1 {
public static void main(String[] args) throws InterruptedException {
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
		//webDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.linkText("Documentation")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		 driver.get("https://www.google.com/");
		 driver.findElement(By.className("gLFyf")).sendKeys("java");
		
		 
		 Thread.sleep(4000);
		 driver.navigate().refresh();
		 
		
		
}
}
