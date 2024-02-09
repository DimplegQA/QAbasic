package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dataprovider {
	static WebDriver driver;
	 @Test
	    public void openbrowser() {
	        // Set the path to the chromedriver executable
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\dimple\\TEST\\res\\sel\\chromedriver.exe");
			//webDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);	
			 driver.get("https://au.mobile.yahoo.com/mail");
			 driver.manage().window().maximize();}
	@DataProvider
	public Object[][]testdata(){
		Object[][] data=new Object[1][2];
	data[0][0]="gdimple7789";
	data[0][1]="Selenium12";
	return data;}
@Test(dataProvider="testdata")
public void mail(String un,String pws) throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/div/div[3]/div[1]/div/a")).click();
	driver.findElement(By.id("login-username")).sendKeys(un);	
 driver.findElement(By.xpath("//input[contains(@type,'submit')]")).submit();
 Thread.sleep(7000);
/* driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[3]")).click();
// driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
 Thread.sleep(6000);
 driver.findElement(By.xpath("//*[@id=\"recaptcha-submit\"]")).click();
 driver.findElement(By.xpath("//input[starts-with(@type,'password')]")).sendKeys(pws);
 driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
 driver.findElement(By.xpath("//*[@id=\"ybarMailLink\"]")).click();*/
 
}
@Test
	public void close() {
	driver.close();
}
}
