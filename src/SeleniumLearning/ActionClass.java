package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		// Launch the browser
		driver= new FirefoxDriver();
		// Hit the URL
		String Url ="https://letskodeit.teachable.com/p/practice";
		driver.navigate().to(Url);
		driver.manage().window().maximize();
		WebElement ele2 = driver.findElement(By.id("name"));
		ele2.sendKeys("Hi");
		
		Actions act = new Actions (driver);
		
		//WebElement ele = driver.findElement(By.xpath(""));
		
		// Double CLick
		
		act.doubleClick(ele2);

	}

}
