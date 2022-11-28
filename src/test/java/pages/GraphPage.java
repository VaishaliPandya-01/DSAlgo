package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

import baseClass.TestBase;

public class GraphPage extends TestBase{

	Actions action = new Actions(driver);
	
	@FindBy (xpath = "//ul//a[.='Graph']") WebElement Graph_btn;
	@FindBy (xpath = "//ul//a[.='Graph Representations']") WebElement GraphRepresnt_btn;
	@FindBy (xpath = "//*[@class='btn btn-info']") WebElement TryHere_btn;
	@FindBy (xpath = "//*[@class=' CodeMirror-line ']") WebElement input_data ;
	@FindBy (xpath = "//*[@type='button']") WebElement run_btn ;
	@FindBy (id = "output") WebElement Output_txt;
	


	//Constructor
	public GraphPage() {

		PageFactory.initElements(driver,this);

	}

	
	//Methods
	public void ValidateGraphPage() {

		String title = driver.getTitle();
		Assert.assertEquals("Graph", title);
		System.out.println("User is on " + title + " Page" );
	}
	
	
	public void ValidationAssesment() {
		
		String title = driver.getTitle();
		Assert.assertEquals("Assessment", title);
		System.out.println("User is on " + title + " Page" );
		
	}


	public void GraphLink() {

		Graph_btn.click();	
	}
	
	public void GraphRepresntbtn() {

		GraphRepresnt_btn.click();	
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
