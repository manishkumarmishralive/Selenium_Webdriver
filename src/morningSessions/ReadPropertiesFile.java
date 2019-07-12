package morningSessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropertiesFile {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		 
		
		Properties prop=new Properties();//1st create object of properties class
		
		FileInputStream ip=new FileInputStream("D:\\Workspacedate13month4_Selenium\\Selenium_WebDriver\\"
				+ "src\\morningSessions\\config.properties");//Then create object of file input stream class. FIS class 
		//will connect to the particular config.properties file. This is role of FIS. 
		
		prop.load(ip);// It will load config.properties file
		
		System.out.println(prop.getProperty("name"));//It will return name value from config.properties file
		
		System.out.println(prop.getProperty("age"));//It will return name value from config.properties file
		
	   String url=prop.getProperty("url");
	   System.out.println(url);
	   
	   String browser=prop.getProperty("browser");
	   System.out.println(browser);
	   
	   if(browser.equals("chrome")){
		   
		   System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
	   }
	   else if(browser.equals("chrome")) {
		  // System.setProperty("webdriver.ff.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
			driver=new FirefoxDriver();
	   }
	   else if(browser.equals("ie")){
		   System.setProperty("webdriver.ie.driver", "D:\\Library\\IEDriverServer.exe");
			driver=new ChromeDriver();
	   }
	   driver.get(url);
	   
	}

}
