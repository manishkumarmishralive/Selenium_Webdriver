package morningSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {
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

		driver.get("https://www.freecrm.com");//Enter URL
		driver.findElement(By.xpath("/html/body/div[1]/main/section[1]/a")).click();
		
		//isDisplayed method: applicable for all the elements
		boolean b1=driver.findElement(By.name("action")).isDisplayed();
		System.out.println(b1);//true
	
		//isEnabled method: 
		boolean b2=driver.findElement(By.name("action")).isEnabled();
		System.out.println(b2);//true
		
		//isSelected() method:only applicable for checkboxes, dropdowns and radio buttons
		 driver.findElement(By.id("terms")).click();//It will click on check box
	     boolean b3= driver.findElement(By.id("terms")).isSelected();
         System.out.println(b3);//True
         
         //de-deselected method:
         driver.findElement(By.id("terms")).click();//It will click on check box
	     boolean b4= driver.findElement(By.id("terms")).isSelected();
         System.out.println(b4);//False
	}
}
