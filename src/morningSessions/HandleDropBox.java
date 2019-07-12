package morningSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {
      static WebDriver driver;
	public static void main(String[] args) {
		//Browser Launch
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//Enter URL
		driver.get("https://www.spicejet.com/?gclid=Cj0KCQj"
				+ "w3PLnBRCpARIsAKaUbgtxheYShEzFOfXTNsrzp-EH12lSGEYNyzLOCPf-Q5TEHxM59_wDlVQaArL6EALw_wcB");
		
		//Handle drop Box:
		Select select=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		select.selectByVisibleText("USD");

	}

}
