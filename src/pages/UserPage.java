package pages;

import org.openqa.selenium.WebDriver;

import core.ActionDriver;
import or.LoginPageElements;
import or.UserPageElements;

public class UserPage extends ActionDriver{

	public UserPage(WebDriver driver) throws Exception {
		super(driver);
		
		if(!isElementPresent(UserPageElements.verifyUser)){
			throw new Exception("User is not on UserPage and is on "+getTitle());
		}
	}
	
	
	public boolean verifyUserText(String text){
		return textIsEqualTo(UserPageElements.verifyUser, text);
	}

	
	
}
