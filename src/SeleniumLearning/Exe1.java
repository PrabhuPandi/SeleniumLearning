package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exe1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver;
		
		driver= new FirefoxDriver();
		
		// Launch the page with authentication
		driver.get("https:prabhu.pandi:Ppraj@2661@mail.exilant.com/");
		
		// Send a single key
		
		driver.findElement(By.id("username")).sendKeys(Keys.TAB);

		Thread.sleep(3000);
		
		// Send the multiple keys and its operation
		String Keyvalue = Keys.chord(Keys.SHIFT, Keys.TAB);
		driver.findElement(By.id("password")).sendKeys(Keyvalue);
		
		// Get the current page URL;
		 //window.location.href
		// Method 1
		 String CurrentURL = driver.getCurrentUrl();
		System.out.println("Current URL Method 1 "+CurrentURL);
		
		// Method 2 by using JS
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location.href;", " " );
		
	}

}
