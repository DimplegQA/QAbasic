package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class multi_browser {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		        // Set the path to the ChromeDriver executable
		        System.setProperty("webdriver.gecko.driver", "./resource/geckodriver.exe");
		        System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
		        System.setProperty("webdriver.edge.driver", "./resource/msedgedriver.exe");
		        // Open Chrome browser
			     
		        ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver chromeDriver = new ChromeDriver(options);
				 chromeDriver.get("https://www.google.com");
			        System.out.println("Chrome browser opened");
		        // Create the first browser instance
			        // Open Firefox browser
		        WebDriver driver1 = new FirefoxDriver();
		        Thread.sleep(2000);
		        driver1.get("https://www.amazon.com/");
		        // Create the second browser instance
		        Thread.sleep(2000);    
		        System.out.println("Firefox browser opened");

		        // Open Edge browser
		        WebDriver edgeDriver = new EdgeDriver();
		        Thread.sleep(2000); 
		        edgeDriver.get("https://selenium.dev/");
		        System.out.println("Edge browser opened");

		        // Close the browsers
		        chromeDriver.quit();
		        driver1.quit();
		        edgeDriver.quit();
		       // Perform some actions in each browser instance
		       // For example, you can interact with elements, click buttons, fill forms, etc.
		       // Close the browsers when you are done
		       

	}

}
