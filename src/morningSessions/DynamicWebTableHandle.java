package morningSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {
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
				driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[3]/ul/a")).click();
                
				driver.findElement(By.xpath("//*[@id='ui']/div/div/form"
						+ "/div/div[1]/div/input")).sendKeys("manishmishra10048@gmail.com");
				driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/"
						+ "div[2]/div/input")).sendKeys("Manish@#1995");
				
				driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
				
				driver.findElement(By.xpath("//*[@id='main-nav']/a[3]/span")).click();
				
				//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]
				//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]
				//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[2]
				//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[4]/td[2]
				
				//Method-1:
				String before_Xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
				
				String after_xpath="]/td[2]";
				
				for(int i=1; i<=4; i++){
					
				String name= driver.findElement(By.xpath(before_Xpath+i+after_xpath)).getText();
				System.out.println(name);
				
				if(name.contains("manish kumar Mishra")){
						
				driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/d"
				    		+ "iv[2]/table/tbody/tr["+i+"]/td[1]/div/label")).click();
						
			}
		 }
				//Method-2:
				//Method 2 will come in letter 		
	  }	
	}












































