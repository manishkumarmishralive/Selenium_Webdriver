package morningSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotConcept {
          static WebDriver driver;
	     public static void main(String[] args) throws IOException {
		//Browser Launch
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();//It is use to maximize the window
		driver.manage().deleteAllCookies();//It will delete all cookies and start fresh browser
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");// Enter URL: It is used to enter URL
		//Take screenshot and store as a file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
        //Now copy the screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Workspacedate13month4_Selenium\\"
        		+ "Selenium_WebDriver\\src\\morningSessions\\google.png"));   
	}
}
