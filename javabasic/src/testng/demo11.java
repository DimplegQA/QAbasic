package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo11 {
	static WebDriver driver;
@BeforeTest
	public void openbrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--remote-allow-origins=*");
      driver = new ChromeDriver(options);
      driver.get("https://www.google.com/");
      driver.manage().window().maximize();
      
     
}
@Test
public void test11() throws InterruptedException {
	 driver.findElement(By.className("gLFyf")).sendKeys("java");
	 Thread.sleep(2000);
	 
}

@AfterTest
public void close() {
	driver.close();
	
}
}