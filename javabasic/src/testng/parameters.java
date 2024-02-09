package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {
	static WebDriver driver;
	 @BeforeTest
	    public void openbrowser() {
	        // Set the path to the chromedriver executable
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
			//webDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);	
			 driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-687201921%3A1681898587825676&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&ifkv=AQMjQ7Tf_hntK_nlIRpHDxbINz7A7kraO4E-HQ7_tcvHvNQkEpKNWJ77MNwSGfXa_1YGgfb7J-y7LA&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			 driver.manage().window().maximize();}
	 @Parameters({"username","password"})
@Test 
public void mail(String un,String pws) throws InterruptedException {
	driver.findElement(By.id("identifierId")).sendKeys(un);
    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();////*[@id="identifierNext"]/div/button/span
    Thread.sleep(4000);
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pws);
    //driver.findElement(By.xpath("//input[@type='checkbox']")).click();
   driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
    
}
/*@AfterTest
	public void close() {
	driver.close();
}*/
}
