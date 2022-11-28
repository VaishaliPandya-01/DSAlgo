package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

import baseClass.TestBase;

public class LinkedListPage extends TestBase{
	
Actions action = new Actions(driver);
	
	@FindBy (xpath = "//*[contains(text(),'Creating Linked LIst')]") WebElement createLinkList_btn;
	@FindBy (xpath = "//*[contains(text(),'Introduction')]") WebElement Introduction_btn;
	@FindBy (xpath = "//*[contains(text(),'Types of Linked List')]") WebElement typeLinkList_btn;
	@FindBy (xpath = "//*[contains(text(),'Implement Linked List in Python')]") WebElement ImplementLinkList_btn;
	@FindBy (xpath = "//*[contains(text(),'Traversal')]") WebElement Traversel_btn;
	@FindBy (xpath = "//*[contains(text(),'Insertion')]") WebElement Insertion_btn;
	@FindBy (xpath = "//*[contains(text(),'Deletion')]") WebElement Deletion_btn;
	@FindBy (xpath = "//*[@class='btn btn-info']") WebElement TryHere_btn;
	@FindBy (xpath = "//*[@class=' CodeMirror-line ']") WebElement input_data ;
	@FindBy (xpath = "//*[@type='button']") WebElement run_btn ;
	@FindBy (id = "output") WebElement Output_txt;
	


	//Constructor
	public LinkedListPage() {

		PageFactory.initElements(driver,this);

	}

	
	//Methods
	public void ValidateLinkListPage() {

		String title = driver.getTitle();
		Assert.assertEquals("Linked List", title);
		System.out.println("User is on " + title + " Page" );
	}
	
	
	public void ValidationAssesment() {
		
		String title = driver.getTitle();
		Assert.assertEquals("Assessment", title);
		System.out.println("User is on " + title + " Page" );
		
	}
	
public void ValidationIntroduction() {
		
		String title = driver.getTitle();
		Assert.assertEquals("Introduction", title);
		System.out.println("User is on " + title + " Page" );
		
	}


	public void createLinkListbtn() {

		createLinkList_btn.click();	
	}
	
	public void IntroductionBtn() {

		Introduction_btn.click();	
	}
	
	public void TypeOfLinkListBtn() {

		typeLinkList_btn.click();	
	}
	
	public void ImplementLinkLIst() {

		ImplementLinkList_btn.click();	
	}
	
	public void TraversalBtn() {

		Traversel_btn.click();	
	}
	
	public void InsertionBtn() {

		Insertion_btn.click();	
	}
	
	public void DeletionBtn() {

		Deletion_btn.click();	
	}


	public void TryHereBtn() {

		TryHere_btn.click();
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
