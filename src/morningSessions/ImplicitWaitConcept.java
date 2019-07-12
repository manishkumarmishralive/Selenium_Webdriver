package morningSessions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {
         static WebDriver driver;
         
	    public static void main(String[] args) {
		//Browser Launch
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://jqueryui.com/droppable/");// Enter URL
		driver.manage().window().maximize();//It is use to maximize the window
		driver.manage().deleteAllCookies();//It will delete all cookies and start fresh browser
        
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			}

}
