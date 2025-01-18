package new4features;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class tab {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\Object repository\\res\\chromedriver.exe");
			//webDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);
			 driver.get("https://www.google.com/");
			driver.switchTo().newWindow(WindowType.TAB);
			driver.navigate().to("https://www.youtube.com/");
				driver.switchTo().newWindow(WindowType.WINDOW);
				driver.navigate().to("https://www.crmpro.com/");
	
//				below(): Web element located below for the specified element.
//				toLeftOf() : Target web element which is present to the left of specified element.
//				toRightOf(): Target web element which is presented to the right of a specified element.
//				above(): Web element located above for the specified element.
//				near() : Target web element which is away(approx. 50 pixels) from the specified element.
				}
	

}
