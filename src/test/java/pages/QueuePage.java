package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

import baseClass.TestBase;

public class QueuePage extends TestBase{
	
Actions action = new Actions(driver);
	
	@FindBy (xpath = "//*[contains(text(),'Implementation of Queue in Python')]") WebElement ImplementationOfQueue_btn;
	@FindBy (xpath = "//*[contains(text(),'Implementation using collections.deque')]") WebElement ImplementationCollection_btn;
	@FindBy (xpath = "//*[contains(text(),'Implementation using array')]") WebElement ImplementationArray_btn;
	@FindBy (xpath = "//*[contains(text(),'Queue Operations')]") WebElement QueueOperation_btn;
	@FindBy (xpath = "//*[@class='btn btn-info']") WebElement TryHere_btn;
	@FindBy (xpath = "//*[@class=' CodeMirror-line ']") WebElement input_data ;
	@FindBy (xpath = "//*[@type='button']") WebElement run_btn ;
	@FindBy (id = "output") WebElement Output_txt;
	


	//Constructor
	public QueuePage() {

		PageFactory.initElements(driver,this);

	}

	
	//Methods
	public void ValidateQueuePage() {

		String title = driver.getTitle();
		Assert.assertEquals("Queue", title);
		System.out.println("User is on " + title + " Page" );
	}
	
	
	public void ValidationAssesment() {
		
		String title = driver.getTitle();
		Assert.assertEquals("Assessment", title);
		System.out.println("User is on " + title + " Page" );
		
	}
	
public void ValidationImplementCollection() {
		
		String title = driver.getTitle();
		Assert.assertEquals("Implementation using collections.deque", title);
		System.out.println("User is on " + title + " Page" );
	
	}

public void ValidationImplementOfQueue() {
	
	String title = driver.getTitle();
	Assert.assertEquals("Implementation of Queue in Python", title);
	System.out.println("User is on " + title + " Page" );
	
}

public void ValidationImplementArray() {
	
	String title = driver.getTitle();
	Assert.assertEquals("Implementation using array", title);
	System.out.println("User is on " + title + " Page" );
	
}

public void ValidationQueueOperation() {
	
	String title = driver.getTitle();
	Assert.assertEquals("Queue Operations", title);
	System.out.println("User is on " + title + " Page" );
	
}


	public void ImplementationOfQueuebtn() {

		ImplementationOfQueue_btn.click();	
	}
	
	public void ImplementationArraybtn() {

		ImplementationArray_btn.click();	
	}
	
	public void ImplementationCollectionbtn() {

		ImplementationCollection_btn.click();	
	}
	
	public void QueueOperationbtn() {

		QueueOperation_btn.click();	
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
