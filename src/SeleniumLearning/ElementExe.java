package SeleniumLearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementExe {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver;
		driver= new FirefoxDriver();
		driver.navigate().to("https://www.google.com");
		
		/*
		 * Element x & y co-ordinate
		 * 
		 */
	
		WebElement ele = driver.findElement(By.xpath(".//*[@id='gbw']//a[text()='Gmail']"));
		Point p =ele.getLocation();
		System.out.println("Element X co-ordinate "+p.x);
		System.out.println("Element y co-ordinate "+p.y);
		System.out.println("Element getX co-ordinate "+p.getX());
		System.out.println("Element gety co-ordinate "+p.getY());
		
		/*
		 * Zoom In & Zoom Out of the Page
		 * 
		 */
		WebElement ele1= driver.findElement(By.tagName("html"));
		ele1.sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD));
		Thread.sleep(5000);
		ele1.sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT));
		
		
		/*
		 * Access the Property File
		 * 
		 */
		
		Properties pro = new Properties();
		FileInputStream fs = new FileInputStream("C:\\Users\\Prabhu Pandi\\STS\\config.properties");
		pro.load(fs);
		
		System.out.println(pro.getProperty("password"));
		System.out.println(pro.get(pro));





	}

}
