package morningSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//Browser Launch
				System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();//It is use to maximize the window
				driver.manage().deleteAllCookies();//It will delete all cookies and start fresh browser
				driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
				
				driver.get("http://www.google.com");// Enter URL: It is used to enter URL
		
				driver.navigate().to("https://www.amazon.com");// It is used to navigate some external URL
				
				//backward and forward simulation
				driver.navigate().back();
				Thread.sleep(2000);
				driver.navigate().forward();
				Thread.sleep(2000);
				driver.navigate().back();
				
				driver.navigate().refresh();//it will refresh the page
				 

	}

}
