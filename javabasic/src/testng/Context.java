package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Context {
	static WebDriver driver;
	 @BeforeTest
	    public void openbrowser() {
	        // Set the path to the chromedriver executable
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
			//webDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);	
			 driver.get("https://www.google.com");
	 }
	 @Test
		 public void rightclick() {
		WebElement link =driver.findElement(By.linkText("Gmail"));
			//link.click();
			Actions act = new Actions(driver);
			
			//act.doubleClick(link).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			act.contextClick(link).build().perform();
			// Send arrow down key to navigate the context menu
	      //act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			//driver.close();
		 }
	 
}
