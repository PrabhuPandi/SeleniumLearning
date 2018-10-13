package SeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserAccessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		String Url ="https://www.google.com";
		
		/* Firefox browser initalization
		 * 
		 */
		driver = new FirefoxDriver();
		Accesslink(driver,Url);
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		Accesslink(driver,Url);
		

	}

	private static void Accesslink(WebDriver driver, String Url) {
		// TODO Auto-generated method stub
		driver.get(Url);
	}

}
