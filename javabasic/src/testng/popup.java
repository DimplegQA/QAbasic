package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class popup {
	 static WebDriver driver;
	 @BeforeTest
	    public void openbrowser() {
	        // Set the path to the chromedriver executable
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\dimple\\TEST\\res\\sel\\chromedriver.exe");
			//webDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);	
	driver.get("file:///C:/Users/DELL/Desktop/G.dimple/prompt.html");
	driver.manage().window().maximize();}
	 @Test
	 public void pormpt() {
		 driver.findElement(By.xpath("/html/body/button")).click();
		 Alert al=driver.switchTo().alert();
		 al.sendKeys("testng");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 // click on the compose button as soon as the "compose" button is visible
		 //al.dismiss();
		 al.accept();
		 driver.switchTo().defaultContent().close();
	 }
	
}
