package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class robotex { 
	WebDriver driver;
	@BeforeTest
	 public void openbrowser() {
        // Set the path to the chromedriver executable
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
		//webDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);	
		 driver.get("https://www.shopify.com/in");
		 driver.manage().window().maximize();}
	@Test 
	public void dimple() throws InterruptedException, AWTException {
		//driver.findElement(By.xpath("/html/body/button")).click();
		Robot robot = new Robot();	
        robot.mouseMove(0, 1056); // move mouse point to specific location	
        robot.delay(1500);        // delay is to make code wait for mentioned milliseconds before executing next step	
       WebElement link=driver.findElement(By.xpath("//a[contains(text(),'Sign up now')]"));
       link.click();
       driver.quit();
       //syntax 
       //robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // press left click	
       // robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // release left click	
       // robot.delay(1500);	
       // robot.keyPress(KeyEvent.VK_DOWN); // press keyboard arrow key to select Save radio button	
       // Thread.sleep(2000);	
       // robot.keyPress(KeyEvent.VK_ENTER);	
        // press enter key of keyboard to perform above selected action
		}
	
}
