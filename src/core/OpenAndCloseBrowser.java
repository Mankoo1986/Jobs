package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenAndCloseBrowser {
	
	protected static WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeClass
	public void openBrowser(String browser){
		
		if(browser.equalsIgnoreCase("ff")||browser.equalsIgnoreCase("firefox")){
			driver= new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("ie")){
			
			
			
			
			
		}else{
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
	}
	
	
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}


	public static WebDriver getDriverInstance() {
		// TODO Auto-generated method stub
		return driver;
	}
	
	
	
	
	
	
	
	
	
	
 
}
