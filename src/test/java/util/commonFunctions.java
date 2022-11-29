package util;

import baseClass.TestBase;

public class commonFunctions extends TestBase{
	
	public void returnBackPage() {
		
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
	}
	
	public void returnBacktwice() {
		
		driver.navigate().back();
		driver.navigate().back();
	}
	
}
