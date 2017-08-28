package pages;

import org.openqa.selenium.WebDriver;

import core.ActionDriver;
import or.HomePageElements;
import or.LoginPageElements;

public class LoginPage extends ActionDriver{

	public LoginPage(WebDriver driver) throws Exception {
		super(driver);
		if(!isElementPresent(LoginPageElements.what)){
			throw new Exception("User is not on LoginPage and is on "+getTitle());
		}
	}
	
	
	public void signIn(String what, String where) throws Exception{
		type(LoginPageElements.what, what);
		type(LoginPageElements.where, where);
		click(LoginPageElements.submit);
		
	}
	
	public void enterWhat(String what) throws Exception{
		type(LoginPageElements.what, what);
			
	}
	
	public void enterWhere(String where) throws Exception{
		type(LoginPageElements.where, where);
			
	}
	
	public void clickSubmit() throws Exception{
		click(LoginPageElements.submit);
		
	}
	
	
	
	
	

}
