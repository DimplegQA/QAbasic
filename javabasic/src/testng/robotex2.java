package testng;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 
public class robotex2 {
	static WebDriver driver;
public static void main(String[] args) throws AWTException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
 driver = new ChromeDriver(options);
driver.get("https://www.edureka.co/?utm_source=Google-Search-Brand&utm_medium=cpc&utm_campaign=Brand-Search-India&utm_term=Edureka+-Core&utm_content=Ad+01&gclid=Cj0KCQjwsIejBhDOARIsANYqkD3klT94KUOZLcprcXOliuem5VPv-hQLzpqu_Gge7O6CA-NDPKQLwq0aAgnPEALw_wcB");
driver.manage().window().maximize();
driver.findElement(By.linkText("Courses")).click();
Robot robot = new Robot();
Thread.sleep(4000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(4000);
robot.keyPress(KeyEvent.VK_TAB);
Thread.sleep(4000);
System.out.println("a");
robot.keyPress(KeyEvent.VK_TAB);
Thread.sleep(4000);
System.out.println("b");
robot.keyPress(KeyEvent.VK_TAB);
Thread.sleep(4000);
System.out.println("c");
robot.mouseMove(30,100);
Thread.sleep(4000);
System.out.println("d");
driver.quit();
 
}
 
}