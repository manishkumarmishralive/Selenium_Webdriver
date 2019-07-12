package morningSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {
static WebDriver driver;
	public static void main(String[] args) {
		 
		//Browser Launch
				System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				
				//Enter URL
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				driver.findElement(By.name("proceed")).click();//Click on go btn
				
		        Alert alert=driver.switchTo().alert();//this method will used to switch main window to popUP window
				System.out.println(alert.getText());//It will return popUP text
	            
				String text=alert.getText();
				
				if(text.equals("Please enter a valid user nam")){
					System.out.println("correct alert message");
				}
				else{
					System.out.println("Incorrect alert message");
					
				}
				alert.accept();// Click on ok btn
				//alert.dismiss();// click on cancel btn
				
	}

}
