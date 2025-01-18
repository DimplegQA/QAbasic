package objusingPropertiesfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Propertiesfile {
			
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\Object repository\\res\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/guru99home/");					
    driver.manage().window().maximize();			
// Load the properties File		
    Properties obj = new Properties();					
    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\application.properties");									
    obj.load(objfile);					
// Nagigate to link Mobile Testing and Back	
    Thread.sleep(4000);
    driver.findElement(By.xpath(obj.getProperty("MobileTesting"))).click();							
    driver.navigate().back();
    Thread.sleep(2000);
// Enter Data into Form		
    driver.findElement(By.xpath(obj.getProperty("Selenium"))).click();
    driver.navigate().back();
    Thread.sleep(2000);
    driver.findElement(By.xpath(obj.getProperty("livetesting"))).click();
    Thread.sleep(2000);
    driver.close();
    
	}				

}
