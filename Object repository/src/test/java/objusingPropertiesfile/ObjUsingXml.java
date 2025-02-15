package objusingPropertiesfile;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
 
public class ObjUsingXml {
 
	public static String readXmlData(String data) throws ParserConfigurationException, SAXException, IOException {
		File file = new File("C:\\Users\\DELL\\Pictures\\Object repository\\src\\test\\java\\objusingPropertiesfile\\objXml.xml");
		DocumentBuilderFactory Df = DocumentBuilderFactory.newInstance();
		DocumentBuilder Db = Df.newDocumentBuilder();
		Document document = Db.parse(file);
		NodeList list = document.getElementsByTagName("locator");
		Node node1 = list.item(0);
		Element ele = (Element) node1;
		return ele.getElementsByTagName(data).item(0).getTextContent();
	}
 
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\Object repository\\res\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath(readXmlData("gmail"))).click();
		driver.navigate().back();
		driver.findElement(By.xpath(readXmlData("image"))).click();
		driver.navigate().back();
		driver.findElement(By.xpath(readXmlData("search"))).sendKeys("selenium");
		Thread.sleep(2000);
		driver.close();
	}
}
