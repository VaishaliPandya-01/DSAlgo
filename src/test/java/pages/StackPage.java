package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

import baseClass.TestBase;

public class StackPage extends TestBase{
	
Actions action = new Actions(driver);
	
	@FindBy (xpath = "//*[contains(text(),'Operations in Stack')]") WebElement OperationStack_btn;
	@FindBy (xpath = "//*[contains(text(),'Implementation')]") WebElement Implementation_btn;
	@FindBy (xpath = "//*[contains(text(),'Applications')]") WebElement Applications_btn;
	@FindBy(xpath="//a[@class='btn btn-info']")
	@CacheLookup
	WebElement btnTryHere;
	@FindBy (xpath = "//*[@class=' CodeMirror-line ']") WebElement input_data ;
	@FindBy (xpath = "//a[@class='btn btn-info']") WebElement run_btn ;
	@FindBy (id = "output") WebElement Output_txt;
	

	
	//Constructor
	public StackPage() {

		PageFactory.initElements(driver,this);

	}

	
	//Methods
	public void ValidateStackPage() {

		String title = driver.getTitle();
		Assert.assertEquals("Stack", title);
		System.out.println("User is on " + title + " Page" );
	}
	
	
	public void ValidationAssesment() {
		
		String title = driver.getTitle();
		Assert.assertEquals("Assessment", title);
		System.out.println("User is on " + title + " Page" );
		
	}
	
	public void ValidateOperationsStack() {

		String title = driver.getTitle();
		Assert.assertEquals("Operations in Stack", title);
		System.out.println("User is on " + title + " Page" );
	}
	
	public void ValidateImplementation() {

		String title = driver.getTitle();
		Assert.assertEquals("Implementation", title);
		System.out.println("User is on " + title + " Page" );
	}
	
	public void ValidateApplications() {

		String title = driver.getTitle();
		Assert.assertEquals("Applications", title);
		System.out.println("User is on " + title + " Page" );
	}


	public void OperationStackbtn() {

		OperationStack_btn.click();	
	}
	
	public void Implementationbtn() {

		Implementation_btn.click();	
	}
	
	public void Applicationsbtn() {

		Applications_btn.click();	
	}


public void clickTryHere() {
		
		btnTryHere.click();
	}


	public void InputData() {
		
		action.click(input_data).sendKeys("print('Testing001')").perform();

	}


	public void RunBtn() {

		run_btn.click();

	}
	
	public void OutputText() {
		
		System.out.println("User entered :- " + Output_txt.getText());
	}


}
