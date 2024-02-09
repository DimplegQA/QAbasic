package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.wonderplugin.com/wordpress-lightbox");
		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Open a Div in Lightbox')]"));
		element.click();
		WebElement frameElement=driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/wswxQ3mhwqQ']"));
		        driver.switchTo().frame(frameElement);	        
		        driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[4]/button")).click();
	}

}
