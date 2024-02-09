package shopify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class simpleTest {
	static WebDriver driver;
	@Test
	 public void openbrowser() {
	        // Set the path to the chromedriver executable
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
			//webDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);	
			 driver.get("https://www.shopify.com/in");
			 driver.manage().window().maximize();
			 driver.findElement(By.xpath("/html/body/div[2]/section/p/a")).click();
			 }
	@Test
		public void test1() {
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/div/nav/ul/li[1]/div[1]/button/span")).click();
	}
}
