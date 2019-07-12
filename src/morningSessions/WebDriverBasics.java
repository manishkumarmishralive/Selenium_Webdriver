package morningSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {
     static WebDriver driver;
	public static void main(String[] args) {
		//FF Driver
		//GeckoDriver
        System.setProperty("webdriver.gecko.driver", "C:\\Software\\geckodriver-v0.24.0-win64\\geckodriver.exe");
       // WebDriver driver=new FirefoxDriver();
        
        //Crome Driver
       /* driver=new FirefoxDriver();//Launch crome
        driver.get("https://www.google.com");//Enter URL
        String title=driver.getTitle();//Get Title
		System.out.println(title);*/
		
        //Safari Driver
        driver =new SafariDriver();
        driver.get("https://google.com");
        String title=driver.getTitle();
        System.out.println(title);
            
		if(title.equals("Google")){
			System.out.println("Correct title");	
		}
		else{
			System.out.println("Title is not correct");
		}
		System.out.println(driver.getCurrentUrl());//Print current URL
		System.out.println(driver.getPageSource());//Get page source
		driver.quit();// Quit the browser
        
        //chrome driver
       /* System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
	   // WebDriver	driver1=new ChromeDriver();
        driver=new ChromeDriver();
		driver.get("https://www.dell.com/en-in?~ck=mn");
	    String title=driver.getTitle();
		System.out.println(title);*/
		 
	}

}
