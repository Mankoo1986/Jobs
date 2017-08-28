package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import core.ActionDriver;
import core.OpenAndCloseBrowser;
import or.HomePageElements;
import or.LoginPageElements;
import or.UserPageElements;
import pages.HomePage;
import pages.LoginPage;
import pages.UserPage;

public class LoginPageTest extends OpenAndCloseBrowser {
	
	@BeforeMethod
	public void navigateToURL(){
		ActionDriver browser = new ActionDriver(driver);
		browser.navigateTo("http://2ndchancejobalerts.com/");
	}
	
	
	@Test(priority=1)
	public void findJob() throws Exception{
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.signIn("Sales", "NEWBURGH , ON");
		
		
		/*loginPage.enterWhat("");
		loginPage.enterWhere("");
		loginPage.clickSubmit();*/
	}
	
	
	
		
		
	
	
	

}
