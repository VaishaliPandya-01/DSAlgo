package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

import baseClass.TestBase;

public class ArrayPage extends TestBase{
	
Actions action = new Actions(driver);
	
	@FindBy (xpath = "//*[contains(text(),'Arrays in Python')]") WebElement ArrayPython_btn;
	@FindBy (xpath = "//*[contains(text(),'Arrays Using List')]") WebElement ArrayList_btn;
	@FindBy (xpath = "//*[contains(text(),'Basic Operations in Lists')]") WebElement BasicOperationList_btn;
	@FindBy (xpath = "//a[@href='applications-of-array']") WebElement ApplicationArray_btn;
	@FindBy(xpath="//a[@href='/question/1']") WebElement btn_searchthearray;
	@FindBy(xpath="//a[@href='/question/2']") WebElement btn_maxconsecutiveones;
	@FindBy(xpath="//a[@href='/question/3']") WebElement btn_findnumberswithevennumberofdigits;
	@FindBy(xpath="//a[@href='/question/4']") WebElement btn_squaresofasortedarray;
	@FindBy(className="CodeMirror-lines") WebElement editorInput;
	@FindBy(xpath="//pre[@id='output']") WebElement editorOutput;
	@FindBy(xpath="//*[text()='Run']") WebElement btn_run;
	@FindBy (xpath = "//*[@class='btn btn-info']") WebElement TryHere_btn;
	@FindBy (xpath = "//*[@class=' CodeMirror-line ']") WebElement input_data ;
	@FindBy (xpath = "//*[@type='button']") WebElement run_btn ;
	@FindBy (id = "output") WebElement Output_txt;
	


	//Constructor
	public ArrayPage() {

		PageFactory.initElements(driver,this);

	}

	
	//Methods
	public void ValidateArrayPage() {

		String title = driver.getTitle();
		Assert.assertEquals("Array", title);
		System.out.println("User is on " + title + " Page" );
	}
	
	
	public void ValidationAssesment() {
		
		String title = driver.getTitle();
		Assert.assertEquals("Assessment", title);
		System.out.println("User is on " + title + " Page" );
		
	}
	
public void ValidationArrayPython() {
		
		String title = driver.getTitle();
		Assert.assertEquals("Arrays in Python", title);
		System.out.println("User is on " + title + " Page" );
		
	}

public void ValidationArrayList() {
	
	String title = driver.getTitle();
	Assert.assertEquals("Arrays Using List", title);
	System.out.println("User is on " + title + " Page" );
	
}

public void ValidationBasicOperation() {
	
	String title = driver.getTitle();
	Assert.assertEquals("Basic Operations in Lists", title);
	System.out.println("User is on " + title + " Page" );
	
}

public void ValidationApplicationArray() {
	
	String title = driver.getTitle();
	Assert.assertEquals("Applications of Array", title);
	System.out.println("User is on " + title + " Page" );
	
} 

public void ValidationQuestionPage() {
	
	String title = driver.getTitle();
	Assert.assertEquals("Assessment", title);
	System.out.println("User is on " + title + " Page" );
	
}


	public void ArrayPythonbtn() {

		ArrayPython_btn.click();	
	}
	
	public void ArrayListbtn() {

		ArrayList_btn.click();	
	}
	
	public void BasicOperationListbtn() {

		BasicOperationList_btn.click();	
	}
	
	public void ApplicationArraybtn() {

		ApplicationArray_btn.click();	
	}
	
	public void searchTheArray() {
		btn_searchthearray.click();
	}

	public void maxConsecutiveOnes() {
		btn_maxconsecutiveones.click();
	}
	
	public void squaresOfASortedArray() {
		btn_squaresofasortedarray.click();
	}
	
	public void findNumbersWithEvenNumberOfDigits() {
		btn_findnumberswithevennumberofdigits.click();
	}

	public void tryEditor() {
		Actions action=new Actions(driver);
		action.click(editorInput).sendKeys("print('Hello world')").perform();
		btn_run.click();
		String output=editorOutput.getAttribute("value");
		System.out.println("----The output is---- : "+output);
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
