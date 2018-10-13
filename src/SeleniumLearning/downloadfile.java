package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class downloadfile {
	
	public static void main(String[] args) throws InterruptedException {
		
		FirefoxProfile profile = new FirefoxProfile();
//		profile.setPreference("browser.download.dir", "D:\\");
//		profile.setPreference("browser.download.folderList", 1);
//		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", 
//			    "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;"); 
//	 
//			profile.setPreference( "browser.download.manager.showWhenStarting", false );
//			profile.setPreference( "pdfjs.disabled", true );	
		/*
		 * Working one
		 * 
		 * Download the file in the Firefox browser
		 * 
		 * 
		 * Find the service & header info of the content-type
		 * 
		 * 
		 * 
		 * */
		
		profile.setPreference("browser.download.dir", "D:\\");
		profile.setPreference("browser.download.folderList", 2);
       profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/vnd.ms-excels..spreadsheetml.sheet;charset=UTF-8,text/xls");
		
		//profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		WebDriver driver;
		
		driver= new FirefoxDriver(profile);
		
		driver.get("https://exis.exilant.com/PAR/index.htm");
		
		Thread.sleep(8000);
		
		driver.switchTo().frame("loginPage");
		
		WebElement username=driver.findElement(By.id("userId"));
		username.clear();
		username.sendKeys("prabhu.pandi");

		
		WebElement passw=driver.findElement(By.id("userPassWord"));
		passw.clear();
		passw.sendKeys("Naga@2661");
	
		driver.findElement(By.id("button")).click();
		
		//driver.manage().window().maximize();
		
		Thread.sleep(8000);

		
		driver.switchTo().defaultContent();
		
		Thread.sleep(8000);
		
		
		WebElement ele = driver.findElement(By.xpath(".//*[@id='e0_5i']"));
		System.out.println(ele.getClass().getFields());
		Actions act = new Actions(driver);
		act.moveToElement(ele);
		act.click().build().perform();

		
		driver.findElement(By.xpath(".//*[@id='e0_7i']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainZero");
		
//		System.out.println(driver.findElement(By.xpath(".//*[@id='myActionList_employee__1']")).getText());
		
		driver.findElement(By.id("buttonGenerate")).click();
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ENTER);


		driver.findElement(By.id("buttonGenerate")).click();

	}

}
