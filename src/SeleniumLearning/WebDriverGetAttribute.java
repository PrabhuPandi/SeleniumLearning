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

public class WebDriverGetAttribute {

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
	System.out.println(ele2.getAttribute("placeholder"));
	System.out.println(ele2.getText());
	



	
}

}
