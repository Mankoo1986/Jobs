package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo2 {

	
	@DataProvider
	public static Object[][] getNames(){
		Object[][] obj= new Object[3][1];
		obj[0][0]="Ram";
		obj[1][0]="Rakesh";
		obj[2][0]="Rohan";
		return obj;
	}
	
	@Test(dataProvider="getNames")
	public void verifyNames(String username){
		System.out.println("Printing names :"+username);
	}
}
