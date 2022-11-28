package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

import baseClass.TestBase;

public class TreePage extends TestBase {
	
	Actions action = new Actions(driver);
	
	@FindBy (xpath = "//*[contains(text(),'Overview of Trees')]") WebElement Overview_btn;
	@FindBy (xpath = "//*[contains(text(),'Terminologies')]") WebElement Terminologies_btn;
	@FindBy (xpath = "//*[contains(text(),'Types of Trees')]") WebElement TypeOfTree_btn;
	@FindBy (xpath = "//a[.='Tree Traversals']") WebElement TreeTraversals_btn;
	@FindBy (xpath = "//*[contains(text(),'Traversals-Illustration')]") WebElement TraversalsIllustration_btn;
	@FindBy (xpath = "//a[.='Binary Trees']") WebElement BinaryTrees_btn;
	@FindBy (xpath = "//*[contains(text(),'Types of Binary Trees')]") WebElement TYpesOfBinary_btn;
	@FindBy (xpath = "//*[contains(text(),'Implementation in Python')]") WebElement ImplementationPython_btn;
	@FindBy (xpath = "//*[contains(text(),'Binary Tree Traversals')]") WebElement BinaryTreeTraversals_btn;
	@FindBy (xpath = "//*[contains(text(),'Implementation of Binary Trees')]") WebElement ImplementationOfBinary_btn;
	@FindBy (xpath = "//*[contains(text(),'Applications of Binary trees')]") WebElement ApplicationsOfBinary_btn;
	@FindBy (xpath = "//*[contains(text(),'Binary Search Trees')]") WebElement BinarySearch_btn;
	@FindBy (xpath = "//*[contains(text(),'Implementation Of BST')]") WebElement ImplementationOfBST_btn;
	@FindBy (xpath = "//*[@class='btn btn-info']") WebElement tryHere_btn;
	@FindBy (xpath = "//*[@class=' CodeMirror-line ']") WebElement input_data ;
	@FindBy (xpath = "//*[@type='button']") WebElement run_btn ;
	@FindBy (id = "output") WebElement Output_txt;
	
	
	
	//Constructor 
	public TreePage() {
		
		PageFactory.initElements(driver, this);
	} 
	
	
	//Methods
	public void TreePageValidation() {
		
		String title = driver.getTitle();
		Assert.assertEquals("Tree",title);
		System.out.println("user is on " + title + " page");	
	}
	
	
	public void TypeOfTreebtn() {
		
		TypeOfTree_btn.click();
		
	}
	
public void Terminologiesbtn() {
		
	Terminologies_btn.click();
		
	}

public void TreeTraversalsbtn() {
	
	TreeTraversals_btn.click();
	
}

public void BinaryTreesbtn() {
	
	BinaryTrees_btn.click();
	
}

public void TYpesOfBinarybtn() {
	
	TYpesOfBinary_btn.click();
	
}

public void ImplementationPythonbtn() {
	
	ImplementationPython_btn.click();
	
}

public void BinaryTreeTraversalsbtn() {
	
	BinaryTreeTraversals_btn.click();
	
}

public void ImplementationOfBinarybtn() {
	
	ImplementationOfBinary_btn.click();
	
}

public void ApplicationsOfBinarybtn() {
	
	ApplicationsOfBinary_btn.click();
	
}

public void BinarySearchbtn() {
	
	BinarySearch_btn.click();
	
}

public void ImplementationOfBSTbtn() {
	
	ImplementationOfBST_btn.click();
	
}


public void OverviewOfTreeBtn() {
	
	Overview_btn.click();
	
}

public void TraversalsIllustrationbtn() {
	TraversalsIllustration_btn.click();
}
	
	
	public void TryHereBtn () {
		
		tryHere_btn.click();
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
