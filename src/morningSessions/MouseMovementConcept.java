package morningSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {
      static WebDriver driver;
	public static void main(String[] args) throws Exception{
		//Browser Launch
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();//It is use to maximize the window
		driver.manage().deleteAllCookies();//It will delete all cookies and start fresh browser
		
		driver.get("https://www.spicejet.com/");
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
		Thread.sleep(3000);
		
		action.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Sign up")).click();
	}
}
