package morningSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    static WebDriver driver;
	public static void main(String[] args) {
		
		//Browser Launch
				System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				
				//Enter URL
				driver.get("https://html.com/input-type-file/");
				driver.manage().window().maximize();
				
				//Type file should be present for browser/attach File/upload file buttons
				driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\Manish\\OneDriv"
						                                                + "e\\Desktop\\Maneesh_Resume.pdf");
				
		        System.out.println("File uploaded successfully");
	}
}
