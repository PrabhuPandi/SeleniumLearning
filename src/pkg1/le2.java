package pkg1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class le2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		driver.get("https://letskodeit.teachable.com/p/practice");
		String s =driver.findElement(By.xpath(".//*[@id='radio-btn-example']/fieldset/legend")).getText();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		String pageTitle= driver.getTitle();
		
		System.out.println(s);
		System.out.println(pageTitle);
		
		
		WebElement text=driver.findElement(By.id("name"));
		text.sendKeys("Prabhu");
		Thread.sleep(3000);
		text.clear();	
		
		// Select 	radio button
		
		driver.findElement(By.id("bmwradio")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("benzradio")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("hondaradio")).click();
		Thread.sleep(3000);
		
		// How to find the selected radio button
		
		List<WebElement> dd= driver.findElements(By.xpath(".//*[@id='radio-btn-example']/fieldset"));
		
		Iterator<WebElement> itr=dd.iterator();
		while(itr.hasNext())
		System.out.println(itr.next().getText());
		System.out.println("////////////");
		for (int i = 0; i < dd.size(); i++) {
			String dropdown =dd.get(i).getText();
			System.out.println(dropdown);
			System.out.println(dd.get(i).isSelected());
			}
		
		//Multi Select
		
		List<WebElement> MS=driver.findElements(By.xpath(".//*[@id='block-1069048']/div/div/div/div[1]/div[3]/fieldset"));
		Iterator<WebElement> itr1=MS.iterator();
		
		while(itr1.hasNext())
			 itr1.next().click();

	}
}
