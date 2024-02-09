package testng;
//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
//import selenium.dropdown;


public class calender {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\dimple\\TEST\\res\\sel\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	String url="https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Cb%7Cfacebook%20log%20in%7C&placement=&creative=589460569900&keyword=facebook%20log%20in&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409266755%26loc_physical_ms%3D1007741%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw586hBhBrEiwAQYEnHX0EyPDuXVjfht3RFO_GXf2BUF-ewsG-OaF-DGJFKmaGDV_QVPiydxoC2RwQAvD_BwE";
	driver.get(url);
	WebElement dayDD=driver.findElement(By.xpath("//select[@id='day']"));
	WebElement monthDD=driver.findElement(By.xpath("//select[@id='month']"));
	WebElement yearDD=driver.findElement(By.xpath("//select[@id='year']"));
	
	calender.dd(dayDD,"22");
	calender.dd(monthDD,"Dec");
	calender.dd(yearDD,"2019");
	}
	public static void dd(WebElement element,String text) {
		Select drop= new Select(element);
	drop.selectByVisibleText(text);
		
	
	}
}
