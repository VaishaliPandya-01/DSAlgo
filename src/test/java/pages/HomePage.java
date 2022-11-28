package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

import baseClass.TestBase;

public class HomePage extends TestBase {



	@FindBy (xpath="//*[contains(text(),' Register ')]") WebElement registerHome_btn;
	@FindBy (xpath="//*[contains(text(),'Sign in')]") WebElement signIn_btn;
	@FindBy (xpath="//*[@class='card-title'][contains(text(),'Tree')]//..//a") WebElement treeGetStrtd_btn;
	@FindBy (xpath="//*[@class='card-title'][contains(text(),'Graph')]//..//a") WebElement graphGetStrtd_btn;
	@FindBy (xpath="//*[@class='card-title'][contains(text(),'Data')]//..//a") WebElement DSIGetStrtd_btn;
	@FindBy (xpath="//*[@class='card-title'][contains(text(),'Array')]//..//a") WebElement arrayGetStrtd_btn;
	@FindBy (xpath="//*[@class='card-title'][contains(text(),'List')]//..//a") WebElement LinkListGetStrtd_btn;
	@FindBy (xpath="//*[@class='card-title'][contains(text(),'Stack')]//..//a") WebElement stackGetStrtd_btn;
	@FindBy (xpath="//*[@class='card-title'][contains(text(),'Queue')]//..//a") WebElement queueGetStrtd_btn;
	@FindBy (xpath = "//*[contains(text(),'Sign out')]") WebElement SignOut_btn;
	@FindBy (xpath = "//*[@class='alert alert-primary']") WebElement Message;
	// For Data Structure Dropdown
	@FindBy(xpath = "//*[@data-toggle='dropdown']") WebElement DataStrDDownItem;
	@FindBy(xpath = "//*[contains(text(),'Arrays')]")WebElement ArrayDDownItem;
	@FindBy(xpath = "//div/a[contains(text(),'Linked List')]")WebElement LinedDDownItem;
	@FindBy(xpath = "//div/a[contains(text(),'Stack')]")WebElement StackDDownItem;
	@FindBy(xpath = "//div/a[contains(text(),'Queue')]")WebElement QueueDDownItem;
	@FindBy(xpath = "//div/a[contains(text(),'Tree')]")WebElement TreeDDownItem;
	@FindBy(xpath = "//div/a[contains(text(),'Graph')]")WebElement GraphDDownItem;
	@FindBy(xpath = "//*[contains(text(),'Arrays')]") WebElement dropDownValue;



	//constructor
	public HomePage () {

		PageFactory.initElements(driver, this);
	}



	//methods
	public void registerHomeBtn() {

		registerHome_btn.click();
	}


	public void signInBtn() {

		signIn_btn.click();

	}	 


	public void treeGetStartBtn() {

		treeGetStrtd_btn.click();
	}


	public void graphGetStartBtn() {

		graphGetStrtd_btn.click();
	}
	
	public void DSIGetStartBtn() {
DSIGetStrtd_btn.click();
	}
	
	public void arrayGetStartBtn() {

		arrayGetStrtd_btn.click();
	}
	
	public void LinkListGetStartBtn() {

		LinkListGetStrtd_btn.click();
	}
	
	public void stackGetStartBtn() {

		stackGetStrtd_btn.click();
	}
	
	public void queueGetStartBtn() {

		queueGetStrtd_btn.click();
	}


	public void validateHomePage() throws InterruptedException {
	
		String title = driver.getTitle();
		Assert.assertEquals("NumpyNinja", title);
		System.out.println("user is on " + title + " home page");

	}


	public void SignOutBtn() {

		SignOut_btn.click();

		String expectedMessage = "Logged out successfully";

		String actualMessage = Message.getText();
		Assert.assertEquals(actualMessage, expectedMessage);
		System.out.println(actualMessage);
	}
	
	public void NotLoggedInMsg() {

		String expectedMessage = "You are not logged in";

		String actualMessage = Message.getText();
		Assert.assertEquals(actualMessage, expectedMessage);
		System.out.println(actualMessage);
	}
	
	public boolean DataStrModValidation() {
		return DSIGetStrtd_btn.isDisplayed();

	}

	public boolean ArrayModValidation() {
		return arrayGetStrtd_btn.isDisplayed();
	}

	public boolean LinkListModValidation() {
		return LinkListGetStrtd_btn.isDisplayed();
	}

	public boolean StackModValidation() {
		return stackGetStrtd_btn.isDisplayed();
	}

	public boolean QueueModValidation() {
		return queueGetStrtd_btn.isDisplayed();
	}

	public boolean TreeModValidation() {
		return treeGetStrtd_btn.isDisplayed();
	}

	public boolean GraphModValidation() {
		return graphGetStrtd_btn.isDisplayed();
	}

	public boolean BtnVisibleCheck() {
		return (DataStrModValidation() && ArrayModValidation()
				&& LinkListModValidation() && StackModValidation()
				&& QueueModValidation() && TreeModValidation()
				&& GraphModValidation());
	}
	
	public void DataStrDropdownClick() throws InterruptedException {
		DataStrDDownItem.click();
		Thread.sleep(1500);
	}
	
	public void clickDropDownValue() {
		dropDownValue.click();	
	}
}
