package SeleniumLearning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		// Launch the browser
		driver= new FirefoxDriver();
		// Hit the URL
		String Url ="https://letskodeit.teachable.com/p/practice";
		driver.navigate().to(Url);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("openwindow")).click();
		
		Set<String> ws= driver.getWindowHandles();
		
		Iterator<String> itr= ws.iterator();
		
		String window1 = itr.next();
		
		String window2=itr.next();
		
		System.out.println(window1);
		System.out.println(window2);
		
		if(driver.getWindowHandle().equals(window1))
		{
			System.out.println("The Main Window is displayed");
			driver.switchTo().window(window2).close();;
		}	
		
		else 
		{
		System.out.println("The child window is displayed");	
		driver.switchTo().window(window2).quit(); 

		}
			
		
		
	
	}

}
