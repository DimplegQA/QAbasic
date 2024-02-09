package javabasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class set {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\browser\\resourses\\chromedriver.exe");
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--remote-allow-origins=*");
       WebDriver driver = new ChromeDriver(options);
       driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
       driver.manage().window().maximize();
       
       
       // dropdown
       
       WebElement courseElement=driver.findElement(By.id("course"));
       Select courseNameDropdown = new Select(courseElement);
       courseNameDropdown.selectByValue("java");
       Thread.sleep(2000);
       courseNameDropdown.selectByIndex(2);
       
       //List of elements
       
       List<WebElement> elements = driver.findElements(By.id("course"));
      for(WebElement element:elements) {
    	  System.out.println(element.getText());
    	  
    	  //check box
    	  driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
    	  WebElement Checkbox = driver.findElement(By.xpath("//*[@id=\"contactList\"]/tbody/tr[2]/td[1]/input"));
    	  Checkbox.click();
      }
}
	}