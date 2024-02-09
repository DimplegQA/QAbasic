package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test4 {
	static WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
	        driver = new ChromeDriver(options);
	       driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	       driver.manage().window().maximize();
	     
	}
	@Test
	public void frame() {
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("ChromeDriver")).click();
		WebElement obj= driver.findElement(By.linkText("ChromeDriverInfo"));
		System.out.println(obj.getText());
		obj.click();
		String actvalue="obj";
		String expvalue ="Addhascasting";
		if(expvalue.equalsIgnoreCase(actvalue)) {
			System.out.println("both are same");
			
		}else
		{
			System.out.println("no same");
		}
	}
}
