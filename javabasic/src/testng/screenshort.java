package testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class screenshort {
	static WebDriver driver;
	 @BeforeSuite
	    public void openbrowser() {
	        // Set the path to the chromedriver executable
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\git\\QAbasic\\javabasic\\resource\\chromedriver.exe");
			//webDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);	
			 driver.get("https://www.shopify.com/in/free-trial/3-steps?term=shopify&adid=566014743975&campaignid=15433369407&branded_enterprise=1&BOID=brand&gclid=CjwKCAjwxaanBhBQEiwA84TVXJGKEtzOd030YKpxJ6GwZT247r2gF6WZqqLdXlBEYFg-My9yHHNmXhoC_yEQAvD_BwE&cmadid=516585705;cmadvertiserid=10730501;cmcampaignid=26990768;cmplacementid=324494758;cmcreativeid=163722649;cmsiteid=5500011");}
	
	 @BeforeTest
	 public void max() {
		 driver.manage().window().maximize();
	 }
	 @Test
	 public void ss() {
		File abc= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(abc, new File("C:\\Users\\DELL\\git\\QAbasic\\javabasic\\screenshot\\dimple.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}}
		// tagname
		@Test
		public void testas() {
		System.out.println("hi this aftersuite");	
		driver.close();
		}
	//FileUtils.copyFile(src, new File("C:/selenium/error.png"));
	 }


