package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

import baseClass.TestBase;

public class GetStartedPage extends TestBase {
	
	@FindBy (xpath="//button") WebElement getStarted_btn;

	
	//Constructor
	 public GetStartedPage () {
			
		 PageFactory.initElements(driver, this);
		}
	 
	 
	 //method
	 public void validateLandingPage() {

		 String title = driver.getTitle();
			Assert.assertEquals("Numpy Ninja", title);
			System.out.println("User is on landing Page "+ title);

		} 
	 
	 
	 public void getStartedBtn() {

			getStarted_btn.click();
			
			
		}

}
