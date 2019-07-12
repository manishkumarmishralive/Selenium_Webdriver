package morningSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Concept {
   static WebDriver driver;
	public static void main(String[] args) {
		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.dell.com/en-in");//Enter URL
		//Locator
		//1. Xpath--2
		//Absolute xpath should not be used:--html/body/div[1]/div[5]/div[2]/a
		//Relative xpath only should be used:--//*[@id='firstname']
		//xpath will always start with double slash like//
		driver.findElement(By.xpath("//*[@id='signin-button']/label")).click();
		driver.findElement(By.xpath("//*[@id='right-utility']/li[3]/div/div/div[1]/div[3]/div/a/button")).click();
		
		//2.ID--1
		driver.findElement(By.id("FirstName")).sendKeys("Amol");
		driver.findElement(By.id("LastName")).sendKeys("Mishra");
		driver.findElement(By.id("CreateAccountEmailAddress")).sendKeys("Mishra@gmail.com");
		
		//3. Name--2
		driver.findElement(By.name("FirstName")).sendKeys("Anish");
		driver.findElement(By.name("LastName")).sendKeys("Pandey"); 
		driver.findElement(By.name("CreateAccountEmailAddress")).sendKeys("manish@gmail.com");
		
		//4. linkText--
		//It is used only for links. Whenever will see <a> tag means anchor tag then we will use linkText attribute
		driver.findElement(By.linkText("Feedback")).click();
		
		//5. partiallinkText: not useful. we never use. It is used when link text is 
		//long name like "create an account before login" in such case we can use only "create an account" text
		
		//6. cssSelector:--2
		//If id is there--#[id]
		//If class is there--.[class]
		driver.findElement(By.cssSelector("#FirstName")).sendKeys("Maneesh");
		driver.findElement(By.cssSelector("#LastName")).sendKeys("Mishra");
		driver.findElement(By.cssSelector("#CreateAccountEmailAddress")).sendKeys("manish@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("password");
		
		//7. className: Not useful because className can be duplicate for different--4 
		driver.findElement(By.className("bottom-offset-mini pull-left col-sm-12 col-md-12"
				+ " col-lg-12 col-xs-12 textbox-standard")).sendKeys("EmailAddess");
		
		driver.findElement(By.className("bottom-offset-mini pull-left col-sm-12 "
				+ "col-md-12 col-lg-12 col-xs-12 clear-on-error textbox-standard")).sendKeys("password");
		
	}

}
