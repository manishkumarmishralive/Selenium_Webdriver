package morningSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
           static WebDriver driver;
	public static void main(String[] args) {
		//Browser Launch
				System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();//It is use to maximize the window
				driver.manage().deleteAllCookies();//It will delete all cookies and start fresh browser

				driver.get("http://jqueryui.com/droppable/");
				
				driver.switchTo().frame(0);// It will switch page to frame. only applicable when If iframe tag is present 
				
				Actions action=new Actions(driver);
				
				action.clickAndHold(driver.findElement(By.id("draggable")))//Click and hold element which we want to drag
				.moveToElement(driver.findElement(By.id("droppable")))// Move that element which we want to drag
				.release()//It will release
				.build()//for build
				.perform();// for perform		
	}
}
