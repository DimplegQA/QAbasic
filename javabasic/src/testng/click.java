package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class click {
	static WebDriver driver;
	@BeforeTest
	public void openbrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--remote-allow-origins=*");
	  driver = new ChromeDriver(options);
	   driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	   driver.manage().window().maximize();
      
     
}
@Test
public void test11() throws InterruptedException {
	 //driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span")).click();
	driver.findElement(By.xpath("//span[text()=\"right click me\"]")) .click();
	Thread.sleep(4000);
	 
}

@AfterTest
public void close() {
	driver.close();
	
}

}
