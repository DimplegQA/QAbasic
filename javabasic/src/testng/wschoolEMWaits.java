package testng;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class wschoolEMWaits {
	static WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException {

	// initializing driver variable using FirefoxDriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
		//webDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);	
	driver.get("https://www.w3schools.com/");
	// maximized the browser window
	driver.manage().window().maximize();
	//ImplicitWait it will wait for 10sec
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws InterruptedException {
	driver.findElement(By.id("search2")).sendKeys("tags");
	//explicit
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("learntocode_searchicon")));
	// click on it
	driver.findElement(By.id("learntocode_searchicon")).click();
	
	}
}
