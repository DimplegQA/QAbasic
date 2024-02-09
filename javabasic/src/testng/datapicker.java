package testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datapicker {
	static WebDriver driver;
	 @BeforeTest
	    public void openbrowser() {
	        // Set the path to the chromedriver executable
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\dimple\\TEST\\res\\sel\\chromedriver.exe");
			//webDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);	
			 driver.get("https://jqueryui.com/droppable/");}
	 @Test
	 public void ss() {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File("C:\\Users\\DELL\\Desktop\\G.dimple\\ss1.jpg"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		 
		  }
	
}
