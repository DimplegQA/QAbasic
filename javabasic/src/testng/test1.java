package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 {
	WebDriver driver;
@BeforeTest
	public void openbrowser() {
        // Set the path to the chromedriver executable
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
		//webDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);	
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
	} 
//@Parameters({"username"})
@Test
public void mail() {
		 driver.findElement(By.name("q")).sendKeys("java"); 
		 driver.findElement(By.className("gLFyf")).submit();
		 
		 //driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
}
@AfterTest
public void close() {
	driver.close();
	
}

}
