package SeleniumLearning;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.jetty.html.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class WebDriverMethods {

public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriver driver;
	// Launch the browser
	driver= new FirefoxDriver();
	// Hit the URL
	String Url ="https://letskodeit.teachable.com/p/practice";
	driver.navigate().to(Url);
	
	//Maximize
	
	driver.manage().window().maximize();
	
	//Find the element of the text
	
	WebElement ele = driver.findElement(By.xpath(".//*[@id='openwindow']"));
	
	
	// Element is displayed or not
	System.out.println(ele.isDisplayed());
	
	// Display the text
	System.out.println(ele.getText());
	
	//Page title
	System.out.println(driver.getTitle());
	
	//Enter the value & clear the value in the textbox
	
	WebElement ele2 = driver.findElement(By.id("name"));
	ele2.sendKeys("Hi");
	Thread.sleep(5000);
	//ele2.clear();
	//System.out.println(ele2.getAttribute("class"));
	
	//Height & Width of the textbox
	System.out.println("The height is "+ele2.getSize().getHeight());
	System.out.println("The width is "+ele2.getSize().getWidth());
   
	// Check all the checkbox present in the webpage
	
	java.util.List<WebElement> checkboxele = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	for(int i=0; i<checkboxele.size();i++)
	{
		
		checkboxele.get(i).click();
		

	}
	
	// Take a screen shot
	
	File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Src, new File("D:\\new.png"));
	
	
	// Alert Popup window access
	
	WebElement Alertele = driver.findElement(By.id("alertbtn"));
	Alertele.click();
	Alert act = driver.switchTo().alert();
	
	Thread.sleep(2000);
	act.accept();
	
	//Right click action
	
	// Method 1
	/*
	Actions act1= new Actions(driver);
	act1.moveToElement(ele2);
	act1.contextClick(ele2).build().perform();
	
	
	*/
	
	// Method 2
	
	Actions act1= new Actions(driver);
	act1.contextClick(ele2).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

	
	//List out the radio buttons
	
//	 List ref = driver.findElements(By.xpath(".//*[@type='radio'][@name='cars']"));
//	 // Total no of radio buttons
//	 System.out.println(ref.size());
//	 
//	 // Select the particular radio buttons
//	 
//	 for(int i=0; i<ref.size();i++)
//		 System.out.println(ref.get(i).toString());
//	 
//	 // Clear the value
//	 
//	// radio.clear();
//
//	 
	
	
}

}
