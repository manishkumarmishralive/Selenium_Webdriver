package morningSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictlyWaitConcept {
         static WebDriver driver;
	     public static void main(String[] args) {
		//Browser Launch
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();//It is use to maximize the window
		driver.manage().deleteAllCookies();//It will delete all cookies and start fresh browser
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");// Enter URL: It is used to enter URL

		clickOn(driver, driver.findElement(By.xpath("//*[@id='u_0_3']")), 20);
		
	}
     public static void clickOn(WebDriver driver, WebElement locator, int timeout){
    	 new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
    	 .until(ExpectedConditions.elementToBeClickable(locator)).click();
     }     
}
