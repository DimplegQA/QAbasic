package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class alerthandle {
	static WebDriver driver;
	 @BeforeTest
	    public void openbrowser() {
	        // Set the path to the chromedriver executable
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
			//webDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);	
	driver.get("file:///C:/Users/DELL/Desktop/G.dimple/alert.html");
	driver.manage().window().maximize();}
	 @Test
	 public void alerthandles2() throws InterruptedException {
		 driver.findElement(By.xpath("//*[text()=\"Login\"]")).click();
		 Thread.sleep(4000);
		 Alert alert=driver.switchTo().alert();
		 System.out.println(alert.getText());
		 Thread.sleep(4000);
		 alert.accept();}
		// alert.sendKeys("dimple");
		// alert.}
		 @AfterTest
		 public void aftertest() {
		driver.close();
		}
		//driver.switchTo().defaultContent().close();
		 
	 
}
	
