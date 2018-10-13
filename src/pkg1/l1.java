package pkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class l1 {
	
	public static void main(String[] args) {
		
		System.out.println("Hi");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://tamilrockers.lv/");
		
		driver.quit();
		
//		System.setProperty("webdriver.ie.driver","C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe");
//		driver = new InternetExplorerDriver();
//		driver.get("http://tamilrockers.lv/");
		
		
//		String chromePath="D:\\Selenium Setup\\chromedriver_win32\\chromedriver.exe";
//		
//		System.setProperty("webdriver.hrome.driver",chromePath);
//		driver = new ChromeDriver();
//		driver.get("http://tamilrockers.lv/");
		
		WebDriver driver1 = new RemoteWebDriver(DesiredCapabilities.chrome());
		driver1.get("http://www.google.com");

	}
	
	

}
