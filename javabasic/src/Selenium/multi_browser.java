package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
public class multi_browser {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		        // Set the path to the ChromeDriver executable
		        System.setProperty("webdriver.gecko.driver", "./resource/geckodriver.exe");
		        //ChromeOptions options = new ChromeOptions();
				//options.addArguments("--remote-allow-origins=*");
			//	WebDriver driver = new ChromeDriver(options);
		        // Create the first browser instance
		        WebDriver driver1 = new FirefoxDriver();
		        Thread.sleep(4000);
		        driver1.get("https://www.amazon.com/");
		        // Create the second browser instance
		        Thread.sleep(4000);
		        WebDriver driver2 = new ChromeDriver();
		        // Open URLs in each browser instance
		        Thread.sleep(4000);
		        driver2.get("https://www.google.com");
		        Thread.sleep(4000);
		       // Perform some actions in each browser instance
		       // For example, you can interact with elements, click buttons, fill forms, etc.
		       // Close the browsers when you are done
		        driver1.quit();
		        driver2.quit();

	}

}
