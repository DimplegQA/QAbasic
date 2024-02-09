package testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ssUseMethod {
	static WebDriver driver;
	 @BeforeTest
	    public void openbrowser() {
	        // Set the path to the chromedriver executable
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
			//webDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);	
			 driver.get("https://jqueryui.com/droppable/");}
	 
@Test
	public void ss() {
		takescreenshort(driver,"output1");
	
}

@Test
public void ss2() {
	takescreenshort(driver,"output2");
}

public static void takescreenshort(WebDriver driver,String filename) {
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(src, new File("C:\\Users\\DELL\\Pictures\\javabasic\\screenshot"+filename+".jpg"));
	} catch (IOException e) {
		System.out.println("unable to take screenshort");
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}}


