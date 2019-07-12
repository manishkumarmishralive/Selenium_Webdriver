package morningSessions;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUP {
         static WebDriver driver;
	public static void main(String[] args) {
		//Browser Launch
				System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				
				/*driver.manage().window().maximize();//It is use to maximize the window
				driver.manage().deleteAllCookies();//It will delete all cookies and start fresh browser
				driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
				
				driver.get("http://www.popuptest.com/goodpopups.html");// Enter URL: It is used to enter URL

                driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
                
                Set<String> handler=driver.getWindowHandles();// It will give one set object in form of string from where there
                // two window id is available of this particular handler. Handler is representing one set of object in which 
                //two window id is available in set object. Set does not store value in form indexes
				
                Iterator<String> it=handler.iterator();//To get the value from set object we use Iterator. This Iterator will 
                //give iterator of String
                
                String ParentWindowId=it.next();//It will give 1st value. next() will point next means top to 1st 
                //and 1st to next means 2nd
                System.out.println("Parent window id: " +ParentWindowId);
                
                String childWindowId=it.next();// It will give child window id
                System.out.println("Child window id: "+childWindowId);
                
                driver.switchTo().window(childWindowId);
                
                System.out.println("Child window title"+driver.getTitle());
				
                driver.close(); // To close the child window we can not use driver.quit(). It will close both the window. to 
                // close the popup window we use close() method.
                 
                driver.switchTo().window(ParentWindowId);//It will return cursor on main window after closing child window
                
                System.out.println("Parent window title is: "+driver.getTitle());//It will verify cursor is 
                //on main window or not
	}
}
