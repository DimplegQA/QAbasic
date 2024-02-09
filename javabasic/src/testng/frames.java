package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class frames {

		// TODO Auto-generated method stub
		static WebDriver driver;
		 @BeforeTest
		    public void openbrowser() {
		        // Set the path to the chromedriver executable
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
				//webDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				 driver = new ChromeDriver(options);	
				 driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		 								}
		 @Test
			 public void frames1() throws InterruptedException {
				 driver.switchTo().frame("packageListFrame");
				 driver.findElement(By.linkText("org.openqa.selenium.bidi")).click();
				 Thread.sleep(2000);
				 driver.switchTo().defaultContent();
				 driver.switchTo().frame("packageFrame");
				WebElement obj= driver.findElement(By.linkText("Command"));
				System.out.println(obj.getText());
				Thread.sleep(2000);
				obj.click();
				String actvalue="obj";
				String expvalue="event";
				if(expvalue.equalsIgnoreCase(actvalue)) 
					System.out.println("both are same");
				else 
					System.out.println("both are not same");
				
				// driver.switchTo().defaultContent().close();
			 }
		 
	
}
