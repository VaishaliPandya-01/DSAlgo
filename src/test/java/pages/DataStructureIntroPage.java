package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

import baseClass.TestBase;

public class DataStructureIntroPage extends TestBase{
	
Actions action = new Actions(driver);
	
	@FindBy (xpath = "//*[contains(text(),'Time Complexity')]") WebElement TimeComplexity_btn;
	@FindBy (xpath = "//*[@class='btn btn-info']") WebElement TryHere_btn;
	@FindBy (xpath = "//*[@class=' CodeMirror-line ']") WebElement input_data ;
	@FindBy (xpath = "//*[@type='button']") WebElement run_btn ;
	@FindBy (id = "output") WebElement Output_txt;
	@FindBy(xpath="//*[contains(text(),'Practice')]") WebElement practiceQuestions_btn;
	


	//Constructor
	public DataStructureIntroPage() {

		PageFactory.initElements(driver,this);

	}

	
	//Methods
	public void ValidateDSIPage() {

		String title = driver.getTitle();
		Assert.assertEquals("Data Structures-Introduction", title);
		System.out.println("User is on " + title + " Page" );
	}
	
	
	public void ValidationAssesment() {
		
		String title = driver.getTitle();
		Assert.assertEquals("Assessment", title);
		System.out.println("User is on " + title + " Page" );
		
	}
	
public void ValidationTimeComplexity() {
		
		String title = driver.getTitle();
		Assert.assertEquals("Time Complexity", title);
		System.out.println("User is on " + title + " Page" );
		
	}

public void ValidationPracticeQtn() {
	
	String title = driver.getTitle();
	Assert.assertEquals("Practice Questions", title);
	System.out.println("User is on " + title + " Page" );
	
}


	public void TimeComplexitybtn() {

		TimeComplexity_btn.click();	
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
	
	public void practiceQuestions() {
		practiceQuestions_btn.click();
	}


}
