package morningSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	static WebDriver driver;
	public static void main(String[] args) {
		//Browser Launch
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        
		driver.manage().window().maximize();//It is use to maximize the window
		driver.manage().deleteAllCookies();//It will delete all cookies and start fresh browser
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

		driver.get("https://www.google.com");//Enter URL
		
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("testing");
      
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
	
	   System.out.println("Total no of suggestion in search box :"+list.size());
	
	}
	

}
