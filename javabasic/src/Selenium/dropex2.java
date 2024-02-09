package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropex2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		////a[@id="navbarDropdown"]
				System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(options);//C:\Users\DELL\eclipse-workspace\TEST\res\sel\chromedriver - Copy.exe
				driver.get("https://www.selenium.dev/");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]")).click();
				
			driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/div/")).click();
				
				driver.findElement(By.linkText("Events")).click();
				//WebElement courseElement=driver.findElement(By.id("course"));
				/*Element.click();
				Select Dropdown = new Select(Element);
				Dropdown.selectByVisibleText("Events");
				Thread.sleep(4000);*/
				
			
	}
}
