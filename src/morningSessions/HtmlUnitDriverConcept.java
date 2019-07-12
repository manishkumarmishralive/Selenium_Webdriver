package morningSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {
        static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//Browser Launch
				//System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
				//driver=new ChromeDriver();
				
				//HtmlUnitDriver is not available in Selenium 3.x version
				//HtmlUnitDriver--to use this concept we have to download HtmlUnitDriver JAR file
				//Advantages:
		        //1. Testing is happening behind the scene--no browser is launched
		        //2. Very fast execution of test cases--very fast--performance of the script
		        //3. Not suitable for actions class--user actions, mouse movement, Drag and Drop, double click
		        //4. Ghost driver--Headless browser
		            // HtmlUnit Driver--java
		             //Phantom JS --Java script
		
		        driver=new HtmlUnitDriver();//HTML unit driver
				
				driver.get("https://www.freecrm.com");//Enter URL
				
				driver.manage().window().maximize();//It is use to maximize the window
				driver.manage().deleteAllCookies();//It will delete all cookies and start fresh browser
				
				//Dynamic wait
				driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
				 
			   driver.get("https://www.freecrm.com");//Enter URL
				
			   System.out.println("Before login title is: "+driver.getTitle());//It will return title of the page
			   
			   driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[3]/ul/a/span[2]")).click();
			   driver.findElement(By.name("email")).sendKeys("manishmishra10048@gamil.com");
			   driver.findElement(By.name("password")).sendKeys("Manish@#1995");
			   
			   Thread.sleep(3000);
			   driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
			   
			   Thread.sleep(2000);
			   System.out.println("Aftere login title is: "+driver.getTitle());		   
	}
}
