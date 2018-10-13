package SeleniumLearning;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iFramehandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		// Launch the browser
		driver= new FirefoxDriver();
		// Hit the URL
		String Url ="https://letskodeit.teachable.com/p/practice";
		driver.navigate().to(Url);
		driver.manage().window().maximize();
		
		List iframelist = driver.findElements(By.tagName("iframe"));
		System.out.println(iframelist.size());
		
		Iterator<WebElement> itr= iframelist.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next().getAttribute("id"));
		
		// Scroll down & Up of the page
		// Method 1
		
//		pagedown(driver);
//		pageup(driver);

		// Method 2 via javascript executor
	
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(000,2000)", "");

	}

	private static void pageup(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement e=driver.findElement(By.xpath(".//*[@id='hide-textbox']"));
		e.sendKeys(Keys.PAGE_UP);
		if(e.isDisplayed())
		{
			System.out.println("Element is displayed ");
			Thread.sleep(3000);
			pagedown(driver);
		}

	}

	private static void pagedown(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath(".//*[@class='navbar-link fedora-navbar-link']")).sendKeys(Keys.PAGE_DOWN);

	}

}
