package morningSessions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {
	 static WebDriver driver;
	public static void main(String[] args) throws Exception  {
		
		//Browser Launch
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        
		driver.manage().window().maximize();//It is use to maximize the window
		driver.manage().deleteAllCookies();//It will delete all cookies and start fresh browser
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

		driver.get("https://www.freecrm.com");//Enter URL
	
		 driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[3]/ul/a/span[2]")).click();
	     driver.findElement(By.name("email")).sendKeys("manishmishra10048@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("Manish@#1995");
		 //driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
		 
		 //ExecuteScript---to execute java script code 
		 WebElement loginbtn=driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")); 
		
		 flash(loginbtn, driver);//Highlight the element
		 
		 drawBorder(loginbtn, driver);//Draw a border
		 
		//Take screenshot and store as a file format
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
	        //Now copy the screenshot to desired location using copyFile method
	        FileUtils.copyFile(src, new File("D:\\Workspacedate13month4_Selenium\\"
	        		+ "Selenium_WebDriver\\src\\morningSessions\\element.png"));
	        
	        //Generate Alert message when getting bug
	        //generateAlert(driver, "This is an issue with login button on login page");
	        
	        //Click on any element using JS Executor 
	        clickElementByJS(loginbtn, driver);
	        
	        //How to Refresh a page 
	        //1. By using navigate method
	        //driver.navigate().refresh();
	        //2. By using JS Executor
	        refreshBrowserByJS(driver);
	    
	        //Get the title of the page by JS Executor
	        System.out.println(getTitleByJs(driver));
	        
	        //Get page text:
	        System.out.println(getPageInnerText(driver));
	        
	        //Scroll page down by JS:
	       // scrollPageDown(driver);
	        
	        //Scroll into view by JS:
	        WebElement signUPLink=driver.findElement(By.linkText("Sign Up"));
	        scrollIntoView(signUPLink, driver);
	        
	        flash(signUPLink, driver);//Highlight the element
	        
	}
       public static void flash(WebElement element, WebDriver driver){
	   JavascriptExecutor js= ((JavascriptExecutor) driver);
       String  bgColor=element.getCssValue("backgroundColor");
    	for(int i=0; i<2; i++){
    		changeColor("rgb(0,0,0)", element, driver);
    		changeColor(bgColor, element, driver);	
    	} 	   
}
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		 JavascriptExecutor js= ((JavascriptExecutor) driver);
		 js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);

	try{
		Thread.sleep(3000);
	}catch(InterruptedException e){		
	}
	}
	public static void drawBorder(WebElement element, WebDriver driver ){
		 JavascriptExecutor js= ((JavascriptExecutor) driver);
		 js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	public static void generateAlert(WebDriver driver, String message){
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		js.executeScript("alert('"+message+"')");
	}
	public static void clickElementByJS(WebElement element, WebDriver driver){
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}
	public static void refreshBrowserByJS(WebDriver driver){
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
	public static String getTitleByJs(WebDriver driver){
		JavascriptExecutor js= ((JavascriptExecutor) driver);
	    String title=js.executeScript("return document.title;").toString();
		return title;
	}
	public static String getPageInnerText(WebDriver driver){
		JavascriptExecutor js= ((JavascriptExecutor) driver);
	    String pageText=js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	} 
	public static void scrollPageDown(WebDriver driver){
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");		
    }
	public static void scrollIntoView(WebElement element, WebDriver driver){
	JavascriptExecutor js= ((JavascriptExecutor) driver);
	js.executeScript("arguments[0].scrollIntoView(true);", element);
	
	}
}




























