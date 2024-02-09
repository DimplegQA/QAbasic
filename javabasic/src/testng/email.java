package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class email {
	static WebDriver driver;
	 @BeforeTest
	    public void openbrowser() throws InterruptedException {
	        // Set the path to the chromedriver executable
		 System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\msedgedriver.exe");
			//webDriverManager.chromedriver().setup();
			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("--remote-allow-origins=*");
			 driver = new EdgeDriver();	
			 Thread.sleep(8000);
			 
			 driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1509694233%3A1682408554275649&continue=https%3A%2F%2Fads.google.com%2Fnav%2Flogin%3Fsubid%3Din-en-adon-awa-sch-c-bbb%21o3%7E0c23d311e6851a7eb7e6b75662d9c182%7Ep71078822507%7E&followup=https%3A%2F%2Fads.google.com%2Fnav%2Flogin%3Fsubid%3Din-en-adon-awa-sch-c-bbb%21o3%7E0c23d311e6851a7eb7e6b75662d9c182%7Ep71078822507%7E&ifkv=AQMjQ7R2RygNeRZ3Qwwf3W6MKKTudWyJIcljkifkEfJ2SGqwhiBUBvr-NBeLWJ4vm8cWGr1gcyV-tQ&osid=1&passive=1209600&service=adwords&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			 Thread.sleep(4000);
			 driver.manage().window().maximize();}
	// @Parameters({"username","password"})
	 @Test 
	 public void mail() throws InterruptedException, AWTException {
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("dimpleg286@gmail.com");
	     driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	     Thread.sleep(4000);
	    driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("somadatta");
	     driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
	     Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//*[@id=\":9q\"]")).click();
	     StringSelection sel=new StringSelection("C:\\Users\\DELL\\MS.docx");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
	     Robot rb=new Robot();
	     rb.keyPress(KeyEvent.VK_ENTER);
	     rb.keyRelease(KeyEvent.VK_END);
	     
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyRelease(KeyEvent.VK_V);
	     
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyRelease(KeyEvent.VK_V);
	     
	     rb.keyPress(KeyEvent.VK_ENTER);
	     rb.keyPress(KeyEvent.VK_ENTER);
	 }
}
