package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class list1forms {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);//C:\Users\DELL\eclipse-workspace\TEST\res\sel\chromedriver - Copy.exe
		driver.get("https://forms.gle/cnGQwLxfpkbZbd7N7");
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div[2]")).click();
		driver.manage().window().maximize();
		List<WebElement> elements = driver.findElements(By.tagName("span"));
		for (WebElement element : elements) {
		    System.out.println(element.getText());}
		
		/*WebElement courseElement=driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[1]/div"));
		Select courseNameDropdown = new Select(courseElement);
		courseNameDropdown.selectByVisibleText("java");
		Thread.sleep(4000);	
		driver.close();	*/
	}

}
